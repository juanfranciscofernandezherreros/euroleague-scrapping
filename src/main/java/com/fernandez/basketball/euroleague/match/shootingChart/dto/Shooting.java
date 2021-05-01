
package com.fernandez.basketball.euroleague.match.shootingChart.dto;

import java.util.HashMap;
import java.util.List;
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
    "Live",
    "Referees",
    "Attendance",
    "ByQuarter",
    "EndOfQuarter",
    "Stats"
})
@Generated("jsonschema2pojo")
public class Shooting {

    @JsonProperty("Live")
    private Boolean live;
    @JsonProperty("Referees")
    private String referees;
    @JsonProperty("Attendance")
    private String attendance;
    @JsonProperty("ByQuarter")
    private List<ByQuarter> byQuarter = null;
    @JsonProperty("EndOfQuarter")
    private List<EndOfQuarter> endOfQuarter = null;
    @JsonProperty("Stats")
    private List<Stat> stats = null;
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

    @JsonProperty("Referees")
    public String getReferees() {
        return referees;
    }

    @JsonProperty("Referees")
    public void setReferees(String referees) {
        this.referees = referees;
    }

    @JsonProperty("Attendance")
    public String getAttendance() {
        return attendance;
    }

    @JsonProperty("Attendance")
    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    @JsonProperty("ByQuarter")
    public List<ByQuarter> getByQuarter() {
        return byQuarter;
    }

    @JsonProperty("ByQuarter")
    public void setByQuarter(List<ByQuarter> byQuarter) {
        this.byQuarter = byQuarter;
    }

    @JsonProperty("EndOfQuarter")
    public List<EndOfQuarter> getEndOfQuarter() {
        return endOfQuarter;
    }

    @JsonProperty("EndOfQuarter")
    public void setEndOfQuarter(List<EndOfQuarter> endOfQuarter) {
        this.endOfQuarter = endOfQuarter;
    }

    @JsonProperty("Stats")
    public List<Stat> getStats() {
        return stats;
    }

    @JsonProperty("Stats")
    public void setStats(List<Stat> stats) {
        this.stats = stats;
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
