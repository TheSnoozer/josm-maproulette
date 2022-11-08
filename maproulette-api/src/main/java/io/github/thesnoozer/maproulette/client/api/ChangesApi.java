package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;

import io.github.thesnoozer.maproulette.client.model.OSMChange;
import io.github.thesnoozer.maproulette.client.model.TagChange;
import io.github.thesnoozer.maproulette.client.model.TagChangeSubmission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class ChangesApi {
  private ApiClient apiClient;

  public ChangesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChangesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Apply Tag Changes for task
   * Submit a group of changes to OSM. Will return a standard OSMChange XML that has been applied to the OSM servers standard OSMChange XML that would have been submitted to the OSM servers
   * @param body The TagChangeSubmission (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param taskId The task id that should be marked as fixed after this tag change has been applied. (required)
   * @param comment A task comment to be stored in map roulette with this change. (optional)
   * @param tags A list of mrTags to be stored with the task (optional)
   * @param requestReview Boolean indicating if a review is requested on this task. (Will override user settings if provided) (optional)
   * @throws ApiException if fails to make API call
   */
  public void applyTagFix(TagChangeSubmission body, String apiKey, Long taskId, String comment, String tags, Object requestReview) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling applyTagFix");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling applyTagFix");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling applyTagFix");
    }
    // create path and map variables
    String localVarPath = "/task/{taskId}/fix/apply";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taskId", taskId));
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

    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Test OSM changes (currently only node creation or tag changes)
   * Takes in a set of changes and, instead of submitting them to OSM, will return a standard OSMChange XML that would have been submitted to the OSM servers
   * @param body The nodes to be created (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void testChange(List<OSMChange> body, String apiKey) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testChange");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling testChange");
    }
    // create path and map variables
    String localVarPath = "/change/test";

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
   * Test Changes
   * Takes in a group of changes and instead of submitting them to OSM will return a standard OSMChange XML that would have been submitted to the OSM servers
   * @param body The tag changes (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param changeType delta to return a delta version of the changes that would be applied. osmchange for the actual OSMChange value that would be applied to the OSM servers (optional, default to delta)
   * @throws ApiException if fails to make API call
   */
  public void testTagChange(List<TagChange> body, String apiKey, String changeType) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testTagChange");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling testTagChange");
    }
    // create path and map variables
    String localVarPath = "/change/tag/test";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "changeType", changeType));

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
}
