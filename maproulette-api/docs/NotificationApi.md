# NotificationApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteNotifications**](NotificationApi.md#deleteNotifications) | **DELETE** /user/{userId}/notifications | Delete user notifications
[**getNotificationSubscriptions**](NotificationApi.md#getNotificationSubscriptions) | **GET** /user/{userId}/notificationSubscriptions | Retrieves Users notification subscriptions
[**getUserNotifications**](NotificationApi.md#getUserNotifications) | **GET** /user/{userId}/notifications | Retrieves Users notifications
[**markNotificationsRead**](NotificationApi.md#markNotificationsRead) | **PUT** /user/{userId}/notifications | Mark user notifications as read
[**updateNotificationSubscriptions**](NotificationApi.md#updateNotificationSubscriptions) | **PUT** /user/{userId}/notificationSubscriptions | Updates user&#x27;s notification subscriptions

<a name="deleteNotifications"></a>
# **deleteNotifications**
> deleteNotifications(userId, notificationIds, apiKey)

Delete user notifications

Deletes the specified user notifications

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
Long userId = 789L; // Long | The id of the user that owns the notifications
Object notificationIds = null; // Object | One or more comma-separated ids of notifications to delete
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.deleteNotifications(userId, notificationIds, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#deleteNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user that owns the notifications |
 **notificationIds** | [**Object**](.md)| One or more comma-separated ids of notifications to delete |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getNotificationSubscriptions"></a>
# **getNotificationSubscriptions**
> List&lt;OrgMaprouletteFrameworkModelUserNotification&gt; getNotificationSubscriptions(userId, apiKey)

Retrieves Users notification subscriptions

Retrieves the user&#x27;s subscriptions to the various notification types

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
Long userId = 789L; // Long | The id of the user to retrieve the subscriptions for
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    List<OrgMaprouletteFrameworkModelUserNotification> result = apiInstance.getNotificationSubscriptions(userId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotificationSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to retrieve the subscriptions for |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**List&lt;OrgMaprouletteFrameworkModelUserNotification&gt;**](OrgMaprouletteFrameworkModelUserNotification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserNotifications"></a>
# **getUserNotifications**
> List&lt;OrgMaprouletteFrameworkModelUserNotification&gt; getUserNotifications(userId, apiKey, limit, page, sort, order, notificationType, isRead, fromUsername)

Retrieves Users notifications

Retrieves notifications generated for the user

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
Long userId = 789L; // Long | The id of the user to retrieve the notifications for
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
String sort = "is_read"; // String | Name of column to sort by
String order = "ASC"; // String | sort order (ASC or DESC)
Integer notificationType = 56; // Integer | 0 = System, 1 = Mention, 2 = Review Approved, 3 = Review Rejected, 4 = Review Again, 5 = Challenge Completed
Integer isRead = 56; // Integer | Limit by whether the notification has been read or not.
String fromUsername = "fromUsername_example"; // String | Limit by notifications from a OSM Username. This can be a SQL \"like\" query
try {
    List<OrgMaprouletteFrameworkModelUserNotification> result = apiInstance.getUserNotifications(userId, apiKey, limit, page, sort, order, notificationType, isRead, fromUsername);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getUserNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to retrieve the notifications for |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **sort** | **String**| Name of column to sort by | [optional] [default to is_read]
 **order** | **String**| sort order (ASC or DESC) | [optional] [default to ASC]
 **notificationType** | **Integer**| 0 &#x3D; System, 1 &#x3D; Mention, 2 &#x3D; Review Approved, 3 &#x3D; Review Rejected, 4 &#x3D; Review Again, 5 &#x3D; Challenge Completed | [optional]
 **isRead** | **Integer**| Limit by whether the notification has been read or not. | [optional]
 **fromUsername** | **String**| Limit by notifications from a OSM Username. This can be a SQL \&quot;like\&quot; query | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelUserNotification&gt;**](OrgMaprouletteFrameworkModelUserNotification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="markNotificationsRead"></a>
# **markNotificationsRead**
> markNotificationsRead(userId, notificationIds, apiKey)

Mark user notifications as read

Marks user notifications as read

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
Long userId = 789L; // Long | The id of the user that owns the notifications
Object notificationIds = null; // Object | One or more comma-separated ids of notifications to mark as read
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.markNotificationsRead(userId, notificationIds, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#markNotificationsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user that owns the notifications |
 **notificationIds** | [**Object**](.md)| One or more comma-separated ids of notifications to mark as read |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateNotificationSubscriptions"></a>
# **updateNotificationSubscriptions**
> updateNotificationSubscriptions(body, apiKey, userId)

Updates user&#x27;s notification subscriptions

Updates the user&#x27;s subscriptions to various notification types

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
OrgMaprouletteFrameworkModelNotificationSubscriptions body = new OrgMaprouletteFrameworkModelNotificationSubscriptions(); // OrgMaprouletteFrameworkModelNotificationSubscriptions | The JSON structure for the updated subscription settings
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long userId = 789L; // Long | The id of the user to update the subscriptions for
try {
    apiInstance.updateNotificationSubscriptions(body, apiKey, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#updateNotificationSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrgMaprouletteFrameworkModelNotificationSubscriptions**](OrgMaprouletteFrameworkModelNotificationSubscriptions.md)| The JSON structure for the updated subscription settings |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **userId** | **Long**| The id of the user to update the subscriptions for |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

