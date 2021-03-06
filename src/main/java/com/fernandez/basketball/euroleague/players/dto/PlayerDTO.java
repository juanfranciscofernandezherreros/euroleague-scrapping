package com.fernandez.basketball.euroleague.players.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlayerDTO {
    private String name;
    private String number;
    private String playerCode;
    private String nameTeam;
    private String linkDetail;
    private String year;
}
