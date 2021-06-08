
package com.fernandez.basketball.euroleague.match.comparission.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DefensiveReboundsA",
    "OffensiveReboundsB",
    "OffensiveReboundsA",
    "DefensiveReboundsB",
    "TurnoversStartersA",
    "TurnoversBenchA",
    "TurnoversStartersB",
    "TurnoversBenchB",
    "StealsStartersA",
    "StealsBenchA",
    "StealsStartersB",
    "StealsBenchB",
    "AssistsStartersA",
    "AssistsBenchA",
    "AssistsStartersB",
    "AssistsBenchB",
    "PointsStartersA",
    "PointsBenchA",
    "PointsStartersB",
    "PointsBenchB",
    "maxA",
    "minutePrevA",
    "prevA",
    "minuteStrA",
    "strA",
    "maxB",
    "minutePrevB",
    "prevB",
    "minuteStrB",
    "strB",
    "maxLeadA",
    "maxLeadB",
    "minuteMaxLeadA",
    "minuteMaxLeadB",
    "puntosMaxLeadA",
    "puntosMaxLeadB",
    "minutoActual",
    "isLive"
})
@Generated("jsonschema2pojo")
public class Comparission {

    @JsonProperty("DefensiveReboundsA")
    private Integer defensiveReboundsA;
    @JsonProperty("OffensiveReboundsB")
    private Integer offensiveReboundsB;
    @JsonProperty("OffensiveReboundsA")
    private Integer offensiveReboundsA;
    @JsonProperty("DefensiveReboundsB")
    private Integer defensiveReboundsB;
    @JsonProperty("TurnoversStartersA")
    private Integer turnoversStartersA;
    @JsonProperty("TurnoversBenchA")
    private Integer turnoversBenchA;
    @JsonProperty("TurnoversStartersB")
    private Integer turnoversStartersB;
    @JsonProperty("TurnoversBenchB")
    private Integer turnoversBenchB;
    @JsonProperty("StealsStartersA")
    private Integer stealsStartersA;
    @JsonProperty("StealsBenchA")
    private Integer stealsBenchA;
    @JsonProperty("StealsStartersB")
    private Integer stealsStartersB;
    @JsonProperty("StealsBenchB")
    private Integer stealsBenchB;
    @JsonProperty("AssistsStartersA")
    private Integer assistsStartersA;
    @JsonProperty("AssistsBenchA")
    private Integer assistsBenchA;
    @JsonProperty("AssistsStartersB")
    private Integer assistsStartersB;
    @JsonProperty("AssistsBenchB")
    private Integer assistsBenchB;
    @JsonProperty("PointsStartersA")
    private Integer pointsStartersA;
    @JsonProperty("PointsBenchA")
    private Integer pointsBenchA;
    @JsonProperty("PointsStartersB")
    private Integer pointsStartersB;
    @JsonProperty("PointsBenchB")
    private Integer pointsBenchB;
    @JsonProperty("maxA")
    private Integer maxA;
    @JsonProperty("minutePrevA")
    private Integer minutePrevA;
    @JsonProperty("prevA")
    private String prevA;
    @JsonProperty("minuteStrA")
    private Integer minuteStrA;
    @JsonProperty("strA")
    private String strA;
    @JsonProperty("maxB")
    private Integer maxB;
    @JsonProperty("minutePrevB")
    private Integer minutePrevB;
    @JsonProperty("prevB")
    private String prevB;
    @JsonProperty("minuteStrB")
    private Integer minuteStrB;
    @JsonProperty("strB")
    private String strB;
    @JsonProperty("maxLeadA")
    private Integer maxLeadA;
    @JsonProperty("maxLeadB")
    private Integer maxLeadB;
    @JsonProperty("minuteMaxLeadA")
    private Integer minuteMaxLeadA;
    @JsonProperty("minuteMaxLeadB")
    private Integer minuteMaxLeadB;
    @JsonProperty("puntosMaxLeadA")
    private String puntosMaxLeadA;
    @JsonProperty("puntosMaxLeadB")
    private String puntosMaxLeadB;
    @JsonProperty("minutoActual")
    private Integer minutoActual;
    @JsonProperty("isLive")
    private Boolean isLive;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DefensiveReboundsA")
    public Integer getDefensiveReboundsA() {
        return defensiveReboundsA;
    }

    @JsonProperty("DefensiveReboundsA")
    public void setDefensiveReboundsA(Integer defensiveReboundsA) {
        this.defensiveReboundsA = defensiveReboundsA;
    }

    @JsonProperty("OffensiveReboundsB")
    public Integer getOffensiveReboundsB() {
        return offensiveReboundsB;
    }

    @JsonProperty("OffensiveReboundsB")
    public void setOffensiveReboundsB(Integer offensiveReboundsB) {
        this.offensiveReboundsB = offensiveReboundsB;
    }

    @JsonProperty("OffensiveReboundsA")
    public Integer getOffensiveReboundsA() {
        return offensiveReboundsA;
    }

    @JsonProperty("OffensiveReboundsA")
    public void setOffensiveReboundsA(Integer offensiveReboundsA) {
        this.offensiveReboundsA = offensiveReboundsA;
    }

    @JsonProperty("DefensiveReboundsB")
    public Integer getDefensiveReboundsB() {
        return defensiveReboundsB;
    }

    @JsonProperty("DefensiveReboundsB")
    public void setDefensiveReboundsB(Integer defensiveReboundsB) {
        this.defensiveReboundsB = defensiveReboundsB;
    }

    @JsonProperty("TurnoversStartersA")
    public Integer getTurnoversStartersA() {
        return turnoversStartersA;
    }

    @JsonProperty("TurnoversStartersA")
    public void setTurnoversStartersA(Integer turnoversStartersA) {
        this.turnoversStartersA = turnoversStartersA;
    }

    @JsonProperty("TurnoversBenchA")
    public Integer getTurnoversBenchA() {
        return turnoversBenchA;
    }

    @JsonProperty("TurnoversBenchA")
    public void setTurnoversBenchA(Integer turnoversBenchA) {
        this.turnoversBenchA = turnoversBenchA;
    }

    @JsonProperty("TurnoversStartersB")
    public Integer getTurnoversStartersB() {
        return turnoversStartersB;
    }

    @JsonProperty("TurnoversStartersB")
    public void setTurnoversStartersB(Integer turnoversStartersB) {
        this.turnoversStartersB = turnoversStartersB;
    }

    @JsonProperty("TurnoversBenchB")
    public Integer getTurnoversBenchB() {
        return turnoversBenchB;
    }

    @JsonProperty("TurnoversBenchB")
    public void setTurnoversBenchB(Integer turnoversBenchB) {
        this.turnoversBenchB = turnoversBenchB;
    }

    @JsonProperty("StealsStartersA")
    public Integer getStealsStartersA() {
        return stealsStartersA;
    }

    @JsonProperty("StealsStartersA")
    public void setStealsStartersA(Integer stealsStartersA) {
        this.stealsStartersA = stealsStartersA;
    }

    @JsonProperty("StealsBenchA")
    public Integer getStealsBenchA() {
        return stealsBenchA;
    }

    @JsonProperty("StealsBenchA")
    public void setStealsBenchA(Integer stealsBenchA) {
        this.stealsBenchA = stealsBenchA;
    }

    @JsonProperty("StealsStartersB")
    public Integer getStealsStartersB() {
        return stealsStartersB;
    }

    @JsonProperty("StealsStartersB")
    public void setStealsStartersB(Integer stealsStartersB) {
        this.stealsStartersB = stealsStartersB;
    }

    @JsonProperty("StealsBenchB")
    public Integer getStealsBenchB() {
        return stealsBenchB;
    }

    @JsonProperty("StealsBenchB")
    public void setStealsBenchB(Integer stealsBenchB) {
        this.stealsBenchB = stealsBenchB;
    }

    @JsonProperty("AssistsStartersA")
    public Integer getAssistsStartersA() {
        return assistsStartersA;
    }

    @JsonProperty("AssistsStartersA")
    public void setAssistsStartersA(Integer assistsStartersA) {
        this.assistsStartersA = assistsStartersA;
    }

    @JsonProperty("AssistsBenchA")
    public Integer getAssistsBenchA() {
        return assistsBenchA;
    }

    @JsonProperty("AssistsBenchA")
    public void setAssistsBenchA(Integer assistsBenchA) {
        this.assistsBenchA = assistsBenchA;
    }

    @JsonProperty("AssistsStartersB")
    public Integer getAssistsStartersB() {
        return assistsStartersB;
    }

    @JsonProperty("AssistsStartersB")
    public void setAssistsStartersB(Integer assistsStartersB) {
        this.assistsStartersB = assistsStartersB;
    }

    @JsonProperty("AssistsBenchB")
    public Integer getAssistsBenchB() {
        return assistsBenchB;
    }

    @JsonProperty("AssistsBenchB")
    public void setAssistsBenchB(Integer assistsBenchB) {
        this.assistsBenchB = assistsBenchB;
    }

    @JsonProperty("PointsStartersA")
    public Integer getPointsStartersA() {
        return pointsStartersA;
    }

    @JsonProperty("PointsStartersA")
    public void setPointsStartersA(Integer pointsStartersA) {
        this.pointsStartersA = pointsStartersA;
    }

    @JsonProperty("PointsBenchA")
    public Integer getPointsBenchA() {
        return pointsBenchA;
    }

    @JsonProperty("PointsBenchA")
    public void setPointsBenchA(Integer pointsBenchA) {
        this.pointsBenchA = pointsBenchA;
    }

    @JsonProperty("PointsStartersB")
    public Integer getPointsStartersB() {
        return pointsStartersB;
    }

    @JsonProperty("PointsStartersB")
    public void setPointsStartersB(Integer pointsStartersB) {
        this.pointsStartersB = pointsStartersB;
    }

    @JsonProperty("PointsBenchB")
    public Integer getPointsBenchB() {
        return pointsBenchB;
    }

    @JsonProperty("PointsBenchB")
    public void setPointsBenchB(Integer pointsBenchB) {
        this.pointsBenchB = pointsBenchB;
    }

    @JsonProperty("maxA")
    public Integer getMaxA() {
        return maxA;
    }

    @JsonProperty("maxA")
    public void setMaxA(Integer maxA) {
        this.maxA = maxA;
    }

    @JsonProperty("minutePrevA")
    public Integer getMinutePrevA() {
        return minutePrevA;
    }

    @JsonProperty("minutePrevA")
    public void setMinutePrevA(Integer minutePrevA) {
        this.minutePrevA = minutePrevA;
    }

    @JsonProperty("prevA")
    public String getPrevA() {
        return prevA;
    }

    @JsonProperty("prevA")
    public void setPrevA(String prevA) {
        this.prevA = prevA;
    }

    @JsonProperty("minuteStrA")
    public Integer getMinuteStrA() {
        return minuteStrA;
    }

    @JsonProperty("minuteStrA")
    public void setMinuteStrA(Integer minuteStrA) {
        this.minuteStrA = minuteStrA;
    }

    @JsonProperty("strA")
    public String getStrA() {
        return strA;
    }

    @JsonProperty("strA")
    public void setStrA(String strA) {
        this.strA = strA;
    }

    @JsonProperty("maxB")
    public Integer getMaxB() {
        return maxB;
    }

    @JsonProperty("maxB")
    public void setMaxB(Integer maxB) {
        this.maxB = maxB;
    }

    @JsonProperty("minutePrevB")
    public Integer getMinutePrevB() {
        return minutePrevB;
    }

    @JsonProperty("minutePrevB")
    public void setMinutePrevB(Integer minutePrevB) {
        this.minutePrevB = minutePrevB;
    }

    @JsonProperty("prevB")
    public String getPrevB() {
        return prevB;
    }

    @JsonProperty("prevB")
    public void setPrevB(String prevB) {
        this.prevB = prevB;
    }

    @JsonProperty("minuteStrB")
    public Integer getMinuteStrB() {
        return minuteStrB;
    }

    @JsonProperty("minuteStrB")
    public void setMinuteStrB(Integer minuteStrB) {
        this.minuteStrB = minuteStrB;
    }

    @JsonProperty("strB")
    public String getStrB() {
        return strB;
    }

    @JsonProperty("strB")
    public void setStrB(String strB) {
        this.strB = strB;
    }

    @JsonProperty("maxLeadA")
    public Integer getMaxLeadA() {
        return maxLeadA;
    }

    @JsonProperty("maxLeadA")
    public void setMaxLeadA(Integer maxLeadA) {
        this.maxLeadA = maxLeadA;
    }

    @JsonProperty("maxLeadB")
    public Integer getMaxLeadB() {
        return maxLeadB;
    }

    @JsonProperty("maxLeadB")
    public void setMaxLeadB(Integer maxLeadB) {
        this.maxLeadB = maxLeadB;
    }

    @JsonProperty("minuteMaxLeadA")
    public Integer getMinuteMaxLeadA() {
        return minuteMaxLeadA;
    }

    @JsonProperty("minuteMaxLeadA")
    public void setMinuteMaxLeadA(Integer minuteMaxLeadA) {
        this.minuteMaxLeadA = minuteMaxLeadA;
    }

    @JsonProperty("minuteMaxLeadB")
    public Integer getMinuteMaxLeadB() {
        return minuteMaxLeadB;
    }

    @JsonProperty("minuteMaxLeadB")
    public void setMinuteMaxLeadB(Integer minuteMaxLeadB) {
        this.minuteMaxLeadB = minuteMaxLeadB;
    }

    @JsonProperty("puntosMaxLeadA")
    public String getPuntosMaxLeadA() {
        return puntosMaxLeadA;
    }

    @JsonProperty("puntosMaxLeadA")
    public void setPuntosMaxLeadA(String puntosMaxLeadA) {
        this.puntosMaxLeadA = puntosMaxLeadA;
    }

    @JsonProperty("puntosMaxLeadB")
    public String getPuntosMaxLeadB() {
        return puntosMaxLeadB;
    }

    @JsonProperty("puntosMaxLeadB")
    public void setPuntosMaxLeadB(String puntosMaxLeadB) {
        this.puntosMaxLeadB = puntosMaxLeadB;
    }

    @JsonProperty("minutoActual")
    public Integer getMinutoActual() {
        return minutoActual;
    }

    @JsonProperty("minutoActual")
    public void setMinutoActual(Integer minutoActual) {
        this.minutoActual = minutoActual;
    }

    @JsonProperty("isLive")
    public Boolean getIsLive() {
        return isLive;
    }

    @JsonProperty("isLive")
    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
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
