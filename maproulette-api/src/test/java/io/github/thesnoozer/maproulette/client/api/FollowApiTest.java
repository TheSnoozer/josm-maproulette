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

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelUser;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FollowApi
 */
@Ignore
public class FollowApiTest {

    private final FollowApi api = new FollowApi();

    /**
     * Block a follower
     *
     * Prevent a user from following this user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void blockTest() throws Exception {
        Long userId = null;
        OrgMaprouletteFrameworkModelUser response = api.block(userId);

        // TODO: test validations
    }
    /**
     * Follow a user
     *
     * Begin following a user&#x27;s MapRoulette activity
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void followTest() throws Exception {
        Long userId = null;
        OrgMaprouletteFrameworkModelUser response = api.follow(userId);

        // TODO: test validations
    }
    /**
     * Get users being followed by a user
     *
     * Get users being followed by a user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void followedByTest() throws Exception {
        Long userId = null;
        OrgMaprouletteFrameworkModelUser response = api.followedBy(userId);

        // TODO: test validations
    }
    /**
     * Get users following a user
     *
     * Get users following a user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void followersOfTest() throws Exception {
        Long userId = null;
        OrgMaprouletteFrameworkModelUser response = api.followersOf(userId);

        // TODO: test validations
    }
    /**
     * Stop blocking a follower
     *
     * Remove block preventing a user from following this user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unblockTest() throws Exception {
        Long userId = null;
        OrgMaprouletteFrameworkModelUser response = api.unblock(userId);

        // TODO: test validations
    }
    /**
     * Stop following a user
     *
     * Stop following a user&#x27;s MapRoulette activity
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unfollowTest() throws Exception {
        Long userId = null;
        OrgMaprouletteFrameworkModelUser response = api.unfollow(userId);

        // TODO: test validations
    }
}
