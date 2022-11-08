# CommentApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](CommentApi.md#add) | **POST** /task/{id}/comment | Adds comment to Task
[**addChallengeComment**](CommentApi.md#addChallengeComment) | **POST** /challenge/{id}/comment | Adds comment to Challenge
[**addToBundleTasks**](CommentApi.md#addToBundleTasks) | **POST** /taskBundle/{id}/comment | Adds comment to each Task in a Task Bundle
[**delete**](CommentApi.md#delete) | **DELETE** /task/{id}/comment/{commentId} | Deletes comment from Task
[**find**](CommentApi.md#find) | **GET** /task/{id}/comments | Retrieves comments for a Task
[**findChallengeComments**](CommentApi.md#findChallengeComments) | **GET** /challenge/{id}/challengeComments | Retrieves comments for a Challenge
[**retrieve**](CommentApi.md#retrieve) | **GET** /comment/{id} | Retrieves a comment
[**update**](CommentApi.md#update) | **PUT** /comment/{commentId} | Update comment on Task

<a name="add"></a>
# **add**
> OrgMaprouletteFrameworkModelComment add(id, comment, actionId)

Adds comment to Task

Adds a comment to a Task

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Long id = 789L; // Long | The ID for the Task
String comment = "comment_example"; // String | A URLEncoded comment for the Task
Long actionId = 789L; // Long | An optional action ID that may be associated with the comment
try {
    OrgMaprouletteFrameworkModelComment result = apiInstance.add(id, comment, actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the Task |
 **comment** | **String**| A URLEncoded comment for the Task |
 **actionId** | **Long**| An optional action ID that may be associated with the comment | [optional]

### Return type

[**OrgMaprouletteFrameworkModelComment**](OrgMaprouletteFrameworkModelComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addChallengeComment"></a>
# **addChallengeComment**
> OrgMaprouletteFrameworkModelChallengeComment addChallengeComment(id, comment)

Adds comment to Challenge

Adds a comment to a Task

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Long id = 789L; // Long | The ID for the Challenge
String comment = "comment_example"; // String | A URLEncoded comment for the Challenge
try {
    OrgMaprouletteFrameworkModelChallengeComment result = apiInstance.addChallengeComment(id, comment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#addChallengeComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the Challenge |
 **comment** | **String**| A URLEncoded comment for the Challenge |

### Return type

[**OrgMaprouletteFrameworkModelChallengeComment**](OrgMaprouletteFrameworkModelChallengeComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addToBundleTasks"></a>
# **addToBundleTasks**
> TaskBundle addToBundleTasks(id, comment, actionId)

Adds comment to each Task in a Task Bundle

Adds a comment to each Task in Bundle

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Long id = 789L; // Long | The ID for the bundle
String comment = "comment_example"; // String | A URLEncoded comment for the Task
Long actionId = 789L; // Long | An optional action ID that may be associated with the comment
try {
    TaskBundle result = apiInstance.addToBundleTasks(id, comment, actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#addToBundleTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the bundle |
 **comment** | **String**| A URLEncoded comment for the Task |
 **actionId** | **Long**| An optional action ID that may be associated with the comment | [optional]

### Return type

[**TaskBundle**](TaskBundle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> delete(id, commentId)

Deletes comment from Task

Deletes a comment from the specific Task

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Long id = 789L; // Long | The ID for the Task
Long commentId = 789L; // Long | The ID for the Comment
try {
    apiInstance.delete(id, commentId);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the Task |
 **commentId** | **Long**| The ID for the Comment |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="find"></a>
# **find**
> List&lt;OrgMaprouletteFrameworkModelComment&gt; find(id)

Retrieves comments for a Task

Retrieves all the comments for a specific Task

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Long id = 789L; // Long | The ID for the Task
try {
    List<OrgMaprouletteFrameworkModelComment> result = apiInstance.find(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#find");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the Task |

### Return type

[**List&lt;OrgMaprouletteFrameworkModelComment&gt;**](OrgMaprouletteFrameworkModelComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findChallengeComments"></a>
# **findChallengeComments**
> List&lt;OrgMaprouletteFrameworkModelChallengeComment&gt; findChallengeComments(id)

Retrieves comments for a Challenge

Retrieves all the challenge comments for a specific Challenge

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Long id = 789L; // Long | The ID for the Challenge
try {
    List<OrgMaprouletteFrameworkModelChallengeComment> result = apiInstance.findChallengeComments(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#findChallengeComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the Challenge |

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallengeComment&gt;**](OrgMaprouletteFrameworkModelChallengeComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieve"></a>
# **retrieve**
> OrgMaprouletteFrameworkModelComment retrieve(id)

Retrieves a comment

Retrieves a comment based on a specific ID.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Long id = 789L; // Long | The ID for the comment
try {
    OrgMaprouletteFrameworkModelComment result = apiInstance.retrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#retrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the comment |

### Return type

[**OrgMaprouletteFrameworkModelComment**](OrgMaprouletteFrameworkModelComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> OrgMaprouletteFrameworkModelComment update(commentId, comment)

Update comment on Task

Updates an existing comment on a Task. Only the original user who made the comment or a SuperUser can update the comment

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
Long commentId = 789L; // Long | The ID of the original comment
String comment = "comment_example"; // String | A URLEncoded comment for the Task
try {
    OrgMaprouletteFrameworkModelComment result = apiInstance.update(commentId, comment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **Long**| The ID of the original comment |
 **comment** | **String**| A URLEncoded comment for the Task |

### Return type

[**OrgMaprouletteFrameworkModelComment**](OrgMaprouletteFrameworkModelComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

