
package com.fernandez.basketball.euroleague.match.playbyplay.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class SecondQuarterDTO {
    private Long id;
    @JsonProperty("TYPE")
    private Integer type;
    @JsonProperty("NUMBEROFPLAY")
    private Integer numberofplay;
    @JsonProperty("CODETEAM")
    private String codeteam;
    @JsonProperty("PLAYER_ID")
    private String playerId;
    @JsonProperty("PLAYTYPE")
    private String playtype;
    @JsonProperty("PLAYER")
    private String player;
    @JsonProperty("TEAM")
    private String team;
    @JsonProperty("DORSAL")
    private String dorsal;
    @JsonProperty("MINUTE")
    private Integer minute;
    @JsonProperty("MARKERTIME")
    private String markertime;
    @JsonProperty("POINTS_A")
    private String pointsA;
    @JsonProperty("POINTS_B")
    private String pointsB;
    @JsonProperty("COMMENT")
    private String comment;
    @JsonProperty("PLAYINFO")
    private String playinfo;
    private boolean markAsFavourite;
    private Long matchId;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TYPE")
    public Integer getType() {
        return type;
    }

    @JsonProperty("TYPE")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("NUMBEROFPLAY")
    public Integer getNumberofplay() {
        return numberofplay;
    }

    @JsonProperty("NUMBEROFPLAY")
    public void setNumberofplay(Integer numberofplay) {
        this.numberofplay = numberofplay;
    }

    @JsonProperty("CODETEAM")
    public String getCodeteam() {
        return codeteam;
    }

    @JsonProperty("CODETEAM")
    public void setCodeteam(String codeteam) {
        this.codeteam = codeteam;
    }

    @JsonProperty("PLAYER_ID")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("PLAYER_ID")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("PLAYTYPE")
    public String getPlaytype() {
        return playtype;
    }

    @JsonProperty("PLAYTYPE")
    public void setPlaytype(String playtype) {
        this.playtype = playtype;
    }

    @JsonProperty("PLAYER")
    public String getPlayer() {
        return player;
    }

    @JsonProperty("PLAYER")
    public void setPlayer(String player) {
        this.player = player;
    }

    @JsonProperty("TEAM")
    public String getTeam() {
        return team;
    }

    @JsonProperty("TEAM")
    public void setTeam(String team) {
        this.team = team;
    }

    @JsonProperty("DORSAL")
    public String getDorsal() {
        return dorsal;
    }

    @JsonProperty("DORSAL")
    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    @JsonProperty("MINUTE")
    public Integer getMinute() {
        return minute;
    }

    @JsonProperty("MINUTE")
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    @JsonProperty("MARKERTIME")
    public String getMarkertime() {
        return markertime;
    }

    @JsonProperty("MARKERTIME")
    public void setMarkertime(String markertime) {
        this.markertime = markertime;
    }

    @JsonProperty("POINTS_A")
    public String getPointsA() {
        return pointsA;
    }

    @JsonProperty("POINTS_A")
    public void setPointsA(String pointsA) {
        this.pointsA = pointsA;
    }

    @JsonProperty("POINTS_B")
    public String getPointsB() {
        return pointsB;
    }

    @JsonProperty("POINTS_B")
    public void setPointsB(String pointsB) {
        this.pointsB = pointsB;
    }

    @JsonProperty("COMMENT")
    public String getComment() {
        return comment;
    }

    @JsonProperty("COMMENT")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("PLAYINFO")
    public String getPlayinfo() {
        return playinfo;
    }

    @JsonProperty("PLAYINFO")
    public void setPlayinfo(String playinfo) {
        this.playinfo = playinfo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public boolean isMarkAsFavourite() {
        return markAsFavourite;
    }

    public void setMarkAsFavourite(boolean markAsFavourite) {
        this.markAsFavourite = markAsFavourite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    @Override
    public String toString() {
        return "SecondQuarterDTO{" +
                "id=" + id +
                ", type=" + type +
                ", numberofplay=" + numberofplay +
                ", codeteam='" + codeteam + '\'' +
                ", playerId='" + playerId + '\'' +
                ", playtype='" + playtype + '\'' +
                ", player='" + player + '\'' +
                ", team='" + team + '\'' +
                ", dorsal='" + dorsal + '\'' +
                ", minute=" + minute +
                ", markertime='" + markertime + '\'' +
                ", pointsA='" + pointsA + '\'' +
                ", pointsB='" + pointsB + '\'' +
                ", comment='" + comment + '\'' +
                ", playinfo='" + playinfo + '\'' +
                ", markAsFavourite=" + markAsFavourite +
                ", matchId=" + matchId +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
