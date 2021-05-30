package com.fernandez.basketball.euroleague.teams.controller;

import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.teams.dto.TeamsDTO;
import com.fernandez.basketball.euroleague.teams.service.TeamsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = UrlMapping.ROOT, produces = {APPLICATION_JSON_VALUE})
public class TeamsController {

    private final TeamsService teamsService;

    @GetMapping(value = UrlMapping.PUBLIC + UrlMapping.V1 + UrlMapping.TEAMS + "/{year}")
    public Page<TeamsDTO> findAllTeamsByYear(@PathVariable String year,
                                             Pageable pageable) throws IOException {
        log.info("[TeamsController][findAllTeamsByYear] year={}",year);
        return teamsService.findAllTeamsByYear(year,pageable);
    }

}
