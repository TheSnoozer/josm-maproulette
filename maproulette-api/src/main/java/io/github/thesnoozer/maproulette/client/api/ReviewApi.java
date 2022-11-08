package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelReviewMetrics;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTask;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTaskCluster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class ReviewApi {
  private ApiClient apiClient;

  public ReviewApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReviewApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cancels a claim on a task for review
   * Cancels a claim on a task for review
   * @param id The id of the task to cancel claim on (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask cancelTaskReview(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelTaskReview");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/review/cancel"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteFrameworkModelTask> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelTask>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieve a summary of review coverage for mappers
   * This will retrieve a summary of review coverage for each mapper and respond with a csv
   * @param onlySaved Only show challenges that have been saved. (optional, default to false)
   * @param mappers the mapper ids to search by (review_requested_by) (optional)
   * @param reviewers the reviewer ids to search by (reviewed_by) (optional)
   * @param priorities the priorities to search by (optional)
   * @param startDate Whether results should be tasks that have been reviewed after this date (format &#x27;YYYY-MM-DD&#x27;) (optional)
   * @param endDate Whether results should be tasks that have been reviewed before this date (format &#x27;YYYY-MM-DD&#x27;) (optional)
   * @throws ApiException if fails to make API call
   */
  public void extractMapperMetrics(Boolean onlySaved, Object mappers, Object reviewers, Object priorities, Object startDate, Object endDate) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/tasks/review/mappers/export";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlySaved", onlySaved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mappers", mappers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewers", reviewers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priorities", priorities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieve a summary of meta-review coverage for reviewers
   * This will retrieve a summary of meta-review coverage for each reviewer and respond with a csv
   * @param onlySaved Only show challenges that have been saved. (optional, default to false)
   * @param reviewers the reviewer ids to search by (reviewed_by) (optional)
   * @param priorities the priorities to search by (optional)
   * @param startDate Whether results should be tasks that have been reviewed after this date (format &#x27;YYYY-MM-DD&#x27;) (optional)
   * @param endDate Whether results should be tasks that have been reviewed before this date (format &#x27;YYYY-MM-DD&#x27;) (optional)
   * @throws ApiException if fails to make API call
   */
  public void extractMetaReviewCoverage(Boolean onlySaved, Object reviewers, Object priorities, Object startDate, Object endDate) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/tasks/metareview/reviewers/export";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlySaved", onlySaved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewers", reviewers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priorities", priorities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieves nearby Tasks
   * Retrieves review tasks geographically closest to the specified task within the given filters
   * @param proximityId  (required)
   * @param limit Limit the number of results returned in the response. Default value is 5. (optional, default to 5)
   * @param excludeOtherReviewers exclude tasks that have been reviewed by someone else (optional, default to false)
   * @param onlySaved Only show challenges that have been saved. (optional, default to false)
   * @param proximity Id of task around which geographically closest tasks are desired (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getNearbyReviewTasks(Long proximityId, Integer limit, Boolean excludeOtherReviewers, Boolean onlySaved, Object proximity) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'proximityId' is set
    if (proximityId == null) {
      throw new ApiException(400, "Missing the required parameter 'proximityId' when calling getNearbyReviewTasks");
    }
    // create path and map variables
    String localVarPath = "/tasks/review/nearby/{proximityId}"
      .replaceAll("\\{" + "proximityId" + "\\}", apiClient.escapeString(proximityId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeOtherReviewers", excludeOtherReviewers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlySaved", onlySaved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "proximity", proximity));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelTask>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTask>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves tasks that need review
   * Retrieves list of Tasks and total count
   * @param reviewTasksType integer value &gt; 1 - To Be Reviewed 2 - User&#x27;s reviewed Tasks 3 - All reviewed by users (required)
   * @param onlySaved Only show challenges that have been saved. (optional, default to false)
   * @param excludeOtherReviewers exclude tasks that have been reviewed by someone else (optional, default to false)
   * @param includeByPriority Also include a breakdown of review status by priority (optional, default to false)
   * @param includeByTaskStatus Also include a breakdown of review status by task status (optional, default to false)
   * @param mappers the mapper ids to search by (review_requested_by) (optional)
   * @param reviewers the reviewer ids to search by (reviewed_by) (optional)
   * @param priorities the priorities to search by (optional)
   * @param startDate Whether results should be tasks that have been reviewed after this date (format &#x27;YYYY-MM-DD&#x27;) (optional)
   * @param endDate Whether results should be tasks that have been reviewed before this date (format &#x27;YYYY-MM-DD&#x27;) (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getReviewMetrics(Integer reviewTasksType, Boolean onlySaved, Boolean excludeOtherReviewers, Boolean includeByPriority, Boolean includeByTaskStatus, Object mappers, Object reviewers, Object priorities, Object startDate, Object endDate) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'reviewTasksType' is set
    if (reviewTasksType == null) {
      throw new ApiException(400, "Missing the required parameter 'reviewTasksType' when calling getReviewMetrics");
    }
    // create path and map variables
    String localVarPath = "/tasks/review/metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewTasksType", reviewTasksType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlySaved", onlySaved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeOtherReviewers", excludeOtherReviewers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeByPriority", includeByPriority));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeByTaskStatus", includeByTaskStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mappers", mappers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewers", reviewers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priorities", priorities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelTask>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTask>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves tasks that need review
   * Retrieves list of Tasks and total count
   * @param onlySaved Only show challenges that have been saved. (optional, default to false)
   * @param limit Limit the number of results returned in the response. Default value is -1 (all). (optional, default to -1)
   * @param page  (optional, default to 0)
   * @param sort Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted. (optional)
   * @param order Sort order direction. Either ASC or DESC. Default is \&quot;ASC\&quot; (ascending) (optional, default to ASC)
   * @param excludeOtherReviewers exclude tasks that have been reviewed by someone else (optional, default to false)
   * @param includeTags In response include list of tags for each task (optional, default to false)
   * @param startDate Whether results should be tasks that have been reviewed after this date (format &#x27;YYYY-MM-DD&#x27;) (optional)
   * @param endDate Whether results should be tasks that have been reviewed before this date (format &#x27;YYYY-MM-DD&#x27;) (optional)
   * @param cs The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges. (optional)
   * @param o The search string used to match the name of the person requesting the review. (review_requested_by) (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getReviewRequestedTasks(Boolean onlySaved, Integer limit, Integer page, String sort, String order, Boolean excludeOtherReviewers, Boolean includeTags, Object startDate, Object endDate, Object cs, Object o) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/tasks/review";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlySaved", onlySaved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeOtherReviewers", excludeOtherReviewers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTags", includeTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cs", cs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "o", o));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelTask>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTask>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves metrics grouped by tag
   * Retrieves list of Tasks and total count
   * @param reviewTasksType integer value &gt; 1 - To Be Reviewed 2 - User&#x27;s reviewed Tasks 3 - All reviewed by users (required)
   * @param onlySaved Only show challenges that have been saved. (optional, default to false)
   * @param excludeOtherReviewers exclude tasks that have been reviewed by someone else (optional, default to false)
   * @return List&lt;OrgMaprouletteFrameworkModelReviewMetrics&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelReviewMetrics> getReviewTagMetrics(Integer reviewTasksType, Boolean onlySaved, Boolean excludeOtherReviewers) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'reviewTasksType' is set
    if (reviewTasksType == null) {
      throw new ApiException(400, "Missing the required parameter 'reviewTasksType' when calling getReviewTagMetrics");
    }
    // create path and map variables
    String localVarPath = "/tasks/review/tag/metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewTasksType", reviewTasksType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlySaved", onlySaved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeOtherReviewers", excludeOtherReviewers));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelReviewMetrics>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelReviewMetrics>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves task review clusters
   * Retrieves task clusters that contain the centroid location for a group of review tasks
   * @param reviewTasksType integer value &gt; 1 - To Be Reviewed 2 - User&#x27;s reviewed Tasks 3 - All reviewed by users (required)
   * @param points The number of clusters that you want returned (optional, default to 100)
   * @param onlySaved Only show challenges that have been saved. (optional, default to false)
   * @param excludeOtherReviewers exclude tasks that have been reviewed by someone else (optional, default to false)
   * @param startDate The start date to search within (optional)
   * @param endDate The end date to search within (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelTaskCluster&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTaskCluster> getReviewTaskClusters(Integer reviewTasksType, Integer points, Boolean onlySaved, Boolean excludeOtherReviewers, Object startDate, Object endDate) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'reviewTasksType' is set
    if (reviewTasksType == null) {
      throw new ApiException(400, "Missing the required parameter 'reviewTasksType' when calling getReviewTaskClusters");
    }
    // create path and map variables
    String localVarPath = "/taskCluster/review";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewTasksType", reviewTasksType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "points", points));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlySaved", onlySaved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeOtherReviewers", excludeOtherReviewers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelTaskCluster>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTaskCluster>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves reviewed tasks that have been reviewed either by this user or where the user requested the review.
   * Retrieves list of Tasks
   * @param allowReviewNeeded  (optional, default to false)
   * @param limit Limit the number of results returned in the response. Default value is -1 (all). (optional, default to 10)
   * @param page  (optional, default to 0)
   * @param sort Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted. (optional)
   * @param order Sort order direction. Either ASC or DESC. Default is \&quot;ASC\&quot; (ascending) (optional, default to ASC)
   * @param includeTags In response include list of tags for each task (optional, default to false)
   * @param asMetaReview Limit response to include tasks ready for meta review (already review approved/assisted) (optional, default to false)
   * @param startDate Whether results should be tasks that have been reviewed after this date (format &#x27;YYYY-MM-DD&#x27;) (optional)
   * @param endDate Whether results should be tasks that have been reviewed before this date (format &#x27;YYYY-MM-DD&#x27;) (optional)
   * @param mappers The mapper ids to search by. (review_requested_by) (optional)
   * @param reviewers Whether results should be included tasks in tasks &#x27;review requested&#x27; (optional)
   * @param cs The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges. (optional)
   * @param o The search string used to match the name of the person requesting the review. (review_requested_by) (optional)
   * @param r The search string used to match the Reviewer names. (reviewed_by) (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getReviewedTasks(Boolean allowReviewNeeded, Integer limit, Integer page, String sort, String order, Boolean includeTags, Boolean asMetaReview, Object startDate, Object endDate, Object mappers, Object reviewers, Object cs, Object o, Object r) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/tasks/reviewed";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allowReviewNeeded", allowReviewNeeded));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTags", includeTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asMetaReview", asMetaReview));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mappers", mappers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewers", reviewers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cs", cs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "o", o));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "r", r));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelTask>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTask>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves and claims a the next review needed Task
   * Retrieves the next Task (given the search parameters) and claims that task for review
   * @param onlySaved Only show challenges that have been saved. (optional, default to false)
   * @param sort Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted. (optional)
   * @param order Sort order direction. Either ASC or DESC. Default is \&quot;ASC\&quot; (ascending) (optional, default to ASC)
   * @param lastTaskId Fetch the next task after the lastTaskId. (so if you want to &#x27;skip&#x27; a task you can get the next one) (optional, default to -1)
   * @param excludeOtherReviewers exclude tasks that have been reviewed by someone else (optional, default to false)
   * @param asMetaReview Fetch the next task for a meta review. (optional, default to false)
   * @param cs The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges. (optional)
   * @param o The search string used to match the name of the person requesting the review. (review_requested_by) (optional)
   * @param r The search string used to match the Reviewer names. (reviewed_by) (optional)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask nextTaskReview(Boolean onlySaved, String sort, String order, Long lastTaskId, Boolean excludeOtherReviewers, Boolean asMetaReview, Object cs, Object o, Object r) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/tasks/review/next";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlySaved", onlySaved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastTaskId", lastTaskId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeOtherReviewers", excludeOtherReviewers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asMetaReview", asMetaReview));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cs", cs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "o", o));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "r", r));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteFrameworkModelTask> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelTask>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves and claims a review needed Task
   * Retrieves a Task and claims that task for review
   * @param id The id of the task to fetch and claim (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask startTaskReview(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling startTaskReview");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/review/start"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteFrameworkModelTask> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelTask>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
