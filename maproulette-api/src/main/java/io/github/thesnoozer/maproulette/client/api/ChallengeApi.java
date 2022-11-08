package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteExceptionStatusMessage;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelChallenge;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelChallengeListing;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelClusteredPoint;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTag;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class ChallengeApi {
  private ApiClient apiClient;

  public ChallengeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChallengeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add tasks to a challenge
   * This will create tasks within a challenge based on the provided geojson in the body of the PUT request
   * @param id The id of the parent Challenge where all the children are being created. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void addTasksToChallenge(Long id, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addTasksToChallenge");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling addTasksToChallenge");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/addTasks"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Add tasks to a challenge
   * This will create tasks within a challenge based on the provided file uploaded as part of the PUT request.
   * @param id The id of the parent Challenge where all the children are being created. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param lineByLine If the JSON provided includes seperate GeoJSON on each line, then this must be true (optional, default to true)
   * @param removeUnmatched Used to remove incomplete tasks that have been addressed externally since the last rebuild, assuming the source data represents all tasks outstanding. If set to true, all existing tasks in CREATED or SKIPPED status (only) will be removed prior to rebuilding with the assumption that they will be recreated if they still appear in the updated source data. If set to false, unmatched existing tasks are simply left as-is. (optional, default to false)
   * @param dataOriginDate  (optional)
   * @param skipSnapshot If included will skip recording a snapshot before proceeding. (By default false, so it will create snapshot.) (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void addTasksToChallengeFromFile(Long id, String apiKey, Boolean lineByLine, Boolean removeUnmatched, String dataOriginDate, Boolean skipSnapshot) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addTasksToChallengeFromFile");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling addTasksToChallengeFromFile");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/addFileTasks"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lineByLine", lineByLine));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "removeUnmatched", removeUnmatched));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataOriginDate", dataOriginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skipSnapshot", skipSnapshot));

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update archive status
   * This will update the archive status of the challenge
   * @param challengeId The ID of the challenge (required)
   * @throws ApiException if fails to make API call
   */
  public void archiveChallenge(Long challengeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'challengeId' is set
    if (challengeId == null) {
      throw new ApiException(400, "Missing the required parameter 'challengeId' when calling archiveChallenge");
    }
    // create path and map variables
    String localVarPath = "/challenge/{challengeId}/archive"
      .replaceAll("\\{" + "challengeId" + "\\}", apiClient.escapeString(challengeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Create a batch of Challenges
   * 
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void batchUploadPost() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a batch of Challenges
   * 
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void batchUploadPut() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Bulk Archive Challenges.
   * Archive or unarchive a list of challenges
   * @throws ApiException if fails to make API call
   */
  public void bulkArchive() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges/bulkArchive";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Clones a Challenge
   * Clones a challenge
   * @param id The id of the Challenge to clone. (required)
   * @param name The name of the new challenge (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteFrameworkModelChallenge
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelChallenge cloneChallenge(Long id, String name, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cloneChallenge");
    }
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling cloneChallenge");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling cloneChallenge");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/clone/{name}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteFrameworkModelChallenge> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelChallenge>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create a Challenge
   * Will create a new challenge from the supplied JSON in the body. When creating the Challenge, leave the ID field out of the body json, if updating (generally use the PUT method) include the ID field.
   * @param body The JSON structure for the Challenge body, include the key &quot;children&quot; to create Task children objects. Although the model schema shows a hierarchy include &quot;general&quot;, &quot;creation&quot;, &quot;priority&quot; and &quot;extra&quot; this JSON structure can be flatten and you can exclude those top level keys and have the children in the root level. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteFrameworkModelChallenge
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelChallenge create(OrgMaprouletteFrameworkModelChallenge body, String apiKey) throws ApiException {
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
    String localVarPath = "/challenge";

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

    GenericType<OrgMaprouletteFrameworkModelChallenge> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelChallenge>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create Tasks for Challenge
   * 
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void createChildren(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createChildren");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/tasks"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Create Challenge from Github
   * This will pull the following files from Github, ${name}_create.json, ${name}_geojson.json, ${name}_info.md, and create a Challenge from it. The create file will be the json used to create the challenge. Similarly to if you supplied json in the create method. The info.md file is just an informational file that can be used later for challenge information to the user. And geojson.json which is used to generate the tasks. If the challenge has been previously created, it will just update the tasks from the geojson
   * @param projectId  (required)
   * @param username username of the github user that owns the repo (required)
   * @param repo Github repositories that contains the challenge files (required)
   * @param name The name of the challenge that prefixes all the github files (required)
   * @param id The ID of the parent project (required)
   * @param rebuild  (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void createFromGithub(Long projectId, String username, String repo, String name, Object id, Boolean rebuild) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling createFromGithub");
    }
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling createFromGithub");
    }
    // verify the required parameter 'repo' is set
    if (repo == null) {
      throw new ApiException(400, "Missing the required parameter 'repo' when calling createFromGithub");
    }
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling createFromGithub");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createFromGithub");
    }
    // create path and map variables
    String localVarPath = "/project/{projectId}/challenge/{username}/{repo}/{name}"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
      .replaceAll("\\{" + "repo" + "\\}", apiClient.escapeString(repo.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rebuild", rebuild));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Deletes an existing Challenge
   * Deletes an existing Challenge based on the supplied ID. This will delete all children Tasks under the Challenge.
   * @param id The id of the Challenge being deleted (required)
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
    String localVarPath = "/challenge/{id}"
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
   * Delete Challenge Tags
   * Deletes all the supplied tags from the Challenge
   * @param id The ID of the challenge (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param tags A comma separated list of tags (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteTagsFromItem(Long id, String apiKey, String tags) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTagsFromItem");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteTagsFromItem");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/tags"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Deletes all Challenge Tasks
   * Deletes all the existing tasks within a challenge. This API will also give the option to delete tasks based on the tasks current status. So can delete all \&quot;false positive\&quot; tasks, or all \&quot;fixed and created\&quot; tasks.
   * @param id The id of the Challenge being deleted (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param statusFilters A comma separated list of status ID&#x27;s. 0 &#x3D; Created, 1 &#x3D; Fixed, 2 &#x3D; False Positive, 3 &#x3D; Skipped, 4 &#x3D; Deleted, 5 &#x3D; Already Fixed, 6 &#x3D; Too Hard (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteTasks(Long id, String apiKey, String statusFilters) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTasks");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteTasks");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/tasks"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "statusFilters", statusFilters));

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieves children for Challenge
   * Retrieves all the children for a Challenge in an expanded list. Unlike the GET request /challenge/{id}/tasks, this function will wrap the json array list inside of the parent Challenge object, so that you see the full hierarchy.
   * @param id The id of the parent Challenge. (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallenge> expandedList(Long id, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling expandedList");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/children"
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

    GenericType<List<OrgMaprouletteFrameworkModelChallenge>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallenge>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Extended Find Challenge matching search criteria
   * Finds a list of Challenges that match a specific search criteria. The search criteria is uses multiple values from the query string
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param sort Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted. (optional)
   * @param order Sort order direction. Either ASC or DESC. Default is \&quot;ASC\&quot; (ascending) (optional, default to ASC)
   * @param pid The id of the project to limit your search too (optional)
   * @param ps The search string used to match the project names. Default value is empty string, ie. will match all projects. (optional)
   * @param pe Boolean variable true|false that limits the search by enabled projects only if set to true. Default will is true. (optional)
   * @param ct Comma separated list of tags to limit the returned challenges by (optional)
   * @param cs The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges. (optional)
   * @param ce Boolean variable true|false that limits the search by enabled projects only if set to true. Default will is true. (optional)
   * @param cd The difficulty level to limit the returned challenges by. Following difficulty Integers can be used. 1 - Easy, 2 - Normal, 3 - Expert, -1 - Any difficulty. Default value is -1. (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallenge> extendedFind(Integer limit, Integer page, String sort, String order, Object pid, Object ps, Object pe, Object ct, Object cs, Object ce, Object cd) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges/extendedFind";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pid", pid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ps", ps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pe", pe));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ct", ct));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cs", cs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ce", ce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cd", cd));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelChallenge>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallenge>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieve task review history of a Challenge
   * This will retrieve review history of all the tasks of a given challenge and respond with a csv
   * @param id The ID of the challenge (required)
   * @throws ApiException if fails to make API call
   */
  public void extractChallengeReviewHistory(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling extractChallengeReviewHistory");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/extractReviewHistory"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



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
   * Retrieve all comments for Challenge
   * This will retrieve all the comments for all the children tasks of a given challenge and respond with a csv
   * @param id The ID of the challenge (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to -1)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @throws ApiException if fails to make API call
   */
  public void extractComments(Long id, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling extractComments");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/comments/extract"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));


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
   * Extracts a Challenge Package
   * This will retrieve a package of the challenge, which will contain json to recreate the challenge, geojson to recreate the tasks, info page in md format if any, all the comments extracted from for the challenge and any metrics and the time the challenge was extracted.
   * @param id The ID of the challenge (required)
   * @throws ApiException if fails to make API call
   */
  public void extractPackage(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling extractPackage");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/extract"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



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
   * Retrieve summaries of all tasks for Challenge
   * This will retrieve summaries of all the tasks of a given challenge and respond with a csv
   * @param id The ID of the challenge (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to -1)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param status Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard (optional)
   * @param reviewStatus Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed (optional)
   * @param priority Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low (optional)
   * @param exportProperties  (optional)
   * @param timezone A timezone offset to apply to time fields. Format should be like &#x27;+HH:MM&#x27;. Default is GMT (+00:00) (optional)
   * @throws ApiException if fails to make API call
   */
  public void extractTaskSummaries(Long id, Integer limit, Integer page, String status, String reviewStatus, String priority, String exportProperties, String timezone) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling extractTaskSummaries");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/tasks/extract"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewStatus", reviewStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priority", priority));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exportProperties", exportProperties));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));


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
   * Retrieve summaries of all tasks for Challenge
   * This will retrieve summaries of all the tasks of a given challenge and respond with a csv
   * @param id The ID of the challenge (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param limit Limit the number of results returned in the response. Default value is -1 (no limit). (optional, default to -1)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param status Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard (optional)
   * @param reviewStatus Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed (optional)
   * @param priority Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low (optional)
   * @param exportProperties  (optional)
   * @param timezone A timezone offset to apply to time fields. Format should be like &#x27;+HH:MM&#x27;. Default is GMT (+00:00) (optional)
   * @throws ApiException if fails to make API call
   */
  public void extractTaskSummaries_0(Long id, String apiKey, Integer limit, Integer page, String status, String reviewStatus, String priority, String exportProperties, String timezone) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling extractTaskSummaries_0");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling extractTaskSummaries_0");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/tasks/extract"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewStatus", reviewStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priority", priority));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exportProperties", exportProperties));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Find Challenge matching search criteria
   * Finds a list of Challenges that match a specific search criteria. The search criteria is simply a string that is contained in the Challenge name. String case sensitivity is ignored.
   * @param q The search string used to match the Challenge names. Default value is empty string, ie. will match everything. (optional)
   * @param parentId This field will be ignored for this request (optional, default to -1)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param onlyEnabled Flag to set if only wanting enabled Challenges returned. Default value is true. (optional, default to true)
   * @return List&lt;OrgMaprouletteFrameworkModelChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallenge> find(String q, Long parentId, Integer limit, Integer page, Boolean onlyEnabled) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges/find";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parentId", parentId));
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

    GenericType<List<OrgMaprouletteFrameworkModelChallenge>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallenge>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves Challenge GeoJSON
   * Retrieves the GeoJSON for the Challenge that represents all the Task children of the Challenge.
   * @param id The id of the parent Challenge limiting the tasks to only a descendent of that Challenge. (required)
   * @param status Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard (optional)
   * @param reviewStatus Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed (optional)
   * @param priority Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low (optional)
   * @param timezone A timezone offset to apply to time fields. Format should be like &#x27;+HH:MM&#x27;. Default is GMT (+00:00) (optional)
   * @param filename Optional filename to be used for the export (optional, default to challenge_geojson.json)
   * @throws ApiException if fails to make API call
   */
  public void getChallengeGeoJSON(Long id, String status, String reviewStatus, String priority, String timezone, String filename) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getChallengeGeoJSON");
    }
    // create path and map variables
    String localVarPath = "/challenge/view/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewStatus", reviewStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priority", priority));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filename", filename));


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
   * Retrieves Challenge GeoJSON
   * Retrieves the GeoJSON for the Challenge that represents all the Task children of the Challenge.
   * @param id The id of the parent Challenge limiting the tasks to only a descendent of that Challenge. (required)
   * @param status Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard (optional)
   * @param reviewStatus Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed (optional)
   * @param priority Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low (optional)
   * @param timezone  (optional)
   * @param filename Optional filename to be used for the export (optional, default to challenge_geojson.json)
   * @throws ApiException if fails to make API call
   */
  public void getChallengeGeoJSON_0(Long id, String status, String reviewStatus, String priority, String timezone, String filename) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getChallengeGeoJSON_0");
    }
    // create path and map variables
    String localVarPath = "/challenge/view/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewStatus", reviewStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "priority", priority));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filename", filename));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieves clustered Task points
   * Retrieves all the Tasks for a specific Challenge as clustered points to potentially display on a map
   * @param id The id of the parent project. (required)
   * @param filter Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard (optional)
   * @param limit  (optional, default to 2500)
   * @param excludeLocked  (optional, default to false)
   * @return List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelClusteredPoint> getClusteredPoints(Long id, String filter, Integer limit, Boolean excludeLocked) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getClusteredPoints");
    }
    // create path and map variables
    String localVarPath = "/challenge/clustered/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeLocked", excludeLocked));


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
   * Featured Challenges.
   * Get all the currently featured challenges
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallenge> getFeaturedChallenges(Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges/featured";

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

    GenericType<List<OrgMaprouletteFrameworkModelChallenge>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallenge>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Hottest Challenges.
   * Get the hottest (recently popular) challenges
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallenge> getHotChallenges(Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges/hot";

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

    GenericType<List<OrgMaprouletteFrameworkModelChallenge>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallenge>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieve challenges based on provided tags
   * Retrieves all the challenges that contain at least one of the supplied tags.
   * @param tags A comma separated list of tags (optional)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallenge> getItemsBasedOnTags(String tags, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges/tags";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
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

    GenericType<List<OrgMaprouletteFrameworkModelChallenge>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallenge>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves nearby Tasks
   * Retrieves tasks geographically closest to the specified task within the same Challenge
   * @param cid  (required)
   * @param proximityId  (required)
   * @param excludeSelfLocked exclude tasks this user has locked (always excludes tasks locked by others) (optional, default to false)
   * @param limit Limit the number of results returned in the response. Default value is 5. (optional, default to 5)
   * @param proximity Id of task around which geographically closest tasks are desired (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getNearbyTasks(Long cid, Long proximityId, Boolean excludeSelfLocked, Integer limit, Object proximity) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling getNearbyTasks");
    }
    // verify the required parameter 'proximityId' is set
    if (proximityId == null) {
      throw new ApiException(400, "Missing the required parameter 'proximityId' when calling getNearbyTasks");
    }
    // create path and map variables
    String localVarPath = "/challenge/{cid}/tasksNearby/{proximityId}"
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()))
      .replaceAll("\\{" + "proximityId" + "\\}", apiClient.escapeString(proximityId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeSelfLocked", excludeSelfLocked));
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
   * Preferred Challenges.
   * Get the preferred challenges which include popular, featured, and newest
   * @param limit Limit the number of results returned in each category. Default value is 10. (optional, default to 10)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getPreferredChallenges(Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges/preferred";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves random Task
   * Retrieves a random Task based on the search criteria and contained within the current Challenge
   * @param cid The id of the parent Challenge limiting the tasks to only a descendent of that Challenge. (required)
   * @param s The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive. (optional)
   * @param tags A comma separated list of task tags. The search will only retrieve random tasks that contain those tags (optional)
   * @param limit Limit the number of results returned in the response. Default value is 1. (optional, default to 1)
   * @param proximity Id of task that you wish to find the next task based on the proximity of that task (optional, default to -1)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getRandomTasks(Long cid, String s, String tags, Integer limit, Long proximity) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling getRandomTasks");
    }
    // create path and map variables
    String localVarPath = "/challenge/{cid}/tasks/random"
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "s", s));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
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
   * Retrieves prioritized random Task
   * Retrieves a prioritized random Task contained within the current Challenge, with higher priority tasks being returned ahead of lower priority tasks
   * @param cid The id of the parent Challenge limiting the tasks to only a descendent of that Challenge. (required)
   * @param s The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive. (optional)
   * @param tags A comma separated list of task tags. The search will only retrieve random tasks that contain those tags (optional)
   * @param limit Limit the number of results returned in the response. Default value is 1. (optional, default to 1)
   * @param proximity Id of task that you wish to find the next task based on the proximity of that task (optional, default to -1)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getRandomTasksWithPriority(Long cid, String s, String tags, Integer limit, Long proximity) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling getRandomTasksWithPriority");
    }
    // create path and map variables
    String localVarPath = "/challenge/{cid}/tasks/prioritizedTasks"
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "s", s));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
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
   * Retrieves a random Task based on the search criteria and contained within the current Challenge
   * @param cid The id of the parent Challenge limiting the tasks to only a descendent of that Challenge. (required)
   * @param s The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive. (optional)
   * @param tags A comma separated list of task tags. The search will only retrieve random tasks that contain those tags (optional)
   * @param limit Limit the number of results returned in the response. Default value is 1. (optional, default to 1)
   * @param proximity Id of task that you wish to find the next task based on the proximity of that task (optional, default to -1)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getRandomTasks_0(Long cid, String s, String tags, Integer limit, Long proximity) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling getRandomTasks_0");
    }
    // create path and map variables
    String localVarPath = "/challenge/{cid}/tasks/randomTasks"
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "s", s));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
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
   * Retrieves next Task
   * Retrieves the next sequential Task based on the task ordering within the Challenge. If it is currently on the last task it will response with the first task in the challenge.
   * @param cid The id of the parent Challenge. (required)
   * @param id The id of the current task being viewed, so that we can get context of what the next task should be (required)
   * @param statusList A comma separated list of Task status&#x27; to limit to the response by. (optional)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask getSequentialNextTask(Long cid, Long id, String statusList) throws ApiException {
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
    String localVarPath = "/challenge/{cid}/nextTask/{id}"
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "statusList", statusList));


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
   * Retrieves the previous sequential Task based on the task ordering within the Challenge. If it is currently on the first task it will response with the last task in the challenge.
   * @param cid The id of the parent Challenge. (required)
   * @param id The id of the current task being viewed, so that we can get context of what the next task should be (required)
   * @param statusList A comma separated list of Task status&#x27; to limit to the response by. (optional)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask getSequentialPreviousTask(Long cid, Long id, String statusList) throws ApiException {
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
    String localVarPath = "/challenge/{cid}/previousTask/{id}"
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "statusList", statusList));


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
   * Retrieve tags for Challenge
   * Retrieves all the Tags that have been added to the specified Challenge
   * @param id The ID of the challenge (required)
   * @return List&lt;OrgMaprouletteFrameworkModelTag&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTag> getTagsForChallenge(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTagsForChallenge");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/tags"
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

    GenericType<List<OrgMaprouletteFrameworkModelTag>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTag>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all the Challenges.
   * Lists all the Challenges in the system
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param onlyEnabled Only retrieve challenges that are enabled, default is false. (optional, default to false)
   * @return List&lt;OrgMaprouletteFrameworkModelChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallenge> list(Integer limit, Integer page, Boolean onlyEnabled) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges";

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

    GenericType<List<OrgMaprouletteFrameworkModelChallenge>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallenge>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all the Challenges with review tasks.
   * Lists all the Challenges in the system with review tasks.
   * @param reviewTasksType Limit challenges to reviews of type... 1/To Be Reviewed 2/User&#x27;s reviewed Tasks 3/All reviewed by users (required)
   * @param tStatus Task statuses to include in search (default all statuses) (optional)
   * @param excludeOtherReviewers Exclude reviews by completed by other reviewers (default true) (optional, default to false)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallenge> listChallenges(Integer reviewTasksType, String tStatus, Boolean excludeOtherReviewers, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'reviewTasksType' is set
    if (reviewTasksType == null) {
      throw new ApiException(400, "Missing the required parameter 'reviewTasksType' when calling listChallenges");
    }
    // create path and map variables
    String localVarPath = "/review/challenges";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewTasksType", reviewTasksType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tStatus", tStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeOtherReviewers", excludeOtherReviewers));
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

    GenericType<List<OrgMaprouletteFrameworkModelChallenge>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallenge>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all the Challenges Tasks.
   * Lists all the Tasks that are children of the supplied Challenge.
   * @param id The project ID. (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> listChildren(Long id, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listChildren");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/tasks"
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
   * List challenges in specified projects
   * Retrieves a lightweight listing of challenges, with just a few basic fields for each, that belong to the specified project(s).
   * @param projectIds Comma-separated list of project ids for which child challenges are desired. Default value is empty string, ie. all projects. (optional)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param onlyEnabled Flag to set if only wanting enabled Challenges returned. Default value is true. (optional, default to true)
   * @param parentId This field will be ignored for this request (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelChallengeListing&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallengeListing> listing(String projectIds, Integer limit, Integer page, Boolean onlyEnabled, Object parentId) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/challenges/listing";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectIds", projectIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyEnabled", onlyEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parentId", parentId));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelChallengeListing>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallengeListing>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Match OSM Changesets
   * This will go through every task and try to match an OSM changeset with the task
   * @param id The ID of the challenge (required)
   * @param skipSet Will skip any tasks if the changesets are already set if this is set to true (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void matchChangeSets(Long id, Boolean skipSet) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling matchChangeSets");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/matchChangesets"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skipSet", skipSet));


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
   * Move Challenge to another Project
   * Will move a challenge into another project
   * @param projectId The ID of the project you are moving the challenge too. (required)
   * @param id The ID of the challenge (required)
   * @return List&lt;OrgMaprouletteFrameworkModelTag&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTag> moveChallenge(Long projectId, Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling moveChallenge");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling moveChallenge");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/project/{projectId}"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()))
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

    GenericType<List<OrgMaprouletteFrameworkModelTag>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTag>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Move Challenges to another Project
   * Will move a list of challenges into another project
   * @param projectId The ID of the project you are moving the challenge too. (required)
   * @return List&lt;OrgMaprouletteFrameworkModelTag&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTag> moveChallenges(Long projectId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling moveChallenges");
    }
    // create path and map variables
    String localVarPath = "/challenges/project/{projectId}"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelTag>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTag>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves an already existing Challenge
   * Retrieves an already existing Challenge based on the supplied ID in the URL.
   * @param id The id of the Challenge to retrieve (required)
   * @return OrgMaprouletteFrameworkModelChallenge
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelChallenge read(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling read");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}"
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

    GenericType<OrgMaprouletteFrameworkModelChallenge> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelChallenge>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves an already existing Challenge
   * Retrieves an already existing Challenge based on the name of the Challenge rather than an ID
   * @param id The id of the parent Project of the Challenge (required)
   * @param name The name of the Challenge being retrieved (required)
   * @return OrgMaprouletteFrameworkModelChallenge
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelChallenge readByName(Long id, String name) throws ApiException {
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
    String localVarPath = "/project/{id}/challenge/{name}"
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

    GenericType<OrgMaprouletteFrameworkModelChallenge> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelChallenge>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Rebuild a Challenge
   * Rebuilds a challenge that was originally built by an overpass query or remote geojson.
   * @param id The id of the Challenge to rebuild. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param removeUnmatched Used to remove incomplete tasks that have been addressed externally since the last rebuild, assuming the source data represents all tasks outstanding. If set to true, all existing tasks in CREATED or SKIPPED status (only) will be removed prior to rebuilding with the assumption that they will be recreated if they still appear in the updated source data. If set to false, unmatched existing tasks are simply left as-is. (optional, default to false)
   * @param skipSnapshot If included will skip recording a snapshot before proceeding. (By default false, so it will create snapshot.) (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void rebuildChallenge(Long id, String apiKey, Boolean removeUnmatched, Boolean skipSnapshot) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling rebuildChallenge");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling rebuildChallenge");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/rebuild"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "removeUnmatched", removeUnmatched));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skipSnapshot", skipSnapshot));

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Reset Task Instructions
   * This will reset all the task instructions so that the task instructions revert to the Challenge instruction.
   * @param id The id of the parent project. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void resetTaskInstructions(Long id, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling resetTaskInstructions");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling resetTaskInstructions");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/resetTaskInstructions"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieve all comments for Challenge
   * This will retrieve all the comments for all the children tasks of a given challenge
   * @param id The ID of the challenge (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @throws ApiException if fails to make API call
   */
  public void retrieveComments(Long id, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveComments");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/comments"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));


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
   * Undeletes a Challenge
   * 
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void undelete(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling undelete");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/undelete"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Updates a Challenge
   * Will update an already existing challenge from the supplied JSON in the body. When updating the Challenge object you can within the same json body include Task children under the \&quot;children\&quot; key.
   * @param body The JSON structure for the Challenge body, include the key &quot;children&quot; to create or update Task children objects. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param id The ID of the Challenge that is being updated (required)
   * @return OrgMaprouletteFrameworkModelChallenge
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelChallenge update(OrgMaprouletteFrameworkModelChallenge body, String apiKey, Long id) throws ApiException {
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
    String localVarPath = "/challenge/{id}"
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

    GenericType<OrgMaprouletteFrameworkModelChallenge> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelChallenge>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create Tasks for Challenge
   * 
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void updateChildren(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateChildren");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/tasks"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update Task Priorities
   * Updates all the Task priorities in a Challenge based on the priority rules setup in the Challenge
   * @param id The id of the parent project. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteExceptionStatusMessage
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteExceptionStatusMessage updateTaskPriorities(Long id, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateTaskPriorities");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling updateTaskPriorities");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/updateTaskPriorities"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteExceptionStatusMessage> localVarReturnType = new GenericType<OrgMaprouletteExceptionStatusMessage>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
