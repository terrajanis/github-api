import helpers.RequestHelper;
import models.Release;
import models.RepositoryInfo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final String BASE_PATH = "repos/selenide/selenide";

    public static void main(String[] args) throws IOException {
        RequestHelper requestHelper = new RequestHelper();
        RepositoryInfo repositoryInfo = requestHelper.get(RepositoryInfo.class, BASE_PATH);
        List<Release> releases = Arrays.asList(requestHelper.get(Release[].class, BASE_PATH + "/releases", Collections.singletonMap("per_page", "1000")));
        Release lastRelease = requestHelper.get(Release.class, BASE_PATH + "/releases/latest");
        System.out.println(BASE_PATH.replace("repos/", ""));
        System.out.println("Stars: " + repositoryInfo.getStargazersCount());
        System.out.println("Releases: " + releases.size());
        System.out.println("Last release: " + lastRelease.getUrl());
    }
}
