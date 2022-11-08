# TagApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchUploadPost**](TagApi.md#batchUploadPost) | **POST** /tags | 
[**batchUploadPut**](TagApi.md#batchUploadPut) | **PUT** /tags | 
[**delete**](TagApi.md#delete) | **DELETE** /tag/{id} | 
[**getTags**](TagApi.md#getTags) | **GET** /tags | 
[**insert**](TagApi.md#insert) | **POST** /tag | 
[**retrieve**](TagApi.md#retrieve) | **GET** /tag/{id} | 
[**update**](TagApi.md#update) | **PUT** /tag/{id} | 

<a name="batchUploadPost"></a>
# **batchUploadPost**
> batchUploadPost()



### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TagApi;


TagApi apiInstance = new TagApi();
try {
    apiInstance.batchUploadPost();
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#batchUploadPost");
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



### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TagApi;


TagApi apiInstance = new TagApi();
try {
    apiInstance.batchUploadPut();
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#batchUploadPut");
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

<a name="delete"></a>
# **delete**
> delete(id)



### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TagApi;


TagApi apiInstance = new TagApi();
Long id = 789L; // Long | 
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#delete");
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

<a name="getTags"></a>
# **getTags**
> getTags(prefix, tagType, limit, page)



### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TagApi;


TagApi apiInstance = new TagApi();
String prefix = "prefix_example"; // String | 
String tagType = "tagType_example"; // String | 
Integer limit = 10; // Integer | 
Integer page = 0; // Integer | 
try {
    apiInstance.getTags(prefix, tagType, limit, page);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#getTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **String**|  | [optional]
 **tagType** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 10]
 **page** | **Integer**|  | [optional] [default to 0]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="insert"></a>
# **insert**
> insert()



### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TagApi;


TagApi apiInstance = new TagApi();
try {
    apiInstance.insert();
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#insert");
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

<a name="retrieve"></a>
# **retrieve**
> retrieve(id)



### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TagApi;


TagApi apiInstance = new TagApi();
Long id = 789L; // Long | 
try {
    apiInstance.retrieve(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#retrieve");
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
> update(id)



### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TagApi;


TagApi apiInstance = new TagApi();
Long id = 789L; // Long | 
try {
    apiInstance.update(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#update");
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

