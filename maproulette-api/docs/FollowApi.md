# FollowApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**block**](FollowApi.md#block) | **POST** /user/{userId}/block | Block a follower
[**follow**](FollowApi.md#follow) | **POST** /user/{userId}/follow | Follow a user
[**followedBy**](FollowApi.md#followedBy) | **GET** /user/{userId}/following | Get users being followed by a user
[**followersOf**](FollowApi.md#followersOf) | **GET** /user/{userId}/followers | Get users following a user
[**unblock**](FollowApi.md#unblock) | **DELETE** /user/{userId}/block | Stop blocking a follower
[**unfollow**](FollowApi.md#unfollow) | **DELETE** /user/{userId}/follow | Stop following a user

<a name="block"></a>
# **block**
> OrgMaprouletteFrameworkModelUser block(userId)

Block a follower

Prevent a user from following this user

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.FollowApi;


FollowApi apiInstance = new FollowApi();
Long userId = 789L; // Long | The id of the user to block
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.block(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FollowApi#block");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to block |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="follow"></a>
# **follow**
> OrgMaprouletteFrameworkModelUser follow(userId)

Follow a user

Begin following a user&#x27;s MapRoulette activity

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.FollowApi;


FollowApi apiInstance = new FollowApi();
Long userId = 789L; // Long | The id of the user to follow
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.follow(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FollowApi#follow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to follow |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="followedBy"></a>
# **followedBy**
> OrgMaprouletteFrameworkModelUser followedBy(userId)

Get users being followed by a user

Get users being followed by a user

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.FollowApi;


FollowApi apiInstance = new FollowApi();
Long userId = 789L; // Long | The id of the follower
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.followedBy(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FollowApi#followedBy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the follower |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="followersOf"></a>
# **followersOf**
> OrgMaprouletteFrameworkModelUser followersOf(userId)

Get users following a user

Get users following a user

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.FollowApi;


FollowApi apiInstance = new FollowApi();
Long userId = 789L; // Long | The id of the user being followed
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.followersOf(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FollowApi#followersOf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user being followed |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unblock"></a>
# **unblock**
> OrgMaprouletteFrameworkModelUser unblock(userId)

Stop blocking a follower

Remove block preventing a user from following this user

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.FollowApi;


FollowApi apiInstance = new FollowApi();
Long userId = 789L; // Long | The id of the user to stop blocking
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.unblock(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FollowApi#unblock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to stop blocking |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unfollow"></a>
# **unfollow**
> OrgMaprouletteFrameworkModelUser unfollow(userId)

Stop following a user

Stop following a user&#x27;s MapRoulette activity

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.FollowApi;


FollowApi apiInstance = new FollowApi();
Long userId = 789L; // Long | The id of the user to stop following
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.unfollow(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FollowApi#unfollow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to stop following |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

