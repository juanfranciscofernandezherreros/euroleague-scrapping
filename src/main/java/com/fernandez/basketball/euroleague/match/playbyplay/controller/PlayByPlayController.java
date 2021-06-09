package com.fernandez.basketball.euroleague.match.playbyplay.controller;

import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.header.service.HeaderService;
import com.fernandez.basketball.euroleague.match.playbyplay.dto.MatchDTO;
import com.fernandez.basketball.euroleague.match.playbyplay.service.PlayByPlayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = UrlMapping.ROOT, produces = {APPLICATION_JSON_VALUE})
public class PlayByPlayController {

    private final PlayByPlayService playByPlayService;

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.PLAYBYPLAY)
    public ResponseEntity<MatchDTO> findPlayByPlay(@RequestParam("gamecode") String gamecode ,
                                                   @RequestParam("seasoncode") String seasoncode) throws IOException {
        log.info("[PlayByPlayController][findPlayByPlay]");
        return playByPlayService.downloadWitouthSync(gamecode,seasoncode);
    }

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.PLAYBYPLAY + UrlMapping.PLAYER)
    public ResponseEntity<MatchDTO> retreiveDataSpecificPlayerFromMatch(
                                                   @RequestParam("gamecode") String gamecode ,
                                                   @RequestParam("seasoncode") String seasoncode,
                                                   @RequestParam(name = "playtype", required = false) String playtype ,
                                                   @RequestParam(name = "codeteam", required = false) String codeteam,
                                                   @RequestParam(name = "playerid", required = false) String playerid) throws IOException {
    log.info("[PlayByPlayController][findPlayByPlay] gamecode={} seasoncode={} playtype={} codeteam={} playerid={}", gamecode,seasoncode,playtype,codeteam,playerid);
    return playByPlayService.retreiveDataSpecificPlayerFromMatch(gamecode, seasoncode, playtype,codeteam,playerid);
    }

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.PLAYBYPLAY + "/{fileName}")
    public MatchDTO findAll(@PathVariable String fileName) throws IOException {
        log.info("[PlayByPlayController][findAll] fileName={}" , fileName);
        return playByPlayService.findAllMovementsFromMatchInJsonFile(fileName);
    }

}
