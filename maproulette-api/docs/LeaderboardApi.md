# LeaderboardApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLeaderboardForUser**](LeaderboardApi.md#getLeaderboardForUser) | **GET** /data/user/{userId}/leaderboard | Fetches leaderboard stats with ranking for the user
[**getMapperLeaderboard**](LeaderboardApi.md#getMapperLeaderboard) | **GET** /data/user/leaderboard | Fetches the mapper leaderboard stats
[**getReviewerLeaderboard**](LeaderboardApi.md#getReviewerLeaderboard) | **GET** /data/reviewer/leaderboard | Fetches the reviewer leaderboard stats
[**getUserTopChallenges**](LeaderboardApi.md#getUserTopChallenges) | **GET** /data/user/{userId}/topChallenges | Gets the top challenges worked on by the user

<a name="getLeaderboardForUser"></a>
# **getLeaderboardForUser**
> getLeaderboardForUser(userId, bracket, projectIds, challengeIds, countryCodes, monthDuration, start, end, onlyEnabled)

Fetches leaderboard stats with ranking for the user

Fetches user&#x27;s current ranking and stats in the leaderboard along with a number of mappers above and below in the rankings.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.LeaderboardApi;


LeaderboardApi apiInstance = new LeaderboardApi();
Long userId = 789L; // Long | User id to fetch ranking for.
Integer bracket = 0; // Integer | How many results before and after the found user to return
Object projectIds = null; // Object | The optional project ids to search by
Object challengeIds = null; // Object | The optional challenge ids to search by
Object countryCodes = null; // Object | The optional country codes to search by
Object monthDuration = null; // Object | The optional number of past months to search by (with 0 as current month and -1 as all time)
Object start = null; // Object | The optional start date when not using monthDuration
Object end = null; // Object | The optional end date when not using monthDuration
Object onlyEnabled = null; // Object | Limit search to only enabled challenges
try {
    apiInstance.getLeaderboardForUser(userId, bracket, projectIds, challengeIds, countryCodes, monthDuration, start, end, onlyEnabled);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaderboardApi#getLeaderboardForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User id to fetch ranking for. |
 **bracket** | **Integer**| How many results before and after the found user to return | [optional] [default to 0]
 **projectIds** | [**Object**](.md)| The optional project ids to search by | [optional]
 **challengeIds** | [**Object**](.md)| The optional challenge ids to search by | [optional]
 **countryCodes** | [**Object**](.md)| The optional country codes to search by | [optional]
 **monthDuration** | [**Object**](.md)| The optional number of past months to search by (with 0 as current month and -1 as all time) | [optional]
 **start** | [**Object**](.md)| The optional start date when not using monthDuration | [optional]
 **end** | [**Object**](.md)| The optional end date when not using monthDuration | [optional]
 **onlyEnabled** | [**Object**](.md)| Limit search to only enabled challenges | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMapperLeaderboard"></a>
# **getMapperLeaderboard**
> getMapperLeaderboard(limit, offset, userIds, projectIds, challengeIds, countryCodes, monthDuration, start, end, onlyEnabled)

Fetches the mapper leaderboard stats

Fetches the mapper leaderboard stats

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.LeaderboardApi;


LeaderboardApi apiInstance = new LeaderboardApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
Object userIds = null; // Object | The optional user ids to search by
Object projectIds = null; // Object | The optional project ids to search by
Object challengeIds = null; // Object | The optional challenge ids to search by
Object countryCodes = null; // Object | The optional country codes to search by
Object monthDuration = null; // Object | The optional number of past months to search by (with 0 as current month and -1 as all time)
Object start = null; // Object | The optional start date when not using monthDuration
Object end = null; // Object | The optional end date when not using monthDuration
Object onlyEnabled = null; // Object | Limit search to only enabled challenges
try {
    apiInstance.getMapperLeaderboard(limit, offset, userIds, projectIds, challengeIds, countryCodes, monthDuration, start, end, onlyEnabled);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaderboardApi#getMapperLeaderboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]
 **userIds** | [**Object**](.md)| The optional user ids to search by | [optional]
 **projectIds** | [**Object**](.md)| The optional project ids to search by | [optional]
 **challengeIds** | [**Object**](.md)| The optional challenge ids to search by | [optional]
 **countryCodes** | [**Object**](.md)| The optional country codes to search by | [optional]
 **monthDuration** | [**Object**](.md)| The optional number of past months to search by (with 0 as current month and -1 as all time) | [optional]
 **start** | [**Object**](.md)| The optional start date when not using monthDuration | [optional]
 **end** | [**Object**](.md)| The optional end date when not using monthDuration | [optional]
 **onlyEnabled** | [**Object**](.md)| Limit search to only enabled challenges | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getReviewerLeaderboard"></a>
# **getReviewerLeaderboard**
> getReviewerLeaderboard(limit, offset, projectIds, challengeIds, monthDuration, start, end)

Fetches the reviewer leaderboard stats

Fetches the reviewer leaderboard stats

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.LeaderboardApi;


LeaderboardApi apiInstance = new LeaderboardApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
Object projectIds = null; // Object | The optional project ids to search by
Object challengeIds = null; // Object | The optional challenge ids to search by
Object monthDuration = null; // Object | The optional number of past months to search by (with 0 as current month and -1 as all time)
Object start = null; // Object | The optional start date when not using monthDuration
Object end = null; // Object | The optional end date when not using monthDuration
try {
    apiInstance.getReviewerLeaderboard(limit, offset, projectIds, challengeIds, monthDuration, start, end);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaderboardApi#getReviewerLeaderboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]
 **projectIds** | [**Object**](.md)| The optional project ids to search by | [optional]
 **challengeIds** | [**Object**](.md)| The optional challenge ids to search by | [optional]
 **monthDuration** | [**Object**](.md)| The optional number of past months to search by (with 0 as current month and -1 as all time) | [optional]
 **start** | [**Object**](.md)| The optional start date when not using monthDuration | [optional]
 **end** | [**Object**](.md)| The optional end date when not using monthDuration | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUserTopChallenges"></a>
# **getUserTopChallenges**
> getUserTopChallenges(userId, limit, offset, projectIds, challengeIds, countryCodes, monthDuration, start, end, onlyEnabled)

Gets the top challenges worked on by the user

Gets the top challenges worked on by the user

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.LeaderboardApi;


LeaderboardApi apiInstance = new LeaderboardApi();
Long userId = 789L; // Long | User id to fetch challenges for.
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
Object projectIds = null; // Object | The optional project ids to search by
Object challengeIds = null; // Object | The optional challenge ids to search by
Object countryCodes = null; // Object | The optional country codes to search by
Object monthDuration = null; // Object | The optional number of past months to search by (with 0 as current month and -1 as all time)
Object start = null; // Object | The optional start date when not using monthDuration
Object end = null; // Object | The optional end date when not using monthDuration
Object onlyEnabled = null; // Object | Limit search to only enabled challenges
try {
    apiInstance.getUserTopChallenges(userId, limit, offset, projectIds, challengeIds, countryCodes, monthDuration, start, end, onlyEnabled);
} catch (ApiException e) {
    System.err.println("Exception when calling LeaderboardApi#getUserTopChallenges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User id to fetch challenges for. |
 **limit** | **Integer**|  | [optional] [default to 20]
 **offset** | **Integer**|  | [optional] [default to 0]
 **projectIds** | [**Object**](.md)| The optional project ids to search by | [optional]
 **challengeIds** | [**Object**](.md)| The optional challenge ids to search by | [optional]
 **countryCodes** | [**Object**](.md)| The optional country codes to search by | [optional]
 **monthDuration** | [**Object**](.md)| The optional number of past months to search by (with 0 as current month and -1 as all time) | [optional]
 **start** | [**Object**](.md)| The optional start date when not using monthDuration | [optional]
 **end** | [**Object**](.md)| The optional end date when not using monthDuration | [optional]
 **onlyEnabled** | [**Object**](.md)| Limit search to only enabled challenges | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

