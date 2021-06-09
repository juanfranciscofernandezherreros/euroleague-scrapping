package com.fernandez.basketball.euroleague.match.playbyplay.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.playbyplay.dto.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayByPlayImpl implements PlayByPlayService{

    @Override
    public MatchDTO findAllMovementsFromMatchInJsonFile(String fileName) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        MatchDTO match = new ObjectMapper().readValue(new FileInputStream(UrlMapping.MAIN_RESOURCES+UrlMapping.PLAYBYPLAY+"/"+fileName+".json"), MatchDTO.class );
        return match;
    }

    @Override
    public ResponseEntity<MatchDTO> retreiveDataSpecificPlayerFromMatch(String gamecode, String seasoncode, String playtype, String codeteam, String playerid) throws IOException {

        List<FirstQuarterDTO> firstQuarterDTOList = new ArrayList<FirstQuarterDTO>();
        List<SecondQuarterDTO> secondQuarterDTOList = new ArrayList<SecondQuarterDTO>();
        List<ThirdQuarterDTO> thirdQuarterDTOList = new ArrayList<ThirdQuarterDTO>();
        List<ForthQuarterDTO> forthQuarterDTOList = new ArrayList<ForthQuarterDTO>();
        List<ExtraTimeDTO> extraQuarterDTOList = new ArrayList<ExtraTimeDTO>();

        MatchDTO matchDTO = downloadWitouthSync(gamecode,seasoncode).getBody();

        if(Objects.nonNull(playtype) && Objects.isNull(codeteam) && Objects.isNull(playerid)) {
            firstQuarterDTOList =matchDTO.getFirstQuarter()
                    .stream()
                    .filter(firstQuarterDTO -> firstQuarterDTO.getPlaytype().equals(playtype))
                    .collect(Collectors.toList());
            secondQuarterDTOList = matchDTO.getSecondQuarter()
                    .stream()
                    .filter(secondQuarterDTO -> secondQuarterDTO.getPlaytype().equals(playtype))
                    .collect(Collectors.toList());
            thirdQuarterDTOList = matchDTO.getThirdQuarter()
                    .stream()
                    .filter(thirdQuarterDTO -> thirdQuarterDTO.getPlaytype().equals(playtype))
                    .collect(Collectors.toList());
            forthQuarterDTOList = matchDTO.getForthQuarter()
                    .stream()
                    .filter(forthQuarterDTO -> forthQuarterDTO.getPlaytype().equals(playtype))
                    .collect(Collectors.toList());
            extraQuarterDTOList = matchDTO.getExtraTime()
                    .stream()
                    .filter(extraTimeDTO -> extraTimeDTO.getPlaytype().equals(playtype))
                    .collect(Collectors.toList());
        }

        if(Objects.nonNull(playtype) && Objects.nonNull(codeteam) && Objects.nonNull(playerid)) {
            firstQuarterDTOList =matchDTO.getFirstQuarter()
                    .stream()
                    .filter(firstQuarterDTO -> firstQuarterDTO.getPlaytype().equals(playtype) && StringUtils.trim(firstQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(firstQuarterDTO.getPlayerId()).equals(playerid))
                    .collect(Collectors.toList());
            secondQuarterDTOList = matchDTO.getSecondQuarter()
                    .stream()
                    .filter(secondQuarterDTO -> secondQuarterDTO.getPlaytype().equals(playtype) && StringUtils.trim(secondQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(secondQuarterDTO.getPlayerId()).equals(playerid))
                    .collect(Collectors.toList());
            thirdQuarterDTOList = matchDTO.getThirdQuarter()
                    .stream()
                    .filter(thirdQuarterDTO -> thirdQuarterDTO.getPlaytype().equals(playtype) && StringUtils.trim(thirdQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(thirdQuarterDTO.getPlayerId()).equals(playerid))
                    .collect(Collectors.toList());
            forthQuarterDTOList = matchDTO.getForthQuarter()
                    .stream()
                    .filter(forthQuarterDTO -> forthQuarterDTO.getPlaytype().equals(playtype) && StringUtils.trim(forthQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(forthQuarterDTO.getPlayerId()).equals(playerid))
                    .collect(Collectors.toList());
            extraQuarterDTOList = matchDTO.getExtraTime()
                    .stream()
                    .filter(extraTimeDTO -> extraTimeDTO.getPlaytype().equals(playtype) && StringUtils.trim(extraTimeDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(extraTimeDTO.getPlayerId()).equals(playerid))
                    .collect(Collectors.toList());
        }
        if(Objects.nonNull(playtype)  && Objects.nonNull(codeteam) && Objects.isNull(playerid)) {
            firstQuarterDTOList = matchDTO.getFirstQuarter()
                    .stream()
                    .filter(firstQuarterDTO -> StringUtils.trim(firstQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(firstQuarterDTO.getPlaytype()).equals(playtype))
                    .collect(Collectors.toList());
            secondQuarterDTOList = matchDTO.getSecondQuarter()
                    .stream()
                    .filter(secondQuarterDTO -> StringUtils.trim(secondQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(secondQuarterDTO.getPlaytype()).equals(playtype))
                    .collect(Collectors.toList());
            thirdQuarterDTOList = matchDTO.getThirdQuarter()
                    .stream()
                    .filter(thirdQuarterDTO -> StringUtils.trim(thirdQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(thirdQuarterDTO.getPlaytype()).equals(playtype))
                    .collect(Collectors.toList());
            forthQuarterDTOList = matchDTO.getForthQuarter()
                    .stream()
                    .filter(forthQuarterDTO -> StringUtils.trim(forthQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(forthQuarterDTO.getPlaytype()).equals(playtype))
                    .collect(Collectors.toList());
            extraQuarterDTOList = matchDTO.getExtraTime()
                    .stream()
                    .filter(extraTimeDTO -> StringUtils.trim(extraTimeDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(extraTimeDTO.getPlaytype()).equals(playtype))
                    .collect(Collectors.toList());
        }
        if(Objects.isNull(playtype)  && Objects.nonNull(codeteam) && Objects.isNull(playerid)) {
            firstQuarterDTOList = matchDTO.getFirstQuarter()
                    .stream()
                    .filter(firstQuarterDTO -> StringUtils.trim(firstQuarterDTO.getCodeteam()).equals(codeteam))
                    .collect(Collectors.toList());
            secondQuarterDTOList = matchDTO.getSecondQuarter()
                    .stream()
                    .filter(secondQuarterDTO -> StringUtils.trim(secondQuarterDTO.getCodeteam()).equals(codeteam))
                    .collect(Collectors.toList());
            thirdQuarterDTOList = matchDTO.getThirdQuarter()
                    .stream()
                    .filter(thirdQuarterDTO -> StringUtils.trim(thirdQuarterDTO.getCodeteam()).equals(codeteam))
                    .collect(Collectors.toList());
            forthQuarterDTOList = matchDTO.getForthQuarter()
                    .stream()
                    .filter(forthQuarterDTO -> StringUtils.trim(forthQuarterDTO.getCodeteam()).equals(codeteam))
                    .collect(Collectors.toList());
            extraQuarterDTOList = matchDTO.getExtraTime()
                    .stream()
                    .filter(extraTimeDTO -> StringUtils.trim(extraTimeDTO.getCodeteam()).equals(codeteam))
                    .collect(Collectors.toList());
        }
        if(Objects.nonNull(playerid)  && Objects.nonNull(codeteam) && Objects.isNull(playtype)) {
            firstQuarterDTOList = matchDTO.getFirstQuarter()
                    .stream()
                    .filter(firstQuarterDTO -> StringUtils.trim(firstQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(firstQuarterDTO.getPlayerId()).equals(playerid))
                    .collect(Collectors.toList());
            secondQuarterDTOList = matchDTO.getSecondQuarter()
                    .stream()
                    .filter(secondQuarterDTO -> StringUtils.trim(secondQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(secondQuarterDTO.getPlayerId()).equals(playerid))
                    .collect(Collectors.toList());
            thirdQuarterDTOList = matchDTO.getThirdQuarter()
                    .stream()
                    .filter(thirdQuarterDTO -> StringUtils.trim(thirdQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(thirdQuarterDTO.getPlayerId()).equals(playerid))
                    .collect(Collectors.toList());
            forthQuarterDTOList = matchDTO.getForthQuarter()
                    .stream()
                    .filter(forthQuarterDTO -> StringUtils.trim(forthQuarterDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(forthQuarterDTO.getPlayerId()).equals(playerid))
                    .collect(Collectors.toList());
            extraQuarterDTOList = matchDTO.getExtraTime()
                    .stream()
                    .filter(extraTimeDTO -> StringUtils.trim(extraTimeDTO.getCodeteam()).equals(codeteam) && StringUtils.trim(extraTimeDTO.getPlayerId()).equals(playerid))
                    .collect(Collectors.toList());
        }
        if(Objects.nonNull(playtype) || Objects.nonNull(codeteam) || Objects.nonNull(playerid)){
            matchDTO.setFirstQuarter(firstQuarterDTOList);
            matchDTO.setSecondQuarter(secondQuarterDTOList);
            matchDTO.setThirdQuarter(thirdQuarterDTOList);
            matchDTO.setForthQuarter(forthQuarterDTOList);
            matchDTO.setExtraTime(extraQuarterDTOList);
        }
        return ResponseEntity.ok(matchDTO);
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
        return ResponseEntity.ok(matchDTO);
    }


}
