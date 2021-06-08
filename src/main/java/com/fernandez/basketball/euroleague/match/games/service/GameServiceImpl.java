package com.fernandez.basketball.euroleague.match.games.service;

import com.fernandez.basketball.euroleague.match.games.dto.GamesScrappingDTO;
import com.fernandez.basketball.euroleague.match.header.dto.Header;
import com.fernandez.basketball.euroleague.match.header.service.HeaderService;
import com.fernandez.basketball.utils.DocumenUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService{


    private final HeaderService headerService;

    private final ModelMapper modelMapper = new ModelMapper();


    private final MongoTemplate mongoTemplate;

    @Override
    public Page<GamesScrappingDTO> findAllGamesByTeamAndYear(String clubcode, String seasoncode,Pageable pageable) throws MalformedURLException, UnsupportedEncodingException {
        String url = "https://www.euroleague.net/competition/teams/showteam?clubcode="+clubcode+"&seasoncode=E"+seasoncode+"#!games";
        List<GamesScrappingDTO> gamesScrappingDTOList = new ArrayList<>();
        // Compruebo si me da un 200 al hacer la petición
        if (DocumenUtils.getStatusConnectionCode(url) == 200) {
            // Obtengo el HTML de la web en un objeto Document
            Document document = DocumenUtils.getHtmlDocument(url);
            Elements versusContainer = document.select("td.VersusContainer");
            Elements gameNumberContainer = document.select("td.GameNumberContainer");
            Elements winLoseContainer = document.select("td.WinLoseContainer");
            Elements teamPhaseGameScoreContainer = document.select("td.TeamPhaseGameScoreContainer");
            Elements linksMatchContainer = versusContainer.select("a[href]");
            List<String> gameNumberList = new ArrayList<>();
            List<String> winLoseList = new ArrayList<>();
            List<String> versusList = new ArrayList<>();
            List<String> teamPhaseGameScoreList = new ArrayList<>();
            List<String> linksMatchList = new ArrayList<>();

            for (Element number : gameNumberContainer) {
                gameNumberList.add(number.text());
            }
            for (Element winLose : winLoseContainer) {
                winLoseList.add(winLose.text());
            }
            for (Element versus : versusContainer) {
                versusList.add(versus.text());
            }
            for (Element teamPhaseGameScore : teamPhaseGameScoreContainer) {
                teamPhaseGameScoreList.add(teamPhaseGameScore.text());
            }
            for (Element linkMatch : linksMatchContainer) {
                linksMatchList.add(linkMatch.attr("href"));
            }
            for(int i=0;i<gameNumberList.size();i++){
                GamesScrappingDTO gamesScrappingDTO = new GamesScrappingDTO();
                gamesScrappingDTO.setNumberMatch(gameNumberList.get(i));
                gamesScrappingDTO.setWinLose(winLoseList.get(i));
                gamesScrappingDTO.setVersus(versusList.get(i));
                gamesScrappingDTO.setTeamPhaseGameScore(teamPhaseGameScoreList.get(i));
                gamesScrappingDTO.setMatchLink("https://www.euroleague.net".concat(linksMatchList.get(i)));
                String gameCode = linksMatchList.get(i).split("&")[0].subSequence(32,linksMatchList.get(i).split("&")[0].length()).toString();
                gamesScrappingDTO.setGameCode(gameCode);
                gamesScrappingDTO.setSeassonCode(seasoncode);
                Header header = headerService.findInfoMatch(gameCode,seasoncode).getBody();
                gamesScrappingDTO.setHeader(header);
                gamesScrappingDTO.setTeam(clubcode);
                gamesScrappingDTOList.add(gamesScrappingDTO);
            }
        }else{
            log.error("El Status Code no es OK es: "+DocumenUtils.getStatusConnectionCode(url));
        }
        return convertList2Page(gamesScrappingDTOList,pageable);
    }

    private Page convertList2Page(final List list, final Pageable pageable) {
        return getPage(list, pageable);
    }

    @NotNull
    static Page getPage(final List list, final Pageable pageable) {
        int startIndex = (int) pageable.getOffset();
        int endIndex = (int) ((pageable.getOffset() + pageable.getPageSize()) > list.size() ? list.size()
                : pageable.getOffset() + pageable.getPageSize());
        List subList = list.subList(startIndex, endIndex);
        return new PageImpl(subList, pageable, list.size());
    }

}
