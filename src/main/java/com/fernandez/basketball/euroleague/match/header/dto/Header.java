
package com.fernandez.basketball.euroleague.match.header.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Live",
    "Round",
    "Date",
    "Hour",
    "Stadium",
    "Capacity",
    "TeamA",
    "TeamB",
    "CodeTeamA",
    "TVCodeA",
    "CodeTeamB",
    "TVCodeB",
    "imA",
    "imB",
    "ScoreA",
    "ScoreB",
    "CoachA",
    "CoachB",
    "GameTime",
    "wid",
    "Quarter",
    "FoultsA",
    "FoultsB",
    "TimeoutsA",
    "TimeoutsB",
    "ScoreQuarter1A",
    "ScoreQuarter2A",
    "ScoreQuarter3A",
    "ScoreQuarter4A",
    "ScoreExtraTimeA",
    "ScoreQuarter1B",
    "ScoreQuarter2B",
    "ScoreQuarter3B",
    "ScoreQuarter4B",
    "ScoreExtraTimeB",
    "Phase",
    "PhaseReducedName",
    "Competition",
    "CompetitionReducedName",
    "pcom",
    "Referee1",
    "Referee2",
    "Referee3"
})
@Generated("jsonschema2pojo")
public class Header {

    @JsonProperty("Live")
    private Boolean live;
    @JsonProperty("Round")
    private String round;
    @JsonProperty("Date")
    private String date;
    @JsonProperty("Hour")
    private String hour;
    @JsonProperty("Stadium")
    private String stadium;
    @JsonProperty("Capacity")
    private String capacity;
    @JsonProperty("TeamA")
    private String teamA;
    @JsonProperty("TeamB")
    private String teamB;
    @JsonProperty("CodeTeamA")
    private String codeTeamA;
    @JsonProperty("TVCodeA")
    private String tVCodeA;
    @JsonProperty("CodeTeamB")
    private String codeTeamB;
    @JsonProperty("TVCodeB")
    private String tVCodeB;
    @JsonProperty("imA")
    private String imA;
    @JsonProperty("imB")
    private String imB;
    @JsonProperty("ScoreA")
    private String scoreA;
    @JsonProperty("ScoreB")
    private String scoreB;
    @JsonProperty("CoachA")
    private String coachA;
    @JsonProperty("CoachB")
    private String coachB;
    @JsonProperty("GameTime")
    private String gameTime;
    @JsonProperty("wid")
    private String wid;
    @JsonProperty("Quarter")
    private String quarter;
    @JsonProperty("FoultsA")
    private String foultsA;
    @JsonProperty("FoultsB")
    private String foultsB;
    @JsonProperty("TimeoutsA")
    private String timeoutsA;
    @JsonProperty("TimeoutsB")
    private String timeoutsB;
    @JsonProperty("ScoreQuarter1A")
    private Integer scoreQuarter1A;
    @JsonProperty("ScoreQuarter2A")
    private Integer scoreQuarter2A;
    @JsonProperty("ScoreQuarter3A")
    private Integer scoreQuarter3A;
    @JsonProperty("ScoreQuarter4A")
    private Integer scoreQuarter4A;
    @JsonProperty("ScoreExtraTimeA")
    private Integer scoreExtraTimeA;
    @JsonProperty("ScoreQuarter1B")
    private Integer scoreQuarter1B;
    @JsonProperty("ScoreQuarter2B")
    private Integer scoreQuarter2B;
    @JsonProperty("ScoreQuarter3B")
    private Integer scoreQuarter3B;
    @JsonProperty("ScoreQuarter4B")
    private Integer scoreQuarter4B;
    @JsonProperty("ScoreExtraTimeB")
    private Integer scoreExtraTimeB;
    @JsonProperty("Phase")
    private String phase;
    @JsonProperty("PhaseReducedName")
    private String phaseReducedName;
    @JsonProperty("Competition")
    private String competition;
    @JsonProperty("CompetitionReducedName")
    private String competitionReducedName;
    @JsonProperty("pcom")
    private String pcom;
    @JsonProperty("Referee1")
    private String referee1;
    @JsonProperty("Referee2")
    private String referee2;
    @JsonProperty("Referee3")
    private String referee3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Live")
    public Boolean getLive() {
        return live;
    }

    @JsonProperty("Live")
    public void setLive(Boolean live) {
        this.live = live;
    }

    @JsonProperty("Round")
    public String getRound() {
        return round;
    }

    @JsonProperty("Round")
    public void setRound(String round) {
        this.round = round;
    }

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("Hour")
    public String getHour() {
        return hour;
    }

    @JsonProperty("Hour")
    public void setHour(String hour) {
        this.hour = hour;
    }

    @JsonProperty("Stadium")
    public String getStadium() {
        return stadium;
    }

    @JsonProperty("Stadium")
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    @JsonProperty("Capacity")
    public String getCapacity() {
        return capacity;
    }

    @JsonProperty("Capacity")
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @JsonProperty("TeamA")
    public String getTeamA() {
        return teamA;
    }

    @JsonProperty("TeamA")
    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    @JsonProperty("TeamB")
    public String getTeamB() {
        return teamB;
    }

    @JsonProperty("TeamB")
    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    @JsonProperty("CodeTeamA")
    public String getCodeTeamA() {
        return codeTeamA;
    }

    @JsonProperty("CodeTeamA")
    public void setCodeTeamA(String codeTeamA) {
        this.codeTeamA = codeTeamA;
    }

    @JsonProperty("TVCodeA")
    public String getTVCodeA() {
        return tVCodeA;
    }

    @JsonProperty("TVCodeA")
    public void setTVCodeA(String tVCodeA) {
        this.tVCodeA = tVCodeA;
    }

    @JsonProperty("CodeTeamB")
    public String getCodeTeamB() {
        return codeTeamB;
    }

    @JsonProperty("CodeTeamB")
    public void setCodeTeamB(String codeTeamB) {
        this.codeTeamB = codeTeamB;
    }

    @JsonProperty("TVCodeB")
    public String getTVCodeB() {
        return tVCodeB;
    }

    @JsonProperty("TVCodeB")
    public void setTVCodeB(String tVCodeB) {
        this.tVCodeB = tVCodeB;
    }

    @JsonProperty("imA")
    public String getImA() {
        return imA;
    }

    @JsonProperty("imA")
    public void setImA(String imA) {
        this.imA = imA;
    }

    @JsonProperty("imB")
    public String getImB() {
        return imB;
    }

    @JsonProperty("imB")
    public void setImB(String imB) {
        this.imB = imB;
    }

    @JsonProperty("ScoreA")
    public String getScoreA() {
        return scoreA;
    }

    @JsonProperty("ScoreA")
    public void setScoreA(String scoreA) {
        this.scoreA = scoreA;
    }

    @JsonProperty("ScoreB")
    public String getScoreB() {
        return scoreB;
    }

    @JsonProperty("ScoreB")
    public void setScoreB(String scoreB) {
        this.scoreB = scoreB;
    }

    @JsonProperty("CoachA")
    public String getCoachA() {
        return coachA;
    }

    @JsonProperty("CoachA")
    public void setCoachA(String coachA) {
        this.coachA = coachA;
    }

    @JsonProperty("CoachB")
    public String getCoachB() {
        return coachB;
    }

    @JsonProperty("CoachB")
    public void setCoachB(String coachB) {
        this.coachB = coachB;
    }

    @JsonProperty("GameTime")
    public String getGameTime() {
        return gameTime;
    }

    @JsonProperty("GameTime")
    public void setGameTime(String gameTime) {
        this.gameTime = gameTime;
    }

    @JsonProperty("wid")
    public String getWid() {
        return wid;
    }

    @JsonProperty("wid")
    public void setWid(String wid) {
        this.wid = wid;
    }

    @JsonProperty("Quarter")
    public String getQuarter() {
        return quarter;
    }

    @JsonProperty("Quarter")
    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    @JsonProperty("FoultsA")
    public String getFoultsA() {
        return foultsA;
    }

    @JsonProperty("FoultsA")
    public void setFoultsA(String foultsA) {
        this.foultsA = foultsA;
    }

    @JsonProperty("FoultsB")
    public String getFoultsB() {
        return foultsB;
    }

    @JsonProperty("FoultsB")
    public void setFoultsB(String foultsB) {
        this.foultsB = foultsB;
    }

    @JsonProperty("TimeoutsA")
    public String getTimeoutsA() {
        return timeoutsA;
    }

    @JsonProperty("TimeoutsA")
    public void setTimeoutsA(String timeoutsA) {
        this.timeoutsA = timeoutsA;
    }

    @JsonProperty("TimeoutsB")
    public String getTimeoutsB() {
        return timeoutsB;
    }

    @JsonProperty("TimeoutsB")
    public void setTimeoutsB(String timeoutsB) {
        this.timeoutsB = timeoutsB;
    }

    @JsonProperty("ScoreQuarter1A")
    public Integer getScoreQuarter1A() {
        return scoreQuarter1A;
    }

    @JsonProperty("ScoreQuarter1A")
    public void setScoreQuarter1A(Integer scoreQuarter1A) {
        this.scoreQuarter1A = scoreQuarter1A;
    }

    @JsonProperty("ScoreQuarter2A")
    public Integer getScoreQuarter2A() {
        return scoreQuarter2A;
    }

    @JsonProperty("ScoreQuarter2A")
    public void setScoreQuarter2A(Integer scoreQuarter2A) {
        this.scoreQuarter2A = scoreQuarter2A;
    }

    @JsonProperty("ScoreQuarter3A")
    public Integer getScoreQuarter3A() {
        return scoreQuarter3A;
    }

    @JsonProperty("ScoreQuarter3A")
    public void setScoreQuarter3A(Integer scoreQuarter3A) {
        this.scoreQuarter3A = scoreQuarter3A;
    }

    @JsonProperty("ScoreQuarter4A")
    public Integer getScoreQuarter4A() {
        return scoreQuarter4A;
    }

    @JsonProperty("ScoreQuarter4A")
    public void setScoreQuarter4A(Integer scoreQuarter4A) {
        this.scoreQuarter4A = scoreQuarter4A;
    }

    @JsonProperty("ScoreExtraTimeA")
    public Integer getScoreExtraTimeA() {
        return scoreExtraTimeA;
    }

    @JsonProperty("ScoreExtraTimeA")
    public void setScoreExtraTimeA(Integer scoreExtraTimeA) {
        this.scoreExtraTimeA = scoreExtraTimeA;
    }

    @JsonProperty("ScoreQuarter1B")
    public Integer getScoreQuarter1B() {
        return scoreQuarter1B;
    }

    @JsonProperty("ScoreQuarter1B")
    public void setScoreQuarter1B(Integer scoreQuarter1B) {
        this.scoreQuarter1B = scoreQuarter1B;
    }

    @JsonProperty("ScoreQuarter2B")
    public Integer getScoreQuarter2B() {
        return scoreQuarter2B;
    }

    @JsonProperty("ScoreQuarter2B")
    public void setScoreQuarter2B(Integer scoreQuarter2B) {
        this.scoreQuarter2B = scoreQuarter2B;
    }

    @JsonProperty("ScoreQuarter3B")
    public Integer getScoreQuarter3B() {
        return scoreQuarter3B;
    }

    @JsonProperty("ScoreQuarter3B")
    public void setScoreQuarter3B(Integer scoreQuarter3B) {
        this.scoreQuarter3B = scoreQuarter3B;
    }

    @JsonProperty("ScoreQuarter4B")
    public Integer getScoreQuarter4B() {
        return scoreQuarter4B;
    }

    @JsonProperty("ScoreQuarter4B")
    public void setScoreQuarter4B(Integer scoreQuarter4B) {
        this.scoreQuarter4B = scoreQuarter4B;
    }

    @JsonProperty("ScoreExtraTimeB")
    public Integer getScoreExtraTimeB() {
        return scoreExtraTimeB;
    }

    @JsonProperty("ScoreExtraTimeB")
    public void setScoreExtraTimeB(Integer scoreExtraTimeB) {
        this.scoreExtraTimeB = scoreExtraTimeB;
    }

    @JsonProperty("Phase")
    public String getPhase() {
        return phase;
    }

    @JsonProperty("Phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    @JsonProperty("PhaseReducedName")
    public String getPhaseReducedName() {
        return phaseReducedName;
    }

    @JsonProperty("PhaseReducedName")
    public void setPhaseReducedName(String phaseReducedName) {
        this.phaseReducedName = phaseReducedName;
    }

    @JsonProperty("Competition")
    public String getCompetition() {
        return competition;
    }

    @JsonProperty("Competition")
    public void setCompetition(String competition) {
        this.competition = competition;
    }

    @JsonProperty("CompetitionReducedName")
    public String getCompetitionReducedName() {
        return competitionReducedName;
    }

    @JsonProperty("CompetitionReducedName")
    public void setCompetitionReducedName(String competitionReducedName) {
        this.competitionReducedName = competitionReducedName;
    }

    @JsonProperty("pcom")
    public String getPcom() {
        return pcom;
    }

    @JsonProperty("pcom")
    public void setPcom(String pcom) {
        this.pcom = pcom;
    }

    @JsonProperty("Referee1")
    public String getReferee1() {
        return referee1;
    }

    @JsonProperty("Referee1")
    public void setReferee1(String referee1) {
        this.referee1 = referee1;
    }

    @JsonProperty("Referee2")
    public String getReferee2() {
        return referee2;
    }

    @JsonProperty("Referee2")
    public void setReferee2(String referee2) {
        this.referee2 = referee2;
    }

    @JsonProperty("Referee3")
    public String getReferee3() {
        return referee3;
    }

    @JsonProperty("Referee3")
    public void setReferee3(String referee3) {
        this.referee3 = referee3;
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
