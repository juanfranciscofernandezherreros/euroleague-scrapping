
package com.fernandez.basketball.euroleague.match.playbyplay.dto;

import com.fasterxml.jackson.annotation.*;
import com.fernandez.basketball.euroleague.match.header.dto.Header;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class MatchDTO {
    private Long id;
    @JsonProperty("Live")
    private Boolean live;
    @JsonProperty("TeamA")
    private String teamA;
    @JsonProperty("TeamB")
    private String teamB;
    @JsonProperty("CodeTeamA")
    private String codeTeamA;
    @JsonProperty("CodeTeamB")
    private String codeTeamB;
    @JsonProperty("ActualQuarter")
    private Integer actualQuarter;
    @JsonProperty("firstQuarterDTO")
    private List<FirstQuarterDTO> firstQuarter = null;
    @JsonProperty("secondQuarterDTO")
    private List<SecondQuarterDTO> secondQuarter = null;
    @JsonProperty("thirdQuarterDTO")
    private List<ThirdQuarterDTO> thirdQuarter = null;
    @JsonProperty("forthQuarterDTO")
    private List<ForthQuarterDTO> forthQuarter = null;
    @JsonProperty("extraTimeDTO")
    private List<ExtraTimeDTO> extraTime = null;
    private boolean markAsFavourite;
    private Header header;
    private String gameCode;
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

    @JsonProperty("CodeTeamB")
    public String getCodeTeamB() {
        return codeTeamB;
    }

    @JsonProperty("CodeTeamB")
    public void setCodeTeamB(String codeTeamB) {
        this.codeTeamB = codeTeamB;
    }

    @JsonProperty("ActualQuarter")
    public Integer getActualQuarter() {
        return actualQuarter;
    }

    @JsonProperty("ActualQuarter")
    public void setActualQuarter(Integer actualQuarter) {
        this.actualQuarter = actualQuarter;
    }

    @JsonProperty("firstQuarterDTO")
    public List<FirstQuarterDTO> getFirstQuarter() {
        return firstQuarter;
    }

    @JsonProperty("FirstQuarter")
    public void setFirstQuarter(List<FirstQuarterDTO> firstQuarter) {
        this.firstQuarter = firstQuarter;
    }

    @JsonProperty("secondQuarterDTO")
    public List<SecondQuarterDTO> getSecondQuarter() {
        return secondQuarter;
    }

    @JsonProperty("SecondQuarter")
    public void setSecondQuarter(List<SecondQuarterDTO> secondQuarter) {
        this.secondQuarter = secondQuarter;
    }

    @JsonProperty("thirdQuarterDTO")
    public List<ThirdQuarterDTO> getThirdQuarter() {
        return thirdQuarter;
    }

    @JsonProperty("ThirdQuarter")
    public void setThirdQuarter(List<ThirdQuarterDTO> thirdQuarter) {
        this.thirdQuarter = thirdQuarter;
    }

    @JsonProperty("forthQuarterDTO")
    public List<ForthQuarterDTO> getForthQuarter() {
        return forthQuarter;
    }

    @JsonProperty("ForthQuarter")
    public void setForthQuarter(List<ForthQuarterDTO> forthQuarter) {
        this.forthQuarter = forthQuarter;
    }

    @JsonProperty("extraTimeDTO")
    public List<ExtraTimeDTO> getExtraTime() {
        return extraTime;
    }

    @JsonProperty("ExtraTime")
    public void setExtraTime(List<ExtraTimeDTO> extraTime) {
        this.extraTime = extraTime;
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

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    @Override
    public String toString() {
        return "MatchDTO{" +
                "id=" + id +
                ", live=" + live +
                ", teamA='" + teamA + '\'' +
                ", teamB='" + teamB + '\'' +
                ", codeTeamA='" + codeTeamA + '\'' +
                ", codeTeamB='" + codeTeamB + '\'' +
                ", actualQuarter=" + actualQuarter +
                ", firstQuarter=" + firstQuarter +
                ", secondQuarter=" + secondQuarter +
                ", thirdQuarter=" + thirdQuarter +
                ", forthQuarter=" + forthQuarter +
                ", extraTime=" + extraTime +
                ", markAsFavourite=" + markAsFavourite +
                ", header=" + header +
                ", gameCode='" + gameCode + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
