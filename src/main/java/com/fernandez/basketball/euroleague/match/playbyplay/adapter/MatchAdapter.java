package com.fernandez.basketball.euroleague.match.playbyplay.adapter;

import com.fernandez.basketball.euroleague.match.playbyplay.dto.MatchDTO;
import com.fernandez.basketball.euroleague.match.playbyplay.entity.jpa.Match;

public class MatchAdapter {

        public static Match mapToEntity(MatchDTO matchDTO){
            Match match = new Match();
            match.setLive(matchDTO.getLive());
            match.setTeamA(matchDTO.getTeamA());
            match.setTeamB(matchDTO.getTeamB());
            match.setCodeTeamA(matchDTO.getCodeTeamA());
            match.setCodeTeamB(matchDTO.getCodeTeamB());
            match.setActualQuarter(matchDTO.getActualQuarter());
            match.setId(matchDTO.getId());
            match.setPhase(matchDTO.getHeader().getPhase());
            match.setDate(matchDTO.getHeader().getDate());
            match.setRound(matchDTO.getHeader().getRound());
            match.setGameCode(matchDTO.getGameCode());
        return match;
    }

}


