package com.fernandez.basketball.euroleague.match.boxscore.controller;

import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.boxscore.dto.BoxScore;
import com.fernandez.basketball.euroleague.match.boxscore.service.BoxScoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = UrlMapping.ROOT, produces = {APPLICATION_JSON_VALUE})
public class BoxScoreController {

    private final BoxScoreService boxScoreService;

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.BOXSCORE + "/{fileName}")
    public BoxScore findBoxScoreFromJson(@PathVariable String fileName) throws IOException {
        log.info("[BoxScoreController][findBoxScoreFromJson] fileName={}" , fileName);
        return boxScoreService.findBoxScoreFromJson(fileName);
    }

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.BOXSCORE)
    public BoxScore boxScoreWitouthSync(@RequestParam("gameCode") String gameCode , @RequestParam("seassonCode") String seassonCode) throws IOException {
        log.info("[BoxScore][boxScoreWitouthSync] gameCode={} seassonCode={}" + gameCode,seassonCode);
        return boxScoreService.findBoxScoreWitouthSync(gameCode,seassonCode);
    }

}