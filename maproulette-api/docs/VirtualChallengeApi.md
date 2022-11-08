# VirtualChallengeApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](VirtualChallengeApi.md#create) | **POST** /virtualchallenge | Create a Virtual Challenge
[**delete**](VirtualChallengeApi.md#delete) | **DELETE** /virtualchallenge/{id} | Deletes an existing Virtual Challenge
[**getClusteredPoints**](VirtualChallengeApi.md#getClusteredPoints) | **GET** /virtualchallenge/clustered/{id} | Retrieves clustered Task points
[**getNearbyTasks**](VirtualChallengeApi.md#getNearbyTasks) | **GET** /virtualchallenge/{id}/tasksNearby/{proximityId} | Retrieves nearby Tasks in Virtual Challenge
[**getRandomTask**](VirtualChallengeApi.md#getRandomTask) | **GET** /virtualchallenge/{cid}/task | Retrieves random Task
[**getSequentialNextTask**](VirtualChallengeApi.md#getSequentialNextTask) | **GET** /virtualchallenge/{cid}/nextTask/{id} | Retrieves next Task
[**getSequentialPreviousTask**](VirtualChallengeApi.md#getSequentialPreviousTask) | **GET** /virtualchallenge/{cid}/previousTask/{id} | Retrieves previous Task
[**getVirtualChallengeGeoJSON**](VirtualChallengeApi.md#getVirtualChallengeGeoJSON) | **GET** /virtualchallenge/view/{id} | Retrieves Virtual Challenge GeoJSON
[**list**](VirtualChallengeApi.md#list) | **GET** /virtualchallenges | List all the Virtual Challenge.
[**listTasks**](VirtualChallengeApi.md#listTasks) | **GET** /virtualchallenge/{id}/tasks | List all the Virtual Challenges Tasks.
[**read**](VirtualChallengeApi.md#read) | **GET** /virtualchallenge/{id} | Retrieves an already existing Virtual Challenge
[**readByName**](VirtualChallengeApi.md#readByName) | **GET** /virtualchallengebyname/{name} | Retrieves an already existing Virtual Challenge
[**update**](VirtualChallengeApi.md#update) | **PUT** /virtualchallenge/{id} | Updates a Virtual Challenge

<a name="create"></a>
# **create**
> OrgMaprouletteModelsVirtualChallenge create(body, apiKey)

Create a Virtual Challenge

Will create a new Virtual Challenge from the supplied JSON in the body. When creating the Virtual Challenge, leave the ID field out of the body json, if updating (generally use the PUT method) include the ID field.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
OrgMaprouletteModelsVirtualChallenge body = new OrgMaprouletteModelsVirtualChallenge(); // OrgMaprouletteModelsVirtualChallenge | The JSON structure for the Virtual Challenge body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteModelsVirtualChallenge result = apiInstance.create(body, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrgMaprouletteModelsVirtualChallenge**](OrgMaprouletteModelsVirtualChallenge.md)| The JSON structure for the Virtual Challenge body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteModelsVirtualChallenge**](OrgMaprouletteModelsVirtualChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> OrgMaprouletteExceptionStatusMessage delete(id, apiKey, immediate)

Deletes an existing Virtual Challenge

Deletes an existing Virtual Challenge based on the supplied ID. This will delete all associated Tasks of the Virtual Challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Long id = 789L; // Long | The id of the Virtual Challenge being deleted
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Boolean immediate = false; // Boolean | If set to true, will delete the virtual challenge immediately instead of delayed
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.delete(id, apiKey, immediate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Virtual Challenge being deleted |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **immediate** | **Boolean**| If set to true, will delete the virtual challenge immediately instead of delayed | [optional] [default to false]

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClusteredPoints"></a>
# **getClusteredPoints**
> List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt; getClusteredPoints(id, filter)

Retrieves clustered Task points

Retrieves all the Tasks for a specific Virtual Challenge as clustered points to potentially display on a map.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Long id = 789L; // Long | The id of the parent project.
String filter = "filter_example"; // String | Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
try {
    List<OrgMaprouletteFrameworkModelClusteredPoint> result = apiInstance.getClusteredPoints(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#getClusteredPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent project. |
 **filter** | **String**| Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt;**](OrgMaprouletteFrameworkModelClusteredPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNearbyTasks"></a>
# **getNearbyTasks**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getNearbyTasks(id, proximityId, limit, proximity)

Retrieves nearby Tasks in Virtual Challenge

Retrieves tasks geographically closest to the specified task within the same Virtual Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Long id = 789L; // Long | 
Long proximityId = 789L; // Long | 
Integer limit = 5; // Integer | Limit the number of results returned in the response. Default value is 5.
Object proximity = null; // Object | Id of task around which geographically closest tasks are desired
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getNearbyTasks(id, proximityId, limit, proximity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#getNearbyTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **proximityId** | **Long**|  |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 5. | [optional] [default to 5]
 **proximity** | [**Object**](.md)| Id of task around which geographically closest tasks are desired | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRandomTask"></a>
# **getRandomTask**
> OrgMaprouletteFrameworkModelTask getRandomTask(cid, proximity)

Retrieves random Task

Retrieves a random Task based on the search criteria and contained within the current Virtual Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Long cid = 789L; // Long | The id of the Virtual Challenge limiting the tasks to only a descendent of that Virtual Challenge.
Long proximity = -1L; // Long | Id of task that you wish to find the next task based on the proximity of that task
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.getRandomTask(cid, proximity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#getRandomTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **Long**| The id of the Virtual Challenge limiting the tasks to only a descendent of that Virtual Challenge. |
 **proximity** | **Long**| Id of task that you wish to find the next task based on the proximity of that task | [optional] [default to -1]

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSequentialNextTask"></a>
# **getSequentialNextTask**
> OrgMaprouletteFrameworkModelTask getSequentialNextTask(cid, id)

Retrieves next Task

Retrieves the next sequential Task based on the task ordering within the Virtual Challenge. If it is currently on the last task it will response with the first task in the Virtual Challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Long cid = 789L; // Long | The id of the parent Virtual Challenge.
Long id = 789L; // Long | The id of the current task being viewed, so that we can get context of what the next task should be
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.getSequentialNextTask(cid, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#getSequentialNextTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **Long**| The id of the parent Virtual Challenge. |
 **id** | **Long**| The id of the current task being viewed, so that we can get context of what the next task should be |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSequentialPreviousTask"></a>
# **getSequentialPreviousTask**
> OrgMaprouletteFrameworkModelTask getSequentialPreviousTask(cid, id)

Retrieves previous Task

Retrieves the previous sequential Task based on the task ordering within the Virtual Challenge. If it is currently on the first task it will response with the last task in the Virtual Challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Long cid = 789L; // Long | The id of the parent Virtual Challenge.
Long id = 789L; // Long | The id of the current task being viewed, so that we can get context of what the next task should be
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.getSequentialPreviousTask(cid, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#getSequentialPreviousTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **Long**| The id of the parent Virtual Challenge. |
 **id** | **Long**| The id of the current task being viewed, so that we can get context of what the next task should be |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVirtualChallengeGeoJSON"></a>
# **getVirtualChallengeGeoJSON**
> getVirtualChallengeGeoJSON(id, filter)

Retrieves Virtual Challenge GeoJSON

Retrieves the GeoJSON for the Virtual Challenge that represents all the associated Tasks of the Virtual Challenge. WARNING* This API query can be quite slow due to retrieving all the points that is grouped in various different challenges

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Long id = 789L; // Long | The id of the parent Virtual Challenge limiting the tasks to only a descendent of that Virtual Challenge.
String filter = "filter_example"; // String | Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
try {
    apiInstance.getVirtualChallengeGeoJSON(id, filter);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#getVirtualChallengeGeoJSON");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent Virtual Challenge limiting the tasks to only a descendent of that Virtual Challenge. |
 **filter** | **String**| Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="list"></a>
# **list**
> List&lt;OrgMaprouletteModelsVirtualChallenge&gt; list(limit, page, onlyEnabled)

List all the Virtual Challenge.

Lists all the Virtual Challenges in the system

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
Boolean onlyEnabled = false; // Boolean | 
try {
    List<OrgMaprouletteModelsVirtualChallenge> result = apiInstance.list(limit, page, onlyEnabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **onlyEnabled** | **Boolean**|  | [optional] [default to false]

### Return type

[**List&lt;OrgMaprouletteModelsVirtualChallenge&gt;**](OrgMaprouletteModelsVirtualChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTasks"></a>
# **listTasks**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; listTasks(id, limit, page)

List all the Virtual Challenges Tasks.

Lists all the Tasks that are children of the supplied Virtual Challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Long id = 789L; // Long | The project ID.
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.listTasks(id, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#listTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The project ID. |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="read"></a>
# **read**
> OrgMaprouletteModelsVirtualChallenge read(id)

Retrieves an already existing Virtual Challenge

Retrieves an already existing Virtual Challenge based on the supplied ID in the URL.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Long id = 789L; // Long | The id of the Virtual Challenge to retrieve
try {
    OrgMaprouletteModelsVirtualChallenge result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Virtual Challenge to retrieve |

### Return type

[**OrgMaprouletteModelsVirtualChallenge**](OrgMaprouletteModelsVirtualChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readByName"></a>
# **readByName**
> OrgMaprouletteModelsVirtualChallenge readByName(id, name)

Retrieves an already existing Virtual Challenge

Retrieves an already existing Virtual Challenge based on the name of the Virtual Challenge rather than an ID

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
Long id = 789L; // Long | The id of the parent Project of the Virtual Challenge
String name = "name_example"; // String | The name of the Virtual Challenge being retrieved
try {
    OrgMaprouletteModelsVirtualChallenge result = apiInstance.readByName(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#readByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent Project of the Virtual Challenge |
 **name** | **String**| The name of the Virtual Challenge being retrieved |

### Return type

[**OrgMaprouletteModelsVirtualChallenge**](OrgMaprouletteModelsVirtualChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> OrgMaprouletteModelsVirtualChallenge update(body, apiKey, id)

Updates a Virtual Challenge

Will update an already existing Virtual Challenge from the supplied JSON in the body.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.VirtualChallengeApi;


VirtualChallengeApi apiInstance = new VirtualChallengeApi();
OrgMaprouletteFrameworkModelChallenge body = new OrgMaprouletteFrameworkModelChallenge(); // OrgMaprouletteFrameworkModelChallenge | The JSON structure for the Virtual Challenge body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long id = 789L; // Long | The ID of the Virtual Challenge that is being updated
try {
    OrgMaprouletteModelsVirtualChallenge result = apiInstance.update(body, apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualChallengeApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrgMaprouletteFrameworkModelChallenge**](OrgMaprouletteFrameworkModelChallenge.md)| The JSON structure for the Virtual Challenge body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **id** | **Long**| The ID of the Virtual Challenge that is being updated |

### Return type

[**OrgMaprouletteModelsVirtualChallenge**](OrgMaprouletteModelsVirtualChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

