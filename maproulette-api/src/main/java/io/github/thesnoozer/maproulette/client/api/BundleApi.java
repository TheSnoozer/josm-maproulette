package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;

import io.github.thesnoozer.maproulette.client.model.TaskBundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class BundleApi {
  private ApiClient apiClient;

  public BundleApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BundleApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a task bundle
   * Create a new task bundle with the task ids in the supplied JSON body.
   * @param body The JSON structure for the bundle body. (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return TaskBundle
   * @throws ApiException if fails to make API call
   */
  public TaskBundle createTaskBundle(TaskBundle body, String apiKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createTaskBundle");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling createTaskBundle");
    }
    // create path and map variables
    String localVarPath = "/taskBundle";

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

    GenericType<TaskBundle> localVarReturnType = new GenericType<TaskBundle>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Deletes a Task Bundle
   * Deletes a task bundle based on the supplied id
   * @param id The id of the Task Bundle (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param primaryId  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteTaskBundle(Long id, String apiKey, Long primaryId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTaskBundle");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteTaskBundle");
    }
    // create path and map variables
    String localVarPath = "/taskBundle/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "primaryId", primaryId));

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
   * Gets a Task Bundle
   * Gets a task bundle based on the supplied id
   * @param id The id of the Task Bundle (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return TaskBundle
   * @throws ApiException if fails to make API call
   */
  public TaskBundle getTaskBundle(Long id, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTaskBundle");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getTaskBundle");
    }
    // create path and map variables
    String localVarPath = "/taskBundle/{id}"
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

    GenericType<TaskBundle> localVarReturnType = new GenericType<TaskBundle>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Unbundles tasks from Task Bundle
   * Removes a list of tasks from a bundle of tasks
   * @param id The id of the Task Bundle (required)
   * @param taskIds The list of task ids to remove from the bundle (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return TaskBundle
   * @throws ApiException if fails to make API call
   */
  public TaskBundle unbundleTasks(Long id, List<Long> taskIds, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling unbundleTasks");
    }
    // verify the required parameter 'taskIds' is set
    if (taskIds == null) {
      throw new ApiException(400, "Missing the required parameter 'taskIds' when calling unbundleTasks");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling unbundleTasks");
    }
    // create path and map variables
    String localVarPath = "/taskBundle/{id}/unbundle"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "taskIds", taskIds));

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

    GenericType<TaskBundle> localVarReturnType = new GenericType<TaskBundle>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
