package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;

import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelNotificationSubscriptions;
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelUserNotification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class NotificationApi {
  private ApiClient apiClient;

  public NotificationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete user notifications
   * Deletes the specified user notifications
   * @param userId The id of the user that owns the notifications (required)
   * @param notificationIds One or more comma-separated ids of notifications to delete (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteNotifications(Long userId, Object notificationIds, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteNotifications");
    }
    // verify the required parameter 'notificationIds' is set
    if (notificationIds == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationIds' when calling deleteNotifications");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteNotifications");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/notifications"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notificationIds", notificationIds));

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
   * Retrieves Users notification subscriptions
   * Retrieves the user&#x27;s subscriptions to the various notification types
   * @param userId The id of the user to retrieve the subscriptions for (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @return List&lt;OrgMaprouletteFrameworkModelUserNotification&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelUserNotification> getNotificationSubscriptions(Long userId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getNotificationSubscriptions");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getNotificationSubscriptions");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/notificationSubscriptions"
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

    GenericType<List<OrgMaprouletteFrameworkModelUserNotification>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelUserNotification>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves Users notifications
   * Retrieves notifications generated for the user
   * @param userId The id of the user to retrieve the notifications for (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param limit Limit the number of results returned in the response. Default value is 10. (optional, default to 10)
   * @param page Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. (optional, default to 0)
   * @param sort Name of column to sort by (optional, default to is_read)
   * @param order sort order (ASC or DESC) (optional, default to ASC)
   * @param notificationType 0 &#x3D; System, 1 &#x3D; Mention, 2 &#x3D; Review Approved, 3 &#x3D; Review Rejected, 4 &#x3D; Review Again, 5 &#x3D; Challenge Completed (optional)
   * @param isRead Limit by whether the notification has been read or not. (optional)
   * @param fromUsername Limit by notifications from a OSM Username. This can be a SQL \&quot;like\&quot; query (optional)
   * @return List&lt;OrgMaprouletteFrameworkModelUserNotification&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OrgMaprouletteFrameworkModelUserNotification> getUserNotifications(Long userId, String apiKey, Integer limit, Integer page, String sort, String order, Integer notificationType, Integer isRead, String fromUsername) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserNotifications");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getUserNotifications");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/notifications"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notificationType", notificationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isRead", isRead));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromUsername", fromUsername));

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

    GenericType<List<OrgMaprouletteFrameworkModelUserNotification>> localVarReturnType = new GenericType<List<OrgMaprouletteFrameworkModelUserNotification>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Mark user notifications as read
   * Marks user notifications as read
   * @param userId The id of the user that owns the notifications (required)
   * @param notificationIds One or more comma-separated ids of notifications to mark as read (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @throws ApiException if fails to make API call
   */
  public void markNotificationsRead(Long userId, Object notificationIds, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling markNotificationsRead");
    }
    // verify the required parameter 'notificationIds' is set
    if (notificationIds == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationIds' when calling markNotificationsRead");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling markNotificationsRead");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/notifications"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notificationIds", notificationIds));

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
   * Updates user&#x27;s notification subscriptions
   * Updates the user&#x27;s subscriptions to various notification types
   * @param body The JSON structure for the updated subscription settings (required)
   * @param apiKey The user&#x27;s apiKey to authorize the request (required)
   * @param userId The id of the user to update the subscriptions for (required)
   * @throws ApiException if fails to make API call
   */
  public void updateNotificationSubscriptions(OrgMaprouletteFrameworkModelNotificationSubscriptions body, String apiKey, Long userId) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateNotificationSubscriptions");
    }
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling updateNotificationSubscriptions");
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateNotificationSubscriptions");
    }
    // create path and map variables
    String localVarPath = "/user/{userId}/notificationSubscriptions"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
