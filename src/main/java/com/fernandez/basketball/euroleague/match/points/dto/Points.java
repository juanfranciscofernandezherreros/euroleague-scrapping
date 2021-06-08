
package com.fernandez.basketball.euroleague.match.points.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Rows"
})
@Generated("jsonschema2pojo")
public class Points {

    @JsonProperty("Rows")
    private List<Row> rows = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Rows")
    public List<Row> getRows() {
        return rows;
    }

    @JsonProperty("Rows")
    public void setRows(List<Row> rows) {
        this.rows = rows;
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
