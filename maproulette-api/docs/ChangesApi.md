# ChangesApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyTagFix**](ChangesApi.md#applyTagFix) | **POST** /task/{taskId}/fix/apply | Apply Tag Changes for task
[**testChange**](ChangesApi.md#testChange) | **POST** /change/test | Test OSM changes (currently only node creation or tag changes)
[**testTagChange**](ChangesApi.md#testTagChange) | **POST** /change/tag/test | Test Changes

<a name="applyTagFix"></a>
# **applyTagFix**
> applyTagFix(body, apiKey, taskId, comment, tags, requestReview)

Apply Tag Changes for task

Submit a group of changes to OSM. Will return a standard OSMChange XML that has been applied to the OSM servers standard OSMChange XML that would have been submitted to the OSM servers

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChangesApi;


ChangesApi apiInstance = new ChangesApi();
TagChangeSubmission body = new TagChangeSubmission(); // TagChangeSubmission | The TagChangeSubmission
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long taskId = 789L; // Long | The task id that should be marked as fixed after this tag change has been applied.
String comment = "comment_example"; // String | A task comment to be stored in map roulette with this change.
String tags = "tags_example"; // String | A list of mrTags to be stored with the task
Object requestReview = null; // Object | Boolean indicating if a review is requested on this task. (Will override user settings if provided)
try {
    apiInstance.applyTagFix(body, apiKey, taskId, comment, tags, requestReview);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangesApi#applyTagFix");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagChangeSubmission**](TagChangeSubmission.md)| The TagChangeSubmission |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **taskId** | **Long**| The task id that should be marked as fixed after this tag change has been applied. |
 **comment** | **String**| A task comment to be stored in map roulette with this change. | [optional]
 **tags** | **String**| A list of mrTags to be stored with the task | [optional]
 **requestReview** | [**Object**](.md)| Boolean indicating if a review is requested on this task. (Will override user settings if provided) | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="testChange"></a>
# **testChange**
> testChange(body, apiKey)

Test OSM changes (currently only node creation or tag changes)

Takes in a set of changes and, instead of submitting them to OSM, will return a standard OSMChange XML that would have been submitted to the OSM servers

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChangesApi;


ChangesApi apiInstance = new ChangesApi();
List<OSMChange> body = Arrays.asList(new OSMChange()); // List<OSMChange> | The nodes to be created
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.testChange(body, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangesApi#testChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;OSMChange&gt;**](OSMChange.md)| The nodes to be created |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="testTagChange"></a>
# **testTagChange**
> testTagChange(body, apiKey, changeType)

Test Changes

Takes in a group of changes and instead of submitting them to OSM will return a standard OSMChange XML that would have been submitted to the OSM servers

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChangesApi;


ChangesApi apiInstance = new ChangesApi();
List<TagChange> body = Arrays.asList(new TagChange()); // List<TagChange> | The tag changes
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String changeType = "delta"; // String | delta to return a delta version of the changes that would be applied. osmchange for the actual OSMChange value that would be applied to the OSM servers
try {
    apiInstance.testTagChange(body, apiKey, changeType);
} catch (ApiException e) {
    System.err.println("Exception when calling ChangesApi#testTagChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;TagChange&gt;**](TagChange.md)| The tag changes |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **changeType** | **String**| delta to return a delta version of the changes that would be applied. osmchange for the actual OSMChange value that would be applied to the OSM servers | [optional] [default to delta]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

