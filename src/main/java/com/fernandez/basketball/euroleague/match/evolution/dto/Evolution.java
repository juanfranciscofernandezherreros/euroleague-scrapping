
package com.fernandez.basketball.euroleague.match.evolution.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PointsList",
    "MinutesList",
    "ScoreDiffPerMinute",
    "LargestDifference",
    "MinuteMaxA",
    "MinuteMaxB",
    "ScoreMaxA",
    "ScoreMaxB",
    "difp",
    "dA",
    "dB"
})
@Generated("jsonschema2pojo")
public class Evolution {

    @JsonProperty("PointsList")
    private List<List<Integer>> pointsList = null;
    @JsonProperty("MinutesList")
    private List<Integer> minutesList = null;
    @JsonProperty("ScoreDiffPerMinute")
    private List<List<Integer>> scoreDiffPerMinute = null;
    @JsonProperty("LargestDifference")
    private List<List<Integer>> largestDifference = null;
    @JsonProperty("MinuteMaxA")
    private Integer minuteMaxA;
    @JsonProperty("MinuteMaxB")
    private Integer minuteMaxB;
    @JsonProperty("ScoreMaxA")
    private String scoreMaxA;
    @JsonProperty("ScoreMaxB")
    private String scoreMaxB;
    @JsonProperty("difp")
    private Object difp;
    @JsonProperty("dA")
    private Object dA;
    @JsonProperty("dB")
    private Object dB;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PointsList")
    public List<List<Integer>> getPointsList() {
        return pointsList;
    }

    @JsonProperty("PointsList")
    public void setPointsList(List<List<Integer>> pointsList) {
        this.pointsList = pointsList;
    }

    @JsonProperty("MinutesList")
    public List<Integer> getMinutesList() {
        return minutesList;
    }

    @JsonProperty("MinutesList")
    public void setMinutesList(List<Integer> minutesList) {
        this.minutesList = minutesList;
    }

    @JsonProperty("ScoreDiffPerMinute")
    public List<List<Integer>> getScoreDiffPerMinute() {
        return scoreDiffPerMinute;
    }

    @JsonProperty("ScoreDiffPerMinute")
    public void setScoreDiffPerMinute(List<List<Integer>> scoreDiffPerMinute) {
        this.scoreDiffPerMinute = scoreDiffPerMinute;
    }

    @JsonProperty("LargestDifference")
    public List<List<Integer>> getLargestDifference() {
        return largestDifference;
    }

    @JsonProperty("LargestDifference")
    public void setLargestDifference(List<List<Integer>> largestDifference) {
        this.largestDifference = largestDifference;
    }

    @JsonProperty("MinuteMaxA")
    public Integer getMinuteMaxA() {
        return minuteMaxA;
    }

    @JsonProperty("MinuteMaxA")
    public void setMinuteMaxA(Integer minuteMaxA) {
        this.minuteMaxA = minuteMaxA;
    }

    @JsonProperty("MinuteMaxB")
    public Integer getMinuteMaxB() {
        return minuteMaxB;
    }

    @JsonProperty("MinuteMaxB")
    public void setMinuteMaxB(Integer minuteMaxB) {
        this.minuteMaxB = minuteMaxB;
    }

    @JsonProperty("ScoreMaxA")
    public String getScoreMaxA() {
        return scoreMaxA;
    }

    @JsonProperty("ScoreMaxA")
    public void setScoreMaxA(String scoreMaxA) {
        this.scoreMaxA = scoreMaxA;
    }

    @JsonProperty("ScoreMaxB")
    public String getScoreMaxB() {
        return scoreMaxB;
    }

    @JsonProperty("ScoreMaxB")
    public void setScoreMaxB(String scoreMaxB) {
        this.scoreMaxB = scoreMaxB;
    }

    @JsonProperty("difp")
    public Object getDifp() {
        return difp;
    }

    @JsonProperty("difp")
    public void setDifp(Object difp) {
        this.difp = difp;
    }

    @JsonProperty("dA")
    public Object getdA() {
        return dA;
    }

    @JsonProperty("dA")
    public void setdA(Object dA) {
        this.dA = dA;
    }

    @JsonProperty("dB")
    public Object getdB() {
        return dB;
    }

    @JsonProperty("dB")
    public void setdB(Object dB) {
        this.dB = dB;
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
