package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelChallengeComment;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelComment;
import io.github.thesnoozer.maproulette.client.model.TaskBundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class CommentApi {
  private ApiClient apiClient;

  public CommentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CommentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Adds comment to Task
   * Adds a comment to a Task
   * @param id The ID for the Task (required)
   * @param comment A URLEncoded comment for the Task (required)
   * @param actionId An optional action ID that may be associated with the comment (optional)
   * @return OrgMaprouletteFrameworkModelComment
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelComment add(Long id, String comment, Long actionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling add");
    }
    // verify the required parameter 'comment' is set
    if (comment == null) {
      throw new ApiException(400, "Missing the required parameter 'comment' when calling add");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/comment"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actionId", actionId));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteFrameworkModelComment> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelComment>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Adds comment to Challenge
   * Adds a comment to a Task
   * @param id The ID for the Challenge (required)
   * @param comment A URLEncoded comment for the Challenge (required)
   * @return OrgMaprouletteFrameworkModelChallengeComment
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelChallengeComment addChallengeComment(Long id, String comment) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addChallengeComment");
    }
    // verify the required parameter 'comment' is set
    if (comment == null) {
      throw new ApiException(400, "Missing the required parameter 'comment' when calling addChallengeComment");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/comment"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteFrameworkModelChallengeComment> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelChallengeComment>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Adds comment to each Task in a Task Bundle
   * Adds a comment to each Task in Bundle
   * @param id The ID for the bundle (required)
   * @param comment A URLEncoded comment for the Task (required)
   * @param actionId An optional action ID that may be associated with the comment (optional)
   * @return TaskBundle
   * @throws ApiException if fails to make API call
   */
  public TaskBundle addToBundleTasks(Long id, String comment, Long actionId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addToBundleTasks");
    }
    // verify the required parameter 'comment' is set
    if (comment == null) {
      throw new ApiException(400, "Missing the required parameter 'comment' when calling addToBundleTasks");
    }
    // create path and map variables
    String localVarPath = "/taskBundle/{id}/comment"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actionId", actionId));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TaskBundle> localVarReturnType = new GenericType<TaskBundle>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Deletes comment from Task
   * Deletes a comment from the specific Task
   * @param id The ID for the Task (required)
   * @param commentId The ID for the Comment (required)
   * @throws ApiException if fails to make API call
   */
  public void delete(Long id, Long commentId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling delete");
    }
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling delete");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/comment/{commentId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

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
   * Retrieves comments for a Task
   * Retrieves all the comments for a specific Task
   * @param id The ID for the Task (required)
   * @return List&lt;OrgMaprouletteFrameworkModelComment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelComment> find(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling find");
    }
    // create path and map variables
    String localVarPath = "/task/{id}/comments"
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

    GenericType<List<OrgMaprouletteFrameworkModelComment>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelComment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves comments for a Challenge
   * Retrieves all the challenge comments for a specific Challenge
   * @param id The ID for the Challenge (required)
   * @return List&lt;OrgMaprouletteFrameworkModelChallengeComment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelChallengeComment> findChallengeComments(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling findChallengeComments");
    }
    // create path and map variables
    String localVarPath = "/challenge/{id}/challengeComments"
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

    GenericType<List<OrgMaprouletteFrameworkModelChallengeComment>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelChallengeComment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves a comment
   * Retrieves a comment based on a specific ID.
   * @param id The ID for the comment (required)
   * @return OrgMaprouletteFrameworkModelComment
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelComment retrieve(Long id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieve");
    }
    // create path and map variables
    String localVarPath = "/comment/{id}"
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

    GenericType<OrgMaprouletteFrameworkModelComment> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelComment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update comment on Task
   * Updates an existing comment on a Task. Only the original user who made the comment or a SuperUser can update the comment
   * @param commentId The ID of the original comment (required)
   * @param comment A URLEncoded comment for the Task (required)
   * @return OrgMaprouletteFrameworkModelComment
   * @throws ApiException if fails to make API call
   */
  public OrgMaprouletteFrameworkModelComment update(Long commentId, String comment) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling update");
    }
    // verify the required parameter 'comment' is set
    if (comment == null) {
      throw new ApiException(400, "Missing the required parameter 'comment' when calling update");
    }
    // create path and map variables
    String localVarPath = "/comment/{commentId}"
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));


    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrgMaprouletteFrameworkModelComment> localVarReturnType = new GenericType<OrgMaprouletteFrameworkModelComment>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
