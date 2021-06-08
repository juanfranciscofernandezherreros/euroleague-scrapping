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

    @PostMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.FAVOURITE + UrlMapping.PLAYBYPLAY)
    public ResponseEntity<MarkAsFavouriteDTO> markPlayByPlayAsFavourite(@RequestBody MarkAsFavouriteDTO markAsFavouriteDTO) {
        log.info("[PlayByPlayController][markPlayByPlayAsFavourite] markAsFavouriteDTO={}" ,markAsFavouriteDTO);
        return ResponseEntity.ok(playByPlayService.markAsFavourite(markAsFavouriteDTO));
    }

    @DeleteMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.FAVOURITE + UrlMapping.PLAYBYPLAY)
    public void deletePlayByPlayAsFavourite(@RequestParam String numberofplay,
                                            @RequestParam String gamecode ,
                                            @RequestParam String seasoncode,
                                            @RequestParam String actualQuarter,
                                            @RequestParam String index) {
        log.info("[PlayByPlayController][deletePlayByPlayAsFavourite] gamecode={} seasoncode={} actualQuarter={} index={}" +numberofplay, gamecode,seasoncode , actualQuarter,index);
        playByPlayService.deleteByMarkAsFavourite(numberofplay,gamecode,seasoncode,actualQuarter,index);
    }

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.PLAYBYPLAY + "/{fileName}")
    public MatchDTO findAll(@PathVariable String fileName) throws IOException {
        log.info("[PlayByPlayController][findAll] fileName={}" , fileName);
        return playByPlayService.findAllMovementsFromMatchInJsonFile(fileName);
    }

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.SYNC + UrlMapping.PLAYBYPLAY)
    public MatchDTO syncWithDatabase(@RequestParam String gamecode , @RequestParam String seasoncode) throws IOException {
        log.info("[PlayByPlayController][downloadPlayByPlay]");
        ResponseEntity<MatchDTO> matchDTO = playByPlayService.downloadWitouthSync(gamecode,seasoncode);
        ResponseEntity<Header> header = headerService.findInfoMatch(gamecode,seasoncode);
        matchDTO.getBody().setHeader(header.getBody());
        return playByPlayService.save(matchDTO.getBody());
    }

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.PLAYBYPLAY)
    public void addPlayByPlayToArticle(@RequestParam String numberofplay,
                                       @RequestParam String gamecode ,
                                       @RequestParam String seasoncode,
                                       @RequestParam String articleId) throws IOException {
        log.info("[PlayByPlayController][addPlayByPlayToArticle]");
        playByPlayService.addToArticle(articleId, numberofplay, gamecode, seasoncode);
    }



}
