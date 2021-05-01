
package com.fernandez.basketball.euroleague.match.shootingChart.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Minutes",
    "Points",
    "FieldGoalsMade2",
    "FieldGoalsAttempted2",
    "FieldGoalsMade3",
    "FieldGoalsAttempted3",
    "FreeThrowsMade",
    "FreeThrowsAttempted",
    "OffensiveRebounds",
    "DefensiveRebounds",
    "TotalRebounds",
    "Assistances",
    "Steals",
    "Turnovers",
    "BlocksFavour",
    "BlocksAgainst",
    "FoulsCommited",
    "FoulsReceived",
    "Valuation"
})
@Generated("jsonschema2pojo")
public class Totr {

    @JsonProperty("Minutes")
    private String minutes;
    @JsonProperty("Points")
    private Integer points;
    @JsonProperty("FieldGoalsMade2")
    private Integer fieldGoalsMade2;
    @JsonProperty("FieldGoalsAttempted2")
    private Integer fieldGoalsAttempted2;
    @JsonProperty("FieldGoalsMade3")
    private Integer fieldGoalsMade3;
    @JsonProperty("FieldGoalsAttempted3")
    private Integer fieldGoalsAttempted3;
    @JsonProperty("FreeThrowsMade")
    private Integer freeThrowsMade;
    @JsonProperty("FreeThrowsAttempted")
    private Integer freeThrowsAttempted;
    @JsonProperty("OffensiveRebounds")
    private Integer offensiveRebounds;
    @JsonProperty("DefensiveRebounds")
    private Integer defensiveRebounds;
    @JsonProperty("TotalRebounds")
    private Integer totalRebounds;
    @JsonProperty("Assistances")
    private Integer assistances;
    @JsonProperty("Steals")
    private Integer steals;
    @JsonProperty("Turnovers")
    private Integer turnovers;
    @JsonProperty("BlocksFavour")
    private Integer blocksFavour;
    @JsonProperty("BlocksAgainst")
    private Integer blocksAgainst;
    @JsonProperty("FoulsCommited")
    private Integer foulsCommited;
    @JsonProperty("FoulsReceived")
    private Integer foulsReceived;
    @JsonProperty("Valuation")
    private Integer valuation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Minutes")
    public String getMinutes() {
        return minutes;
    }

    @JsonProperty("Minutes")
    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    @JsonProperty("Points")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("Points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonProperty("FieldGoalsMade2")
    public Integer getFieldGoalsMade2() {
        return fieldGoalsMade2;
    }

    @JsonProperty("FieldGoalsMade2")
    public void setFieldGoalsMade2(Integer fieldGoalsMade2) {
        this.fieldGoalsMade2 = fieldGoalsMade2;
    }

    @JsonProperty("FieldGoalsAttempted2")
    public Integer getFieldGoalsAttempted2() {
        return fieldGoalsAttempted2;
    }

    @JsonProperty("FieldGoalsAttempted2")
    public void setFieldGoalsAttempted2(Integer fieldGoalsAttempted2) {
        this.fieldGoalsAttempted2 = fieldGoalsAttempted2;
    }

    @JsonProperty("FieldGoalsMade3")
    public Integer getFieldGoalsMade3() {
        return fieldGoalsMade3;
    }

    @JsonProperty("FieldGoalsMade3")
    public void setFieldGoalsMade3(Integer fieldGoalsMade3) {
        this.fieldGoalsMade3 = fieldGoalsMade3;
    }

    @JsonProperty("FieldGoalsAttempted3")
    public Integer getFieldGoalsAttempted3() {
        return fieldGoalsAttempted3;
    }

    @JsonProperty("FieldGoalsAttempted3")
    public void setFieldGoalsAttempted3(Integer fieldGoalsAttempted3) {
        this.fieldGoalsAttempted3 = fieldGoalsAttempted3;
    }

    @JsonProperty("FreeThrowsMade")
    public Integer getFreeThrowsMade() {
        return freeThrowsMade;
    }

    @JsonProperty("FreeThrowsMade")
    public void setFreeThrowsMade(Integer freeThrowsMade) {
        this.freeThrowsMade = freeThrowsMade;
    }

    @JsonProperty("FreeThrowsAttempted")
    public Integer getFreeThrowsAttempted() {
        return freeThrowsAttempted;
    }

    @JsonProperty("FreeThrowsAttempted")
    public void setFreeThrowsAttempted(Integer freeThrowsAttempted) {
        this.freeThrowsAttempted = freeThrowsAttempted;
    }

    @JsonProperty("OffensiveRebounds")
    public Integer getOffensiveRebounds() {
        return offensiveRebounds;
    }

    @JsonProperty("OffensiveRebounds")
    public void setOffensiveRebounds(Integer offensiveRebounds) {
        this.offensiveRebounds = offensiveRebounds;
    }

    @JsonProperty("DefensiveRebounds")
    public Integer getDefensiveRebounds() {
        return defensiveRebounds;
    }

    @JsonProperty("DefensiveRebounds")
    public void setDefensiveRebounds(Integer defensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
    }

    @JsonProperty("TotalRebounds")
    public Integer getTotalRebounds() {
        return totalRebounds;
    }

    @JsonProperty("TotalRebounds")
    public void setTotalRebounds(Integer totalRebounds) {
        this.totalRebounds = totalRebounds;
    }

    @JsonProperty("Assistances")
    public Integer getAssistances() {
        return assistances;
    }

    @JsonProperty("Assistances")
    public void setAssistances(Integer assistances) {
        this.assistances = assistances;
    }

    @JsonProperty("Steals")
    public Integer getSteals() {
        return steals;
    }

    @JsonProperty("Steals")
    public void setSteals(Integer steals) {
        this.steals = steals;
    }

    @JsonProperty("Turnovers")
    public Integer getTurnovers() {
        return turnovers;
    }

    @JsonProperty("Turnovers")
    public void setTurnovers(Integer turnovers) {
        this.turnovers = turnovers;
    }

    @JsonProperty("BlocksFavour")
    public Integer getBlocksFavour() {
        return blocksFavour;
    }

    @JsonProperty("BlocksFavour")
    public void setBlocksFavour(Integer blocksFavour) {
        this.blocksFavour = blocksFavour;
    }

    @JsonProperty("BlocksAgainst")
    public Integer getBlocksAgainst() {
        return blocksAgainst;
    }

    @JsonProperty("BlocksAgainst")
    public void setBlocksAgainst(Integer blocksAgainst) {
        this.blocksAgainst = blocksAgainst;
    }

    @JsonProperty("FoulsCommited")
    public Integer getFoulsCommited() {
        return foulsCommited;
    }

    @JsonProperty("FoulsCommited")
    public void setFoulsCommited(Integer foulsCommited) {
        this.foulsCommited = foulsCommited;
    }

    @JsonProperty("FoulsReceived")
    public Integer getFoulsReceived() {
        return foulsReceived;
    }

    @JsonProperty("FoulsReceived")
    public void setFoulsReceived(Integer foulsReceived) {
        this.foulsReceived = foulsReceived;
    }

    @JsonProperty("Valuation")
    public Integer getValuation() {
        return valuation;
    }

    @JsonProperty("Valuation")
    public void setValuation(Integer valuation) {
        this.valuation = valuation;
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
