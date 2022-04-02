
package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Owner {

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("events_url")
    private String eventsUrl;

    @JsonProperty("followers_url")
    private String followersUrl;

    @JsonProperty("following_url")
    private String followingUrl;

    @JsonProperty("gists_url")
    private String gistsUrl;

    @JsonProperty("gravatar_id")
    private String gravatarId;

    @JsonProperty("html_url")
    private String htmlUrl;

    private Long id;

    private String login;

    @JsonProperty("node_id")
    private String nodeId;

    @JsonProperty("organizations_url")
    private String organizationsUrl;

    @JsonProperty("received_events_url")
    private String receivedEventsUrl;

    @JsonProperty("repos_url")
    private String reposUrl;

    @JsonProperty("site_admin")
    private Boolean siteAdmin;

    @JsonProperty("starred_url")
    private String starredUrl;

    @JsonProperty("subscriptions_url")
    private String subscriptionsUrl;

    private String type;

    private String url;
}
