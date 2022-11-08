/*
 * MapRoulette API
 * API for MapRoulette enabling the creation and maintenance of MapRoulette challenges
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.github.thesnoozer.maproulette.client.api;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LeaderboardApi
 */
@Ignore
public class LeaderboardApiTest {

    private final LeaderboardApi api = new LeaderboardApi();

    /**
     * Fetches leaderboard stats with ranking for the user
     *
     * Fetches user&#x27;s current ranking and stats in the leaderboard along with a number of mappers above and below in the rankings.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLeaderboardForUserTest() throws Exception {
        Long userId = null;
        Integer bracket = null;
        Object projectIds = null;
        Object challengeIds = null;
        Object countryCodes = null;
        Object monthDuration = null;
        Object start = null;
        Object end = null;
        Object onlyEnabled = null;
        api.getLeaderboardForUser(userId, bracket, projectIds, challengeIds, countryCodes, monthDuration, start, end, onlyEnabled);

        // TODO: test validations
    }
    /**
     * Fetches the mapper leaderboard stats
     *
     * Fetches the mapper leaderboard stats
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMapperLeaderboardTest() throws Exception {
        Integer limit = null;
        Integer offset = null;
        Object userIds = null;
        Object projectIds = null;
        Object challengeIds = null;
        Object countryCodes = null;
        Object monthDuration = null;
        Object start = null;
        Object end = null;
        Object onlyEnabled = null;
        api.getMapperLeaderboard(limit, offset, userIds, projectIds, challengeIds, countryCodes, monthDuration, start, end, onlyEnabled);

        // TODO: test validations
    }
    /**
     * Fetches the reviewer leaderboard stats
     *
     * Fetches the reviewer leaderboard stats
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getReviewerLeaderboardTest() throws Exception {
        Integer limit = null;
        Integer offset = null;
        Object projectIds = null;
        Object challengeIds = null;
        Object monthDuration = null;
        Object start = null;
        Object end = null;
        api.getReviewerLeaderboard(limit, offset, projectIds, challengeIds, monthDuration, start, end);

        // TODO: test validations
    }
    /**
     * Gets the top challenges worked on by the user
     *
     * Gets the top challenges worked on by the user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserTopChallengesTest() throws Exception {
        Long userId = null;
        Integer limit = null;
        Integer offset = null;
        Object projectIds = null;
        Object challengeIds = null;
        Object countryCodes = null;
        Object monthDuration = null;
        Object start = null;
        Object end = null;
        Object onlyEnabled = null;
        api.getUserTopChallenges(userId, limit, offset, projectIds, challengeIds, countryCodes, monthDuration, start, end, onlyEnabled);

        // TODO: test validations
    }
}
