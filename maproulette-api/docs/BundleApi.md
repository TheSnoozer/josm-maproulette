# BundleApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaskBundle**](BundleApi.md#createTaskBundle) | **POST** /taskBundle | Create a task bundle
[**deleteTaskBundle**](BundleApi.md#deleteTaskBundle) | **DELETE** /taskBundle/{id} | Deletes a Task Bundle
[**getTaskBundle**](BundleApi.md#getTaskBundle) | **GET** /taskBundle/{id} | Gets a Task Bundle
[**unbundleTasks**](BundleApi.md#unbundleTasks) | **GET** /taskBundle/{id}/unbundle | Unbundles tasks from Task Bundle

<a name="createTaskBundle"></a>
# **createTaskBundle**
> TaskBundle createTaskBundle(body, apiKey)

Create a task bundle

Create a new task bundle with the task ids in the supplied JSON body.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.BundleApi;


BundleApi apiInstance = new BundleApi();
TaskBundle body = new TaskBundle(); // TaskBundle | The JSON structure for the bundle body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    TaskBundle result = apiInstance.createTaskBundle(body, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundleApi#createTaskBundle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TaskBundle**](TaskBundle.md)| The JSON structure for the bundle body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**TaskBundle**](TaskBundle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTaskBundle"></a>
# **deleteTaskBundle**
> deleteTaskBundle(id, apiKey, primaryId)

Deletes a Task Bundle

Deletes a task bundle based on the supplied id

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.BundleApi;


BundleApi apiInstance = new BundleApi();
Long id = 789L; // Long | The id of the Task Bundle
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long primaryId = 789L; // Long | 
try {
    apiInstance.deleteTaskBundle(id, apiKey, primaryId);
} catch (ApiException e) {
    System.err.println("Exception when calling BundleApi#deleteTaskBundle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task Bundle |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **primaryId** | **Long**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTaskBundle"></a>
# **getTaskBundle**
> TaskBundle getTaskBundle(id, apiKey)

Gets a Task Bundle

Gets a task bundle based on the supplied id

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.BundleApi;


BundleApi apiInstance = new BundleApi();
Long id = 789L; // Long | The id of the Task Bundle
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    TaskBundle result = apiInstance.getTaskBundle(id, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundleApi#getTaskBundle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task Bundle |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**TaskBundle**](TaskBundle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unbundleTasks"></a>
# **unbundleTasks**
> TaskBundle unbundleTasks(id, taskIds, apiKey)

Unbundles tasks from Task Bundle

Removes a list of tasks from a bundle of tasks

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.BundleApi;


BundleApi apiInstance = new BundleApi();
Long id = 789L; // Long | The id of the Task Bundle
List<Long> taskIds = Arrays.asList(56L); // List<Long> | The list of task ids to remove from the bundle
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    TaskBundle result = apiInstance.unbundleTasks(id, taskIds, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundleApi#unbundleTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task Bundle |
 **taskIds** | [**List&lt;Long&gt;**](Long.md)| The list of task ids to remove from the bundle |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**TaskBundle**](TaskBundle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

