# ChallengeApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTasksToChallenge**](ChallengeApi.md#addTasksToChallenge) | **PUT** /challenge/{id}/addTasks | Add tasks to a challenge
[**addTasksToChallengeFromFile**](ChallengeApi.md#addTasksToChallengeFromFile) | **PUT** /challenge/{id}/addFileTasks | Add tasks to a challenge
[**archiveChallenge**](ChallengeApi.md#archiveChallenge) | **POST** /challenge/{challengeId}/archive | Update archive status
[**batchUploadPost**](ChallengeApi.md#batchUploadPost) | **POST** /challenges | Create a batch of Challenges
[**batchUploadPut**](ChallengeApi.md#batchUploadPut) | **PUT** /challenges | Update a batch of Challenges
[**bulkArchive**](ChallengeApi.md#bulkArchive) | **POST** /challenges/bulkArchive | Bulk Archive Challenges.
[**cloneChallenge**](ChallengeApi.md#cloneChallenge) | **PUT** /challenge/{id}/clone/{name} | Clones a Challenge
[**create**](ChallengeApi.md#create) | **POST** /challenge | Create a Challenge
[**createChildren**](ChallengeApi.md#createChildren) | **POST** /challenge/{id}/tasks | Create Tasks for Challenge
[**createFromGithub**](ChallengeApi.md#createFromGithub) | **POST** /project/{projectId}/challenge/{username}/{repo}/{name} | Create Challenge from Github
[**delete**](ChallengeApi.md#delete) | **DELETE** /challenge/{id} | Deletes an existing Challenge
[**deleteTagsFromItem**](ChallengeApi.md#deleteTagsFromItem) | **DELETE** /challenge/{id}/tags | Delete Challenge Tags
[**deleteTasks**](ChallengeApi.md#deleteTasks) | **DELETE** /challenge/{id}/tasks | Deletes all Challenge Tasks
[**expandedList**](ChallengeApi.md#expandedList) | **GET** /challenge/{id}/children | Retrieves children for Challenge
[**extendedFind**](ChallengeApi.md#extendedFind) | **GET** /challenges/extendedFind | Extended Find Challenge matching search criteria
[**extractChallengeReviewHistory**](ChallengeApi.md#extractChallengeReviewHistory) | **GET** /challenge/{id}/extractReviewHistory | Retrieve task review history of a Challenge
[**extractComments**](ChallengeApi.md#extractComments) | **GET** /challenge/{id}/comments/extract | Retrieve all comments for Challenge
[**extractPackage**](ChallengeApi.md#extractPackage) | **GET** /challenge/{id}/extract | Extracts a Challenge Package
[**extractTaskSummaries**](ChallengeApi.md#extractTaskSummaries) | **GET** /challenge/{id}/tasks/extract | Retrieve summaries of all tasks for Challenge
[**extractTaskSummaries_0**](ChallengeApi.md#extractTaskSummaries_0) | **POST** /challenge/{id}/tasks/extract | Retrieve summaries of all tasks for Challenge
[**find**](ChallengeApi.md#find) | **GET** /challenges/find | Find Challenge matching search criteria
[**getChallengeGeoJSON**](ChallengeApi.md#getChallengeGeoJSON) | **GET** /challenge/view/{id} | Retrieves Challenge GeoJSON
[**getChallengeGeoJSON_0**](ChallengeApi.md#getChallengeGeoJSON_0) | **POST** /challenge/view/{id} | Retrieves Challenge GeoJSON
[**getClusteredPoints**](ChallengeApi.md#getClusteredPoints) | **GET** /challenge/clustered/{id} | Retrieves clustered Task points
[**getFeaturedChallenges**](ChallengeApi.md#getFeaturedChallenges) | **GET** /challenges/featured | Featured Challenges.
[**getHotChallenges**](ChallengeApi.md#getHotChallenges) | **GET** /challenges/hot | Hottest Challenges.
[**getItemsBasedOnTags**](ChallengeApi.md#getItemsBasedOnTags) | **GET** /challenges/tags | Retrieve challenges based on provided tags
[**getNearbyTasks**](ChallengeApi.md#getNearbyTasks) | **GET** /challenge/{cid}/tasksNearby/{proximityId} | Retrieves nearby Tasks
[**getPreferredChallenges**](ChallengeApi.md#getPreferredChallenges) | **GET** /challenges/preferred | Preferred Challenges.
[**getRandomTasks**](ChallengeApi.md#getRandomTasks) | **GET** /challenge/{cid}/tasks/random | Retrieves random Task
[**getRandomTasksWithPriority**](ChallengeApi.md#getRandomTasksWithPriority) | **GET** /challenge/{cid}/tasks/prioritizedTasks | Retrieves prioritized random Task
[**getRandomTasks_0**](ChallengeApi.md#getRandomTasks_0) | **GET** /challenge/{cid}/tasks/randomTasks | Retrieves random Task
[**getSequentialNextTask**](ChallengeApi.md#getSequentialNextTask) | **GET** /challenge/{cid}/nextTask/{id} | Retrieves next Task
[**getSequentialPreviousTask**](ChallengeApi.md#getSequentialPreviousTask) | **GET** /challenge/{cid}/previousTask/{id} | Retrieves previous Task
[**getTagsForChallenge**](ChallengeApi.md#getTagsForChallenge) | **GET** /challenge/{id}/tags | Retrieve tags for Challenge
[**list**](ChallengeApi.md#list) | **GET** /challenges | List all the Challenges.
[**listChallenges**](ChallengeApi.md#listChallenges) | **GET** /review/challenges | List all the Challenges with review tasks.
[**listChildren**](ChallengeApi.md#listChildren) | **GET** /challenge/{id}/tasks | List all the Challenges Tasks.
[**listing**](ChallengeApi.md#listing) | **GET** /challenges/listing | List challenges in specified projects
[**matchChangeSets**](ChallengeApi.md#matchChangeSets) | **GET** /challenge/{id}/matchChangesets | Match OSM Changesets
[**moveChallenge**](ChallengeApi.md#moveChallenge) | **POST** /challenge/{id}/project/{projectId} | Move Challenge to another Project
[**moveChallenges**](ChallengeApi.md#moveChallenges) | **POST** /challenges/project/{projectId} | Move Challenges to another Project
[**read**](ChallengeApi.md#read) | **GET** /challenge/{id} | Retrieves an already existing Challenge
[**readByName**](ChallengeApi.md#readByName) | **GET** /project/{id}/challenge/{name} | Retrieves an already existing Challenge
[**rebuildChallenge**](ChallengeApi.md#rebuildChallenge) | **PUT** /challenge/{id}/rebuild | Rebuild a Challenge
[**resetTaskInstructions**](ChallengeApi.md#resetTaskInstructions) | **PUT** /challenge/{id}/resetTaskInstructions | Reset Task Instructions
[**retrieveComments**](ChallengeApi.md#retrieveComments) | **GET** /challenge/{id}/comments | Retrieve all comments for Challenge
[**undelete**](ChallengeApi.md#undelete) | **PUT** /challenge/{id}/undelete | Undeletes a Challenge
[**update**](ChallengeApi.md#update) | **PUT** /challenge/{id} | Updates a Challenge
[**updateChildren**](ChallengeApi.md#updateChildren) | **PUT** /challenge/{id}/tasks | Create Tasks for Challenge
[**updateTaskPriorities**](ChallengeApi.md#updateTaskPriorities) | **PUT** /challenge/{id}/updateTaskPriorities | Update Task Priorities

<a name="addTasksToChallenge"></a>
# **addTasksToChallenge**
> addTasksToChallenge(id, apiKey)

Add tasks to a challenge

This will create tasks within a challenge based on the provided geojson in the body of the PUT request

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the parent Challenge where all the children are being created.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.addTasksToChallenge(id, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#addTasksToChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent Challenge where all the children are being created. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="addTasksToChallengeFromFile"></a>
# **addTasksToChallengeFromFile**
> addTasksToChallengeFromFile(id, apiKey, lineByLine, removeUnmatched, dataOriginDate, skipSnapshot)

Add tasks to a challenge

This will create tasks within a challenge based on the provided file uploaded as part of the PUT request.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the parent Challenge where all the children are being created.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Boolean lineByLine = true; // Boolean | If the JSON provided includes seperate GeoJSON on each line, then this must be true
Boolean removeUnmatched = false; // Boolean | Used to remove incomplete tasks that have been addressed externally since the last rebuild, assuming the source data represents all tasks outstanding. If set to true, all existing tasks in CREATED or SKIPPED status (only) will be removed prior to rebuilding with the assumption that they will be recreated if they still appear in the updated source data. If set to false, unmatched existing tasks are simply left as-is.
String dataOriginDate = "dataOriginDate_example"; // String | 
Boolean skipSnapshot = false; // Boolean | If included will skip recording a snapshot before proceeding. (By default false, so it will create snapshot.)
try {
    apiInstance.addTasksToChallengeFromFile(id, apiKey, lineByLine, removeUnmatched, dataOriginDate, skipSnapshot);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#addTasksToChallengeFromFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent Challenge where all the children are being created. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **lineByLine** | **Boolean**| If the JSON provided includes seperate GeoJSON on each line, then this must be true | [optional] [default to true]
 **removeUnmatched** | **Boolean**| Used to remove incomplete tasks that have been addressed externally since the last rebuild, assuming the source data represents all tasks outstanding. If set to true, all existing tasks in CREATED or SKIPPED status (only) will be removed prior to rebuilding with the assumption that they will be recreated if they still appear in the updated source data. If set to false, unmatched existing tasks are simply left as-is. | [optional] [default to false]
 **dataOriginDate** | **String**|  | [optional]
 **skipSnapshot** | **Boolean**| If included will skip recording a snapshot before proceeding. (By default false, so it will create snapshot.) | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="archiveChallenge"></a>
# **archiveChallenge**
> archiveChallenge(challengeId)

Update archive status

This will update the archive status of the challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long challengeId = 789L; // Long | The ID of the challenge
try {
    apiInstance.archiveChallenge(challengeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#archiveChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **challengeId** | **Long**| The ID of the challenge |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="batchUploadPost"></a>
# **batchUploadPost**
> batchUploadPost()

Create a batch of Challenges

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
try {
    apiInstance.batchUploadPost();
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#batchUploadPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="batchUploadPut"></a>
# **batchUploadPut**
> batchUploadPut()

Update a batch of Challenges

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
try {
    apiInstance.batchUploadPut();
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#batchUploadPut");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="bulkArchive"></a>
# **bulkArchive**
> bulkArchive()

Bulk Archive Challenges.

Archive or unarchive a list of challenges

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
try {
    apiInstance.bulkArchive();
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#bulkArchive");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="cloneChallenge"></a>
# **cloneChallenge**
> OrgMaprouletteFrameworkModelChallenge cloneChallenge(id, name, apiKey)

Clones a Challenge

Clones a challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the Challenge to clone.
String name = "name_example"; // String | The name of the new challenge
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteFrameworkModelChallenge result = apiInstance.cloneChallenge(id, name, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#cloneChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Challenge to clone. |
 **name** | **String**| The name of the new challenge |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteFrameworkModelChallenge**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="create"></a>
# **create**
> OrgMaprouletteFrameworkModelChallenge create(body, apiKey)

Create a Challenge

Will create a new challenge from the supplied JSON in the body. When creating the Challenge, leave the ID field out of the body json, if updating (generally use the PUT method) include the ID field.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
OrgMaprouletteFrameworkModelChallenge body = new OrgMaprouletteFrameworkModelChallenge(); // OrgMaprouletteFrameworkModelChallenge | The JSON structure for the Challenge body, include the key "children" to create Task children objects. Although the model schema shows a hierarchy include "general", "creation", "priority" and "extra" this JSON structure can be flatten and you can exclude those top level keys and have the children in the root level.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteFrameworkModelChallenge result = apiInstance.create(body, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrgMaprouletteFrameworkModelChallenge**](OrgMaprouletteFrameworkModelChallenge.md)| The JSON structure for the Challenge body, include the key &quot;children&quot; to create Task children objects. Although the model schema shows a hierarchy include &quot;general&quot;, &quot;creation&quot;, &quot;priority&quot; and &quot;extra&quot; this JSON structure can be flatten and you can exclude those top level keys and have the children in the root level. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteFrameworkModelChallenge**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createChildren"></a>
# **createChildren**
> createChildren(id)

Create Tasks for Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | 
try {
    apiInstance.createChildren(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#createChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createFromGithub"></a>
# **createFromGithub**
> createFromGithub(projectId, username, repo, name, id, rebuild)

Create Challenge from Github

This will pull the following files from Github, ${name}_create.json, ${name}_geojson.json, ${name}_info.md, and create a Challenge from it. The create file will be the json used to create the challenge. Similarly to if you supplied json in the create method. The info.md file is just an informational file that can be used later for challenge information to the user. And geojson.json which is used to generate the tasks. If the challenge has been previously created, it will just update the tasks from the geojson

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long projectId = 789L; // Long | 
String username = "username_example"; // String | username of the github user that owns the repo
String repo = "repo_example"; // String | Github repositories that contains the challenge files
String name = "name_example"; // String | The name of the challenge that prefixes all the github files
Object id = null; // Object | The ID of the parent project
Boolean rebuild = false; // Boolean | 
try {
    apiInstance.createFromGithub(projectId, username, repo, name, id, rebuild);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#createFromGithub");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**|  |
 **username** | **String**| username of the github user that owns the repo |
 **repo** | **String**| Github repositories that contains the challenge files |
 **name** | **String**| The name of the challenge that prefixes all the github files |
 **id** | [**Object**](.md)| The ID of the parent project |
 **rebuild** | **Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> OrgMaprouletteExceptionStatusMessage delete(id, apiKey, immediate)

Deletes an existing Challenge

Deletes an existing Challenge based on the supplied ID. This will delete all children Tasks under the Challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the Challenge being deleted
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Boolean immediate = false; // Boolean | If set to true, will delete the virtual challenge immediately instead of delayed
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.delete(id, apiKey, immediate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Challenge being deleted |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **immediate** | **Boolean**| If set to true, will delete the virtual challenge immediately instead of delayed | [optional] [default to false]

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTagsFromItem"></a>
# **deleteTagsFromItem**
> deleteTagsFromItem(id, apiKey, tags)

Delete Challenge Tags

Deletes all the supplied tags from the Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The ID of the challenge
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String tags = "tags_example"; // String | A comma separated list of tags
try {
    apiInstance.deleteTagsFromItem(id, apiKey, tags);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#deleteTagsFromItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the challenge |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **tags** | **String**| A comma separated list of tags | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTasks"></a>
# **deleteTasks**
> deleteTasks(id, apiKey, statusFilters)

Deletes all Challenge Tasks

Deletes all the existing tasks within a challenge. This API will also give the option to delete tasks based on the tasks current status. So can delete all \&quot;false positive\&quot; tasks, or all \&quot;fixed and created\&quot; tasks.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the Challenge being deleted
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String statusFilters = "statusFilters_example"; // String | A comma separated list of status ID's. 0 = Created, 1 = Fixed, 2 = False Positive, 3 = Skipped, 4 = Deleted, 5 = Already Fixed, 6 = Too Hard
try {
    apiInstance.deleteTasks(id, apiKey, statusFilters);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#deleteTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Challenge being deleted |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **statusFilters** | **String**| A comma separated list of status ID&#x27;s. 0 &#x3D; Created, 1 &#x3D; Fixed, 2 &#x3D; False Positive, 3 &#x3D; Skipped, 4 &#x3D; Deleted, 5 &#x3D; Already Fixed, 6 &#x3D; Too Hard | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="expandedList"></a>
# **expandedList**
> List&lt;OrgMaprouletteFrameworkModelChallenge&gt; expandedList(id, limit, page)

Retrieves children for Challenge

Retrieves all the children for a Challenge in an expanded list. Unlike the GET request /challenge/{id}/tasks, this function will wrap the json array list inside of the parent Challenge object, so that you see the full hierarchy.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the parent Challenge.
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelChallenge> result = apiInstance.expandedList(id, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#expandedList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent Challenge. |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallenge&gt;**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extendedFind"></a>
# **extendedFind**
> List&lt;OrgMaprouletteFrameworkModelChallenge&gt; extendedFind(limit, page, sort, order, pid, ps, pe, ct, cs, ce, cd)

Extended Find Challenge matching search criteria

Finds a list of Challenges that match a specific search criteria. The search criteria is uses multiple values from the query string

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
String sort = "sort_example"; // String | Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted.
String order = "ASC"; // String | Sort order direction. Either ASC or DESC. Default is \"ASC\" (ascending)
Object pid = null; // Object | The id of the project to limit your search too
Object ps = null; // Object | The search string used to match the project names. Default value is empty string, ie. will match all projects.
Object pe = null; // Object | Boolean variable true|false that limits the search by enabled projects only if set to true. Default will is true.
Object ct = null; // Object | Comma separated list of tags to limit the returned challenges by
Object cs = null; // Object | The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges.
Object ce = null; // Object | Boolean variable true|false that limits the search by enabled projects only if set to true. Default will is true.
Object cd = null; // Object | The difficulty level to limit the returned challenges by. Following difficulty Integers can be used. 1 - Easy, 2 - Normal, 3 - Expert, -1 - Any difficulty. Default value is -1.
try {
    List<OrgMaprouletteFrameworkModelChallenge> result = apiInstance.extendedFind(limit, page, sort, order, pid, ps, pe, ct, cs, ce, cd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#extendedFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **sort** | **String**| Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted. | [optional]
 **order** | **String**| Sort order direction. Either ASC or DESC. Default is \&quot;ASC\&quot; (ascending) | [optional] [default to ASC]
 **pid** | [**Object**](.md)| The id of the project to limit your search too | [optional]
 **ps** | [**Object**](.md)| The search string used to match the project names. Default value is empty string, ie. will match all projects. | [optional]
 **pe** | [**Object**](.md)| Boolean variable true|false that limits the search by enabled projects only if set to true. Default will is true. | [optional]
 **ct** | [**Object**](.md)| Comma separated list of tags to limit the returned challenges by | [optional]
 **cs** | [**Object**](.md)| The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges. | [optional]
 **ce** | [**Object**](.md)| Boolean variable true|false that limits the search by enabled projects only if set to true. Default will is true. | [optional]
 **cd** | [**Object**](.md)| The difficulty level to limit the returned challenges by. Following difficulty Integers can be used. 1 - Easy, 2 - Normal, 3 - Expert, -1 - Any difficulty. Default value is -1. | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallenge&gt;**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extractChallengeReviewHistory"></a>
# **extractChallengeReviewHistory**
> extractChallengeReviewHistory(id)

Retrieve task review history of a Challenge

This will retrieve review history of all the tasks of a given challenge and respond with a csv

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The ID of the challenge
try {
    apiInstance.extractChallengeReviewHistory(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#extractChallengeReviewHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the challenge |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="extractComments"></a>
# **extractComments**
> extractComments(id, limit, page)

Retrieve all comments for Challenge

This will retrieve all the comments for all the children tasks of a given challenge and respond with a csv

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The ID of the challenge
Integer limit = -1; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    apiInstance.extractComments(id, limit, page);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#extractComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the challenge |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to -1]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="extractPackage"></a>
# **extractPackage**
> extractPackage(id)

Extracts a Challenge Package

This will retrieve a package of the challenge, which will contain json to recreate the challenge, geojson to recreate the tasks, info page in md format if any, all the comments extracted from for the challenge and any metrics and the time the challenge was extracted.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The ID of the challenge
try {
    apiInstance.extractPackage(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#extractPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the challenge |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="extractTaskSummaries"></a>
# **extractTaskSummaries**
> extractTaskSummaries(id, limit, page, status, reviewStatus, priority, exportProperties, timezone)

Retrieve summaries of all tasks for Challenge

This will retrieve summaries of all the tasks of a given challenge and respond with a csv

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The ID of the challenge
Integer limit = -1; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
String status = "status_example"; // String | Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
String reviewStatus = "reviewStatus_example"; // String | Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed
String priority = "priority_example"; // String | Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low
String exportProperties = "exportProperties_example"; // String | 
String timezone = "timezone_example"; // String | A timezone offset to apply to time fields. Format should be like '+HH:MM'. Default is GMT (+00:00)
try {
    apiInstance.extractTaskSummaries(id, limit, page, status, reviewStatus, priority, exportProperties, timezone);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#extractTaskSummaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the challenge |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to -1]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **status** | **String**| Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard | [optional]
 **reviewStatus** | **String**| Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed | [optional]
 **priority** | **String**| Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low | [optional]
 **exportProperties** | **String**|  | [optional]
 **timezone** | **String**| A timezone offset to apply to time fields. Format should be like &#x27;+HH:MM&#x27;. Default is GMT (+00:00) | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="extractTaskSummaries_0"></a>
# **extractTaskSummaries_0**
> extractTaskSummaries_0(id, apiKey, limit, page, status, reviewStatus, priority, exportProperties, timezone)

Retrieve summaries of all tasks for Challenge

This will retrieve summaries of all the tasks of a given challenge and respond with a csv

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The ID of the challenge
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Integer limit = -1; // Integer | Limit the number of results returned in the response. Default value is -1 (no limit).
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
String status = "status_example"; // String | Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
String reviewStatus = "reviewStatus_example"; // String | Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed
String priority = "priority_example"; // String | Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low
String exportProperties = "exportProperties_example"; // String | 
String timezone = "timezone_example"; // String | A timezone offset to apply to time fields. Format should be like '+HH:MM'. Default is GMT (+00:00)
try {
    apiInstance.extractTaskSummaries_0(id, apiKey, limit, page, status, reviewStatus, priority, exportProperties, timezone);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#extractTaskSummaries_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the challenge |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is -1 (no limit). | [optional] [default to -1]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **status** | **String**| Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard | [optional]
 **reviewStatus** | **String**| Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed | [optional]
 **priority** | **String**| Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low | [optional]
 **exportProperties** | **String**|  | [optional]
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
> List&lt;OrgMaprouletteFrameworkModelChallenge&gt; find(q, parentId, limit, page, onlyEnabled)

Find Challenge matching search criteria

Finds a list of Challenges that match a specific search criteria. The search criteria is simply a string that is contained in the Challenge name. String case sensitivity is ignored.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
String q = "q_example"; // String | The search string used to match the Challenge names. Default value is empty string, ie. will match everything.
Long parentId = -1L; // Long | This field will be ignored for this request
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
Boolean onlyEnabled = true; // Boolean | Flag to set if only wanting enabled Challenges returned. Default value is true.
try {
    List<OrgMaprouletteFrameworkModelChallenge> result = apiInstance.find(q, parentId, limit, page, onlyEnabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#find");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| The search string used to match the Challenge names. Default value is empty string, ie. will match everything. | [optional]
 **parentId** | **Long**| This field will be ignored for this request | [optional] [default to -1]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **onlyEnabled** | **Boolean**| Flag to set if only wanting enabled Challenges returned. Default value is true. | [optional] [default to true]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallenge&gt;**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChallengeGeoJSON"></a>
# **getChallengeGeoJSON**
> getChallengeGeoJSON(id, status, reviewStatus, priority, timezone, filename)

Retrieves Challenge GeoJSON

Retrieves the GeoJSON for the Challenge that represents all the Task children of the Challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the parent Challenge limiting the tasks to only a descendent of that Challenge.
String status = "status_example"; // String | Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
String reviewStatus = "reviewStatus_example"; // String | Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed
String priority = "priority_example"; // String | Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low
String timezone = "timezone_example"; // String | A timezone offset to apply to time fields. Format should be like '+HH:MM'. Default is GMT (+00:00)
String filename = "challenge_geojson.json"; // String | Optional filename to be used for the export
try {
    apiInstance.getChallengeGeoJSON(id, status, reviewStatus, priority, timezone, filename);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getChallengeGeoJSON");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent Challenge limiting the tasks to only a descendent of that Challenge. |
 **status** | **String**| Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard | [optional]
 **reviewStatus** | **String**| Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed | [optional]
 **priority** | **String**| Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low | [optional]
 **timezone** | **String**| A timezone offset to apply to time fields. Format should be like &#x27;+HH:MM&#x27;. Default is GMT (+00:00) | [optional]
 **filename** | **String**| Optional filename to be used for the export | [optional] [default to challenge_geojson.json]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChallengeGeoJSON_0"></a>
# **getChallengeGeoJSON_0**
> getChallengeGeoJSON_0(id, status, reviewStatus, priority, timezone, filename)

Retrieves Challenge GeoJSON

Retrieves the GeoJSON for the Challenge that represents all the Task children of the Challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the parent Challenge limiting the tasks to only a descendent of that Challenge.
String status = "status_example"; // String | Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
String reviewStatus = "reviewStatus_example"; // String | Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed
String priority = "priority_example"; // String | Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low
String timezone = "timezone_example"; // String | 
String filename = "challenge_geojson.json"; // String | Optional filename to be used for the export
try {
    apiInstance.getChallengeGeoJSON_0(id, status, reviewStatus, priority, timezone, filename);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getChallengeGeoJSON_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent Challenge limiting the tasks to only a descendent of that Challenge. |
 **status** | **String**| Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard | [optional]
 **reviewStatus** | **String**| Can filter the Tasks returned by the reviewStatus of the Task. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed | [optional]
 **priority** | **String**| Can filter the Tasks returned by the priority of the Task. 0 - High, 1 - Medium, 2 - Low | [optional]
 **timezone** | **String**|  | [optional]
 **filename** | **String**| Optional filename to be used for the export | [optional] [default to challenge_geojson.json]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getClusteredPoints"></a>
# **getClusteredPoints**
> List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt; getClusteredPoints(id, filter, limit, excludeLocked)

Retrieves clustered Task points

Retrieves all the Tasks for a specific Challenge as clustered points to potentially display on a map

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the parent project.
String filter = "filter_example"; // String | Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
Integer limit = 2500; // Integer | 
Boolean excludeLocked = false; // Boolean | 
try {
    List<OrgMaprouletteFrameworkModelClusteredPoint> result = apiInstance.getClusteredPoints(id, filter, limit, excludeLocked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getClusteredPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent project. |
 **filter** | **String**| Can filter the Tasks returned by the status of the Task. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard | [optional]
 **limit** | **Integer**|  | [optional] [default to 2500]
 **excludeLocked** | **Boolean**|  | [optional] [default to false]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt;**](OrgMaprouletteFrameworkModelClusteredPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFeaturedChallenges"></a>
# **getFeaturedChallenges**
> List&lt;OrgMaprouletteFrameworkModelChallenge&gt; getFeaturedChallenges(limit, page)

Featured Challenges.

Get all the currently featured challenges

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelChallenge> result = apiInstance.getFeaturedChallenges(limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getFeaturedChallenges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallenge&gt;**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHotChallenges"></a>
# **getHotChallenges**
> List&lt;OrgMaprouletteFrameworkModelChallenge&gt; getHotChallenges(limit, page)

Hottest Challenges.

Get the hottest (recently popular) challenges

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelChallenge> result = apiInstance.getHotChallenges(limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getHotChallenges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallenge&gt;**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemsBasedOnTags"></a>
# **getItemsBasedOnTags**
> List&lt;OrgMaprouletteFrameworkModelChallenge&gt; getItemsBasedOnTags(tags, limit, page)

Retrieve challenges based on provided tags

Retrieves all the challenges that contain at least one of the supplied tags.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
String tags = "tags_example"; // String | A comma separated list of tags
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelChallenge> result = apiInstance.getItemsBasedOnTags(tags, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getItemsBasedOnTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **String**| A comma separated list of tags | [optional]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallenge&gt;**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNearbyTasks"></a>
# **getNearbyTasks**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getNearbyTasks(cid, proximityId, excludeSelfLocked, limit, proximity)

Retrieves nearby Tasks

Retrieves tasks geographically closest to the specified task within the same Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long cid = 789L; // Long | 
Long proximityId = 789L; // Long | 
Boolean excludeSelfLocked = false; // Boolean | exclude tasks this user has locked (always excludes tasks locked by others)
Integer limit = 5; // Integer | Limit the number of results returned in the response. Default value is 5.
Object proximity = null; // Object | Id of task around which geographically closest tasks are desired
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getNearbyTasks(cid, proximityId, excludeSelfLocked, limit, proximity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getNearbyTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **Long**|  |
 **proximityId** | **Long**|  |
 **excludeSelfLocked** | **Boolean**| exclude tasks this user has locked (always excludes tasks locked by others) | [optional] [default to false]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 5. | [optional] [default to 5]
 **proximity** | [**Object**](.md)| Id of task around which geographically closest tasks are desired | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPreferredChallenges"></a>
# **getPreferredChallenges**
> Object getPreferredChallenges(limit)

Preferred Challenges.

Get the preferred challenges which include popular, featured, and newest

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Integer limit = 10; // Integer | Limit the number of results returned in each category. Default value is 10.
try {
    Object result = apiInstance.getPreferredChallenges(limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getPreferredChallenges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of results returned in each category. Default value is 10. | [optional] [default to 10]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRandomTasks"></a>
# **getRandomTasks**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getRandomTasks(cid, s, tags, limit, proximity)

Retrieves random Task

Retrieves a random Task based on the search criteria and contained within the current Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long cid = 789L; // Long | The id of the parent Challenge limiting the tasks to only a descendent of that Challenge.
String s = "s_example"; // String | The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive.
String tags = "tags_example"; // String | A comma separated list of task tags. The search will only retrieve random tasks that contain those tags
Integer limit = 1; // Integer | Limit the number of results returned in the response. Default value is 1.
Long proximity = -1L; // Long | Id of task that you wish to find the next task based on the proximity of that task
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getRandomTasks(cid, s, tags, limit, proximity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getRandomTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **Long**| The id of the parent Challenge limiting the tasks to only a descendent of that Challenge. |
 **s** | **String**| The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive. | [optional]
 **tags** | **String**| A comma separated list of task tags. The search will only retrieve random tasks that contain those tags | [optional]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 1. | [optional] [default to 1]
 **proximity** | **Long**| Id of task that you wish to find the next task based on the proximity of that task | [optional] [default to -1]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRandomTasksWithPriority"></a>
# **getRandomTasksWithPriority**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getRandomTasksWithPriority(cid, s, tags, limit, proximity)

Retrieves prioritized random Task

Retrieves a prioritized random Task contained within the current Challenge, with higher priority tasks being returned ahead of lower priority tasks

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long cid = 789L; // Long | The id of the parent Challenge limiting the tasks to only a descendent of that Challenge.
String s = "s_example"; // String | The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive.
String tags = "tags_example"; // String | A comma separated list of task tags. The search will only retrieve random tasks that contain those tags
Integer limit = 1; // Integer | Limit the number of results returned in the response. Default value is 1.
Long proximity = -1L; // Long | Id of task that you wish to find the next task based on the proximity of that task
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getRandomTasksWithPriority(cid, s, tags, limit, proximity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getRandomTasksWithPriority");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **Long**| The id of the parent Challenge limiting the tasks to only a descendent of that Challenge. |
 **s** | **String**| The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive. | [optional]
 **tags** | **String**| A comma separated list of task tags. The search will only retrieve random tasks that contain those tags | [optional]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 1. | [optional] [default to 1]
 **proximity** | **Long**| Id of task that you wish to find the next task based on the proximity of that task | [optional] [default to -1]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRandomTasks_0"></a>
# **getRandomTasks_0**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getRandomTasks_0(cid, s, tags, limit, proximity)

Retrieves random Task

Retrieves a random Task based on the search criteria and contained within the current Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long cid = 789L; // Long | The id of the parent Challenge limiting the tasks to only a descendent of that Challenge.
String s = "s_example"; // String | The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive.
String tags = "tags_example"; // String | A comma separated list of task tags. The search will only retrieve random tasks that contain those tags
Integer limit = 1; // Integer | Limit the number of results returned in the response. Default value is 1.
Long proximity = -1L; // Long | Id of task that you wish to find the next task based on the proximity of that task
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getRandomTasks_0(cid, s, tags, limit, proximity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getRandomTasks_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **Long**| The id of the parent Challenge limiting the tasks to only a descendent of that Challenge. |
 **s** | **String**| The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive. | [optional]
 **tags** | **String**| A comma separated list of task tags. The search will only retrieve random tasks that contain those tags | [optional]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 1. | [optional] [default to 1]
 **proximity** | **Long**| Id of task that you wish to find the next task based on the proximity of that task | [optional] [default to -1]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSequentialNextTask"></a>
# **getSequentialNextTask**
> OrgMaprouletteFrameworkModelTask getSequentialNextTask(cid, id, statusList)

Retrieves next Task

Retrieves the next sequential Task based on the task ordering within the Challenge. If it is currently on the last task it will response with the first task in the challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long cid = 789L; // Long | The id of the parent Challenge.
Long id = 789L; // Long | The id of the current task being viewed, so that we can get context of what the next task should be
String statusList = "statusList_example"; // String | A comma separated list of Task status' to limit to the response by.
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.getSequentialNextTask(cid, id, statusList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getSequentialNextTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **Long**| The id of the parent Challenge. |
 **id** | **Long**| The id of the current task being viewed, so that we can get context of what the next task should be |
 **statusList** | **String**| A comma separated list of Task status&#x27; to limit to the response by. | [optional]

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSequentialPreviousTask"></a>
# **getSequentialPreviousTask**
> OrgMaprouletteFrameworkModelTask getSequentialPreviousTask(cid, id, statusList)

Retrieves previous Task

Retrieves the previous sequential Task based on the task ordering within the Challenge. If it is currently on the first task it will response with the last task in the challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long cid = 789L; // Long | The id of the parent Challenge.
Long id = 789L; // Long | The id of the current task being viewed, so that we can get context of what the next task should be
String statusList = "statusList_example"; // String | A comma separated list of Task status' to limit to the response by.
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.getSequentialPreviousTask(cid, id, statusList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getSequentialPreviousTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cid** | **Long**| The id of the parent Challenge. |
 **id** | **Long**| The id of the current task being viewed, so that we can get context of what the next task should be |
 **statusList** | **String**| A comma separated list of Task status&#x27; to limit to the response by. | [optional]

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagsForChallenge"></a>
# **getTagsForChallenge**
> List&lt;OrgMaprouletteFrameworkModelTag&gt; getTagsForChallenge(id)

Retrieve tags for Challenge

Retrieves all the Tags that have been added to the specified Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The ID of the challenge
try {
    List<OrgMaprouletteFrameworkModelTag> result = apiInstance.getTagsForChallenge(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#getTagsForChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the challenge |

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTag&gt;**](OrgMaprouletteFrameworkModelTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="list"></a>
# **list**
> List&lt;OrgMaprouletteFrameworkModelChallenge&gt; list(limit, page, onlyEnabled)

List all the Challenges.

Lists all the Challenges in the system

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
Boolean onlyEnabled = false; // Boolean | Only retrieve challenges that are enabled, default is false.
try {
    List<OrgMaprouletteFrameworkModelChallenge> result = apiInstance.list(limit, page, onlyEnabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **onlyEnabled** | **Boolean**| Only retrieve challenges that are enabled, default is false. | [optional] [default to false]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallenge&gt;**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listChallenges"></a>
# **listChallenges**
> List&lt;OrgMaprouletteFrameworkModelChallenge&gt; listChallenges(reviewTasksType, tStatus, excludeOtherReviewers, limit, page)

List all the Challenges with review tasks.

Lists all the Challenges in the system with review tasks.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Integer reviewTasksType = 56; // Integer | Limit challenges to reviews of type... 1/To Be Reviewed 2/User's reviewed Tasks 3/All reviewed by users
String tStatus = "tStatus_example"; // String | Task statuses to include in search (default all statuses)
Boolean excludeOtherReviewers = false; // Boolean | Exclude reviews by completed by other reviewers (default true)
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelChallenge> result = apiInstance.listChallenges(reviewTasksType, tStatus, excludeOtherReviewers, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#listChallenges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewTasksType** | **Integer**| Limit challenges to reviews of type... 1/To Be Reviewed 2/User&#x27;s reviewed Tasks 3/All reviewed by users |
 **tStatus** | **String**| Task statuses to include in search (default all statuses) | [optional]
 **excludeOtherReviewers** | **Boolean**| Exclude reviews by completed by other reviewers (default true) | [optional] [default to false]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallenge&gt;**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listChildren"></a>
# **listChildren**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; listChildren(id, limit, page)

List all the Challenges Tasks.

Lists all the Tasks that are children of the supplied Challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The project ID.
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.listChildren(id, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#listChildren");
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

<a name="listing"></a>
# **listing**
> List&lt;OrgMaprouletteFrameworkModelChallengeListing&gt; listing(projectIds, limit, page, onlyEnabled, parentId)

List challenges in specified projects

Retrieves a lightweight listing of challenges, with just a few basic fields for each, that belong to the specified project(s).

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
String projectIds = "projectIds_example"; // String | Comma-separated list of project ids for which child challenges are desired. Default value is empty string, ie. all projects.
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
Boolean onlyEnabled = true; // Boolean | Flag to set if only wanting enabled Challenges returned. Default value is true.
Object parentId = null; // Object | This field will be ignored for this request
try {
    List<OrgMaprouletteFrameworkModelChallengeListing> result = apiInstance.listing(projectIds, limit, page, onlyEnabled, parentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#listing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIds** | **String**| Comma-separated list of project ids for which child challenges are desired. Default value is empty string, ie. all projects. | [optional]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **onlyEnabled** | **Boolean**| Flag to set if only wanting enabled Challenges returned. Default value is true. | [optional] [default to true]
 **parentId** | [**Object**](.md)| This field will be ignored for this request | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallengeListing&gt;**](OrgMaprouletteFrameworkModelChallengeListing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchChangeSets"></a>
# **matchChangeSets**
> matchChangeSets(id, skipSet)

Match OSM Changesets

This will go through every task and try to match an OSM changeset with the task

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The ID of the challenge
Boolean skipSet = false; // Boolean | Will skip any tasks if the changesets are already set if this is set to true
try {
    apiInstance.matchChangeSets(id, skipSet);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#matchChangeSets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the challenge |
 **skipSet** | **Boolean**| Will skip any tasks if the changesets are already set if this is set to true | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="moveChallenge"></a>
# **moveChallenge**
> List&lt;OrgMaprouletteFrameworkModelTag&gt; moveChallenge(projectId, id)

Move Challenge to another Project

Will move a challenge into another project

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long projectId = 789L; // Long | The ID of the project you are moving the challenge too.
Long id = 789L; // Long | The ID of the challenge
try {
    List<OrgMaprouletteFrameworkModelTag> result = apiInstance.moveChallenge(projectId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#moveChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The ID of the project you are moving the challenge too. |
 **id** | **Long**| The ID of the challenge |

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTag&gt;**](OrgMaprouletteFrameworkModelTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="moveChallenges"></a>
# **moveChallenges**
> List&lt;OrgMaprouletteFrameworkModelTag&gt; moveChallenges(projectId)

Move Challenges to another Project

Will move a list of challenges into another project

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long projectId = 789L; // Long | The ID of the project you are moving the challenge too.
try {
    List<OrgMaprouletteFrameworkModelTag> result = apiInstance.moveChallenges(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#moveChallenges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The ID of the project you are moving the challenge too. |

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTag&gt;**](OrgMaprouletteFrameworkModelTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="read"></a>
# **read**
> OrgMaprouletteFrameworkModelChallenge read(id)

Retrieves an already existing Challenge

Retrieves an already existing Challenge based on the supplied ID in the URL.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the Challenge to retrieve
try {
    OrgMaprouletteFrameworkModelChallenge result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Challenge to retrieve |

### Return type

[**OrgMaprouletteFrameworkModelChallenge**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readByName"></a>
# **readByName**
> OrgMaprouletteFrameworkModelChallenge readByName(id, name)

Retrieves an already existing Challenge

Retrieves an already existing Challenge based on the name of the Challenge rather than an ID

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the parent Project of the Challenge
String name = "name_example"; // String | The name of the Challenge being retrieved
try {
    OrgMaprouletteFrameworkModelChallenge result = apiInstance.readByName(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#readByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent Project of the Challenge |
 **name** | **String**| The name of the Challenge being retrieved |

### Return type

[**OrgMaprouletteFrameworkModelChallenge**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rebuildChallenge"></a>
# **rebuildChallenge**
> rebuildChallenge(id, apiKey, removeUnmatched, skipSnapshot)

Rebuild a Challenge

Rebuilds a challenge that was originally built by an overpass query or remote geojson.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the Challenge to rebuild.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Boolean removeUnmatched = false; // Boolean | Used to remove incomplete tasks that have been addressed externally since the last rebuild, assuming the source data represents all tasks outstanding. If set to true, all existing tasks in CREATED or SKIPPED status (only) will be removed prior to rebuilding with the assumption that they will be recreated if they still appear in the updated source data. If set to false, unmatched existing tasks are simply left as-is.
Boolean skipSnapshot = false; // Boolean | If included will skip recording a snapshot before proceeding. (By default false, so it will create snapshot.)
try {
    apiInstance.rebuildChallenge(id, apiKey, removeUnmatched, skipSnapshot);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#rebuildChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Challenge to rebuild. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **removeUnmatched** | **Boolean**| Used to remove incomplete tasks that have been addressed externally since the last rebuild, assuming the source data represents all tasks outstanding. If set to true, all existing tasks in CREATED or SKIPPED status (only) will be removed prior to rebuilding with the assumption that they will be recreated if they still appear in the updated source data. If set to false, unmatched existing tasks are simply left as-is. | [optional] [default to false]
 **skipSnapshot** | **Boolean**| If included will skip recording a snapshot before proceeding. (By default false, so it will create snapshot.) | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="resetTaskInstructions"></a>
# **resetTaskInstructions**
> resetTaskInstructions(id, apiKey)

Reset Task Instructions

This will reset all the task instructions so that the task instructions revert to the Challenge instruction.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the parent project.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.resetTaskInstructions(id, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#resetTaskInstructions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent project. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveComments"></a>
# **retrieveComments**
> retrieveComments(id, limit, page)

Retrieve all comments for Challenge

This will retrieve all the comments for all the children tasks of a given challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The ID of the challenge
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    apiInstance.retrieveComments(id, limit, page);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#retrieveComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the challenge |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="undelete"></a>
# **undelete**
> undelete(id)

Undeletes a Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | 
try {
    apiInstance.undelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#undelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> OrgMaprouletteFrameworkModelChallenge update(body, apiKey, id)

Updates a Challenge

Will update an already existing challenge from the supplied JSON in the body. When updating the Challenge object you can within the same json body include Task children under the \&quot;children\&quot; key.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
OrgMaprouletteFrameworkModelChallenge body = new OrgMaprouletteFrameworkModelChallenge(); // OrgMaprouletteFrameworkModelChallenge | The JSON structure for the Challenge body, include the key "children" to create or update Task children objects.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long id = 789L; // Long | The ID of the Challenge that is being updated
try {
    OrgMaprouletteFrameworkModelChallenge result = apiInstance.update(body, apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrgMaprouletteFrameworkModelChallenge**](OrgMaprouletteFrameworkModelChallenge.md)| The JSON structure for the Challenge body, include the key &quot;children&quot; to create or update Task children objects. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **id** | **Long**| The ID of the Challenge that is being updated |

### Return type

[**OrgMaprouletteFrameworkModelChallenge**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateChildren"></a>
# **updateChildren**
> updateChildren(id)

Create Tasks for Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | 
try {
    apiInstance.updateChildren(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#updateChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateTaskPriorities"></a>
# **updateTaskPriorities**
> OrgMaprouletteExceptionStatusMessage updateTaskPriorities(id, apiKey)

Update Task Priorities

Updates all the Task priorities in a Challenge based on the priority rules setup in the Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ChallengeApi;


ChallengeApi apiInstance = new ChallengeApi();
Long id = 789L; // Long | The id of the parent project.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.updateTaskPriorities(id, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeApi#updateTaskPriorities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent project. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

