
package com.fernandez.basketball.euroleague.match.points.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NUM_ANOT",
    "TEAM",
    "ID_PLAYER",
    "PLAYER",
    "ID_ACTION",
    "ACTION",
    "POINTS",
    "COORD_X",
    "COORD_Y",
    "ZONE",
    "FASTBREAK",
    "SECOND_CHANCE",
    "POINTS_OFF_TURNOVER",
    "MINUTE",
    "CONSOLE",
    "POINTS_A",
    "POINTS_B",
    "UTC"
})
@Generated("jsonschema2pojo")
public class Row {

    @JsonProperty("NUM_ANOT")
    private Integer numAnot;
    @JsonProperty("TEAM")
    private String team;
    @JsonProperty("ID_PLAYER")
    private String idPlayer;
    @JsonProperty("PLAYER")
    private String player;
    @JsonProperty("ID_ACTION")
    private String idAction;
    @JsonProperty("ACTION")
    private String action;
    @JsonProperty("POINTS")
    private Integer points;
    @JsonProperty("COORD_X")
    private Integer coordX;
    @JsonProperty("COORD_Y")
    private Integer coordY;
    @JsonProperty("ZONE")
    private String zone;
    @JsonProperty("FASTBREAK")
    private String fastbreak;
    @JsonProperty("SECOND_CHANCE")
    private String secondChance;
    @JsonProperty("POINTS_OFF_TURNOVER")
    private String pointsOffTurnover;
    @JsonProperty("MINUTE")
    private Integer minute;
    @JsonProperty("CONSOLE")
    private String console;
    @JsonProperty("POINTS_A")
    private Integer pointsA;
    @JsonProperty("POINTS_B")
    private Integer pointsB;
    @JsonProperty("UTC")
    private String utc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NUM_ANOT")
    public Integer getNumAnot() {
        return numAnot;
    }

    @JsonProperty("NUM_ANOT")
    public void setNumAnot(Integer numAnot) {
        this.numAnot = numAnot;
    }

    @JsonProperty("TEAM")
    public String getTeam() {
        return team;
    }

    @JsonProperty("TEAM")
    public void setTeam(String team) {
        this.team = team;
    }

    @JsonProperty("ID_PLAYER")
    public String getIdPlayer() {
        return idPlayer;
    }

    @JsonProperty("ID_PLAYER")
    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

    @JsonProperty("PLAYER")
    public String getPlayer() {
        return player;
    }

    @JsonProperty("PLAYER")
    public void setPlayer(String player) {
        this.player = player;
    }

    @JsonProperty("ID_ACTION")
    public String getIdAction() {
        return idAction;
    }

    @JsonProperty("ID_ACTION")
    public void setIdAction(String idAction) {
        this.idAction = idAction;
    }

    @JsonProperty("ACTION")
    public String getAction() {
        return action;
    }

    @JsonProperty("ACTION")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("POINTS")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("POINTS")
    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonProperty("COORD_X")
    public Integer getCoordX() {
        return coordX;
    }

    @JsonProperty("COORD_X")
    public void setCoordX(Integer coordX) {
        this.coordX = coordX;
    }

    @JsonProperty("COORD_Y")
    public Integer getCoordY() {
        return coordY;
    }

    @JsonProperty("COORD_Y")
    public void setCoordY(Integer coordY) {
        this.coordY = coordY;
    }

    @JsonProperty("ZONE")
    public String getZone() {
        return zone;
    }

    @JsonProperty("ZONE")
    public void setZone(String zone) {
        this.zone = zone;
    }

    @JsonProperty("FASTBREAK")
    public String getFastbreak() {
        return fastbreak;
    }

    @JsonProperty("FASTBREAK")
    public void setFastbreak(String fastbreak) {
        this.fastbreak = fastbreak;
    }

    @JsonProperty("SECOND_CHANCE")
    public String getSecondChance() {
        return secondChance;
    }

    @JsonProperty("SECOND_CHANCE")
    public void setSecondChance(String secondChance) {
        this.secondChance = secondChance;
    }

    @JsonProperty("POINTS_OFF_TURNOVER")
    public String getPointsOffTurnover() {
        return pointsOffTurnover;
    }

    @JsonProperty("POINTS_OFF_TURNOVER")
    public void setPointsOffTurnover(String pointsOffTurnover) {
        this.pointsOffTurnover = pointsOffTurnover;
    }

    @JsonProperty("MINUTE")
    public Integer getMinute() {
        return minute;
    }

    @JsonProperty("MINUTE")
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    @JsonProperty("CONSOLE")
    public String getConsole() {
        return console;
    }

    @JsonProperty("CONSOLE")
    public void setConsole(String console) {
        this.console = console;
    }

    @JsonProperty("POINTS_A")
    public Integer getPointsA() {
        return pointsA;
    }

    @JsonProperty("POINTS_A")
    public void setPointsA(Integer pointsA) {
        this.pointsA = pointsA;
    }

    @JsonProperty("POINTS_B")
    public Integer getPointsB() {
        return pointsB;
    }

    @JsonProperty("POINTS_B")
    public void setPointsB(Integer pointsB) {
        this.pointsB = pointsB;
    }

    @JsonProperty("UTC")
    public String getUtc() {
        return utc;
    }

    @JsonProperty("UTC")
    public void setUtc(String utc) {
        this.utc = utc;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
