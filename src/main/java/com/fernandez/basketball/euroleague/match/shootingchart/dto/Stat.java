
package com.fernandez.basketball.euroleague.match.shootingchart.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Team",
    "Coach",
    "PlayersStats",
    "tmr",
    "totr"
})
@Generated("jsonschema2pojo")
public class Stat {

    @JsonProperty("Team")
    private String team;
    @JsonProperty("Coach")
    private String coach;
    @JsonProperty("PlayersStats")
    private List<PlayersStat> playersStats = null;
    @JsonProperty("tmr")
    private Tmr tmr;
    @JsonProperty("totr")
    private Totr totr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Team")
    public String getTeam() {
        return team;
    }

    @JsonProperty("Team")
    public void setTeam(String team) {
        this.team = team;
    }

    @JsonProperty("Coach")
    public String getCoach() {
        return coach;
    }

    @JsonProperty("Coach")
    public void setCoach(String coach) {
        this.coach = coach;
    }

    @JsonProperty("PlayersStats")
    public List<PlayersStat> getPlayersStats() {
        return playersStats;
    }

    @JsonProperty("PlayersStats")
    public void setPlayersStats(List<PlayersStat> playersStats) {
        this.playersStats = playersStats;
    }

    @JsonProperty("tmr")
    public Tmr getTmr() {
        return tmr;
    }

    @JsonProperty("tmr")
    public void setTmr(Tmr tmr) {
        this.tmr = tmr;
    }

    @JsonProperty("totr")
    public Totr getTotr() {
        return totr;
    }

    @JsonProperty("totr")
    public void setTotr(Totr totr) {
        this.totr = totr;
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
