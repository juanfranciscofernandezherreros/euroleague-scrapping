package com.fernandez.basketball.euroleague.teams.service;

import com.fernandez.basketball.euroleague.teams.dto.TeamsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TeamsService {
    Page<TeamsDTO> syncAllTeamsByYear(String year, Pageable pageable);
}
