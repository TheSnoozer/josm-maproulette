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

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelChallengeComment;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelComment;
import io.github.thesnoozer.maproulette.client.model.TaskBundle;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CommentApi
 */
@Ignore
public class CommentApiTest {

    private final CommentApi api = new CommentApi();

    /**
     * Adds comment to Task
     *
     * Adds a comment to a Task
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addTest() throws Exception {
        Long id = null;
        String comment = null;
        Long actionId = null;
        OrgMaprouletteFrameworkModelComment response = api.add(id, comment, actionId);

        // TODO: test validations
    }
    /**
     * Adds comment to Challenge
     *
     * Adds a comment to a Task
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addChallengeCommentTest() throws Exception {
        Long id = null;
        String comment = null;
        OrgMaprouletteFrameworkModelChallengeComment response = api.addChallengeComment(id, comment);

        // TODO: test validations
    }
    /**
     * Adds comment to each Task in a Task Bundle
     *
     * Adds a comment to each Task in Bundle
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addToBundleTasksTest() throws Exception {
        Long id = null;
        String comment = null;
        Long actionId = null;
        TaskBundle response = api.addToBundleTasks(id, comment, actionId);

        // TODO: test validations
    }
    /**
     * Deletes comment from Task
     *
     * Deletes a comment from the specific Task
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws Exception {
        Long id = null;
        Long commentId = null;
        api.delete(id, commentId);

        // TODO: test validations
    }
    /**
     * Retrieves comments for a Task
     *
     * Retrieves all the comments for a specific Task
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findTest() throws Exception {
        Long id = null;
        List<OrgMaprouletteFrameworkModelComment> response = api.find(id);

        // TODO: test validations
    }
    /**
     * Retrieves comments for a Challenge
     *
     * Retrieves all the challenge comments for a specific Challenge
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findChallengeCommentsTest() throws Exception {
        Long id = null;
        List<OrgMaprouletteFrameworkModelChallengeComment> response = api.findChallengeComments(id);

        // TODO: test validations
    }
    /**
     * Retrieves a comment
     *
     * Retrieves a comment based on a specific ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void retrieveTest() throws Exception {
        Long id = null;
        OrgMaprouletteFrameworkModelComment response = api.retrieve(id);

        // TODO: test validations
    }
    /**
     * Update comment on Task
     *
     * Updates an existing comment on a Task. Only the original user who made the comment or a SuperUser can update the comment
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws Exception {
        Long commentId = null;
        String comment = null;
        OrgMaprouletteFrameworkModelComment response = api.update(commentId, comment);

        // TODO: test validations
    }
}
