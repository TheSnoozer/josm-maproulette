# ReviewApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelTaskReview**](ReviewApi.md#cancelTaskReview) | **GET** /task/{id}/review/cancel | Cancels a claim on a task for review
[**extractMapperMetrics**](ReviewApi.md#extractMapperMetrics) | **GET** /tasks/review/mappers/export | Retrieve a summary of review coverage for mappers
[**extractMetaReviewCoverage**](ReviewApi.md#extractMetaReviewCoverage) | **GET** /tasks/metareview/reviewers/export | Retrieve a summary of meta-review coverage for reviewers
[**getNearbyReviewTasks**](ReviewApi.md#getNearbyReviewTasks) | **GET** /tasks/review/nearby/{proximityId} | Retrieves nearby Tasks
[**getReviewMetrics**](ReviewApi.md#getReviewMetrics) | **GET** /tasks/review/metrics | Retrieves tasks that need review
[**getReviewRequestedTasks**](ReviewApi.md#getReviewRequestedTasks) | **GET** /tasks/review | Retrieves tasks that need review
[**getReviewTagMetrics**](ReviewApi.md#getReviewTagMetrics) | **GET** /tasks/review/tag/metrics | Retrieves metrics grouped by tag
[**getReviewTaskClusters**](ReviewApi.md#getReviewTaskClusters) | **GET** /taskCluster/review | Retrieves task review clusters
[**getReviewedTasks**](ReviewApi.md#getReviewedTasks) | **GET** /tasks/reviewed | Retrieves reviewed tasks that have been reviewed either by this user or where the user requested the review.
[**nextTaskReview**](ReviewApi.md#nextTaskReview) | **GET** /tasks/review/next | Retrieves and claims a the next review needed Task
[**startTaskReview**](ReviewApi.md#startTaskReview) | **GET** /task/{id}/review/start | Retrieves and claims a review needed Task

<a name="cancelTaskReview"></a>
# **cancelTaskReview**
> OrgMaprouletteFrameworkModelTask cancelTaskReview(id)

Cancels a claim on a task for review

Cancels a claim on a task for review

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Long id = 789L; // Long | The id of the task to cancel claim on
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.cancelTaskReview(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#cancelTaskReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the task to cancel claim on |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extractMapperMetrics"></a>
# **extractMapperMetrics**
> extractMapperMetrics(onlySaved, mappers, reviewers, priorities, startDate, endDate)

Retrieve a summary of review coverage for mappers

This will retrieve a summary of review coverage for each mapper and respond with a csv

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Boolean onlySaved = false; // Boolean | Only show challenges that have been saved.
Object mappers = null; // Object | the mapper ids to search by (review_requested_by)
Object reviewers = null; // Object | the reviewer ids to search by (reviewed_by)
Object priorities = null; // Object | the priorities to search by
Object startDate = null; // Object | Whether results should be tasks that have been reviewed after this date (format 'YYYY-MM-DD')
Object endDate = null; // Object | Whether results should be tasks that have been reviewed before this date (format 'YYYY-MM-DD')
try {
    apiInstance.extractMapperMetrics(onlySaved, mappers, reviewers, priorities, startDate, endDate);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#extractMapperMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **onlySaved** | **Boolean**| Only show challenges that have been saved. | [optional] [default to false]
 **mappers** | [**Object**](.md)| the mapper ids to search by (review_requested_by) | [optional]
 **reviewers** | [**Object**](.md)| the reviewer ids to search by (reviewed_by) | [optional]
 **priorities** | [**Object**](.md)| the priorities to search by | [optional]
 **startDate** | [**Object**](.md)| Whether results should be tasks that have been reviewed after this date (format &#x27;YYYY-MM-DD&#x27;) | [optional]
 **endDate** | [**Object**](.md)| Whether results should be tasks that have been reviewed before this date (format &#x27;YYYY-MM-DD&#x27;) | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="extractMetaReviewCoverage"></a>
# **extractMetaReviewCoverage**
> extractMetaReviewCoverage(onlySaved, reviewers, priorities, startDate, endDate)

Retrieve a summary of meta-review coverage for reviewers

This will retrieve a summary of meta-review coverage for each reviewer and respond with a csv

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Boolean onlySaved = false; // Boolean | Only show challenges that have been saved.
Object reviewers = null; // Object | the reviewer ids to search by (reviewed_by)
Object priorities = null; // Object | the priorities to search by
Object startDate = null; // Object | Whether results should be tasks that have been reviewed after this date (format 'YYYY-MM-DD')
Object endDate = null; // Object | Whether results should be tasks that have been reviewed before this date (format 'YYYY-MM-DD')
try {
    apiInstance.extractMetaReviewCoverage(onlySaved, reviewers, priorities, startDate, endDate);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#extractMetaReviewCoverage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **onlySaved** | **Boolean**| Only show challenges that have been saved. | [optional] [default to false]
 **reviewers** | [**Object**](.md)| the reviewer ids to search by (reviewed_by) | [optional]
 **priorities** | [**Object**](.md)| the priorities to search by | [optional]
 **startDate** | [**Object**](.md)| Whether results should be tasks that have been reviewed after this date (format &#x27;YYYY-MM-DD&#x27;) | [optional]
 **endDate** | [**Object**](.md)| Whether results should be tasks that have been reviewed before this date (format &#x27;YYYY-MM-DD&#x27;) | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getNearbyReviewTasks"></a>
# **getNearbyReviewTasks**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getNearbyReviewTasks(proximityId, limit, excludeOtherReviewers, onlySaved, proximity)

Retrieves nearby Tasks

Retrieves review tasks geographically closest to the specified task within the given filters

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Long proximityId = 789L; // Long | 
Integer limit = 5; // Integer | Limit the number of results returned in the response. Default value is 5.
Boolean excludeOtherReviewers = false; // Boolean | exclude tasks that have been reviewed by someone else
Boolean onlySaved = false; // Boolean | Only show challenges that have been saved.
Object proximity = null; // Object | Id of task around which geographically closest tasks are desired
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getNearbyReviewTasks(proximityId, limit, excludeOtherReviewers, onlySaved, proximity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#getNearbyReviewTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proximityId** | **Long**|  |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 5. | [optional] [default to 5]
 **excludeOtherReviewers** | **Boolean**| exclude tasks that have been reviewed by someone else | [optional] [default to false]
 **onlySaved** | **Boolean**| Only show challenges that have been saved. | [optional] [default to false]
 **proximity** | [**Object**](.md)| Id of task around which geographically closest tasks are desired | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReviewMetrics"></a>
# **getReviewMetrics**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getReviewMetrics(reviewTasksType, onlySaved, excludeOtherReviewers, includeByPriority, includeByTaskStatus, mappers, reviewers, priorities, startDate, endDate)

Retrieves tasks that need review

Retrieves list of Tasks and total count

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Integer reviewTasksType = 56; // Integer | integer value > 1 - To Be Reviewed 2 - User's reviewed Tasks 3 - All reviewed by users
Boolean onlySaved = false; // Boolean | Only show challenges that have been saved.
Boolean excludeOtherReviewers = false; // Boolean | exclude tasks that have been reviewed by someone else
Boolean includeByPriority = false; // Boolean | Also include a breakdown of review status by priority
Boolean includeByTaskStatus = false; // Boolean | Also include a breakdown of review status by task status
Object mappers = null; // Object | the mapper ids to search by (review_requested_by)
Object reviewers = null; // Object | the reviewer ids to search by (reviewed_by)
Object priorities = null; // Object | the priorities to search by
Object startDate = null; // Object | Whether results should be tasks that have been reviewed after this date (format 'YYYY-MM-DD')
Object endDate = null; // Object | Whether results should be tasks that have been reviewed before this date (format 'YYYY-MM-DD')
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getReviewMetrics(reviewTasksType, onlySaved, excludeOtherReviewers, includeByPriority, includeByTaskStatus, mappers, reviewers, priorities, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#getReviewMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewTasksType** | **Integer**| integer value &gt; 1 - To Be Reviewed 2 - User&#x27;s reviewed Tasks 3 - All reviewed by users |
 **onlySaved** | **Boolean**| Only show challenges that have been saved. | [optional] [default to false]
 **excludeOtherReviewers** | **Boolean**| exclude tasks that have been reviewed by someone else | [optional] [default to false]
 **includeByPriority** | **Boolean**| Also include a breakdown of review status by priority | [optional] [default to false]
 **includeByTaskStatus** | **Boolean**| Also include a breakdown of review status by task status | [optional] [default to false]
 **mappers** | [**Object**](.md)| the mapper ids to search by (review_requested_by) | [optional]
 **reviewers** | [**Object**](.md)| the reviewer ids to search by (reviewed_by) | [optional]
 **priorities** | [**Object**](.md)| the priorities to search by | [optional]
 **startDate** | [**Object**](.md)| Whether results should be tasks that have been reviewed after this date (format &#x27;YYYY-MM-DD&#x27;) | [optional]
 **endDate** | [**Object**](.md)| Whether results should be tasks that have been reviewed before this date (format &#x27;YYYY-MM-DD&#x27;) | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReviewRequestedTasks"></a>
# **getReviewRequestedTasks**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getReviewRequestedTasks(onlySaved, limit, page, sort, order, excludeOtherReviewers, includeTags, startDate, endDate, cs, o)

Retrieves tasks that need review

Retrieves list of Tasks and total count

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Boolean onlySaved = false; // Boolean | Only show challenges that have been saved.
Integer limit = -1; // Integer | Limit the number of results returned in the response. Default value is -1 (all).
Integer page = 0; // Integer | 
String sort = "sort_example"; // String | Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted.
String order = "ASC"; // String | Sort order direction. Either ASC or DESC. Default is \"ASC\" (ascending)
Boolean excludeOtherReviewers = false; // Boolean | exclude tasks that have been reviewed by someone else
Boolean includeTags = false; // Boolean | In response include list of tags for each task
Object startDate = null; // Object | Whether results should be tasks that have been reviewed after this date (format 'YYYY-MM-DD')
Object endDate = null; // Object | Whether results should be tasks that have been reviewed before this date (format 'YYYY-MM-DD')
Object cs = null; // Object | The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges.
Object o = null; // Object | The search string used to match the name of the person requesting the review. (review_requested_by)
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getReviewRequestedTasks(onlySaved, limit, page, sort, order, excludeOtherReviewers, includeTags, startDate, endDate, cs, o);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#getReviewRequestedTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **onlySaved** | **Boolean**| Only show challenges that have been saved. | [optional] [default to false]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is -1 (all). | [optional] [default to -1]
 **page** | **Integer**|  | [optional] [default to 0]
 **sort** | **String**| Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted. | [optional]
 **order** | **String**| Sort order direction. Either ASC or DESC. Default is \&quot;ASC\&quot; (ascending) | [optional] [default to ASC]
 **excludeOtherReviewers** | **Boolean**| exclude tasks that have been reviewed by someone else | [optional] [default to false]
 **includeTags** | **Boolean**| In response include list of tags for each task | [optional] [default to false]
 **startDate** | [**Object**](.md)| Whether results should be tasks that have been reviewed after this date (format &#x27;YYYY-MM-DD&#x27;) | [optional]
 **endDate** | [**Object**](.md)| Whether results should be tasks that have been reviewed before this date (format &#x27;YYYY-MM-DD&#x27;) | [optional]
 **cs** | [**Object**](.md)| The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges. | [optional]
 **o** | [**Object**](.md)| The search string used to match the name of the person requesting the review. (review_requested_by) | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReviewTagMetrics"></a>
# **getReviewTagMetrics**
> List&lt;OrgMaprouletteFrameworkModelReviewMetrics&gt; getReviewTagMetrics(reviewTasksType, onlySaved, excludeOtherReviewers)

Retrieves metrics grouped by tag

Retrieves list of Tasks and total count

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Integer reviewTasksType = 56; // Integer | integer value > 1 - To Be Reviewed 2 - User's reviewed Tasks 3 - All reviewed by users
Boolean onlySaved = false; // Boolean | Only show challenges that have been saved.
Boolean excludeOtherReviewers = false; // Boolean | exclude tasks that have been reviewed by someone else
try {
    List<OrgMaprouletteFrameworkModelReviewMetrics> result = apiInstance.getReviewTagMetrics(reviewTasksType, onlySaved, excludeOtherReviewers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#getReviewTagMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewTasksType** | **Integer**| integer value &gt; 1 - To Be Reviewed 2 - User&#x27;s reviewed Tasks 3 - All reviewed by users |
 **onlySaved** | **Boolean**| Only show challenges that have been saved. | [optional] [default to false]
 **excludeOtherReviewers** | **Boolean**| exclude tasks that have been reviewed by someone else | [optional] [default to false]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelReviewMetrics&gt;**](OrgMaprouletteFrameworkModelReviewMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReviewTaskClusters"></a>
# **getReviewTaskClusters**
> List&lt;OrgMaprouletteFrameworkModelTaskCluster&gt; getReviewTaskClusters(reviewTasksType, points, onlySaved, excludeOtherReviewers, startDate, endDate)

Retrieves task review clusters

Retrieves task clusters that contain the centroid location for a group of review tasks

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Integer reviewTasksType = 56; // Integer | integer value > 1 - To Be Reviewed 2 - User's reviewed Tasks 3 - All reviewed by users
Integer points = 100; // Integer | The number of clusters that you want returned
Boolean onlySaved = false; // Boolean | Only show challenges that have been saved.
Boolean excludeOtherReviewers = false; // Boolean | exclude tasks that have been reviewed by someone else
Object startDate = null; // Object | The start date to search within
Object endDate = null; // Object | The end date to search within
try {
    List<OrgMaprouletteFrameworkModelTaskCluster> result = apiInstance.getReviewTaskClusters(reviewTasksType, points, onlySaved, excludeOtherReviewers, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#getReviewTaskClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewTasksType** | **Integer**| integer value &gt; 1 - To Be Reviewed 2 - User&#x27;s reviewed Tasks 3 - All reviewed by users |
 **points** | **Integer**| The number of clusters that you want returned | [optional] [default to 100]
 **onlySaved** | **Boolean**| Only show challenges that have been saved. | [optional] [default to false]
 **excludeOtherReviewers** | **Boolean**| exclude tasks that have been reviewed by someone else | [optional] [default to false]
 **startDate** | [**Object**](.md)| The start date to search within | [optional]
 **endDate** | [**Object**](.md)| The end date to search within | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTaskCluster&gt;**](OrgMaprouletteFrameworkModelTaskCluster.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReviewedTasks"></a>
# **getReviewedTasks**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getReviewedTasks(allowReviewNeeded, limit, page, sort, order, includeTags, asMetaReview, startDate, endDate, mappers, reviewers, cs, o, r)

Retrieves reviewed tasks that have been reviewed either by this user or where the user requested the review.

Retrieves list of Tasks

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Boolean allowReviewNeeded = false; // Boolean | 
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is -1 (all).
Integer page = 0; // Integer | 
String sort = "sort_example"; // String | Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted.
String order = "ASC"; // String | Sort order direction. Either ASC or DESC. Default is \"ASC\" (ascending)
Boolean includeTags = false; // Boolean | In response include list of tags for each task
Boolean asMetaReview = false; // Boolean | Limit response to include tasks ready for meta review (already review approved/assisted)
Object startDate = null; // Object | Whether results should be tasks that have been reviewed after this date (format 'YYYY-MM-DD')
Object endDate = null; // Object | Whether results should be tasks that have been reviewed before this date (format 'YYYY-MM-DD')
Object mappers = null; // Object | The mapper ids to search by. (review_requested_by)
Object reviewers = null; // Object | Whether results should be included tasks in tasks 'review requested'
Object cs = null; // Object | The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges.
Object o = null; // Object | The search string used to match the name of the person requesting the review. (review_requested_by)
Object r = null; // Object | The search string used to match the Reviewer names. (reviewed_by)
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getReviewedTasks(allowReviewNeeded, limit, page, sort, order, includeTags, asMetaReview, startDate, endDate, mappers, reviewers, cs, o, r);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#getReviewedTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowReviewNeeded** | **Boolean**|  | [optional] [default to false]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is -1 (all). | [optional] [default to 10]
 **page** | **Integer**|  | [optional] [default to 0]
 **sort** | **String**| Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted. | [optional]
 **order** | **String**| Sort order direction. Either ASC or DESC. Default is \&quot;ASC\&quot; (ascending) | [optional] [default to ASC]
 **includeTags** | **Boolean**| In response include list of tags for each task | [optional] [default to false]
 **asMetaReview** | **Boolean**| Limit response to include tasks ready for meta review (already review approved/assisted) | [optional] [default to false]
 **startDate** | [**Object**](.md)| Whether results should be tasks that have been reviewed after this date (format &#x27;YYYY-MM-DD&#x27;) | [optional]
 **endDate** | [**Object**](.md)| Whether results should be tasks that have been reviewed before this date (format &#x27;YYYY-MM-DD&#x27;) | [optional]
 **mappers** | [**Object**](.md)| The mapper ids to search by. (review_requested_by) | [optional]
 **reviewers** | [**Object**](.md)| Whether results should be included tasks in tasks &#x27;review requested&#x27; | [optional]
 **cs** | [**Object**](.md)| The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges. | [optional]
 **o** | [**Object**](.md)| The search string used to match the name of the person requesting the review. (review_requested_by) | [optional]
 **r** | [**Object**](.md)| The search string used to match the Reviewer names. (reviewed_by) | [optional]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nextTaskReview"></a>
# **nextTaskReview**
> OrgMaprouletteFrameworkModelTask nextTaskReview(onlySaved, sort, order, lastTaskId, excludeOtherReviewers, asMetaReview, cs, o, r)

Retrieves and claims a the next review needed Task

Retrieves the next Task (given the search parameters) and claims that task for review

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Boolean onlySaved = false; // Boolean | Only show challenges that have been saved.
String sort = "sort_example"; // String | Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted.
String order = "ASC"; // String | Sort order direction. Either ASC or DESC. Default is \"ASC\" (ascending)
Long lastTaskId = -1L; // Long | Fetch the next task after the lastTaskId. (so if you want to 'skip' a task you can get the next one)
Boolean excludeOtherReviewers = false; // Boolean | exclude tasks that have been reviewed by someone else
Boolean asMetaReview = false; // Boolean | Fetch the next task for a meta review.
Object cs = null; // Object | The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges.
Object o = null; // Object | The search string used to match the name of the person requesting the review. (review_requested_by)
Object r = null; // Object | The search string used to match the Reviewer names. (reviewed_by)
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.nextTaskReview(onlySaved, sort, order, lastTaskId, excludeOtherReviewers, asMetaReview, cs, o, r);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#nextTaskReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **onlySaved** | **Boolean**| Only show challenges that have been saved. | [optional] [default to false]
 **sort** | **String**| Sorts the results retuned in the response. Parameter is optional, if not provided then results will not be sorted. | [optional]
 **order** | **String**| Sort order direction. Either ASC or DESC. Default is \&quot;ASC\&quot; (ascending) | [optional] [default to ASC]
 **lastTaskId** | **Long**| Fetch the next task after the lastTaskId. (so if you want to &#x27;skip&#x27; a task you can get the next one) | [optional] [default to -1]
 **excludeOtherReviewers** | **Boolean**| exclude tasks that have been reviewed by someone else | [optional] [default to false]
 **asMetaReview** | **Boolean**| Fetch the next task for a meta review. | [optional] [default to false]
 **cs** | [**Object**](.md)| The search string used to match the Challenge names. Default value is empty string, ie. will match all challenges. | [optional]
 **o** | [**Object**](.md)| The search string used to match the name of the person requesting the review. (review_requested_by) | [optional]
 **r** | [**Object**](.md)| The search string used to match the Reviewer names. (reviewed_by) | [optional]

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startTaskReview"></a>
# **startTaskReview**
> OrgMaprouletteFrameworkModelTask startTaskReview(id)

Retrieves and claims a review needed Task

Retrieves a Task and claims that task for review

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
Long id = 789L; // Long | The id of the task to fetch and claim
try {
    OrgMaprouletteFrameworkModelTask result = apiInstance.startTaskReview(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#startTaskReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the task to fetch and claim |

### Return type

[**OrgMaprouletteFrameworkModelTask**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

