package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteExceptionStatusMessage;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelChallenge;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelProjectManager;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTask;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelUser;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelUserSettings;
import io.github.thesnoozer.maproulette.client.model.PublicUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class UserApi {
  private ApiClient apiClient;

  public UserApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Grant role to user on project
   * Grants a user an Admin, Write or Read role on the project
   * @param userId The id of the user to be granted the role. If using an OSM user id, then the isOSMUserId query parameter must be set to true (required)
   * @param projectId The id of the project (required)
   * @param role Either 1 - Admin, 2 - Write, 3 - Read (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param isOSMUserId Specify if the user id is to be treated as an OSM user id (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void addUserToProject(Long userId, Long projectId, Integer role, String apiKey, Boolean isOSMUserId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addUserToProject");
    }
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling addUserToProject");
    }
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling addUserToProject");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling addUserToProject");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/project/{projectId}/{role}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isOSMUserId", isOSMUserId));

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
   * Grant role on project to a list of users
   * Grants Admin, Write, or Read role on project to list of users
   * @param body A JSON array of user ids. If using OSM user Ids then the isOSMUserId query parameter must be set to true (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param projectId The id of the project (required)
   * @param role Either 1 - Admin, 2 - Write, 3 - Read (required)
   * @param isOSMUserId Specify if the user ids are to be treated as OSM user ids (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void addUsersToProject(List<Integer> body, String apiKey, Long projectId, Integer role, Boolean isOSMUserId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addUsersToProject");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling addUsersToProject");
    }
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling addUsersToProject");
    }
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling addUsersToProject");
    }
    // create path and map variables
    String localVarPath = "/user/project/{projectId}/{role}"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isOSMUserId", isOSMUserId));

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
   * Deletes a user from the database
   * This will delete a user completely from the database. It can also optionally anonymize the users data from actions taken in MapRoulette, like change in status for tasks, comments on tasks and answers to survey questions
   * @param osmId The OSM id of the user you want to delete (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param anonymize Whether to anonymize the users data, false by default (optional, default to false)
   * @return OrgMaprouletteExceptionStatusMessage
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteExceptionStatusMessage deleteUser(Long osmId, String apiKey, Boolean anonymize) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'osmId' is set
    if (osmId == null) {
      throw new ApiException(400, "Missing the required parameter 'osmId' when calling deleteUser");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteUser");
    }
    // create path and map variables
    String localVarPath = "/user/{osmId}"
      .replaceAll("\\{" + "osmId" + "\\}", apiClient.escapeString(osmId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "anonymize", anonymize));

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
   * Generates an API_KEY for a specified user
   * This API will generate or regenerate the API_KEY for a specified user
   * @param userId The id of the user to retrieve (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteFrameworkModelUser
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelUser generateAPIKey(Long userId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling generateAPIKey");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling generateAPIKey");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/apikey"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<OrgMaprouletteFrameworkModelUser> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelUser>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves Users public Json information
   * Retrieves a JSON object that represents the user&#x27;s public information that anyone can retrieve. This is a limited set of information that only includes certain fields.
   * @param userId The id of the user to retrieve (required)
   * @return PublicUser
   * @throws ApiException if fails to make API call
   */
  public PublicUser getPublicUser(Long userId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getPublicUser");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/public"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<PublicUser> localVarReturnType = new GenericType<PublicUser>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves Users public Json information
   * Retrieves User Json based on the supplied OSM username
   * @param username The OSM username of the user to retrieve (required)
   * @return PublicUser
   * @throws ApiException if fails to make API call
   */
  public PublicUser getPublicUserByOSMUsername(String username) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling getPublicUserByOSMUsername");
    }
    // create path and map variables
    String localVarPath = "/osmuser/{username}/public"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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

    GenericType<PublicUser> localVarReturnType = new GenericType<PublicUser>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves Users Saved Challenged
   * Retrieves that list of challenges that has been saved by the User
   * @param userId The id of the user to retrieve the challenges for (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallenge> getSavedChallenges(Long userId, String apiKey, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSavedChallenges");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getSavedChallenges");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/saved"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

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

    GenericType<List<OrgMaprouletteFrameworkModelChallenge>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallenge>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves Users Saved Tasks
   * Retrieves that list of tasks that has been saved by the User
   * @param userId The id of the user to retrieve the challenges for (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param challengeIds A comma separated list of challenge Ids that you want to filter the tasks by (optional)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getSavedTasks(Long userId, String apiKey, String challengeIds, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSavedTasks");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getSavedTasks");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/savedTasks"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "challengeIds", challengeIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

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

    GenericType<List<OrgMaprouletteFrameworkModelTask>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTask>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves Users Json information
   * Retrieves User Json based on the supplied ID
   * @param userId The id or OsmId of the user to retrieve. It will first try to match on the OSM id and if not found it will retrieve based on the MapRoulette Id. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteFrameworkModelUser
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelUser getUser(Long userId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getUser");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<OrgMaprouletteFrameworkModelUser> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelUser>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves Users Json information
   * Retrieves User Json based on the supplied OSM username
   * @param username The OSM username of the user to retrieve (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteFrameworkModelUser
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelUser getUserByOSMUsername(String username, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling getUserByOSMUsername");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getUserByOSMUsername");
    }
    // create path and map variables
    String localVarPath = "/osmuser/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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

    GenericType<OrgMaprouletteFrameworkModelUser> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelUser>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Gets a list of users managing project
   * Gets list of users managing project along with their roles (1 - Admin, 2 - Write, 3 - Read)
   * @param projectId The id of the project (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param osmIds A list of comma separated OSM id&#x27;s to filter the request by (optional)
   * @param includeTeams If true, indirect managers via teams will also be included (optional, default to false)
   * @return List&lt;OrgMaprouletteFrameworkModelProjectManager&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelProjectManager> getUsersManagingProject(Long projectId, String apiKey, String osmIds, Boolean includeTeams) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getUsersManagingProject");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getUsersManagingProject");
    }
    // create path and map variables
    String localVarPath = "/user/project/{projectId}"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "osmIds", osmIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTeams", includeTeams));

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

    GenericType<List<OrgMaprouletteFrameworkModelProjectManager>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelProjectManager>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Refresh User Profile
   * Refreshes the user profile from OSM
   * @param userId The osm id of the user to update the settings for (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void refreshProfile(Long userId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling refreshProfile");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling refreshProfile");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/refresh"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
   * Remove granted role on project from user
   * Removes Admin, Write, or Read role on a project from a user
   * @param userId The id of the user who is to have role removed. If using an OSM user id, then the isOSMUserId query parameter must be set to true (required)
   * @param projectId The id of the project (required)
   * @param role Either -1 all, 1 - Admin, 2 - Write, 3 - Read (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param isOSMUserId Specify if the user ids are to be treated as OSM user ids (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void removeUserFromProject(Long userId, Long projectId, Integer role, String apiKey, Boolean isOSMUserId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeUserFromProject");
    }
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling removeUserFromProject");
    }
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling removeUserFromProject");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling removeUserFromProject");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/project/{projectId}/{role}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isOSMUserId", isOSMUserId));

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
   * Removes granted role on project from a list of users
   * Removes Admin, Write, or Read role on project from a list of users
   * @param body A JSON array of user ids. This can be either the MapRoulette or OSM Id. If using OSM user ids, then the isOSMUserId query parameter must be set to true (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param projectId The id of the project (required)
   * @param role Either 1 - Admin, 2 - Write, 3 - Read (required)
   * @param isOSMUserId Specify if the user ids are to be treated as OSM user ids (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void removeUsersFromProject(List<Integer> body, String apiKey, Long projectId, Integer role, Boolean isOSMUserId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling removeUsersFromProject");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling removeUsersFromProject");
    }
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling removeUsersFromProject");
    }
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling removeUsersFromProject");
    }
    // create path and map variables
    String localVarPath = "/user/project/{projectId}/{role}"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isOSMUserId", isOSMUserId));

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

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Saves Challenge for a User
   * Saves a Challenge to a user account
   * @param userId The id of the user to save the challenges for (required)
   * @param challengeId The id of the challenge to save (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteExceptionStatusMessage
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteExceptionStatusMessage saveChallenge(Long userId, Long challengeId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling saveChallenge");
    }
    // verify the required parameter 'challengeId' is set
    if (challengeId == null) {
      throw new ApiException(400, "Missing the required parameter 'challengeId' when calling saveChallenge");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling saveChallenge");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/save/{challengeId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "challengeId" + "\\}", apiClient.escapeString(challengeId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Saves a Task for a User
   * Saves a Task to a user account
   * @param userId The id of the user to save the tasks for (required)
   * @param taskId The id of the Task to save (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteExceptionStatusMessage
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteExceptionStatusMessage saveTask(Long userId, Long taskId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling saveTask");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling saveTask");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling saveTask");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/saveTask/{taskId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Search for users by OSM username
   * Retrieves list of matching users
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param tid Optional field to allow searching for users who participated in a task. (optional)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. (optional)
   * @return OrgMaprouletteFrameworkModelUser
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelUser searchUserByOSMUsername(String apiKey, Integer limit, Object tid, Object page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling searchUserByOSMUsername");
    }
    // create path and map variables
    String localVarPath = "/users/find/{username}";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tid", tid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

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

    GenericType<OrgMaprouletteFrameworkModelUser> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelUser>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Set project role for user, removing any prior roles on the project
   * Sets a user&#x27;s role on the project to Admin, Write or Read. This will also remove any other roles on the project from the user.
   * @param userId The id of the user to be granted the role (required)
   * @param projectId The id of the project (required)
   * @param role Either 1 - Admin, 2 - Write, 3 - Read (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param isOSMUserId Specify if the user id is to be treated as an OSM user id (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void setUserProjectRole(Long userId, Long projectId, Integer role, String apiKey, Boolean isOSMUserId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setUserProjectRole");
    }
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling setUserProjectRole");
    }
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling setUserProjectRole");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling setUserProjectRole");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/project/{projectId}/{role}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isOSMUserId", isOSMUserId));

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
   * Unsaves Challenge for a User
   * Unsaves a Challenge to a user account
   * @param userId The id of the user to unsave the challenges for (required)
   * @param challengeId The id of the challenge to unsave (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteExceptionStatusMessage
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteExceptionStatusMessage unsaveChallenge(Long userId, Long challengeId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling unsaveChallenge");
    }
    // verify the required parameter 'challengeId' is set
    if (challengeId == null) {
      throw new ApiException(400, "Missing the required parameter 'challengeId' when calling unsaveChallenge");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling unsaveChallenge");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/unsave/{challengeId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "challengeId" + "\\}", apiClient.escapeString(challengeId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Unsaves Task for a User
   * Unsaves a Task from a user account
   * @param userId The id of the user to unsave the tasks for (required)
   * @param taskId The id of the task to unsave (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteExceptionStatusMessage
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteExceptionStatusMessage unsaveTask(Long userId, Long taskId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling unsaveTask");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling unsaveTask");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling unsaveTask");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/unsaveTask/{taskId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Updates UserSettings
   * Updates the user settings for a specified user
   * @param body The JSON structure for the users UserSettings. You can optionally include a key properties which would be a JSON object that contains any extra information for the user. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param userId The id of the user to update the settings for (required)
   * @return OrgMaprouletteFrameworkModelUser
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelUser updateUser(List<OrgMaprouletteFrameworkModelUserSettings> body, String apiKey, Long userId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateUser");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling updateUser");
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<OrgMaprouletteFrameworkModelUser> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelUser>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves current user
   * Retrieves the current logged-in user&#x27;s JSON
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteFrameworkModelUser
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelUser whoami(String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling whoami");
    }
    // create path and map variables
    String localVarPath = "/user/whoami";

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

    GenericType<OrgMaprouletteFrameworkModelUser> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelUser>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
