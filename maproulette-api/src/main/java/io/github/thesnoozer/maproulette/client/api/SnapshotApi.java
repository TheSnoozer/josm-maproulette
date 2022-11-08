package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class SnapshotApi {
  private ApiClient apiClient;

  public SnapshotApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SnapshotApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Deletes a snapshot
   * Deletes a challenge snapshot
   * @param snapshotId  (required)
   * @param id The id of the snapshot to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void delete(Long snapshotId, Object id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'snapshotId' is set
    if (snapshotId == null) {
      throw new ApiException(400, "Missing the required parameter 'snapshotId' when calling delete");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling delete");
    }
    // create path and map variables
    String localVarPath = "/snapshot/{snapshotId}"
      .replaceAll("\\{" + "snapshotId" + "\\}", apiClient.escapeString(snapshotId.toString()))
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

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Creates a csv of all snapshots for a challenge.
   * Creates a csv export of all snaphshots for a challenge.
   * @param challengeId The id of the challenge (required)
   * @throws ApiException if fails to make API call
   */
  public void exportChallengeSnapshots(Long challengeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'challengeId' is set
    if (challengeId == null) {
      throw new ApiException(400, "Missing the required parameter 'challengeId' when calling exportChallengeSnapshots");
    }
    // create path and map variables
    String localVarPath = "/snapshot/challenge/{challengeId}/export"
      .replaceAll("\\{" + "challengeId" + "\\}", apiClient.escapeString(challengeId.toString()));

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
   * Gets the list of snapshots for a challenge
   * Retrieves a list challenge snapshots
   * @param challengeId The id of the challenge (required)
   * @param includeAllData Whether to include all the snapshot data or just a brief summary (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void getSnapshotList(Long challengeId, Boolean includeAllData) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'challengeId' is set
    if (challengeId == null) {
      throw new ApiException(400, "Missing the required parameter 'challengeId' when calling getSnapshotList");
    }
    // create path and map variables
    String localVarPath = "/snapshot/challenge/{challengeId}/list"
      .replaceAll("\\{" + "challengeId" + "\\}", apiClient.escapeString(challengeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeAllData", includeAllData));


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
   * Records a snapshot for a challenge
   * Creates a challenge snapshot.
   * @param challengeId The id of the challenge to snapshot (required)
   * @throws ApiException if fails to make API call
   */
  public void recordChallengeSnapshot(Long challengeId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'challengeId' is set
    if (challengeId == null) {
      throw new ApiException(400, "Missing the required parameter 'challengeId' when calling recordChallengeSnapshot");
    }
    // create path and map variables
    String localVarPath = "/snapshot/challenge/{challengeId}/record"
      .replaceAll("\\{" + "challengeId" + "\\}", apiClient.escapeString(challengeId.toString()));

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
   * Gets a snapshot
   * Retrieves a challenge snapshot
   * @param snapshotId  (required)
   * @param id The id of the snapshot to get (required)
   * @throws ApiException if fails to make API call
   */
  public void retrieve(Long snapshotId, Object id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'snapshotId' is set
    if (snapshotId == null) {
      throw new ApiException(400, "Missing the required parameter 'snapshotId' when calling retrieve");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieve");
    }
    // create path and map variables
    String localVarPath = "/snapshot/{snapshotId}"
      .replaceAll("\\{" + "snapshotId" + "\\}", apiClient.escapeString(snapshotId.toString()))
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
}
