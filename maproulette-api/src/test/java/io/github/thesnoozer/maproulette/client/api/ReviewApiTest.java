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

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelReviewMetrics;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTask;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTaskCluster;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ReviewApi
 */
@Ignore
public class ReviewApiTest {

    private final ReviewApi api = new ReviewApi();

    /**
     * Cancels a claim on a task for review
     *
     * Cancels a claim on a task for review
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelTaskReviewTest() throws Exception {
        Long id = null;
        OrgMaprouletteFrameworkModelTask response = api.cancelTaskReview(id);

        // TODO: test validations
    }
    /**
     * Retrieve a summary of review coverage for mappers
     *
     * This will retrieve a summary of review coverage for each mapper and respond with a csv
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void extractMapperMetricsTest() throws Exception {
        Boolean onlySaved = null;
        Object mappers = null;
        Object reviewers = null;
        Object priorities = null;
        Object startDate = null;
        Object endDate = null;
        api.extractMapperMetrics(onlySaved, mappers, reviewers, priorities, startDate, endDate);

        // TODO: test validations
    }
    /**
     * Retrieve a summary of meta-review coverage for reviewers
     *
     * This will retrieve a summary of meta-review coverage for each reviewer and respond with a csv
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void extractMetaReviewCoverageTest() throws Exception {
        Boolean onlySaved = null;
        Object reviewers = null;
        Object priorities = null;
        Object startDate = null;
        Object endDate = null;
        api.extractMetaReviewCoverage(onlySaved, reviewers, priorities, startDate, endDate);

        // TODO: test validations
    }
    /**
     * Retrieves nearby Tasks
     *
     * Retrieves review tasks geographically closest to the specified task within the given filters
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNearbyReviewTasksTest() throws Exception {
        Long proximityId = null;
        Integer limit = null;
        Boolean excludeOtherReviewers = null;
        Boolean onlySaved = null;
        Object proximity = null;
        List<OrgMaprouletteFrameworkModelTask> response = api.getNearbyReviewTasks(proximityId, limit, excludeOtherReviewers, onlySaved, proximity);

        // TODO: test validations
    }
    /**
     * Retrieves tasks that need review
     *
     * Retrieves list of Tasks and total count
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getReviewMetricsTest() throws Exception {
        Integer reviewTasksType = null;
        Boolean onlySaved = null;
        Boolean excludeOtherReviewers = null;
        Boolean includeByPriority = null;
        Boolean includeByTaskStatus = null;
        Object mappers = null;
        Object reviewers = null;
        Object priorities = null;
        Object startDate = null;
        Object endDate = null;
        List<OrgMaprouletteFrameworkModelTask> response = api.getReviewMetrics(reviewTasksType, onlySaved, excludeOtherReviewers, includeByPriority, includeByTaskStatus, mappers, reviewers, priorities, startDate, endDate);

        // TODO: test validations
    }
    /**
     * Retrieves tasks that need review
     *
     * Retrieves list of Tasks and total count
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getReviewRequestedTasksTest() throws Exception {
        Boolean onlySaved = null;
        Integer limit = null;
        Integer page = null;
        String sort = null;
        String order = null;
        Boolean excludeOtherReviewers = null;
        Boolean includeTags = null;
        Object startDate = null;
        Object endDate = null;
        Object cs = null;
        Object o = null;
        List<OrgMaprouletteFrameworkModelTask> response = api.getReviewRequestedTasks(onlySaved, limit, page, sort, order, excludeOtherReviewers, includeTags, startDate, endDate, cs, o);

        // TODO: test validations
    }
    /**
     * Retrieves metrics grouped by tag
     *
     * Retrieves list of Tasks and total count
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getReviewTagMetricsTest() throws Exception {
        Integer reviewTasksType = null;
        Boolean onlySaved = null;
        Boolean excludeOtherReviewers = null;
        List<OrgMaprouletteFrameworkModelReviewMetrics> response = api.getReviewTagMetrics(reviewTasksType, onlySaved, excludeOtherReviewers);

        // TODO: test validations
    }
    /**
     * Retrieves task review clusters
     *
     * Retrieves task clusters that contain the centroid location for a group of review tasks
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getReviewTaskClustersTest() throws Exception {
        Integer reviewTasksType = null;
        Integer points = null;
        Boolean onlySaved = null;
        Boolean excludeOtherReviewers = null;
        Object startDate = null;
        Object endDate = null;
        List<OrgMaprouletteFrameworkModelTaskCluster> response = api.getReviewTaskClusters(reviewTasksType, points, onlySaved, excludeOtherReviewers, startDate, endDate);

        // TODO: test validations
    }
    /**
     * Retrieves reviewed tasks that have been reviewed either by this user or where the user requested the review.
     *
     * Retrieves list of Tasks
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getReviewedTasksTest() throws Exception {
        Boolean allowReviewNeeded = null;
        Integer limit = null;
        Integer page = null;
        String sort = null;
        String order = null;
        Boolean includeTags = null;
        Boolean asMetaReview = null;
        Object startDate = null;
        Object endDate = null;
        Object mappers = null;
        Object reviewers = null;
        Object cs = null;
        Object o = null;
        Object r = null;
        List<OrgMaprouletteFrameworkModelTask> response = api.getReviewedTasks(allowReviewNeeded, limit, page, sort, order, includeTags, asMetaReview, startDate, endDate, mappers, reviewers, cs, o, r);

        // TODO: test validations
    }
    /**
     * Retrieves and claims a the next review needed Task
     *
     * Retrieves the next Task (given the search parameters) and claims that task for review
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void nextTaskReviewTest() throws Exception {
        Boolean onlySaved = null;
        String sort = null;
        String order = null;
        Long lastTaskId = null;
        Boolean excludeOtherReviewers = null;
        Boolean asMetaReview = null;
        Object cs = null;
        Object o = null;
        Object r = null;
        OrgMaprouletteFrameworkModelTask response = api.nextTaskReview(onlySaved, sort, order, lastTaskId, excludeOtherReviewers, asMetaReview, cs, o, r);

        // TODO: test validations
    }
    /**
     * Retrieves and claims a review needed Task
     *
     * Retrieves a Task and claims that task for review
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void startTaskReviewTest() throws Exception {
        Long id = null;
        OrgMaprouletteFrameworkModelTask response = api.startTaskReview(id);

        // TODO: test validations
    }
}