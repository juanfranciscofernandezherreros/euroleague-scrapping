package com.fernandez.basketball.euroleague.match.playbyplay.controller;

import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.header.dto.Header;
import com.fernandez.basketball.euroleague.match.header.service.HeaderService;
import com.fernandez.basketball.euroleague.match.playbyplay.dto.MarkAsFavouriteDTO;
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

    private final HeaderService headerService;

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.PLAYBYPLAY)
    public ResponseEntity<MatchDTO> findPlayByPlay(@RequestParam("gamecode") String gamecode , @RequestParam("seassoncode") String seasoncode) throws IOException {
        log.info("[PlayByPlayController][findPlayByPlay] gamecode={} seasoncode={}" + gamecode , seasoncode);
        return playByPlayService.downloadWitouthSync(gamecode,seasoncode);
    }

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.PLAYBYPLAY + "/{fileName}")
    public MatchDTO findAll(@PathVariable String fileName) throws IOException {
        log.info("[PlayByPlayController][findAll] fileName={}" , fileName);
        return playByPlayService.findAllMovementsFromMatchInJsonFile(fileName);
    }

}
