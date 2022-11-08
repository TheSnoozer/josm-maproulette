# VirtualProjectApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addChallenge**](VirtualProjectApi.md#addChallenge) | **POST** /project/{projectId}/challenge/{id}/add | Add Challenge to a virtual Project
[**removeChallenge**](VirtualProjectApi.md#removeChallenge) | **POST** /project/{projectId}/challenge/{id}/remove | Remove Challenge from a virtual Project

<a name="addChallenge"></a>
# **addChallenge**
> addChallenge(projectId, id, apiKey)

Add Challenge to a virtual Project

Will add a challenge into a virtual project

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualProjectApi;


VirtualProjectApi apiInstance = new VirtualProjectApi();
Long projectId = 789L; // Long | The ID of the project you are adding the challenge to.
Long id = 789L; // Long | The ID of the challenge
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.addChallenge(projectId, id, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualProjectApi#addChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The ID of the project you are adding the challenge to. |
 **id** | **Long**| The ID of the challenge |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeChallenge"></a>
# **removeChallenge**
> removeChallenge(projectId, id, apiKey)

Remove Challenge from a virtual Project

Will remove a challenge from a virtual project

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualProjectApi;


VirtualProjectApi apiInstance = new VirtualProjectApi();
Long projectId = 789L; // Long | The ID of the project you are removing the challenge from.
Long id = 789L; // Long | The ID of the challenge
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.removeChallenge(projectId, id, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualProjectApi#removeChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The ID of the project you are removing the challenge from. |
 **id** | **Long**| The ID of the challenge |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

