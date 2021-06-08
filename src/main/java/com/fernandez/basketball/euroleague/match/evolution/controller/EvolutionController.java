package com.fernandez.basketball.euroleague.match.evolution.controller;

import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.evolution.dto.Evolution;
import com.fernandez.basketball.euroleague.match.evolution.service.EvolutionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = UrlMapping.ROOT, produces = {APPLICATION_JSON_VALUE})
public class EvolutionController {

    private final EvolutionService evolutionService;

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.EVOLUTION + "/{fileName}")
    public Evolution findAllEvolutionFromMatchInJsonFile(@PathVariable String fileName) throws IOException {
        log.info("[EvolutionController][findAllEvolutionFromMatchInJsonFile] fileName={}" , fileName);
        return evolutionService.findAllEvolutionFromMatchInJsonFile(fileName);
    }

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.EVOLUTION)
    public Evolution evolutionWitouthSync(@RequestParam("gameCode") String gameCode , @RequestParam("seassonCode") String seassonCode) throws IOException {
        log.info("[EvolutionController][evolutionWitouthSync] gameCode={} seassonCode={}" + gameCode,seassonCode);
        return evolutionService.evolutionWitouthSync(gameCode,seassonCode);
    }

}
