package com.fernandez.basketball.euroleague.match.data.service;

import com.fernandez.basketball.euroleague.match.boxscore.service.BoxScoreService;
import com.fernandez.basketball.euroleague.match.comparission.service.ComparissionService;
import com.fernandez.basketball.euroleague.match.data.dto.DataDTO;
import com.fernandez.basketball.euroleague.match.evolution.service.EvolutionService;
import com.fernandez.basketball.euroleague.match.header.dto.Header;
import com.fernandez.basketball.euroleague.match.header.service.HeaderService;
import com.fernandez.basketball.euroleague.match.playbyplay.service.PlayByPlayService;
import com.fernandez.basketball.euroleague.match.playersmatch.service.PlayersMatchService;
import com.fernandez.basketball.euroleague.match.points.service.PointsService;
import com.fernandez.basketball.euroleague.match.shootingchart.service.ShootingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {

    private final HeaderService headerService;

    private final EvolutionService evolutionService;

    private final ComparissionService comparissionService;

    private final PlayByPlayService playByPlayService;

    private final BoxScoreService boxScoreService;

    private final PlayersMatchService playersMatchService;

    private final ShootingService shootingService;

    private final PointsService pointsService;

    @Override
    public DataDTO findCompleteDataMtach(String gameCode, String seassonCode) throws IOException {
        DataDTO dataDTO = new DataDTO();
        Header header = headerService.findInfoMatch(gameCode, seassonCode).getBody();
        dataDTO.setHeader(header);
        dataDTO.setEvolution(evolutionService.evolutionWitouthSync(gameCode, seassonCode));
        dataDTO.setComparission(comparissionService.comparisionWitouthSync(gameCode, seassonCode));
        dataDTO.setShooting(shootingService.findAllShootingWitouthSync(gameCode, seassonCode));
        dataDTO.setBoxScore(boxScoreService.findBoxScoreWitouthSync(gameCode, seassonCode));
        dataDTO.setPoints(pointsService.findPointsWitouthSync(gameCode, seassonCode));
        dataDTO.setMatchDTO(playByPlayService.downloadWitouthSync(gameCode, seassonCode).getBody());
        dataDTO.setPlayerMatchTeamA(playersMatchService.findPlayersMatchByTeamWitouthSync(gameCode, seassonCode, header.getCodeTeamA().toUpperCase()));
        dataDTO.setPlayerMatchTeamB(playersMatchService.findPlayersMatchByTeamWitouthSync(gameCode, seassonCode, header.getCodeTeamB().toUpperCase()));
        dataDTO.setGameCode(gameCode);
        dataDTO.setSeassonCode(seassonCode);
        return dataDTO;
    }
}
