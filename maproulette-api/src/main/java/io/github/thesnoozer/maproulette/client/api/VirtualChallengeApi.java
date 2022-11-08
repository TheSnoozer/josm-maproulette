package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteExceptionStatusMessage;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelChallenge;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelClusteredPoint;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTask;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteModelsVirtualChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class VirtualChallengeApi {
  private ApiClient apiClient;

  public VirtualChallengeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VirtualChallengeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Virtual Challenge
   * Will create a new Virtual Challenge from the supplied JSON in the body. When creating the Virtual Challenge, leave the ID field out of the body json, if updating (generally use the PUT method) include the ID field.
   * @param body The JSON structure for the Virtual Challenge body. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteModelsVirtualChallenge
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteModelsVirtualChallenge create(OrgMaprouletteModelsVirtualChallenge body, String apiKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling create");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling create");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteModelsVirtualChallenge> localVarReturnType = new GenericType<OrgMaprouletteModelsVirtualChallenge>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Deletes an existing Virtual Challenge
   * Deletes an existing Virtual Challenge based on the supplied ID. This will delete all associated Tasks of the Virtual Challenge.
   * @param id The id of the Virtual Challenge being deleted (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param immediate If set to true, will delete the virtual challenge immediately instead of delayed (optional, default to false)
   * @return OrgMaprouletteExceptionStatusMessage
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteExceptionStatusMessage delete(Long id, String apiKey, Boolean immediate) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling delete");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling delete");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "immediate", immediate));

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteExceptionStatusMessage> localVarReturnType = new GenericType<OrgMaprouletteExceptionStatusMessage>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves clustered Task points
   * Retrieves all the Tasks for a specific Virtual Challenge as clustered points to potentially display on a map.
   * @param id The id of the parent project. (required)
   * @param filter Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelClusteredPoint> getClusteredPoints(Long id, String filter) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getClusteredPoints");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge/clustered/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelClusteredPoint>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelClusteredPoint>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves nearby Tasks in Virtual Challenge
   * Retrieves tasks geographically closest to the specified task within the same Virtual Challenge
   * @param id  (required)
   * @param proximityId  (required)
   * @param limit Limit the number of results returned in the response. Default value is 5. (optional, default to 5)
   * @param proximity Id of task around which geographically closest tasks are desired (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getNearbyTasks(Long id, Long proximityId, Integer limit, Object proximity) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNearbyTasks");
    }
    // verify the required parameter 'proximityId' is set
    if (proximityId == null) {
      throw new ApiException(400, "Missing the required parameter 'proximityId' when calling getNearbyTasks");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge/{id}/tasksNearby/{proximityId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "proximityId" + "\\}", apiClient.escapeString(proximityId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
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
   * Retrieves random Task
   * Retrieves a random Task based on the search criteria and contained within the current Virtual Challenge
   * @param cid The id of the Virtual Challenge limiting the tasks to only a descendent of that Virtual Challenge. (required)
   * @param proximity Id of task that you wish to find the next task based on the proximity of that task (optional, default to -1)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask getRandomTask(Long cid, Long proximity) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling getRandomTask");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge/{cid}/task"
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "proximity", proximity));


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
   * Retrieves next Task
   * Retrieves the next sequential Task based on the task ordering within the Virtual Challenge. If it is currently on the last task it will response with the first task in the Virtual Challenge.
   * @param cid The id of the parent Virtual Challenge. (required)
   * @param id The id of the current task being viewed, so that we can get context of what the next task should be (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask getSequentialNextTask(Long cid, Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling getSequentialNextTask");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSequentialNextTask");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge/{cid}/nextTask/{id}"
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()))
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
   * Retrieves previous Task
   * Retrieves the previous sequential Task based on the task ordering within the Virtual Challenge. If it is currently on the first task it will response with the last task in the Virtual Challenge.
   * @param cid The id of the parent Virtual Challenge. (required)
   * @param id The id of the current task being viewed, so that we can get context of what the next task should be (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask getSequentialPreviousTask(Long cid, Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling getSequentialPreviousTask");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSequentialPreviousTask");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge/{cid}/previousTask/{id}"
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()))
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
   * Retrieves Virtual Challenge GeoJSON
   * Retrieves the GeoJSON for the Virtual Challenge that represents all the associated Tasks of the Virtual Challenge. WARNING* This API query can be quite slow due to retrieving all the points that is grouped in various different challenges
   * @param id The id of the parent Virtual Challenge limiting the tasks to only a descendent of that Virtual Challenge. (required)
   * @param filter Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard (optional)
   * @throws ApiException if fails to make API call
   */
  public void getVirtualChallengeGeoJSON(Long id, String filter) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getVirtualChallengeGeoJSON");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge/view/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));


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
   * List all the Virtual Challenge.
   * Lists all the Virtual Challenges in the system
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param onlyEnabled  (optional, default to false)
   * @return List&lt;OrgMaprouletteModelsVirtualChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteModelsVirtualChallenge> list(Integer limit, Integer page, Boolean onlyEnabled) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/virtualchallenges";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyEnabled", onlyEnabled));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteModelsVirtualChallenge>> localVarReturnType = new GenericType<List<OrgMaprouletteModelsVirtualChallenge>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all the Virtual Challenges Tasks.
   * Lists all the Tasks that are children of the supplied Virtual Challenge.
   * @param id The project ID. (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> listTasks(Long id, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listTasks");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge/{id}/tasks"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));


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
   * Retrieves an already existing Virtual Challenge
   * Retrieves an already existing Virtual Challenge based on the supplied ID in the URL.
   * @param id The id of the Virtual Challenge to retrieve (required)
   * @return OrgMaprouletteModelsVirtualChallenge
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteModelsVirtualChallenge read(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling read");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge/{id}"
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

    GenericType<OrgMaprouletteModelsVirtualChallenge> localVarReturnType = new GenericType<OrgMaprouletteModelsVirtualChallenge>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves an already existing Virtual Challenge
   * Retrieves an already existing Virtual Challenge based on the name of the Virtual Challenge rather than an ID
   * @param id The id of the parent Project of the Virtual Challenge (required)
   * @param name The name of the Virtual Challenge being retrieved (required)
   * @return OrgMaprouletteModelsVirtualChallenge
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteModelsVirtualChallenge readByName(Long id, String name) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling readByName");
    }
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling readByName");
    }
    // create path and map variables
    String localVarPath = "/virtualchallengebyname/{name}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

    GenericType<OrgMaprouletteModelsVirtualChallenge> localVarReturnType = new GenericType<OrgMaprouletteModelsVirtualChallenge>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Updates a Virtual Challenge
   * Will update an already existing Virtual Challenge from the supplied JSON in the body.
   * @param body The JSON structure for the Virtual Challenge body. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param id The ID of the Virtual Challenge that is being updated (required)
   * @return OrgMaprouletteModelsVirtualChallenge
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteModelsVirtualChallenge update(OrgMaprouletteFrameworkModelChallenge body, String apiKey, Long id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling update");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling update");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling update");
    }
    // create path and map variables
    String localVarPath = "/virtualchallenge/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteModelsVirtualChallenge> localVarReturnType = new GenericType<OrgMaprouletteModelsVirtualChallenge>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
