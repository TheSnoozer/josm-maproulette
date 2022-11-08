package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteExceptionStatusMessage;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelClusteredPoint;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTag;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTask;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelTaskCluster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class TaskApi {
  private ApiClient apiClient;

  public TaskApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TaskApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve task attachment
   * Retrieve attachment identified by attachmentId on specified task
   * @param id The id of the Task for which attachment is desired (required)
   * @param attachmentId The id of the desired task attachment (required)
   * @throws ApiException if fails to make API call
   */
  public void attachment(Long id, String attachmentId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling attachment");
    }
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling attachment");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/attachment/{attachmentId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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
   * Download task attachment data as file
   * Download attachment attachment data as file
   * @param id The id of the Task for which attachment is desired (required)
   * @param attachmentId The id of the desired task attachment (required)
   * @param filename A filename to use. Some editors will use this as a hint as to the format of the data. Must be alphanumeric with optional underscores, dashes, and dots. (required)
   * @throws ApiException if fails to make API call
   */
  public void attachmentData(Long id, String attachmentId, String filename) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling attachmentData");
    }
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling attachmentData");
    }
    // verify the required parameter 'filename' is set
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling attachmentData");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/attachment/{attachmentId}/data/{filename}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()))
      .replaceAll("\\{" + "filename" + "\\}", apiClient.escapeString(filename.toString()));

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
   * Create a batch of Tasks
   * Will create multiple new Tasks from the JSONArray supplied in the body. Each JSON object is basically a Task object that is processed similarly to the singular /sask POST. If Tasks already exist with the name, they will simply be skipped, ie. not updated.
   * @param body The JSON structure for the Task body. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void batchUploadPost(List<OrgMaprouletteFrameworkModelTask> body, String apiKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling batchUploadPost");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling batchUploadPost");
    }
    // create path and map variables
    String localVarPath = "/tasks";

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

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a batch of Tasks
   * Will update multiple already existing Tasks from the JSONArray supplied in the body. Each JSON object is basically a Task object that is processed similarly to the singular /task POST. If a Task does not exist it will be created from scratch
   * @param body The JSON structure for the Task body. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void batchUploadPut(List<OrgMaprouletteFrameworkModelTask> body, String apiKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling batchUploadPut");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling batchUploadPut");
    }
    // create path and map variables
    String localVarPath = "/tasks";

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
   * Changes status on tasks matching criteria
   * Will changes status on tasks that match the given search parameters.
   * @param newStatus  (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void bulkStatusChange(Integer newStatus, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'newStatus' is set
    if (newStatus == null) {
      throw new ApiException(400, "Missing the required parameter 'newStatus' when calling bulkStatusChange");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling bulkStatusChange");
    }
    // create path and map variables
    String localVarPath = "/tasks/changeStatus";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newStatus", newStatus));

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
   * Retrieve any change XML that is part of this task&#x27;s cooperative work
   * Retrieve change XML that is part of this task&#x27;s cooperative work. The cooperative work on the task should be consulted to determine if any change exists for the task, and which change format was used (i.e. JOSM, OSMChange, etc).
   * @param id The id of the Task for which change XML is desired (required)
   * @param filename A filename to use. Some editors will use this as a hint as to the change format of the XML. Must be alphanumeric with optional underscores, dashes, and dots. (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask cooperativeWorkChangeXML(Long id, String filename) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cooperativeWorkChangeXML");
    }
    // verify the required parameter 'filename' is set
    if (filename == null) {
      throw new ApiException(400, "Missing the required parameter 'filename' when calling cooperativeWorkChangeXML");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/cooperative/change/{filename}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "filename" + "\\}", apiClient.escapeString(filename.toString()));

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
   * Create a Task
   * Will create a new Task from the supplied JSON in the body. When creating the Task, leave the ID field out of the body json, if updating (generally use the PUT method) include the ID field.
   * @param body The JSON structure for the Task body. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask create(OrgMaprouletteFrameworkModelTask body, String apiKey) throws ApiException {
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
    String localVarPath = "/task";

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

    GenericType<OrgMaprouletteFrameworkModelTask> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelTask>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Deletes an existing Task
   * Deletes an existing Task based on the supplied ID.
   * @param id The id of the Task being deleted (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param immediate  (optional, default to true)
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
    String localVarPath = "/task/{id}"
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
   * Delete Task Tags
   * Deletes all the supplied tags from the Task
   * @param id The ID of the Task (required)
   * @param tags A comma separated list of tags (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTagsFromItem(Long id, String tags, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTagsFromItem");
    }
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling deleteTagsFromItem");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteTagsFromItem");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/tags"
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
   * Find Task matching search criteria
   * Finds a list of Tasks that match a specific search criteria. The search criteria is simply a string that is contained in the Task name. String case sensitivity is ignored.
   * @param q The search string used to match the Task names. Default value is empty string, ie. will match everything. (optional)
   * @param parentId This limits the search to the provided challenge and no tasks outside of the provided challenge ID. (optional, default to -1)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param onlyEnabled Flag to set if only want to see Tasks from enabled Challenges returned. Default value is true. (optional, default to true)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> find(String q, Long parentId, Integer limit, Integer page, Boolean onlyEnabled) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/tasks/find";

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

    GenericType<List<OrgMaprouletteFrameworkModelTask>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTask>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieve Tasks based on provided tags
   * Retrieves all the Tasks that contain at least one of the supplied tags.
   * @param tags A comma separated list of tags (optional)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getItemsBasedOnTags(String tags, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/tasks/tags";

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

    GenericType<List<OrgMaprouletteFrameworkModelTask>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTask>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves random Task
   * Retrieves a random Task based on the search criteria.
   * @param ps The search string to match the names of projects to limit the Task pool from. The string is case insensitive. (optional)
   * @param cs The search string to match the names of challenges to limit the Task pool from. The string is case insensitive. (optional)
   * @param ct The challenge tags to limit the parent challenges that will limit the Task pool. (optional)
   * @param tags A comma separated list of task tags. The search will only retrieve random tasks that contain those tags (optional)
   * @param ts The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive. (optional)
   * @param limit Limit the number of results returned in the response. Default value is 1. (optional, default to 1)
   * @param proximity Id of task that you wish to find the next task based on the proximity of that task (optional, default to -1)
   * @return List&lt;OrgMaprouletteFrameworkModelTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTask> getRandomTasks(String ps, String cs, String ct, String tags, String ts, Integer limit, Long proximity) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/tasks/random";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ps", ps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cs", cs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ct", ct));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ts", ts));
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
   * Retrieve tags for Task
   * Retrieves all the Tags that have been added to the specified Task
   * @param id The ID of the Task (required)
   * @return List&lt;OrgMaprouletteFrameworkModelTag&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTag> getTagsForTask(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTagsForTask");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/tags"
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
   * Retrieves task clusters. USE PUT METHOD
   * 
   * @param points  (optional, default to 100)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void getTaskClusters(Integer points) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/taskCluster";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "points", points));


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
   * Retrieves task clusters.
   * Retrieves task clusters that contain the centroid location for a group of tasks
   * @param points The number of clusters that you want returned (optional, default to 100)
   * @return List&lt;OrgMaprouletteFrameworkModelTaskCluster&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelTaskCluster> getTaskClusters_0(Integer points) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/taskCluster";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "points", points));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelTaskCluster>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelTaskCluster>>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves a history for the task
   * Retrieves list of task history log entries. This includes comments, status actions, and review actions.
   * @param id The id of the task (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask getTaskHistoryLog(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTaskHistoryLog");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/history"
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
   * Retrieves Tasks within a bounding box
   * 
   * @param left  (required)
   * @param bottom  (required)
   * @param right  (required)
   * @param top  (required)
   * @param limit  (optional, default to 10000)
   * @param page  (optional, default to 0)
   * @param excludeLocked  (optional, default to false)
   * @param sort  (optional)
   * @param order  (optional, default to ASC)
   * @param includeTotal  (optional, default to false)
   * @param includeGeometries  (optional, default to false)
   * @param includeTags  (optional, default to false)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void getTasksInBoundingBox(Double left, Double bottom, Double right, Double top, Integer limit, Integer page, Boolean excludeLocked, String sort, String order, Boolean includeTotal, Boolean includeGeometries, Boolean includeTags) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'left' is set
    if (left == null) {
      throw new ApiException(400, "Missing the required parameter 'left' when calling getTasksInBoundingBox");
    }
    // verify the required parameter 'bottom' is set
    if (bottom == null) {
      throw new ApiException(400, "Missing the required parameter 'bottom' when calling getTasksInBoundingBox");
    }
    // verify the required parameter 'right' is set
    if (right == null) {
      throw new ApiException(400, "Missing the required parameter 'right' when calling getTasksInBoundingBox");
    }
    // verify the required parameter 'top' is set
    if (top == null) {
      throw new ApiException(400, "Missing the required parameter 'top' when calling getTasksInBoundingBox");
    }
    // create path and map variables
    String localVarPath = "/tasks/box/{left}/{bottom}/{right}/{top}"
      .replaceAll("\\{" + "left" + "\\}", apiClient.escapeString(left.toString()))
      .replaceAll("\\{" + "bottom" + "\\}", apiClient.escapeString(bottom.toString()))
      .replaceAll("\\{" + "right" + "\\}", apiClient.escapeString(right.toString()))
      .replaceAll("\\{" + "top" + "\\}", apiClient.escapeString(top.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeLocked", excludeLocked));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTotal", includeTotal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeGeometries", includeGeometries));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTags", includeTags));


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
   * Retrieves Tasks within a bounding box
   * Retrieves tasks within a given bounding box.
   * @param left The minimum latitude for the bounding box. (required)
   * @param bottom The minimum longitude for the bounding box. (required)
   * @param right The maximum latitude for the bounding box. (required)
   * @param top The maximum longitude for the bounding box. (required)
   * @param limit Limit the number of results returned in the response. Default value is 1. (optional, default to 10000)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param excludeLocked Ignore the lock status of the task. So true will include all tasks, including ones locked by another user. (optional, default to false)
   * @param sort  (optional)
   * @param order  (optional, default to ASC)
   * @param includeTotal  (optional, default to false)
   * @param includeGeometries Optional flag to have geometries data returned for each task. (optional, default to false)
   * @param includeTags Optional flag to have tag data returned for each task. (optional, default to false)
   * @return List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelClusteredPoint> getTasksInBoundingBox_0(Double left, Double bottom, Double right, Double top, Integer limit, Integer page, Boolean excludeLocked, String sort, String order, Boolean includeTotal, Boolean includeGeometries, Boolean includeTags) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'left' is set
    if (left == null) {
      throw new ApiException(400, "Missing the required parameter 'left' when calling getTasksInBoundingBox_0");
    }
    // verify the required parameter 'bottom' is set
    if (bottom == null) {
      throw new ApiException(400, "Missing the required parameter 'bottom' when calling getTasksInBoundingBox_0");
    }
    // verify the required parameter 'right' is set
    if (right == null) {
      throw new ApiException(400, "Missing the required parameter 'right' when calling getTasksInBoundingBox_0");
    }
    // verify the required parameter 'top' is set
    if (top == null) {
      throw new ApiException(400, "Missing the required parameter 'top' when calling getTasksInBoundingBox_0");
    }
    // create path and map variables
    String localVarPath = "/tasks/box/{left}/{bottom}/{right}/{top}"
      .replaceAll("\\{" + "left" + "\\}", apiClient.escapeString(left.toString()))
      .replaceAll("\\{" + "bottom" + "\\}", apiClient.escapeString(bottom.toString()))
      .replaceAll("\\{" + "right" + "\\}", apiClient.escapeString(right.toString()))
      .replaceAll("\\{" + "top" + "\\}", apiClient.escapeString(top.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeLocked", excludeLocked));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTotal", includeTotal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeGeometries", includeGeometries));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTags", includeTags));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrgMaprouletteFrameworkModelClusteredPoint>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelClusteredPoint>>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves tasks in a cluster
   * Retrieves tasks contained in a cluster retrieved from api /api/v2/challenge/:id/taskCluster
   * @param clusterId The id of the single cluster. (required)
   * @param id The id of the parent project. (required)
   * @param points The number of clusters that you want returned (optional, default to 100)
   * @return List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelClusteredPoint> getTasksInCluster(Integer clusterId, Object id, Integer points) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'clusterId' is set
    if (clusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'clusterId' when calling getTasksInCluster");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTasksInCluster");
    }
    // create path and map variables
    String localVarPath = "/tasksInCluster/{clusterId}"
      .replaceAll("\\{" + "clusterId" + "\\}", apiClient.escapeString(clusterId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "points", points));


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
   * Update Task Changeset
   * Will update the changeset of the task. It will do this by attempting to match the OSM changeset to the Task based on the geometry and the time that the changeset was executed.
   * @param id The ID of the task (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask matchToOSMChangeSet(Long id, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling matchToOSMChangeSet");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling matchToOSMChangeSet");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/changeset"
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

    GenericType<OrgMaprouletteFrameworkModelTask> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelTask>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves an already existing Task
   * Retrieves an already existing Task based on the supplied ID in the URL.
   * @param id The id of the Task to retrieve (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask read(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling read");
    }
    // create path and map variables
    String localVarPath = "/task/{id}"
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
   * Retrieves an already existing Task
   * Retrieves an already existing Task based on the name of the Task rather than an ID
   * @param id The id of the parent Challenge of the Task (required)
   * @param name The name of the Task being retrieved (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask readByName(Long id, String name) throws ApiException {
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
    String localVarPath = "/challenge/{id}/task/{name}"
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

    GenericType<OrgMaprouletteFrameworkModelTask> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelTask>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Refresh an existing lock on a Task
   * Refreshes an existing lock, extending its allowed duration, on the task with the supplied ID. The requesting user must already own an active lock on the task (i.e. via the task/:id/start API) or a 403 will be raised
   * @param id The id of the Task on which the lock is to be refreshed (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask refreshTaskLock(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling refreshTaskLock");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/refreshLock"
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
   * Release a Task (unlocks it)
   * Unlocks a Task based on the supplied ID in the URL.
   * @param id The id of the Task to retrieve (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask releaseTask(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling releaseTask");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/release"
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
   * Changes review status to \&quot;Unnecessary\&quot; on tasks matching criteria
   * Will change review status on tasks that match the given search parameters indicating the tasks do not need a review.
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param ids  (optional)
   * @param asMetaReview  (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void removeReviewRequest(String apiKey, String ids, Boolean asMetaReview) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling removeReviewRequest");
    }
    // create path and map variables
    String localVarPath = "/tasks/review/remove";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asMetaReview", asMetaReview));

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
   * Update Meta Review Status for a Bundle
   * Will update Tasks meta review status to one of the following. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted
   * @param id The ID of the bundle (required)
   * @param status The review status to update the meta review status to. Following status Integers can be used. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param comment Any comment that is provided by the user when setting the review status (optional)
   * @param tags Optional tags to associate with this task (optional)
   * @param errorTags Optional string to provide error tags in the review history (optional)
   * @throws ApiException if fails to make API call
   */
  public void setBundleMetaReviewStatus(Long id, Integer status, String apiKey, String comment, String tags, String errorTags) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setBundleMetaReviewStatus");
    }
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling setBundleMetaReviewStatus");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling setBundleMetaReviewStatus");
    }
    // create path and map variables
    String localVarPath = "/taskBundle/{id}/metareview/{status}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(status.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "errorTags", errorTags));

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
   * Update Task Review Status for a Bundle
   * Will update a Tasks review status to one of the following. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted
   * @param id The ID of the bundle (required)
   * @param status The status to update the Task to. Following status Integers can be used. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param comment Any comment that is provided by the user when setting the review status (optional)
   * @param tags Optional tags to associate with this task (optional)
   * @param newTaskStatus Optional int taskStatus to change the task status on all tasks in this bundle to (optional)
   * @param errorTags Optional string to provide error tags in the review history (optional)
   * @throws ApiException if fails to make API call
   */
  public void setBundleTaskReviewStatus(Long id, Integer status, String apiKey, String comment, String tags, String newTaskStatus, String errorTags) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setBundleTaskReviewStatus");
    }
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling setBundleTaskReviewStatus");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling setBundleTaskReviewStatus");
    }
    // create path and map variables
    String localVarPath = "/taskBundle/{id}/review/{status}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(status.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newTaskStatus", newTaskStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "errorTags", errorTags));

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
   * Update Bundle Task Status
   * Will update a Bundled list of Tasks statuses to one of the following. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
   * @param bundleId The ID of the bundle (required)
   * @param primaryId The primary ID of the task for this bundle (required)
   * @param status The status to update the Task too. Following status Integers can be used. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param comment Any comment that is provided by the user when setting the status (optional)
   * @param tags Optional tags to associate with this task (optional)
   * @param requestReview Boolean indicating if a review is requested on this task. (Will override user settings if provided) (optional)
   * @throws ApiException if fails to make API call
   */
  public void setBundleTaskStatus(Long bundleId, Long primaryId, Integer status, String apiKey, String comment, String tags, Object requestReview) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'bundleId' is set
    if (bundleId == null) {
      throw new ApiException(400, "Missing the required parameter 'bundleId' when calling setBundleTaskStatus");
    }
    // verify the required parameter 'primaryId' is set
    if (primaryId == null) {
      throw new ApiException(400, "Missing the required parameter 'primaryId' when calling setBundleTaskStatus");
    }
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling setBundleTaskStatus");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling setBundleTaskStatus");
    }
    // create path and map variables
    String localVarPath = "/taskBundle/{bundleId}/{status}"
      .replaceAll("\\{" + "bundleId" + "\\}", apiClient.escapeString(bundleId.toString()))
      .replaceAll("\\{" + "primaryId" + "\\}", apiClient.escapeString(primaryId.toString()))
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(status.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestReview", requestReview));

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
   * Update Task Meta Review Status
   * Will update a Tasks meta review status to one of the following. 0 - (re)Requested, 1 - Approved, 2 - Rejected, 3 - Assisted
   * @param id The ID of the task (required)
   * @param status Will update a Tasks meta review status to one of the following. 0 - (re)Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed, 5 - Unnecessary (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param comment Any comment that is provided by the user when setting the meta review status (optional)
   * @param tags Optional tags to associate with this task (optional)
   * @param errorTags Optional string to provide reject tags in the review history (optional)
   * @throws ApiException if fails to make API call
   */
  public void setMetaReviewStatus(Long id, Integer status, String apiKey, String comment, String tags, String errorTags) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setMetaReviewStatus");
    }
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling setMetaReviewStatus");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling setMetaReviewStatus");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/metareview/{status}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(status.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "errorTags", errorTags));

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
   * Update Task Review Status
   * Will update a Tasks review status to one of the following. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted
   * @param id The ID of the task (required)
   * @param status Will update a Tasks review status to one of the following. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed, 5 - Unnecessary, 6 - Approved With Revisions (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param comment Any comment that is provided by the user when setting the review status (optional)
   * @param tags Optional tags to associate with this task (optional)
   * @param newTaskStatus Optional int taskStatus to change the task status on this task to (optional)
   * @param errorTags Optional string to provide error tags in the review history (optional)
   * @param asMetaReview Optional boolean to indicate the meta review status should be set to unecessary (optional)
   * @throws ApiException if fails to make API call
   */
  public void setTaskReviewStatus(Long id, Integer status, String apiKey, String comment, String tags, String newTaskStatus, String errorTags, Object asMetaReview) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setTaskReviewStatus");
    }
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling setTaskReviewStatus");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling setTaskReviewStatus");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/review/{status}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(status.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newTaskStatus", newTaskStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "errorTags", errorTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asMetaReview", asMetaReview));

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
   * Update Task Status
   * Will update a Tasks status to one of the following. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
   * @param id The ID of the task (required)
   * @param status The status to update the Task too. Following status Integers can be used. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param comment Any comment that is provided by the user when setting the status (optional)
   * @param tags Optional tags to associate with this task (optional)
   * @param requestReview Boolean indicating if a review is requested on this task. (Will override user settings if provided) (optional)
   * @throws ApiException if fails to make API call
   */
  public void setTaskStatus(Long id, Integer status, String apiKey, String comment, String tags, Object requestReview) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setTaskStatus");
    }
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling setTaskStatus");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling setTaskStatus");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/{status}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(status.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestReview", requestReview));

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
   * Start working on a Task (locks it for the user)
   * Locks a Task based on the supplied ID in the URL.
   * @param id The id of the Task to retrieve (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask startOnTask(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling startOnTask");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/start"
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
   * Updates a Task
   * Will update an already existing Task from the supplied JSON in the body.
   * @param body The JSON structure for the Task body. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param id The ID of the Task that is being updated (required)
   * @return OrgMaprouletteFrameworkModelTask
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelTask update(OrgMaprouletteFrameworkModelTask body, String apiKey, Long id) throws ApiException {
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
    String localVarPath = "/task/{id}"
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

    GenericType<OrgMaprouletteFrameworkModelTask> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelTask>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update Completion Responses
   * Will update the completion responses on the Task.
   * @param id The ID of the task (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void updateCompletionResponses(Long id, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCompletionResponses");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling updateCompletionResponses");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/responses"
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
   * Updates Task Tags
   * Updates the tags on the Task
   * @param id The ID of the Task (required)
   * @param tags A complete comma separated list of tags. If empty, then all tags will be removed. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void updateItemTags(Long id, String tags, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateItemTags");
    }
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling updateItemTags");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling updateItemTags");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/tags/update"
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

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
