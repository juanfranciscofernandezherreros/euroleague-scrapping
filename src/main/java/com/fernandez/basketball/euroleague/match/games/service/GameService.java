package com.fernandez.basketball.euroleague.match.games.service;

import com.fernandez.basketball.euroleague.match.games.dto.GamesScrappingDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

public interface GameService {
    Page<GamesScrappingDTO> findAllGamesByTeamAndYear(String clubode , String seasoncode , final Pageable pageable) throws MalformedURLException, UnsupportedEncodingException;
}
