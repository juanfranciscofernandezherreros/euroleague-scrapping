package com.fernandez.basketball.euroleague.match.playbyplay.service;

import com.fernandez.basketball.euroleague.match.playbyplay.dto.MatchDTO;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface PlayByPlayService {
    MatchDTO findAllMovementsFromMatchInJsonFile(String fileName) throws IOException;
    ResponseEntity<MatchDTO> downloadWitouthSync(String gamecode, String seasoncode) throws IOException;
    ResponseEntity<MatchDTO> retreiveDataSpecificPlayerFromMatch(String gamecode, String seasoncode,String playByplay,String codeTeam,String playerid) throws IOException;

}
