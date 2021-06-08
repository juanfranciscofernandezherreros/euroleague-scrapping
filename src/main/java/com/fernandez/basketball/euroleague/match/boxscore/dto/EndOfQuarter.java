
package com.fernandez.basketball.euroleague.match.boxscore.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Team",
    "Quarter1",
    "Quarter2",
    "Quarter3",
    "Quarter4"
})
@Generated("jsonschema2pojo")
public class EndOfQuarter {

    @JsonProperty("Team")
    private String team;
    @JsonProperty("Quarter1")
    private Integer quarter1;
    @JsonProperty("Quarter2")
    private Integer quarter2;
    @JsonProperty("Quarter3")
    private Integer quarter3;
    @JsonProperty("Quarter4")
    private Integer quarter4;
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

    @JsonProperty("Quarter1")
    public Integer getQuarter1() {
        return quarter1;
    }

    @JsonProperty("Quarter1")
    public void setQuarter1(Integer quarter1) {
        this.quarter1 = quarter1;
    }

    @JsonProperty("Quarter2")
    public Integer getQuarter2() {
        return quarter2;
    }

    @JsonProperty("Quarter2")
    public void setQuarter2(Integer quarter2) {
        this.quarter2 = quarter2;
    }

    @JsonProperty("Quarter3")
    public Integer getQuarter3() {
        return quarter3;
    }

    @JsonProperty("Quarter3")
    public void setQuarter3(Integer quarter3) {
        this.quarter3 = quarter3;
    }

    @JsonProperty("Quarter4")
    public Integer getQuarter4() {
        return quarter4;
    }

    @JsonProperty("Quarter4")
    public void setQuarter4(Integer quarter4) {
        this.quarter4 = quarter4;
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
