# UserApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserToProject**](UserApi.md#addUserToProject) | **POST** /user/{userId}/project/{projectId}/{role} | Grant role to user on project
[**addUsersToProject**](UserApi.md#addUsersToProject) | **PUT** /user/project/{projectId}/{role} | Grant role on project to a list of users
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /user/{osmId} | Deletes a user from the database
[**generateAPIKey**](UserApi.md#generateAPIKey) | **PUT** /user/{userId}/apikey | Generates an API_KEY for a specified user
[**getPublicUser**](UserApi.md#getPublicUser) | **GET** /user/{userId}/public | Retrieves Users public Json information
[**getPublicUserByOSMUsername**](UserApi.md#getPublicUserByOSMUsername) | **GET** /osmuser/{username}/public | Retrieves Users public Json information
[**getSavedChallenges**](UserApi.md#getSavedChallenges) | **GET** /user/{userId}/saved | Retrieves Users Saved Challenged
[**getSavedTasks**](UserApi.md#getSavedTasks) | **GET** /user/{userId}/savedTasks | Retrieves Users Saved Tasks
[**getUser**](UserApi.md#getUser) | **GET** /user/{userId} | Retrieves Users Json information
[**getUserByOSMUsername**](UserApi.md#getUserByOSMUsername) | **GET** /osmuser/{username} | Retrieves Users Json information
[**getUsersManagingProject**](UserApi.md#getUsersManagingProject) | **GET** /user/project/{projectId} | Gets a list of users managing project
[**refreshProfile**](UserApi.md#refreshProfile) | **PUT** /user/{userId}/refresh | Refresh User Profile
[**removeUserFromProject**](UserApi.md#removeUserFromProject) | **DELETE** /user/{userId}/project/{projectId}/{role} | Remove granted role on project from user
[**removeUsersFromProject**](UserApi.md#removeUsersFromProject) | **DELETE** /user/project/{projectId}/{role} | Removes granted role on project from a list of users
[**saveChallenge**](UserApi.md#saveChallenge) | **POST** /user/{userId}/save/{challengeId} | Saves Challenge for a User
[**saveTask**](UserApi.md#saveTask) | **POST** /user/{userId}/saveTask/{taskId} | Saves a Task for a User
[**searchUserByOSMUsername**](UserApi.md#searchUserByOSMUsername) | **GET** /users/find/{username} | Search for users by OSM username
[**setUserProjectRole**](UserApi.md#setUserProjectRole) | **PUT** /user/{userId}/project/{projectId}/{role} | Set project role for user, removing any prior roles on the project
[**unsaveChallenge**](UserApi.md#unsaveChallenge) | **DELETE** /user/{userId}/unsave/{challengeId} | Unsaves Challenge for a User
[**unsaveTask**](UserApi.md#unsaveTask) | **DELETE** /user/{userId}/unsaveTask/{taskId} | Unsaves Task for a User
[**updateUser**](UserApi.md#updateUser) | **PUT** /user/{userId} | Updates UserSettings
[**whoami**](UserApi.md#whoami) | **GET** /user/whoami | Retrieves current user

<a name="addUserToProject"></a>
# **addUserToProject**
> addUserToProject(userId, projectId, role, apiKey, isOSMUserId)

Grant role to user on project

Grants a user an Admin, Write or Read role on the project

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user to be granted the role. If using an OSM user id, then the isOSMUserId query parameter must be set to true
Long projectId = 789L; // Long | The id of the project
Integer role = 56; // Integer | Either 1 - Admin, 2 - Write, 3 - Read
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Boolean isOSMUserId = false; // Boolean | Specify if the user id is to be treated as an OSM user id
try {
    apiInstance.addUserToProject(userId, projectId, role, apiKey, isOSMUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUserToProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to be granted the role. If using an OSM user id, then the isOSMUserId query parameter must be set to true |
 **projectId** | **Long**| The id of the project |
 **role** | **Integer**| Either 1 - Admin, 2 - Write, 3 - Read |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **isOSMUserId** | **Boolean**| Specify if the user id is to be treated as an OSM user id | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="addUsersToProject"></a>
# **addUsersToProject**
> addUsersToProject(body, apiKey, projectId, role, isOSMUserId)

Grant role on project to a list of users

Grants Admin, Write, or Read role on project to list of users

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
List<Integer> body = Arrays.asList(56); // List<Integer> | A JSON array of user ids. If using OSM user Ids then the isOSMUserId query parameter must be set to true
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long projectId = 789L; // Long | The id of the project
Integer role = 56; // Integer | Either 1 - Admin, 2 - Write, 3 - Read
Boolean isOSMUserId = false; // Boolean | Specify if the user ids are to be treated as OSM user ids
try {
    apiInstance.addUsersToProject(body, apiKey, projectId, role, isOSMUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUsersToProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Integer&gt;**](Integer.md)| A JSON array of user ids. If using OSM user Ids then the isOSMUserId query parameter must be set to true |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **projectId** | **Long**| The id of the project |
 **role** | **Integer**| Either 1 - Admin, 2 - Write, 3 - Read |
 **isOSMUserId** | **Boolean**| Specify if the user ids are to be treated as OSM user ids | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteUser"></a>
# **deleteUser**
> OrgMaprouletteExceptionStatusMessage deleteUser(osmId, apiKey, anonymize)

Deletes a user from the database

This will delete a user completely from the database. It can also optionally anonymize the users data from actions taken in MapRoulette, like change in status for tasks, comments on tasks and answers to survey questions

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long osmId = 789L; // Long | The OSM id of the user you want to delete
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Boolean anonymize = false; // Boolean | Whether to anonymize the users data, false by default
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.deleteUser(osmId, apiKey, anonymize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osmId** | **Long**| The OSM id of the user you want to delete |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **anonymize** | **Boolean**| Whether to anonymize the users data, false by default | [optional] [default to false]

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="generateAPIKey"></a>
# **generateAPIKey**
> OrgMaprouletteFrameworkModelUser generateAPIKey(userId, apiKey)

Generates an API_KEY for a specified user

This API will generate or regenerate the API_KEY for a specified user

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user to retrieve
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.generateAPIKey(userId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#generateAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to retrieve |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPublicUser"></a>
# **getPublicUser**
> PublicUser getPublicUser(userId)

Retrieves Users public Json information

Retrieves a JSON object that represents the user&#x27;s public information that anyone can retrieve. This is a limited set of information that only includes certain fields.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user to retrieve
try {
    PublicUser result = apiInstance.getPublicUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getPublicUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to retrieve |

### Return type

[**PublicUser**](PublicUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPublicUserByOSMUsername"></a>
# **getPublicUserByOSMUsername**
> PublicUser getPublicUserByOSMUsername(username)

Retrieves Users public Json information

Retrieves User Json based on the supplied OSM username

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | The OSM username of the user to retrieve
try {
    PublicUser result = apiInstance.getPublicUserByOSMUsername(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getPublicUserByOSMUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The OSM username of the user to retrieve |

### Return type

[**PublicUser**](PublicUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSavedChallenges"></a>
# **getSavedChallenges**
> List&lt;OrgMaprouletteFrameworkModelChallenge&gt; getSavedChallenges(userId, apiKey, limit, page)

Retrieves Users Saved Challenged

Retrieves that list of challenges that has been saved by the User

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user to retrieve the challenges for
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelChallenge> result = apiInstance.getSavedChallenges(userId, apiKey, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getSavedChallenges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to retrieve the challenges for |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelChallenge&gt;**](OrgMaprouletteFrameworkModelChallenge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSavedTasks"></a>
# **getSavedTasks**
> List&lt;OrgMaprouletteFrameworkModelTask&gt; getSavedTasks(userId, apiKey, challengeIds, limit, page)

Retrieves Users Saved Tasks

Retrieves that list of tasks that has been saved by the User

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user to retrieve the challenges for
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String challengeIds = "challengeIds_example"; // String | A comma separated list of challenge Ids that you want to filter the tasks by
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelTask> result = apiInstance.getSavedTasks(userId, apiKey, challengeIds, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getSavedTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to retrieve the challenges for |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **challengeIds** | **String**| A comma separated list of challenge Ids that you want to filter the tasks by | [optional]
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTask&gt;**](OrgMaprouletteFrameworkModelTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> OrgMaprouletteFrameworkModelUser getUser(userId, apiKey)

Retrieves Users Json information

Retrieves User Json based on the supplied ID

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id or OsmId of the user to retrieve. It will first try to match on the OSM id and if not found it will retrieve based on the MapRoulette Id.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.getUser(userId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id or OsmId of the user to retrieve. It will first try to match on the OSM id and if not found it will retrieve based on the MapRoulette Id. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserByOSMUsername"></a>
# **getUserByOSMUsername**
> OrgMaprouletteFrameworkModelUser getUserByOSMUsername(username, apiKey)

Retrieves Users Json information

Retrieves User Json based on the supplied OSM username

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | The OSM username of the user to retrieve
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.getUserByOSMUsername(username, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserByOSMUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The OSM username of the user to retrieve |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersManagingProject"></a>
# **getUsersManagingProject**
> List&lt;OrgMaprouletteFrameworkModelProjectManager&gt; getUsersManagingProject(projectId, apiKey, osmIds, includeTeams)

Gets a list of users managing project

Gets list of users managing project along with their roles (1 - Admin, 2 - Write, 3 - Read)

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long projectId = 789L; // Long | The id of the project
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
String osmIds = "osmIds_example"; // String | A list of comma separated OSM id's to filter the request by
Boolean includeTeams = false; // Boolean | If true, indirect managers via teams will also be included
try {
    List<OrgMaprouletteFrameworkModelProjectManager> result = apiInstance.getUsersManagingProject(projectId, apiKey, osmIds, includeTeams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUsersManagingProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The id of the project |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **osmIds** | **String**| A list of comma separated OSM id&#x27;s to filter the request by | [optional]
 **includeTeams** | **Boolean**| If true, indirect managers via teams will also be included | [optional] [default to false]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelProjectManager&gt;**](OrgMaprouletteFrameworkModelProjectManager.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="refreshProfile"></a>
# **refreshProfile**
> refreshProfile(userId, apiKey)

Refresh User Profile

Refreshes the user profile from OSM

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The osm id of the user to update the settings for
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    apiInstance.refreshProfile(userId, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#refreshProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The osm id of the user to update the settings for |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeUserFromProject"></a>
# **removeUserFromProject**
> removeUserFromProject(userId, projectId, role, apiKey, isOSMUserId)

Remove granted role on project from user

Removes Admin, Write, or Read role on a project from a user

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user who is to have role removed. If using an OSM user id, then the isOSMUserId query parameter must be set to true
Long projectId = 789L; // Long | The id of the project
Integer role = 56; // Integer | Either -1 all, 1 - Admin, 2 - Write, 3 - Read
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Boolean isOSMUserId = false; // Boolean | Specify if the user ids are to be treated as OSM user ids
try {
    apiInstance.removeUserFromProject(userId, projectId, role, apiKey, isOSMUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeUserFromProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user who is to have role removed. If using an OSM user id, then the isOSMUserId query parameter must be set to true |
 **projectId** | **Long**| The id of the project |
 **role** | **Integer**| Either -1 all, 1 - Admin, 2 - Write, 3 - Read |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **isOSMUserId** | **Boolean**| Specify if the user ids are to be treated as OSM user ids | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeUsersFromProject"></a>
# **removeUsersFromProject**
> removeUsersFromProject(body, apiKey, projectId, role, isOSMUserId)

Removes granted role on project from a list of users

Removes Admin, Write, or Read role on project from a list of users

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
List<Integer> body = Arrays.asList(56); // List<Integer> | A JSON array of user ids. This can be either the MapRoulette or OSM Id. If using OSM user ids, then the isOSMUserId query parameter must be set to true
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long projectId = 789L; // Long | The id of the project
Integer role = 56; // Integer | Either 1 - Admin, 2 - Write, 3 - Read
Boolean isOSMUserId = false; // Boolean | Specify if the user ids are to be treated as OSM user ids
try {
    apiInstance.removeUsersFromProject(body, apiKey, projectId, role, isOSMUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeUsersFromProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Integer&gt;**](Integer.md)| A JSON array of user ids. This can be either the MapRoulette or OSM Id. If using OSM user ids, then the isOSMUserId query parameter must be set to true |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **projectId** | **Long**| The id of the project |
 **role** | **Integer**| Either 1 - Admin, 2 - Write, 3 - Read |
 **isOSMUserId** | **Boolean**| Specify if the user ids are to be treated as OSM user ids | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="saveChallenge"></a>
# **saveChallenge**
> OrgMaprouletteExceptionStatusMessage saveChallenge(userId, challengeId, apiKey)

Saves Challenge for a User

Saves a Challenge to a user account

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user to save the challenges for
Long challengeId = 789L; // Long | The id of the challenge to save
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.saveChallenge(userId, challengeId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#saveChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to save the challenges for |
 **challengeId** | **Long**| The id of the challenge to save |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveTask"></a>
# **saveTask**
> OrgMaprouletteExceptionStatusMessage saveTask(userId, taskId, apiKey)

Saves a Task for a User

Saves a Task to a user account

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user to save the tasks for
Long taskId = 789L; // Long | The id of the Task to save
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.saveTask(userId, taskId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#saveTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to save the tasks for |
 **taskId** | **Long**| The id of the Task to save |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchUserByOSMUsername"></a>
# **searchUserByOSMUsername**
> OrgMaprouletteFrameworkModelUser searchUserByOSMUsername(apiKey, limit, tid, page)

Search for users by OSM username

Retrieves list of matching users

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default value is 10.
Object tid = null; // Object | Optional field to allow searching for users who participated in a task.
Object page = null; // Object | Used in conjunction with the limit parameter to page through X number of responses.
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.searchUserByOSMUsername(apiKey, limit, tid, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#searchUserByOSMUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **limit** | **Integer**| Limit the number of results returned in the response. Default value is 10. | [optional] [default to 10]
 **tid** | [**Object**](.md)| Optional field to allow searching for users who participated in a task. | [optional]
 **page** | [**Object**](.md)| Used in conjunction with the limit parameter to page through X number of responses. | [optional]

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setUserProjectRole"></a>
# **setUserProjectRole**
> setUserProjectRole(userId, projectId, role, apiKey, isOSMUserId)

Set project role for user, removing any prior roles on the project

Sets a user&#x27;s role on the project to Admin, Write or Read. This will also remove any other roles on the project from the user.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user to be granted the role
Long projectId = 789L; // Long | The id of the project
Integer role = 56; // Integer | Either 1 - Admin, 2 - Write, 3 - Read
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Boolean isOSMUserId = false; // Boolean | Specify if the user id is to be treated as an OSM user id
try {
    apiInstance.setUserProjectRole(userId, projectId, role, apiKey, isOSMUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setUserProjectRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to be granted the role |
 **projectId** | **Long**| The id of the project |
 **role** | **Integer**| Either 1 - Admin, 2 - Write, 3 - Read |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **isOSMUserId** | **Boolean**| Specify if the user id is to be treated as an OSM user id | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unsaveChallenge"></a>
# **unsaveChallenge**
> OrgMaprouletteExceptionStatusMessage unsaveChallenge(userId, challengeId, apiKey)

Unsaves Challenge for a User

Unsaves a Challenge to a user account

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user to unsave the challenges for
Long challengeId = 789L; // Long | The id of the challenge to unsave
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.unsaveChallenge(userId, challengeId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#unsaveChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to unsave the challenges for |
 **challengeId** | **Long**| The id of the challenge to unsave |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unsaveTask"></a>
# **unsaveTask**
> OrgMaprouletteExceptionStatusMessage unsaveTask(userId, taskId, apiKey)

Unsaves Task for a User

Unsaves a Task from a user account

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | The id of the user to unsave the tasks for
Long taskId = 789L; // Long | The id of the task to unsave
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteExceptionStatusMessage result = apiInstance.unsaveTask(userId, taskId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#unsaveTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of the user to unsave the tasks for |
 **taskId** | **Long**| The id of the task to unsave |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteExceptionStatusMessage**](OrgMaprouletteExceptionStatusMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> OrgMaprouletteFrameworkModelUser updateUser(body, apiKey, userId)

Updates UserSettings

Updates the user settings for a specified user

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
List<OrgMaprouletteFrameworkModelUserSettings> body = Arrays.asList(new OrgMaprouletteFrameworkModelUserSettings()); // List<OrgMaprouletteFrameworkModelUserSettings> | The JSON structure for the users UserSettings. You can optionally include a key properties which would be a JSON object that contains any extra information for the user.
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
Long userId = 789L; // Long | The id of the user to update the settings for
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.updateUser(body, apiKey, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;OrgMaprouletteFrameworkModelUserSettings&gt;**](OrgMaprouletteFrameworkModelUserSettings.md)| The JSON structure for the users UserSettings. You can optionally include a key properties which would be a JSON object that contains any extra information for the user. |
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |
 **userId** | **Long**| The id of the user to update the settings for |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="whoami"></a>
# **whoami**
> OrgMaprouletteFrameworkModelUser whoami(apiKey)

Retrieves current user

Retrieves the current logged-in user&#x27;s JSON

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.UserApi;


UserApi apiInstance = new UserApi();
String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
try {
    OrgMaprouletteFrameworkModelUser result = apiInstance.whoami(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#whoami");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| The user&#x27;s apiKey to authorize the request |

### Return type

[**OrgMaprouletteFrameworkModelUser**](OrgMaprouletteFrameworkModelUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

