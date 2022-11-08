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
import io.github.thesnoozer.maproulette.client.model.Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class ProjectApi {
  private ApiClient apiClient;

  public ProjectApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Deletes an existing Project
   * Deletes an existing project based on the supplied ID. This will delete all the children Challenges and Tasks under the project as well.
   * @param id The id of the project being deleted (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param immediate If set to true, will delete the project immediately instead of delayed and deleted through a scheduled job on the backend (optional, default to false)
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
    String localVarPath = "/project/{id}"
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
   * Retrieve summaries of all tasks in a Project
   * This will retrieve summaries of all the tasks of a given project and respond with a csv
   * @param projectId The ID of the project (required)
   * @param cId A list of challengeIds to include. If not provided, then all challenges in the project are used. (optional)
   * @param timezone A timezone offset to apply to time fields. Format should be like &#x27;+HH:MM&#x27;. Default is GMT (+00:00) (optional)
   * @throws ApiException if fails to make API call
   */
  public void extractAllTaskSummaries(Long projectId, String cId, String timezone) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling extractAllTaskSummaries");
    }
    // create path and map variables
    String localVarPath = "/project/{projectId}/tasks/extract"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cId", cId));
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
   * List all the projects.
   * Lists all the projects in the system
   * @param search  (optional)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param onlyEnabled Flag to set if only wanting enabled projects returned. Default value is true. (optional, default to false)
   * @return List&lt;Project&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Project> find(String search, Integer limit, Integer page, Boolean onlyEnabled) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/projects";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
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

    GenericType<List<Project>> localVarReturnType = new GenericType<List<Project>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find project matching search criteria. Use GET /projects to find instead.
   * 
   * @param q  (optional)
   * @param limit  (optional, default to 10)
   * @param page  (optional, default to 0)
   * @param onlyEnabled  (optional, default to true)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void find_0(String q, Integer limit, Integer page, Boolean onlyEnabled) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/projects/find";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyEnabled", onlyEnabled));


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
   * Retrieves clustered challenge points
   * Retrieves all the challenges for a specific project as clustered points to potentially display on a map
   * @param id The id of the parent project. (required)
   * @param challenges The challenge search string. Retrieve only challenge clustered points that have the search string contained within the challenge name. Match is case insensitive. (optional)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 0)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return OrgMaprouletteFrameworkModelClusteredPoint
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelClusteredPoint getClusteredPoints(Long id, String challenges, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getClusteredPoints");
    }
    // create path and map variables
    String localVarPath = "/project/clustered/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "challenges", challenges));
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

    GenericType<OrgMaprouletteFrameworkModelClusteredPoint> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelClusteredPoint>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieve featured projects
   * Get all the currently featured projects
   * @param onlyEnabled Flag to set if only wanting enabled projects returned. Default value is true. (optional, default to true)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;Project&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Project> getFeaturedProjects(Boolean onlyEnabled, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/projects/featured";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyEnabled", onlyEnabled));
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

    GenericType<List<Project>> localVarReturnType = new GenericType<List<Project>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves random Task
   * Retrieves random tasks based on the search criteria and contained within the current project
   * @param id The id of the parent project limiting the tasks to only a descendent of that project. (required)
   * @param limit Limit the number of results returned in the response. Default value is 1. (optional, default to 1)
   * @param proximity Id of task that you wish to find the next task based on the proximity of that task (optional, default to -1)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getRandomTasks(Long id, Integer limit, Long proximity) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRandomTasks");
    }
    // create path and map variables
    String localVarPath = "/project/{id}/tasks"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Retrieves clustered challenge points
   * Retrieves all the challenges as clustered points to potentially display on a map
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 0)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return OrgMaprouletteFrameworkModelClusteredPoint
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelClusteredPoint getSearchedClusteredPoints(Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/project/search/clustered";

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

    GenericType<OrgMaprouletteFrameworkModelClusteredPoint> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelClusteredPoint>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Create a Project
   * Will create a new project from the supplied JSON in the body. When creating the the Project, leave the ID field out of the body json, if updating (generally use the PUT method) and include the ID field.
   * @param body The JSON structure for the project body. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return Project
   * @throws ApiException if fails to make API call
   */
  public Project insert(Project body, String apiKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling insert");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling insert");
    }
    // create path and map variables
    String localVarPath = "/project";

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

    GenericType<Project> localVarReturnType = new GenericType<Project>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * List all the projects challenges.
   * Lists all the challenges that are children of the supplied project.
   * @param id The project ID. (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelChallenge&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallenge> listChildren(Long id, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listChildren");
    }
    // create path and map variables
    String localVarPath = "/project/{id}/challenges"
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
   * List all the managed projects.
   * Lists all the managed projects in the system for the authenticated user
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param onlyEnabled Flag to set if only wanting enabled projects returned. Default value is true. (optional, default to false)
   * @param onlyOwned Whether to only returned projects that are owned by this user. By default set to false and returns all of them (optional, default to false)
   * @param searchString A simple search string that will filter out for a specific set of projects matching the search string. (optional)
   * @param sort The column to sort by. Default column is \&quot;display_name\&quot; (optional, default to display_name)
   * @return List&lt;Project&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Project> listManagedProjects(String apiKey, Integer limit, Integer page, Boolean onlyEnabled, Boolean onlyOwned, String searchString, String sort) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling listManagedProjects");
    }
    // create path and map variables
    String localVarPath = "/projects/managed";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyEnabled", onlyEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyOwned", onlyOwned));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchString", searchString));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

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

    GenericType<List<Project>> localVarReturnType = new GenericType<List<Project>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves an already existing Project
   * Retrieves an already existing project based on the supplied ID in the URL.
   * @param id The id of the project to retrieve (required)
   * @return Project
   * @throws ApiException if fails to make API call
   */
  public Project retrieve(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieve");
    }
    // create path and map variables
    String localVarPath = "/project/{id}"
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

    GenericType<Project> localVarReturnType = new GenericType<Project>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves an already existing Project
   * Retrieves an already existing project based on the name of the project rather than an ID
   * @param name The name of the project being retrieved (required)
   * @return Project
   * @throws ApiException if fails to make API call
   */
  public Project retrieveByName(String name) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling retrieveByName");
    }
    // create path and map variables
    String localVarPath = "/projectByName/{name}"
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

    GenericType<Project> localVarReturnType = new GenericType<Project>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieve all comments for Project
   * This will retrieve all the comments of the descendent tasks of a given Project
   * @param id The ID of the project (required)
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
    String localVarPath = "/project/{id}/comments"
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
   * Retrieves already existing Projects based on a given list of ids
   * Retrieves already existing projects based on the supplied IDs
   * @param projectIds Comma-separated list of project ids for which projects are desired. (required)
   * @return List&lt;Project&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Project> retrieveList(String projectIds) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'projectIds' is set
    if (projectIds == null) {
      throw new ApiException(400, "Missing the required parameter 'projectIds' when calling retrieveList");
    }
    // create path and map variables
    String localVarPath = "/projectsById";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectIds", projectIds));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Project>> localVarReturnType = new GenericType<List<Project>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Updates a Project
   * Will update an already existing project from the supplied JSON in the body.
   * @param body The JSON structure for the project body. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param id The ID of the project that is being updated (required)
   * @return Project
   * @throws ApiException if fails to make API call
   */
  public Project update(Project body, String apiKey, Long id) throws ApiException {
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
    String localVarPath = "/project/{id}"
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

    GenericType<Project> localVarReturnType = new GenericType<Project>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
