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

import io.github.thesnoozer.maproulette.client.model.TaskBundle;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BundleApi
 */
@Ignore
public class BundleApiTest {

    private final BundleApi api = new BundleApi();

    /**
     * Create a task bundle
     *
     * Create a new task bundle with the task ids in the supplied JSON body.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTaskBundleTest() throws Exception {
        TaskBundle body = null;
        String apiKey = null;
        TaskBundle response = api.createTaskBundle(body, apiKey);

        // TODO: test validations
    }
    /**
     * Deletes a Task Bundle
     *
     * Deletes a task bundle based on the supplied id
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteTaskBundleTest() throws Exception {
        Long id = null;
        String apiKey = null;
        Long primaryId = null;
        api.deleteTaskBundle(id, apiKey, primaryId);

        // TODO: test validations
    }
    /**
     * Gets a Task Bundle
     *
     * Gets a task bundle based on the supplied id
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTaskBundleTest() throws Exception {
        Long id = null;
        String apiKey = null;
        TaskBundle response = api.getTaskBundle(id, apiKey);

        // TODO: test validations
    }
    /**
     * Unbundles tasks from Task Bundle
     *
     * Removes a list of tasks from a bundle of tasks
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unbundleTasksTest() throws Exception {
        Long id = null;
        List<Long> taskIds = null;
        String apiKey = null;
        TaskBundle response = api.unbundleTasks(id, taskIds, apiKey);

        // TODO: test validations
    }
}
