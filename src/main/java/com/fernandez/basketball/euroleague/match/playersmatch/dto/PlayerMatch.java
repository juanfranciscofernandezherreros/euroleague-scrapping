package com.fernandez.basketball.euroleague.match.playersmatch.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "c",
        "ac",
        "na",
        "nu",
        "st",
        "sl",
        "nn",
        "p",
        "im"
})
@Generated("jsonschema2pojo")
public class PlayerMatch {

    @JsonProperty("c")
    private String c;
    @JsonProperty("ac")
    private String ac;
    @JsonProperty("na")
    private String na;
    @JsonProperty("nu")
    private String nu;
    @JsonProperty("st")
    private Integer st;
    @JsonProperty("sl")
    private Integer sl;
    @JsonProperty("nn")
    private Integer nn;
    @JsonProperty("p")
    private String p;
    @JsonProperty("im")
    private String im;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("c")
    public String getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(String c) {
        this.c = c;
    }

    @JsonProperty("ac")
    public String getAc() {
        return ac;
    }

    @JsonProperty("ac")
    public void setAc(String ac) {
        this.ac = ac;
    }

    @JsonProperty("na")
    public String getNa() {
        return na;
    }

    @JsonProperty("na")
    public void setNa(String na) {
        this.na = na;
    }

    @JsonProperty("nu")
    public String getNu() {
        return nu;
    }

    @JsonProperty("nu")
    public void setNu(String nu) {
        this.nu = nu;
    }

    @JsonProperty("st")
    public Integer getSt() {
        return st;
    }

    @JsonProperty("st")
    public void setSt(Integer st) {
        this.st = st;
    }

    @JsonProperty("sl")
    public Integer getSl() {
        return sl;
    }

    @JsonProperty("sl")
    public void setSl(Integer sl) {
        this.sl = sl;
    }

    @JsonProperty("nn")
    public Integer getNn() {
        return nn;
    }

    @JsonProperty("nn")
    public void setNn(Integer nn) {
        this.nn = nn;
    }

    @JsonProperty("p")
    public String getP() {
        return p;
    }

    @JsonProperty("p")
    public void setP(String p) {
        this.p = p;
    }

    @JsonProperty("im")
    public String getIm() {
        return im;
    }

    @JsonProperty("im")
    public void setIm(String im) {
        this.im = im;
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
