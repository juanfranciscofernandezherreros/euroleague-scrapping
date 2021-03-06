package com.fernandez.basketball.euroleague.match.header.controller;

import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.header.dto.Header;
import com.fernandez.basketball.euroleague.match.header.service.HeaderService;
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
public class HeaderController {

    private final HeaderService headerService;

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.HEADER + "/{fileName}")
    public Header findHeader(@PathVariable String fileName) throws IOException {
        log.info("[HeaderController][findHeader] fileName={}" , fileName);
        return headerService.findHeader(fileName);
    }

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.HEADER)
    public ResponseEntity<Header> headerWitouthSync(@RequestParam("gameCode") String gameCode , @RequestParam("seassonCode") String seassonCode) throws IOException {
        log.info("[HeaderController][headerWitouthSync]" );
        return ResponseEntity.ok(headerService.headerWitouthSync(gameCode,seassonCode));
    }

}
