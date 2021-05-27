package com.fernandez.basketball.euroleague.match.playbyplay.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.common.repository.*;
import com.fernandez.basketball.euroleague.match.playbyplay.adapter.MatchAdapter;
import com.fernandez.basketball.euroleague.match.playbyplay.dto.*;
import com.fernandez.basketball.euroleague.match.playbyplay.entity.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayByPlayImpl implements PlayByPlayService{

    private final RestTemplate appRestClient;

    private final ModelMapper modelMapper = new ModelMapper();

    private final MatchRepository matchRepository;

    private final FirstQuarterRepository firstQuarterRepository;

    private final SecondQuarterRepository secondQuarterRepository;

    private final ThirdQuarterRepository thirdQuarterRepository;

    private final ForthQuarterRepository forthQuarterRepository;

    private final ExtraTimeRepository extraTimeRepository;


    @Override
    public MatchDTO findAllMovementsFromMatchInJsonFile(String fileName) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        MatchDTO match = new ObjectMapper().readValue(new FileInputStream(UrlMapping.MAIN_RESOURCES+UrlMapping.PLAYBYPLAY+"/"+fileName+".json"), MatchDTO.class );
        return match;
    }

        @Override
        public ResponseEntity<MatchDTO> download(String gamecode, String seasoncode) throws IOException {
            RestTemplate rt = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            return rt.exchange("https://live.euroleague.net/api/PlayByPlay?gamecode="+gamecode+"&seasoncode=E"+seasoncode+"", HttpMethod.GET, entity, MatchDTO.class);
        }



    @Override
    public MatchDTO findAllPlayByPlayFromMatch(Long matchId) {
        Match match = matchRepository.findById(matchId).get();
        return modelMapper.map(match,MatchDTO.class);
    }

    @Override
    public MatchDTO save(MatchDTO saveMatch){
        Match match = MatchAdapter.mapToEntity(saveMatch);
        return modelMapper.map(matchRepository.save(match),MatchDTO.class);
    }

    @Override
    public ResponseEntity<MatchDTO> downloadWitouthSync(String gamecode, String seasoncode) throws IOException {
        URL url = new URL("https://live.euroleague.net/api/PlayByPlay?gamecode="+gamecode+"&seasoncode=E"+seasoncode+"&disp=");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestProperty("authority", "live.euroleague.net");
        http.setRequestProperty("accept", "application/json, text/plain, */*");
        http.setRequestProperty("dnt", "1");
        http.setRequestProperty("sec-ch-ua-mobile", "?0");
        http.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36");
        http.setRequestProperty("sec-fetch-site", "same-origin");
        http.setRequestProperty("sec-fetch-mode", "cors");
        http.setRequestProperty("sec-fetch-dest", "empty");
        ObjectMapper mapper=new ObjectMapper();
        BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
        MatchDTO matchDTO = mapper.readValue(in, MatchDTO.class);
        return  ResponseEntity.ok(matchDTO);
    }

    @Override
    public MarkAsFavouriteDTO markAsFavourite(MarkAsFavouriteDTO markAsFavouriteDTO) {
        MarkAsFavouriteDTO markAsFavouriteDTOCreated = new MarkAsFavouriteDTO();
        Match match = null;
        Optional<Match> optionalMatch = matchRepository.findByGameCodeAndSeassonCode(markAsFavouriteDTO.getGameCode(),markAsFavouriteDTO.getSeassonCode());
        if (optionalMatch.isPresent()){
             match = optionalMatch.get();
        }else{
            Match newMatch = MatchAdapter.mapToEntityFromMarkAsFavourite(markAsFavouriteDTO);
            newMatch.setGameCode(markAsFavouriteDTO.getGameCode());
            newMatch.setSeassonCode(markAsFavouriteDTO.getSeassonCode());
            match = matchRepository.save(newMatch);
        }
        markAsFavouriteDTOCreated.setMatchDTO(modelMapper.map(match,MatchDTO.class));
        if (Objects.nonNull(markAsFavouriteDTO.getFirstQuarterDTO())) {
            FirstQuarter firstQuarter = null;
            FirstQuarterDTO firstQuarterDTO = markAsFavouriteDTO.getFirstQuarterDTO();
            if (Objects.nonNull(firstQuarterDTO.getId())) {
                firstQuarter = firstQuarterRepository.getOne(firstQuarterDTO.getId());
            } else {
                firstQuarter = modelMapper.map(firstQuarterDTO, FirstQuarter.class);
            }
            firstQuarter.setMarkAsFavourite(markAsFavouriteDTO.getFirstQuarterDTO().isMarkAsFavourite());
            firstQuarter.setMatch(match);
            FirstQuarter frstQuarter = firstQuarterRepository.save(firstQuarter);
            markAsFavouriteDTOCreated.setFirstQuarterDTO(modelMapper.map(frstQuarter, FirstQuarterDTO.class));
        }
        if (Objects.nonNull(markAsFavouriteDTO.getSecondQuarterDTO())) {
            SecondQuarter secondQuarter = null;
            SecondQuarterDTO secondQuarterDTO = markAsFavouriteDTO.getSecondQuarterDTO();
            if (Objects.nonNull(secondQuarterDTO.getId())) {
                secondQuarter = secondQuarterRepository.getOne(secondQuarterDTO.getId());
            } else {
                secondQuarter = modelMapper.map(secondQuarterDTO, SecondQuarter.class);
            }
            secondQuarter.setMarkAsFavourite(markAsFavouriteDTO.getSecondQuarterDTO().isMarkAsFavourite());
            secondQuarter.setMatch(match);
            SecondQuarter scndQuarter = secondQuarterRepository.save(secondQuarter);
            markAsFavouriteDTOCreated.setSecondQuarterDTO(modelMapper.map(scndQuarter, SecondQuarterDTO.class));
        }
        if (Objects.nonNull(markAsFavouriteDTO.getThirdQuarterDTO())) {
            ThirdQuarter thirdQuarter = null;
            ThirdQuarterDTO thirdQuarterDTO = markAsFavouriteDTO.getThirdQuarterDTO();
            if (Objects.nonNull(thirdQuarterDTO.getId())) {
                thirdQuarter = thirdQuarterRepository.getOne(thirdQuarterDTO.getId());
            } else {
                thirdQuarter = modelMapper.map(thirdQuarterDTO, ThirdQuarter.class);
            }
            thirdQuarter.setMarkAsFavourite(markAsFavouriteDTO.getThirdQuarterDTO().isMarkAsFavourite());
            thirdQuarter.setMatch(match);
            ThirdQuarter thrdQuarter = thirdQuarterRepository.save(thirdQuarter);
            markAsFavouriteDTOCreated.setThirdQuarterDTO(modelMapper.map(thrdQuarter, ThirdQuarterDTO.class));
        }
        if (Objects.nonNull(markAsFavouriteDTO.getForthQuarterDTO())) {
            ForthQuarter forthQuarter = null;
            ForthQuarterDTO forthQuarterDTO = markAsFavouriteDTO.getForthQuarterDTO();
            if (Objects.nonNull(forthQuarterDTO.getId())) {
                forthQuarter = forthQuarterRepository.getOne(forthQuarterDTO.getId());
            } else {
                forthQuarter = modelMapper.map(forthQuarterDTO, ForthQuarter.class);
            }
            forthQuarter.setMarkAsFavourite(markAsFavouriteDTO.getForthQuarterDTO().isMarkAsFavourite());
            forthQuarter.setMatch(match);
            ForthQuarter frthQuarter = forthQuarterRepository.save(forthQuarter);
            markAsFavouriteDTOCreated.setForthQuarterDTO(modelMapper.map(frthQuarter, ForthQuarterDTO.class));
        }
        if (Objects.nonNull(markAsFavouriteDTO.getExtraTimeDTO())) {
            ExtraTime extraTime = null;
            ExtraTimeDTO extraTimeDTO = markAsFavouriteDTO.getExtraTimeDTO();
            if (Objects.nonNull(extraTimeDTO.getId())) {
                extraTime = extraTimeRepository.getOne(extraTimeDTO.getId());
            } else {
                extraTime = modelMapper.map(extraTimeDTO, ExtraTime.class);
            }
            extraTime.setMarkAsFavourite(markAsFavouriteDTO.getForthQuarterDTO().isMarkAsFavourite());
            extraTime.setMatch(match);
            ExtraTime exTr = extraTimeRepository.save(extraTime);
            markAsFavouriteDTOCreated.setExtraTimeDTO(modelMapper.map(exTr, ExtraTimeDTO.class));
        }
        markAsFavouriteDTOCreated.setMatchId(match.getId());
        return markAsFavouriteDTOCreated;
    }
}
