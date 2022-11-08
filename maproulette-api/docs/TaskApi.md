# TaskApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachment**](TaskApi.md#attachment) | **GET** /task/{id}/attachment/{attachmentId} | Retrieve task attachment
[**attachmentData**](TaskApi.md#attachmentData) | **GET** /task/{id}/attachment/{attachmentId}/data/{filename} | Download task attachment data as file
[**batchUploadPost**](TaskApi.md#batchUploadPost) | **POST** /tasks | Create a batch of Tasks
[**batchUploadPut**](TaskApi.md#batchUploadPut) | **PUT** /tasks | Update a batch of Tasks
[**bulkStatusChange**](TaskApi.md#bulkStatusChange) | **PUT** /tasks/changeStatus | Changes status on tasks matching criteria
[**cooperativeWorkChangeXML**](TaskApi.md#cooperativeWorkChangeXML) | **GET** /task/{id}/cooperative/change/{filename} | Retrieve any change XML that is part of this task&#x27;s cooperative work
[**create**](TaskApi.md#create) | **POST** /task | Create a Task
[**delete**](TaskApi.md#delete) | **DELETE** /task/{id} | Deletes an existing Task
[**deleteTagsFromItem**](TaskApi.md#deleteTagsFromItem) | **DELETE** /task/{id}/tags | Delete Task Tags
[**find**](TaskApi.md#find) | **GET** /tasks/find | Find Task matching search criteria
[**getItemsBasedOnTags**](TaskApi.md#getItemsBasedOnTags) | **GET** /tasks/tags | Retrieve Tasks based on provided tags
[**getRandomTasks**](TaskApi.md#getRandomTasks) | **GET** /tasks/random | Retrieves random Task
[**getTagsForTask**](TaskApi.md#getTagsForTask) | **GET** /task/{id}/tags | Retrieve tags for Task
[**getTaskClusters**](TaskApi.md#getTaskClusters) | **GET** /taskCluster | Retrieves task clusters. USE PUT METHOD
[**getTaskClusters_0**](TaskApi.md#getTaskClusters_0) | **PUT** /taskCluster | Retrieves task clusters.
[**getTaskHistoryLog**](TaskApi.md#getTaskHistoryLog) | **GET** /task/{id}/history | Retrieves a history for the task
[**getTasksInBoundingBox**](TaskApi.md#getTasksInBoundingBox) | **GET** /tasks/box/{left}/{bottom}/{right}/{top} | Retrieves Tasks within a bounding box
[**getTasksInBoundingBox_0**](TaskApi.md#getTasksInBoundingBox_0) | **PUT** /tasks/box/{left}/{bottom}/{right}/{top} | Retrieves Tasks within a bounding box
[**getTasksInCluster**](TaskApi.md#getTasksInCluster) | **GET** /tasksInCluster/{clusterId} | Retrieves tasks in a cluster
[**matchToOSMChangeSet**](TaskApi.md#matchToOSMChangeSet) | **PUT** /task/{id}/changeset | Update Task Changeset
[**read**](TaskApi.md#read) | **GET** /task/{id} | Retrieves an already existing Task
[**readByName**](TaskApi.md#readByName) | **GET** /challenge/{id}/task/{name} | Retrieves an already existing Task
[**refreshTaskLock**](TaskApi.md#refreshTaskLock) | **GET** /task/{id}/refreshLock | Refresh an existing lock on a Task
[**releaseTask**](TaskApi.md#releaseTask) | **GET** /task/{id}/release | Release a Task (unlocks it)
[**removeReviewRequest**](TaskApi.md#removeReviewRequest) | **PUT** /tasks/review/remove | Changes review status to \&quot;Unnecessary\&quot; on tasks matching criteria
[**setBundleMetaReviewStatus**](TaskApi.md#setBundleMetaReviewStatus) | **PUT** /taskBundle/{id}/metareview/{status} | Update Meta Review Status for a Bundle
[**setBundleTaskReviewStatus**](TaskApi.md#setBundleTaskReviewStatus) | **PUT** /taskBundle/{id}/review/{status} | Update Task Review Status for a Bundle
[**setBundleTaskStatus**](TaskApi.md#setBundleTaskStatus) | **PUT** /taskBundle/{bundleId}/{status} | Update Bundle Task Status
[**setMetaReviewStatus**](TaskApi.md#setMetaReviewStatus) | **PUT** /task/{id}/metareview/{status} | Update Task Meta Review Status
[**setTaskReviewStatus**](TaskApi.md#setTaskReviewStatus) | **PUT** /task/{id}/review/{status} | Update Task Review Status
[**setTaskStatus**](TaskApi.md#setTaskStatus) | **PUT** /task/{id}/{status} | Update Task Status
[**startOnTask**](TaskApi.md#startOnTask) | **GET** /task/{id}/start | Start working on a Task (locks it for the user)
[**update**](TaskApi.md#update) | **PUT** /task/{id} | Updates a Task
[**updateCompletionResponses**](TaskApi.md#updateCompletionResponses) | **PUT** /task/{id}/responses | Update Completion Responses
[**updateItemTags**](TaskApi.md#updateItemTags) | **GET** /task/{id}/tags/update | Updates Task Tags

<a name="attachment"></a>
# **attachment**
> attachment(id, attachmentId)

Retrieve task attachment

Retrieve attachment identified by attachmentId on specified task

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The id of the Task for which attachment is desired
String attachmentId = "attachmentId_example"; // String | The id of the desired task attachment
try {
    apiInstance.attachment(id, attachmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#attachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task for which attachment is desired |
 **attachmentId** | **String**| The id of the desired task attachment |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="attachmentData"></a>
# **attachmentData**
> attachmentData(id, attachmentId, filename)

Download task attachment data as file

Download attachment attachment data as file

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The id of the Task for which attachment is desired
String attachmentId = "attachmentId_example"; // String | The id of the desired task attachment
String filename = "filename_example"; // String | A filename to use. Some editors will use this as a hint as to the format of the data. Must be alphanumeric with optional underscores, dashes, and dots.
try {
    apiInstance.attachmentData(id, attachmentId, filename);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#attachmentData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task for which attachment is desired |
 **attachmentId** | **String**| The id of the desired task attachment |
 **filename** | **String**| A filename to use. Some editors will use this as a hint as to the format of the data. Must be alphanumeric with optional underscores, dashes, and dots. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="batchUploadPost"></a>
# **batchUploadPost**
> batchUploadPost(body, apiKey)

Create a batch of Tasks

Will create multiple new Tasks from the JSONArray supplied in the body. Each JSON object is basically a Task object that is processed similarly to the singular /sask POST. If Tasks already exist with the name, they will simply be skipped, ie. not updated.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
List<OrgMaprouletteFrameworkModelTask> body = Arrays.asList(new OrgMaprouletteFrameworkModelTask()); // List<OrgMaprouletteFrameworkModelTask> | The JSON structure for the Task body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.batchUploadPost(body, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#batchUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)| The JSON structure for the Task body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="batchUploadPut"></a>
# **batchUploadPut**
> batchUploadPut(body, apiKey)

Update a batch of Tasks

Will update multiple already existing Tasks from the JSONArray supplied in the body. Each JSON object is basically a Task object that is processed similarly to the singular /task POST. If a Task does not exist it will be created from scratch

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
List<OrgMaprouletteFrameworkModelTask> body = Arrays.asList(new OrgMaprouletteFrameworkModelTask()); // List<OrgMaprouletteFrameworkModelTask> | The JSON structure for the Task body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.batchUploadPut(body, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#batchUploadPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)| The JSON structure for the Task body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="bulkStatusChange"></a>
# **bulkStatusChange**
> bulkStatusChange(newStatus, apiKey)

Changes status on tasks matching criteria

Will changes status on tasks that match the given search parameters.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Integer newStatus = 56; // Integer | 
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.bulkStatusChange(newStatus, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#bulkStatusChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newStatus** | **Integer**|  |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cooperativeWorkChangeXML"></a>
# **cooperativeWorkChangeXML**
> OrgMaprouletteFrameworkModelTask cooperativeWorkChangeXML(id, filename)

Retrieve any change XML that is part of this task&#x27;s cooperative work

Retrieve change XML that is part of this task&#x27;s cooperative work. The cooperative work on the task should be consulted to determine if any change exists for the task, and which change format was used (i.e. JOSM, OSMChange, etc).

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The id of the Task for which change XML is desired
String filename = "filename_example"; // String | A filename to use. Some editors will use this as a hint as to the change format of the XML. Must be alphanumeric with optional underscores, dashes, and dots.
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.cooperativeWorkChangeXML(id, filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#cooperativeWorkChangeXML");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task for which change XML is desired |
 **filename** | **String**| A filename to use. Some editors will use this as a hint as to the change format of the XML. Must be alphanumeric with optional underscores, dashes, and dots. |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="create"></a>
# **create**
> OrgMaprouletteFrameworkModelTask create(body, apiKey)

Create a Task

Will create a new Task from the supplied JSON in the body. When creating the Task, leave the ID field out of the body json, if updating (generally use the PUT method) include the ID field.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
OrgMaprouletteFrameworkModelTask body = new OrgMaprouletteFrameworkModelTask(); // OrgMaprouletteFrameworkModelTask | The JSON structure for the Task body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.create(body, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)| The JSON structure for the Task body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> OrgMaprouletteExceptionStatusMessage delete(id, apiKey, immediate)

Deletes an existing Task

Deletes an existing Task based on the supplied ID.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The id of the Task being deleted
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Boolean immediate = true; // Boolean | 
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.delete(id, apiKey, immediate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task being deleted |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **immediate** | **Boolean**|  | [optional] [default to true]

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTagsFromItem"></a>
# **deleteTagsFromItem**
> deleteTagsFromItem(id, tags, apiKey)

Delete Task Tags

Deletes all the supplied tags from the Task

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The ID of the Task
String tags = "tags_example"; // String | A comma separated list of tags
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.deleteTagsFromItem(id, tags, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#deleteTagsFromItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the Task |
 **tags** | **String**| A comma separated list of tags |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="find"></a>
# **find**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; find(q, parentId, limit, page, onlyEnabled)

Find Task matching search criteria

Finds a list of Tasks that match a specific search criteria. The search criteria is simply a string that is contained in the Task name. String case sensitivity is ignored.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String q = "q_example"; // String | The search string used to match the Task names. Default value is empty string, ie. will match everything.
Long parentId = -1L; // Long | This limits the search to the provided challenge and no tasks outside of the provided challenge ID.
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
Boolean onlyEnabled = true; // Boolean | Flag to set if only want to see Tasks from enabled Challenges returned. Default value is true.
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.find(q, parentId, limit, page, onlyEnabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#find");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| The search string used to match the Task names. Default value is empty string, ie. will match everything. | [optional]
 **parentId** | **Long**| This limits the search to the provided challenge and no tasks outside of the provided challenge ID. | [optional] [default to -1]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **onlyEnabled** | **Boolean**| Flag to set if only want to see Tasks from enabled Challenges returned. Default value is true. | [optional] [default to true]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemsBasedOnTags"></a>
# **getItemsBasedOnTags**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getItemsBasedOnTags(tags, limit, page)

Retrieve Tasks based on provided tags

Retrieves all the Tasks that contain at least one of the supplied tags.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String tags = "tags_example"; // String | A comma separated list of tags
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getItemsBasedOnTags(tags, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getItemsBasedOnTags");
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

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRandomTasks"></a>
# **getRandomTasks**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getRandomTasks(ps, cs, ct, tags, ts, limit, proximity)

Retrieves random Task

Retrieves a random Task based on the search criteria.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String ps = "ps_example"; // String | The search string to match the names of projects to limit the Task pool from. The string is case insensitive.
String cs = "cs_example"; // String | The search string to match the names of challenges to limit the Task pool from. The string is case insensitive.
String ct = "ct_example"; // String | The challenge tags to limit the parent challenges that will limit the Task pool.
String tags = "tags_example"; // String | A comma separated list of task tags. The search will only retrieve random tasks that contain those tags
String ts = "ts_example"; // String | The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive.
Integer limit = 1; // Integer | Limit the number of results returned in the response. Default value is 1.
Long proximity = -1L; // Long | Id of task that you wish to find the next task based on the proximity of that task
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getRandomTasks(ps, cs, ct, tags, ts, limit, proximity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getRandomTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ps** | **String**| The search string to match the names of projects to limit the Task pool from. The string is case insensitive. | [optional]
 **cs** | **String**| The search string to match the names of challenges to limit the Task pool from. The string is case insensitive. | [optional]
 **ct** | **String**| The challenge tags to limit the parent challenges that will limit the Task pool. | [optional]
 **tags** | **String**| A comma separated list of task tags. The search will only retrieve random tasks that contain those tags | [optional]
 **ts** | **String**| The task search string. Retrieve only tasks that contain the search string in the task name. Match is case insensitive. | [optional]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 1. | [optional] [default to 1]
 **proximity** | **Long**| Id of task that you wish to find the next task based on the proximity of that task | [optional] [default to -1]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagsForTask"></a>
# **getTagsForTask**
> List&lt;OrgMaprouletteFrameworkModelTag&gt; getTagsForTask(id)

Retrieve tags for Task

Retrieves all the Tags that have been added to the specified Task

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The ID of the Task
try {
    List<OrgMaprouletteFrameworkModelTag> result = apiInstance.getTagsForTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTagsForTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the Task |

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTag&gt;**](OrgMaprouletteFrameworkModelTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskClusters"></a>
# **getTaskClusters**
> getTaskClusters(points)

Retrieves task clusters. USE PUT METHOD

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Integer points = 100; // Integer | 
try {
    apiInstance.getTaskClusters(points);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTaskClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **points** | **Integer**|  | [optional] [default to 100]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTaskClusters_0"></a>
# **getTaskClusters_0**
> List&lt;OrgMaprouletteFrameworkModelTaskCluster&gt; getTaskClusters_0(points)

Retrieves task clusters.

Retrieves task clusters that contain the centroid location for a group of tasks

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Integer points = 100; // Integer | The number of clusters that you want returned
try {
    List<OrgMaprouletteFrameworkModelTaskCluster> result = apiInstance.getTaskClusters_0(points);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTaskClusters_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **points** | **Integer**| The number of clusters that you want returned | [optional] [default to 100]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTaskCluster&gt;**](OrgMaprouletteFrameworkModelTaskCluster.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskHistoryLog"></a>
# **getTaskHistoryLog**
> OrgMaprouletteFrameworkModelTask getTaskHistoryLog(id)

Retrieves a history for the task

Retrieves list of task history log entries. This includes comments, status actions, and review actions.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The id of the task
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.getTaskHistoryLog(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTaskHistoryLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the task |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTasksInBoundingBox"></a>
# **getTasksInBoundingBox**
> getTasksInBoundingBox(left, bottom, right, top, limit, page, excludeLocked, sort, order, includeTotal, includeGeometries, includeTags)

Retrieves Tasks within a bounding box

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Double left = 3.4D; // Double | 
Double bottom = 3.4D; // Double | 
Double right = 3.4D; // Double | 
Double top = 3.4D; // Double | 
Integer limit = 10000; // Integer | 
Integer page = 0; // Integer | 
Boolean excludeLocked = false; // Boolean | 
String sort = "sort_example"; // String | 
String order = "ASC"; // String | 
Boolean includeTotal = false; // Boolean | 
Boolean includeGeometries = false; // Boolean | 
Boolean includeTags = false; // Boolean | 
try {
    apiInstance.getTasksInBoundingBox(left, bottom, right, top, limit, page, excludeLocked, sort, order, includeTotal, includeGeometries, includeTags);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTasksInBoundingBox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **left** | **Double**|  |
 **bottom** | **Double**|  |
 **right** | **Double**|  |
 **top** | **Double**|  |
 **limit** | **Integer**|  | [optional] [default to 10000]
 **page** | **Integer**|  | [optional] [default to 0]
 **excludeLocked** | **Boolean**|  | [optional] [default to false]
 **sort** | **String**|  | [optional]
 **order** | **String**|  | [optional] [default to ASC]
 **includeTotal** | **Boolean**|  | [optional] [default to false]
 **includeGeometries** | **Boolean**|  | [optional] [default to false]
 **includeTags** | **Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTasksInBoundingBox_0"></a>
# **getTasksInBoundingBox_0**
> List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt; getTasksInBoundingBox_0(left, bottom, right, top, limit, page, excludeLocked, sort, order, includeTotal, includeGeometries, includeTags)

Retrieves Tasks within a bounding box

Retrieves tasks within a given bounding box.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Double left = 3.4D; // Double | The minimum latitude for the bounding box.
Double bottom = 3.4D; // Double | The minimum longitude for the bounding box.
Double right = 3.4D; // Double | The maximum latitude for the bounding box.
Double top = 3.4D; // Double | The maximum longitude for the bounding box.
Integer limit = 10000; // Integer | Limit the number of results returned in the response. Default value is 1.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
Boolean excludeLocked = false; // Boolean | Ignore the lock status of the task. So true will include all tasks, including ones locked by another user.
String sort = "sort_example"; // String | 
String order = "ASC"; // String | 
Boolean includeTotal = false; // Boolean | 
Boolean includeGeometries = false; // Boolean | Optional flag to have geometries data returned for each task.
Boolean includeTags = false; // Boolean | Optional flag to have tag data returned for each task.
try {
    List<OrgMaprouletteFrameworkModelClusteredPoint> result = apiInstance.getTasksInBoundingBox_0(left, bottom, right, top, limit, page, excludeLocked, sort, order, includeTotal, includeGeometries, includeTags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTasksInBoundingBox_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **left** | **Double**| The minimum latitude for the bounding box. |
 **bottom** | **Double**| The minimum longitude for the bounding box. |
 **right** | **Double**| The maximum latitude for the bounding box. |
 **top** | **Double**| The maximum longitude for the bounding box. |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 1. | [optional] [default to 10000]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]
 **excludeLocked** | **Boolean**| Ignore the lock status of the task. So true will include all tasks, including ones locked by another user. | [optional] [default to false]
 **sort** | **String**|  | [optional]
 **order** | **String**|  | [optional] [default to ASC]
 **includeTotal** | **Boolean**|  | [optional] [default to false]
 **includeGeometries** | **Boolean**| Optional flag to have geometries data returned for each task. | [optional] [default to false]
 **includeTags** | **Boolean**| Optional flag to have tag data returned for each task. | [optional] [default to false]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt;**](OrgMaprouletteFrameworkModelClusteredPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTasksInCluster"></a>
# **getTasksInCluster**
> List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt; getTasksInCluster(clusterId, id, points)

Retrieves tasks in a cluster

Retrieves tasks contained in a cluster retrieved from api /api/v2/challenge/:id/taskCluster

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Integer clusterId = 56; // Integer | The id of the single cluster.
Object id = null; // Object | The id of the parent project.
Integer points = 100; // Integer | The number of clusters that you want returned
try {
    List<OrgMaprouletteFrameworkModelClusteredPoint> result = apiInstance.getTasksInCluster(clusterId, id, points);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTasksInCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **Integer**| The id of the single cluster. |
 **id** | [**Object**](.md)| The id of the parent project. |
 **points** | **Integer**| The number of clusters that you want returned | [optional] [default to 100]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelClusteredPoint&gt;**](OrgMaprouletteFrameworkModelClusteredPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchToOSMChangeSet"></a>
# **matchToOSMChangeSet**
> OrgMaprouletteFrameworkModelTask matchToOSMChangeSet(id, apiKey)

Update Task Changeset

Will update the changeset of the task. It will do this by attempting to match the OSM changeset to the Task based on the geometry and the time that the changeset was executed.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The ID of the task
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.matchToOSMChangeSet(id, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#matchToOSMChangeSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the task |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="read"></a>
# **read**
> OrgMaprouletteFrameworkModelTask read(id)

Retrieves an already existing Task

Retrieves an already existing Task based on the supplied ID in the URL.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The id of the Task to retrieve
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task to retrieve |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readByName"></a>
# **readByName**
> OrgMaprouletteFrameworkModelTask readByName(id, name)

Retrieves an already existing Task

Retrieves an already existing Task based on the name of the Task rather than an ID

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The id of the parent Challenge of the Task
String name = "name_example"; // String | The name of the Task being retrieved
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.readByName(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#readByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the parent Challenge of the Task |
 **name** | **String**| The name of the Task being retrieved |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="refreshTaskLock"></a>
# **refreshTaskLock**
> OrgMaprouletteFrameworkModelTask refreshTaskLock(id)

Refresh an existing lock on a Task

Refreshes an existing lock, extending its allowed duration, on the task with the supplied ID. The requesting user must already own an active lock on the task (i.e. via the task/:id/start API) or a 403 will be raised

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The id of the Task on which the lock is to be refreshed
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.refreshTaskLock(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#refreshTaskLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task on which the lock is to be refreshed |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="releaseTask"></a>
# **releaseTask**
> OrgMaprouletteFrameworkModelTask releaseTask(id)

Release a Task (unlocks it)

Unlocks a Task based on the supplied ID in the URL.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The id of the Task to retrieve
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.releaseTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#releaseTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task to retrieve |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeReviewRequest"></a>
# **removeReviewRequest**
> removeReviewRequest(apiKey, ids, asMetaReview)

Changes review status to \&quot;Unnecessary\&quot; on tasks matching criteria

Will change review status on tasks that match the given search parameters indicating the tasks do not need a review.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String ids = "ids_example"; // String | 
Boolean asMetaReview = false; // Boolean | 
try {
    apiInstance.removeReviewRequest(apiKey, ids, asMetaReview);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#removeReviewRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **ids** | **String**|  | [optional]
 **asMetaReview** | **Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setBundleMetaReviewStatus"></a>
# **setBundleMetaReviewStatus**
> setBundleMetaReviewStatus(id, status, apiKey, comment, tags, errorTags)

Update Meta Review Status for a Bundle

Will update Tasks meta review status to one of the following. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The ID of the bundle
Integer status = 56; // Integer | The review status to update the meta review status to. Following status Integers can be used. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String comment = "comment_example"; // String | Any comment that is provided by the user when setting the review status
String tags = "tags_example"; // String | Optional tags to associate with this task
String errorTags = "errorTags_example"; // String | Optional string to provide error tags in the review history
try {
    apiInstance.setBundleMetaReviewStatus(id, status, apiKey, comment, tags, errorTags);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#setBundleMetaReviewStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the bundle |
 **status** | **Integer**| The review status to update the meta review status to. Following status Integers can be used. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **comment** | **String**| Any comment that is provided by the user when setting the review status | [optional]
 **tags** | **String**| Optional tags to associate with this task | [optional]
 **errorTags** | **String**| Optional string to provide error tags in the review history | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setBundleTaskReviewStatus"></a>
# **setBundleTaskReviewStatus**
> setBundleTaskReviewStatus(id, status, apiKey, comment, tags, newTaskStatus, errorTags)

Update Task Review Status for a Bundle

Will update a Tasks review status to one of the following. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The ID of the bundle
Integer status = 56; // Integer | The status to update the Task to. Following status Integers can be used. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String comment = "comment_example"; // String | Any comment that is provided by the user when setting the review status
String tags = "tags_example"; // String | Optional tags to associate with this task
String newTaskStatus = "newTaskStatus_example"; // String | Optional int taskStatus to change the task status on all tasks in this bundle to
String errorTags = "errorTags_example"; // String | Optional string to provide error tags in the review history
try {
    apiInstance.setBundleTaskReviewStatus(id, status, apiKey, comment, tags, newTaskStatus, errorTags);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#setBundleTaskReviewStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the bundle |
 **status** | **Integer**| The status to update the Task to. Following status Integers can be used. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **comment** | **String**| Any comment that is provided by the user when setting the review status | [optional]
 **tags** | **String**| Optional tags to associate with this task | [optional]
 **newTaskStatus** | **String**| Optional int taskStatus to change the task status on all tasks in this bundle to | [optional]
 **errorTags** | **String**| Optional string to provide error tags in the review history | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setBundleTaskStatus"></a>
# **setBundleTaskStatus**
> setBundleTaskStatus(bundleId, primaryId, status, apiKey, comment, tags, requestReview)

Update Bundle Task Status

Will update a Bundled list of Tasks statuses to one of the following. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long bundleId = 789L; // Long | The ID of the bundle
Long primaryId = 789L; // Long | The primary ID of the task for this bundle
Integer status = 56; // Integer | The status to update the Task too. Following status Integers can be used. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String comment = "comment_example"; // String | Any comment that is provided by the user when setting the status
String tags = "tags_example"; // String | Optional tags to associate with this task
Object requestReview = null; // Object | Boolean indicating if a review is requested on this task. (Will override user settings if provided)
try {
    apiInstance.setBundleTaskStatus(bundleId, primaryId, status, apiKey, comment, tags, requestReview);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#setBundleTaskStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleId** | **Long**| The ID of the bundle |
 **primaryId** | **Long**| The primary ID of the task for this bundle |
 **status** | **Integer**| The status to update the Task too. Following status Integers can be used. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **comment** | **String**| Any comment that is provided by the user when setting the status | [optional]
 **tags** | **String**| Optional tags to associate with this task | [optional]
 **requestReview** | [**Object**](.md)| Boolean indicating if a review is requested on this task. (Will override user settings if provided) | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setMetaReviewStatus"></a>
# **setMetaReviewStatus**
> setMetaReviewStatus(id, status, apiKey, comment, tags, errorTags)

Update Task Meta Review Status

Will update a Tasks meta review status to one of the following. 0 - (re)Requested, 1 - Approved, 2 - Rejected, 3 - Assisted

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The ID of the task
Integer status = 56; // Integer | Will update a Tasks meta review status to one of the following. 0 - (re)Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed, 5 - Unnecessary
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String comment = "comment_example"; // String | Any comment that is provided by the user when setting the meta review status
String tags = "tags_example"; // String | Optional tags to associate with this task
String errorTags = "errorTags_example"; // String | Optional string to provide reject tags in the review history
try {
    apiInstance.setMetaReviewStatus(id, status, apiKey, comment, tags, errorTags);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#setMetaReviewStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the task |
 **status** | **Integer**| Will update a Tasks meta review status to one of the following. 0 - (re)Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed, 5 - Unnecessary |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **comment** | **String**| Any comment that is provided by the user when setting the meta review status | [optional]
 **tags** | **String**| Optional tags to associate with this task | [optional]
 **errorTags** | **String**| Optional string to provide reject tags in the review history | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setTaskReviewStatus"></a>
# **setTaskReviewStatus**
> setTaskReviewStatus(id, status, apiKey, comment, tags, newTaskStatus, errorTags, asMetaReview)

Update Task Review Status

Will update a Tasks review status to one of the following. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The ID of the task
Integer status = 56; // Integer | Will update a Tasks review status to one of the following. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed, 5 - Unnecessary, 6 - Approved With Revisions
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String comment = "comment_example"; // String | Any comment that is provided by the user when setting the review status
String tags = "tags_example"; // String | Optional tags to associate with this task
String newTaskStatus = "newTaskStatus_example"; // String | Optional int taskStatus to change the task status on this task to
String errorTags = "errorTags_example"; // String | Optional string to provide error tags in the review history
Object asMetaReview = null; // Object | Optional boolean to indicate the meta review status should be set to unecessary
try {
    apiInstance.setTaskReviewStatus(id, status, apiKey, comment, tags, newTaskStatus, errorTags, asMetaReview);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#setTaskReviewStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the task |
 **status** | **Integer**| Will update a Tasks review status to one of the following. 0 - Requested, 1 - Approved, 2 - Rejected, 3 - Assisted, 4 - Disputed, 5 - Unnecessary, 6 - Approved With Revisions |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **comment** | **String**| Any comment that is provided by the user when setting the review status | [optional]
 **tags** | **String**| Optional tags to associate with this task | [optional]
 **newTaskStatus** | **String**| Optional int taskStatus to change the task status on this task to | [optional]
 **errorTags** | **String**| Optional string to provide error tags in the review history | [optional]
 **asMetaReview** | [**Object**](.md)| Optional boolean to indicate the meta review status should be set to unecessary | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setTaskStatus"></a>
# **setTaskStatus**
> setTaskStatus(id, status, apiKey, comment, tags, requestReview)

Update Task Status

Will update a Tasks status to one of the following. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The ID of the task
Integer status = 56; // Integer | The status to update the Task too. Following status Integers can be used. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String comment = "comment_example"; // String | Any comment that is provided by the user when setting the status
String tags = "tags_example"; // String | Optional tags to associate with this task
Object requestReview = null; // Object | Boolean indicating if a review is requested on this task. (Will override user settings if provided)
try {
    apiInstance.setTaskStatus(id, status, apiKey, comment, tags, requestReview);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#setTaskStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the task |
 **status** | **Integer**| The status to update the Task too. Following status Integers can be used. 0 - Created, 1 - Fixed, 2 - False Positive, 3 - Skipped, 4 - Deleted, 5 - Already Fixed, 6 - Too Hard |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **comment** | **String**| Any comment that is provided by the user when setting the status | [optional]
 **tags** | **String**| Optional tags to associate with this task | [optional]
 **requestReview** | [**Object**](.md)| Boolean indicating if a review is requested on this task. (Will override user settings if provided) | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="startOnTask"></a>
# **startOnTask**
> OrgMaprouletteFrameworkModelTask startOnTask(id)

Start working on a Task (locks it for the user)

Locks a Task based on the supplied ID in the URL.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The id of the Task to retrieve
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.startOnTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#startOnTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Task to retrieve |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> OrgMaprouletteFrameworkModelTask update(body, apiKey, id)

Updates a Task

Will update an already existing Task from the supplied JSON in the body.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
OrgMaprouletteFrameworkModelTask body = new OrgMaprouletteFrameworkModelTask(); // OrgMaprouletteFrameworkModelTask | The JSON structure for the Task body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long id = 789L; // Long | The ID of the Task that is being updated
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.update(body, apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)| The JSON structure for the Task body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **id** | **Long**| The ID of the Task that is being updated |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCompletionResponses"></a>
# **updateCompletionResponses**
> updateCompletionResponses(id, apiKey)

Update Completion Responses

Will update the completion responses on the Task.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The ID of the task
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.updateCompletionResponses(id, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#updateCompletionResponses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the task |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateItemTags"></a>
# **updateItemTags**
> updateItemTags(id, tags, apiKey)

Updates Task Tags

Updates the tags on the Task

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | The ID of the Task
String tags = "tags_example"; // String | A complete comma separated list of tags. If empty, then all tags will be removed.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.updateItemTags(id, tags, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#updateItemTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID of the Task |
 **tags** | **String**| A complete comma separated list of tags. If empty, then all tags will be removed. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

