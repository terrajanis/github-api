
package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class License {

    private String key;

    private String name;

    @JsonProperty("node_id")
    private String nodeId;

    @JsonProperty("spdx_id")
    private String spdxId;

    @JsonProperty
    private String url;
}
