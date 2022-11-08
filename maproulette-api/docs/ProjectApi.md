# ProjectApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](ProjectApi.md#delete) | **DELETE** /project/{id} | Deletes an existing Project
[**extractAllTaskSummaries**](ProjectApi.md#extractAllTaskSummaries) | **GET** /project/{projectId}/tasks/extract | Retrieve summaries of all tasks in a Project
[**find**](ProjectApi.md#find) | **GET** /projects | List all the projects.
[**find_0**](ProjectApi.md#find_0) | **GET** /projects/find | Find project matching search criteria. Use GET /projects to find instead.
[**getClusteredPoints**](ProjectApi.md#getClusteredPoints) | **GET** /project/clustered/{id} | Retrieves clustered challenge points
[**getFeaturedProjects**](ProjectApi.md#getFeaturedProjects) | **GET** /projects/featured | Retrieve featured projects
[**getRandomTasks**](ProjectApi.md#getRandomTasks) | **GET** /project/{id}/tasks | Retrieves random Task
[**getSearchedClusteredPoints**](ProjectApi.md#getSearchedClusteredPoints) | **GET** /project/search/clustered | Retrieves clustered challenge points
[**insert**](ProjectApi.md#insert) | **POST** /project | Create a Project
[**listChildren**](ProjectApi.md#listChildren) | **GET** /project/{id}/challenges | List all the projects challenges.
[**listManagedProjects**](ProjectApi.md#listManagedProjects) | **GET** /projects/managed | List all the managed projects.
[**retrieve**](ProjectApi.md#retrieve) | **GET** /project/{id} | Retrieves an already existing Project
[**retrieveByName**](ProjectApi.md#retrieveByName) | **GET** /projectByName/{name} | Retrieves an already existing Project
[**retrieveComments**](ProjectApi.md#retrieveComments) | **GET** /project/{id}/comments | Retrieve all comments for Project
[**retrieveList**](ProjectApi.md#retrieveList) | **GET** /projectsById | Retrieves already existing Projects based on a given list of ids
[**update**](ProjectApi.md#update) | **PUT** /project/{id} | Updates a Project

<a name="delete"></a>
# **delete**
> OrgMaprouletteExceptionStatusMessage delete(id, apiKey, immediate)

Deletes an existing Project

Deletes an existing project based on the supplied ID. This will delete all the children Challenges and Tasks under the project as well.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Long id = 789L; // Long | The id of the project being deleted
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Boolean immediate = false; // Boolean | If set to true, will delete the project immediately instead of delayed and deleted through a scheduled job on the backend
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.delete(id, apiKey, immediate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the project being deleted |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **immediate** | **Boolean**| If set to true, will delete the project immediately instead of delayed and deleted through a scheduled job on the backend | [optional] [default to false]

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extractAllTaskSummaries"></a>
# **extractAllTaskSummaries**
> extractAllTaskSummaries(projectId, cId, timezone)

Retrieve summaries of all tasks in a Project

This will retrieve summaries of all the tasks of a given project and respond with a csv

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Long projectId = 789L; // Long | The ID of the project
String cId = "cId_example"; // String | A list of challengeIds to include. If not provided, then all challenges in the project are used.
String timezone = "timezone_example"; // String | A timezone offset to apply to time fields. Format should be like '+HH:MM'. Default is GMT (+00:00)
try {
    apiInstance.extractAllTaskSummaries(projectId, cId, timezone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#extractAllTaskSummaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The ID of the project |
 **cId** | **String**| A list of challengeIds to include. If not provided, then all challenges in the project are used. | [optional]
 **timezone** | **String**| A timezone offset to apply to time fields. Format should be like &#x27;+HH:MM&#x27;. Default is GMT (+00:00) | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="find"></a>
# **find**
> List&lt;Project&gt; find(search, limit, page, onlyEnabled)

List all the projects.

Lists all the projects in the system

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String search = "search_example"; // String | 
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
Boolean onlyEnabled = false; // Boolean | Flag to set if only wanting enabled projects returned. Default value is true.
try {
    List<Project> result = apiInstance.find(search, limit, page, onlyEnabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#find");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**|  | [optional]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **onlyEnabled** | **Boolean**| Flag to set if only wanting enabled projects returned. Default value is true. | [optional] [default to false]

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="find_0"></a>
# **find_0**
> find_0(q, limit, page, onlyEnabled)

Find project matching search criteria. Use GET /projects to find instead.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String q = "q_example"; // String | 
Integer limit = 10; // Integer | 
Integer page = 0; // Integer | 
Boolean onlyEnabled = true; // Boolean | 
try {
    apiInstance.find_0(q, limit, page, onlyEnabled);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#find_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 10]
 **page** | **Integer**|  | [optional] [default to 0]
 **onlyEnabled** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getClusteredPoints"></a>
# **getClusteredPoints**
> OrgMaprouletteFrameworkModelClusteredPoint getClusteredPoints(id, challenges, limit, page)

Retrieves clustered challenge points

Retrieves all the challenges for a specific project as clustered points to potentially display on a map

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Long id = 789L; // Long | The id of the parent project.
String challenges = "challenges_example"; // String | The challenge search string. Retrieve only challenge clustered points that have the search string contained within the challenge name. Match is case insensitive.
Integer limit = 0; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    OrgMaprouletteFrameworkModelClusteredPoint result = apiInstance.getClusteredPoints(id, challenges, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getClusteredPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent project. |
 **challenges** | **String**| The challenge search string. Retrieve only challenge clustered points that have the search string contained within the challenge name. Match is case insensitive. | [optional]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 0]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**OrgMaprouletteFrameworkModelClusteredPoint**](OrgMaprouletteFrameworkModelClusteredPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFeaturedProjects"></a>
# **getFeaturedProjects**
> List&lt;Project&gt; getFeaturedProjects(onlyEnabled, limit, page)

Retrieve featured projects

Get all the currently featured projects

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Boolean onlyEnabled = true; // Boolean | Flag to set if only wanting enabled projects returned. Default value is true.
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<Project> result = apiInstance.getFeaturedProjects(onlyEnabled, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getFeaturedProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **onlyEnabled** | **Boolean**| Flag to set if only wanting enabled projects returned. Default value is true. | [optional] [default to true]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRandomTasks"></a>
# **getRandomTasks**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getRandomTasks(id, limit, proximity)

Retrieves random Task

Retrieves random tasks based on the search criteria and contained within the current project

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Long id = 789L; // Long | The id of the parent project limiting the tasks to only a descendent of that project.
Integer limit = 1; // Integer | Limit the number of results returned in the response. Default value is 1.
Long proximity = -1L; // Long | Id of task that you wish to find the next task based on the proximity of that task
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getRandomTasks(id, limit, proximity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getRandomTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent project limiting the tasks to only a descendent of that project. |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 1. | [optional] [default to 1]
 **proximity** | **Long**| Id of task that you wish to find the next task based on the proximity of that task | [optional] [default to -1]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSearchedClusteredPoints"></a>
# **getSearchedClusteredPoints**
> OrgMaprouletteFrameworkModelClusteredPoint getSearchedClusteredPoints(limit, page)

Retrieves clustered challenge points

Retrieves all the challenges as clustered points to potentially display on a map

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Integer limit = 0; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    OrgMaprouletteFrameworkModelClusteredPoint result = apiInstance.getSearchedClusteredPoints(limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getSearchedClusteredPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 0]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**OrgMaprouletteFrameworkModelClusteredPoint**](OrgMaprouletteFrameworkModelClusteredPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="insert"></a>
# **insert**
> Project insert(body, apiKey)

Create a Project

Will create a new project from the supplied JSON in the body. When creating the the Project, leave the ID field out of the body json, if updating (generally use the PUT method) and include the ID field.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Project body = new Project(); // Project | The JSON structure for the project body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    Project result = apiInstance.insert(body, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#insert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)| The JSON structure for the project body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listChildren"></a>
# **listChildren**
> List&lt;OrgMaprouletteFrameworkModelChallenge&gt; listChildren(id, limit, page)

List all the projects challenges.

Lists all the challenges that are children of the supplied project.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Long id = 789L; // Long | The project ID.
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelChallenge> result = apiInstance.listChildren(id, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#listChildren");
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

[**List&lt;OrgMaprouletteFrameworkModelChallenge&gt;**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listManagedProjects"></a>
# **listManagedProjects**
> List&lt;Project&gt; listManagedProjects(apiKey, limit, page, onlyEnabled, onlyOwned, searchString, sort)

List all the managed projects.

Lists all the managed projects in the system for the authenticated user

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
Boolean onlyEnabled = false; // Boolean | Flag to set if only wanting enabled projects returned. Default value is true.
Boolean onlyOwned = false; // Boolean | Whether to only returned projects that are owned by this user. By default set to false and returns all of them
String searchString = "searchString_example"; // String | A simple search string that will filter out for a specific set of projects matching the search string.
String sort = "display_name"; // String | The column to sort by. Default column is \"display_name\"
try {
    List<Project> result = apiInstance.listManagedProjects(apiKey, limit, page, onlyEnabled, onlyOwned, searchString, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#listManagedProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **onlyEnabled** | **Boolean**| Flag to set if only wanting enabled projects returned. Default value is true. | [optional] [default to false]
 **onlyOwned** | **Boolean**| Whether to only returned projects that are owned by this user. By default set to false and returns all of them | [optional] [default to false]
 **searchString** | **String**| A simple search string that will filter out for a specific set of projects matching the search string. | [optional]
 **sort** | **String**| The column to sort by. Default column is \&quot;display_name\&quot; | [optional] [default to display_name]

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieve"></a>
# **retrieve**
> Project retrieve(id)

Retrieves an already existing Project

Retrieves an already existing project based on the supplied ID in the URL.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Long id = 789L; // Long | The id of the project to retrieve
try {
    Project result = apiInstance.retrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#retrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the project to retrieve |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveByName"></a>
# **retrieveByName**
> Project retrieveByName(name)

Retrieves an already existing Project

Retrieves an already existing project based on the name of the project rather than an ID

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String name = "name_example"; // String | The name of the project being retrieved
try {
    Project result = apiInstance.retrieveByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#retrieveByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the project being retrieved |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveComments"></a>
# **retrieveComments**
> retrieveComments(id, limit, page)

Retrieve all comments for Project

This will retrieve all the comments of the descendent tasks of a given Project

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Long id = 789L; // Long | The ID of the project
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    apiInstance.retrieveComments(id, limit, page);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#retrieveComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the project |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveList"></a>
# **retrieveList**
> List&lt;Project&gt; retrieveList(projectIds)

Retrieves already existing Projects based on a given list of ids

Retrieves already existing projects based on the supplied IDs

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectIds = "projectIds_example"; // String | Comma-separated list of project ids for which projects are desired.
try {
    List<Project> result = apiInstance.retrieveList(projectIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#retrieveList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIds** | **String**| Comma-separated list of project ids for which projects are desired. |

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> Project update(body, apiKey, id)

Updates a Project

Will update an already existing project from the supplied JSON in the body.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Project body = new Project(); // Project | The JSON structure for the project body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long id = 789L; // Long | The ID of the project that is being updated
try {
    Project result = apiInstance.update(body, apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)| The JSON structure for the project body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **id** | **Long**| The ID of the project that is being updated |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

