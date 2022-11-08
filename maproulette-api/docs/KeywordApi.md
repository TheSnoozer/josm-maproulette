# KeywordApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchUploadPost**](KeywordApi.md#batchUploadPost) | **POST** /keywords | Create a batch of Keywords
[**batchUploadPut**](KeywordApi.md#batchUploadPut) | **PUT** /keywords | Update a batch of Keywords
[**delete**](KeywordApi.md#delete) | **DELETE** /keyword/{id} | Deletes an existing Keyword
[**getTags**](KeywordApi.md#getTags) | **GET** /keywords | Finds Keywords
[**insert**](KeywordApi.md#insert) | **POST** /keyword | Create a Keyword
[**retrieve**](KeywordApi.md#retrieve) | **GET** /keyword/{id} | Retrieves an already existing Keyword
[**update**](KeywordApi.md#update) | **PUT** /keyword/{id} | Updates a Keyword

<a name="batchUploadPost"></a>
# **batchUploadPost**
> batchUploadPost(body, apiKey)

Create a batch of Keywords

Will create multiple new Keyword from the JSONArray supplied in the body. Each JSON object is basically a Keyword object that is processed similarly to the singular /keyword POST. If Keywords already exist with the name, they will simply be skipped, ie. not updated.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.KeywordApi;


KeywordApi apiInstance = new KeywordApi();
List<Keyword> body = Arrays.asList(new Keyword()); // List<Keyword> | The JSON structure for the Keyword body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.batchUploadPost(body, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordApi#batchUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Keyword&gt;**](Keyword.md)| The JSON structure for the Keyword body. |
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

Update a batch of Keywords

Will update multiple already existing Keywords from the JSONArray supplied in the body. Each JSON object is basically a Keyword object that is processed similarly to the singular /keyword POST. If a Keyword does not exist it will be created from scratch

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.KeywordApi;


KeywordApi apiInstance = new KeywordApi();
List<Keyword> body = Arrays.asList(new Keyword()); // List<Keyword> | The JSON structure for the Keyword body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.batchUploadPut(body, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordApi#batchUploadPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Keyword&gt;**](Keyword.md)| The JSON structure for the Keyword body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> OrgMaprouletteExceptionStatusMessage delete(id, apiKey)

Deletes an existing Keyword

Deletes an existing Keyword based on the supplied ID.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.KeywordApi;


KeywordApi apiInstance = new KeywordApi();
Long id = 789L; // Long | The id of the Keyword being deleted
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.delete(id, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Keyword being deleted |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTags"></a>
# **getTags**
> List&lt;Keyword&gt; getTags(prefix, tagType, limit, page)

Finds Keywords

Retrieves existing Keywords based on a prefix for the Keyword. So if search for \&quot;tes\&quot; will retrieve all Keywords that start with \&quot;tes\&quot;, like \&quot;tester\&quot;, \&quot;testing\&quot;, \&quot;test\&quot;. The search string is case insensitive.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.KeywordApi;


KeywordApi apiInstance = new KeywordApi();
String prefix = "prefix_example"; // String | The prefix for the Keywords you are looking for
String tagType = "tagType_example"; // String | Optional limit tags to a specific tagType ('challenges' or 'tasks')
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<Keyword> result = apiInstance.getTags(prefix, tagType, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordApi#getTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **String**| The prefix for the Keywords you are looking for | [optional]
 **tagType** | **String**| Optional limit tags to a specific tagType (&#x27;challenges&#x27; or &#x27;tasks&#x27;) | [optional]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;Keyword&gt;**](Keyword.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="insert"></a>
# **insert**
> Keyword insert(body, apiKey)

Create a Keyword

Will create a new Keyword from the supplied JSON in the body. When creating the Task, leave the ID field out of the body json, if updating (generally use the PUT method) include the ID field.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.KeywordApi;


KeywordApi apiInstance = new KeywordApi();
Keyword body = new Keyword(); // Keyword | The JSON structure for the Keyword body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    Keyword result = apiInstance.insert(body, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordApi#insert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Keyword**](Keyword.md)| The JSON structure for the Keyword body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**Keyword**](Keyword.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieve"></a>
# **retrieve**
> Keyword retrieve(id)

Retrieves an already existing Keyword

Retrieves an already existing Keyword based on the supplied ID in the URL.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.KeywordApi;


KeywordApi apiInstance = new KeywordApi();
Long id = 789L; // Long | The id of the Keyword to retrieve
try {
    Keyword result = apiInstance.retrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordApi#retrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the Keyword to retrieve |

### Return type

[**Keyword**](Keyword.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update"></a>
# **update**
> Keyword update(body, apiKey, id)

Updates a Keyword

Will update an already existing Keyword from the supplied JSON in the body.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.KeywordApi;


KeywordApi apiInstance = new KeywordApi();
Keyword body = new Keyword(); // Keyword | The JSON structure for the Keyword body.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long id = 789L; // Long | The ID of the Keyword that is being updated
try {
    Keyword result = apiInstance.update(body, apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Keyword**](Keyword.md)| The JSON structure for the Keyword body. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **id** | **Long**| The ID of the Keyword that is being updated |

### Return type

[**Keyword**](Keyword.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

