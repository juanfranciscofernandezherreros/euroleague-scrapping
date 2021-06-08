package com.fernandez.basketball.euroleague.match.games.dto;

import com.fernandez.basketball.euroleague.match.header.dto.Header;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GamesScrappingDTO {
    @Id
    private String id;
    private String numberMatch;
    private String winLose;
    private String versus;
    private String teamPhaseGameScore;
    private String matchLink;
    private Header header;
    private String gameCode;
    private String seassonCode;
    private String team;
}
