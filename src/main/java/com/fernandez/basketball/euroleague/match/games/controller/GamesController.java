package com.fernandez.basketball.euroleague.match.games.controller;

import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.games.dto.GamesScrappingDTO;
import com.fernandez.basketball.euroleague.match.games.service.GameService;
import com.fernandez.basketball.euroleague.match.playbyplay.service.PlayByPlayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = UrlMapping.ROOT, produces = {APPLICATION_JSON_VALUE})
public class GamesController {

    private final GameService gameService;

    private final PlayByPlayService playByPlayService;


    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.GAMES + UrlMapping.TEAMS + UrlMapping.SHOWTEAM)
    public Page<GamesScrappingDTO> retreiveAllGamesByTeamAndYear(@RequestParam("clubcode") String clubcode ,
                                                                @RequestParam("seasoncode") String seasoncode ,
                                                                final @PageableDefault(size = 40) Pageable pageable) throws MalformedURLException, UnsupportedEncodingException {
        log.info("[GamesController][retreiveAllGamesByTeamAndYear] clubcode={} seasoncode={}" , clubcode , seasoncode);
        return gameService.findAllGamesByTeamAndYear(clubcode,seasoncode,pageable);
    }

}
