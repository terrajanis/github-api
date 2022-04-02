
package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Release {

    private List<Object> assets;

    @JsonProperty("assets_url")
    private String assetsUrl;

    private Author author;

    private String body;

    @JsonProperty("created_at")
    private String createdAt;

    private Boolean draft;

    @JsonProperty("html_url")
    private String htmlUrl;

    private Long id;

    @JsonProperty("mentions_count")
    private Integer mentionsCount;

    private String name;

    @JsonProperty("node_id")
    private String nodeId;

    private Boolean prerelease;

    @JsonProperty("published_at")
    private String publishedAt;

    @JsonProperty("tag_name")
    private String tagName;

    @JsonProperty("tarball_url")
    private String tarballUrl;

    @JsonProperty("target_commitish")
    private String targetCommitish;

    @JsonProperty("upload_url")
    private String uploadUrl;

    private String url;

    @JsonProperty("zipball_url")
    private String zipballUrl;
}
