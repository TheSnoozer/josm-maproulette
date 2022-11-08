# TeamApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptInvite**](TeamApi.md#acceptInvite) | **PUT** /team/{id}/invite/accept | Accept an invitation to join a team
[**addTeamToProject**](TeamApi.md#addTeamToProject) | **POST** /team/{teamId}/project/{projectId}/{role} | Grant role to team on project
[**createTeam**](TeamApi.md#createTeam) | **POST** /team | Create a new team
[**declineInvite**](TeamApi.md#declineInvite) | **DELETE** /team/{id}/invite | Decline an invitation to join a team
[**deleteTeam**](TeamApi.md#deleteTeam) | **DELETE** /team/{id} | Delete a team
[**find**](TeamApi.md#find) | **GET** /teams/find | Find teams by name
[**getTeamsManagingProject**](TeamApi.md#getTeamsManagingProject) | **GET** /teams/projectManagers/{projectId} | Get teams granted a role on a project
[**inviteUser**](TeamApi.md#inviteUser) | **POST** /team/{id}/user/{userId}/invite/{role} | Invites a user to join a team
[**removeTeamFromProject**](TeamApi.md#removeTeamFromProject) | **DELETE** /team/{teamId}/project/{projectId} | Remove granted roles on project from team
[**removeTeamMember**](TeamApi.md#removeTeamMember) | **DELETE** /team/{id}/user/{userId}/ | Remove a member from a team
[**retrieve**](TeamApi.md#retrieve) | **GET** /team/{id} | Retrieves a team
[**setTeamProjectRole**](TeamApi.md#setTeamProjectRole) | **PUT** /team/{teamId}/project/{projectId}/{role} | Set granted role of team on project
[**teamUsers**](TeamApi.md#teamUsers) | **GET** /team/{id}/userMembers | Retrieves users who are members of a team
[**updateMemberRole**](TeamApi.md#updateMemberRole) | **PUT** /team/{id}/user/{userId}/role/{role} | Update a team member&#x27;s role
[**updateTeam**](TeamApi.md#updateTeam) | **PUT** /team/{id} | Update a team
[**userTeamMemberships**](TeamApi.md#userTeamMemberships) | **GET** /team/all/user/{userId}/memberships | Retrieves all team memberships for a user

<a name="acceptInvite"></a>
# **acceptInvite**
> OrgMaprouletteFrameworkModelTeamUser acceptInvite(id)

Accept an invitation to join a team

Accepts the logged-in user&#x27;s invitation to join a team

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long id = 789L; // Long | The ID for the team
try {
    OrgMaprouletteFrameworkModelTeamUser result = apiInstance.acceptInvite(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#acceptInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the team |

### Return type

[**OrgMaprouletteFrameworkModelTeamUser**](OrgMaprouletteFrameworkModelTeamUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addTeamToProject"></a>
# **addTeamToProject**
> addTeamToProject(teamId, projectId, role)

Grant role to team on project

Grant a team an Admin, Write or Read role on the project

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long teamId = 789L; // Long | The id of the team to be granted the role
Long projectId = 789L; // Long | The id of the project on which the role is to be granted
Integer role = 56; // Integer | Either 1 - Admin, 2 - Write, 3 - Read
try {
    apiInstance.addTeamToProject(teamId, projectId, role);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#addTeamToProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| The id of the team to be granted the role |
 **projectId** | **Long**| The id of the project on which the role is to be granted |
 **role** | **Integer**| Either 1 - Admin, 2 - Write, 3 - Read |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createTeam"></a>
# **createTeam**
> OrgMaprouletteFrameworkModelGroup createTeam(body)

Create a new team

Creates a new team

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
OrgMaprouletteFrameworkModelGroup body = new OrgMaprouletteFrameworkModelGroup(); // OrgMaprouletteFrameworkModelGroup | The JSON structure for the team (a group) body
try {
    OrgMaprouletteFrameworkModelGroup result = apiInstance.createTeam(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#createTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrgMaprouletteFrameworkModelGroup**](OrgMaprouletteFrameworkModelGroup.md)| The JSON structure for the team (a group) body |

### Return type

[**OrgMaprouletteFrameworkModelGroup**](OrgMaprouletteFrameworkModelGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="declineInvite"></a>
# **declineInvite**
> declineInvite(id)

Decline an invitation to join a team

Decline the logged-in user&#x27;s invitation to join a team

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long id = 789L; // Long | The ID for the team
try {
    apiInstance.declineInvite(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#declineInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the team |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTeam"></a>
# **deleteTeam**
> deleteTeam(id)

Delete a team

Deletes a team with ID

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long id = 789L; // Long | The ID for the team
try {
    apiInstance.deleteTeam(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#deleteTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the team |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="find"></a>
# **find**
> List&lt;OrgMaprouletteFrameworkModelGroup&gt; find(name, limit, page)

Find teams by name

Search for teams by name

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
String name = "name_example"; // String | Name fragment to match
Integer limit = 10; // Integer | Limit the number of results returned in the response. Default is 10 results
Integer page = 0; // Integer | Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page.
try {
    List<OrgMaprouletteFrameworkModelGroup> result = apiInstance.find(name, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#find");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name fragment to match |
 **limit** | **Integer**| Limit the number of results returned in the response. Default is 10 results | [optional] [default to 10]
 **page** | **Integer**| Used in conjunction with the limit parameter to page through X number of responses. Default value is 0, ie. first page. | [optional] [default to 0]

### Return type

[**List&lt;OrgMaprouletteFrameworkModelGroup&gt;**](OrgMaprouletteFrameworkModelGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamsManagingProject"></a>
# **getTeamsManagingProject**
> List&lt;OrgMaprouletteFrameworkModelGroup&gt; getTeamsManagingProject(projectId)

Get teams granted a role on a project

Get teams granted an Admin, Write or Read role on a project

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long projectId = 789L; // Long | The id of the project for which teams are desired
try {
    List<OrgMaprouletteFrameworkModelGroup> result = apiInstance.getTeamsManagingProject(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeamsManagingProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| The id of the project for which teams are desired |

### Return type

[**List&lt;OrgMaprouletteFrameworkModelGroup&gt;**](OrgMaprouletteFrameworkModelGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="inviteUser"></a>
# **inviteUser**
> OrgMaprouletteFrameworkModelTeamUser inviteUser(id, userId, role)

Invites a user to join a team

Invites a user to join a team with the given role

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long id = 789L; // Long | The ID for the team
Long userId = 789L; // Long | The ID for the user to invite
Integer role = 56; // Integer | Either 1 - Admin, 2 - Write, 3 - Read
try {
    OrgMaprouletteFrameworkModelTeamUser result = apiInstance.inviteUser(id, userId, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#inviteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the team |
 **userId** | **Long**| The ID for the user to invite |
 **role** | **Integer**| Either 1 - Admin, 2 - Write, 3 - Read |

### Return type

[**OrgMaprouletteFrameworkModelTeamUser**](OrgMaprouletteFrameworkModelTeamUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeTeamFromProject"></a>
# **removeTeamFromProject**
> removeTeamFromProject(teamId, projectId)

Remove granted roles on project from team

Remove roles on a project from a team

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long teamId = 789L; // Long | The id of the team to be granted the role
Long projectId = 789L; // Long | The id of the project on which the role is to be granted
try {
    apiInstance.removeTeamFromProject(teamId, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#removeTeamFromProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| The id of the team to be granted the role |
 **projectId** | **Long**| The id of the project on which the role is to be granted |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeTeamMember"></a>
# **removeTeamMember**
> removeTeamMember(id, userId)

Remove a member from a team

Remove a team member from a team

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long id = 789L; // Long | The ID for the team
Long userId = 789L; // Long | The ID for the user to remove
try {
    apiInstance.removeTeamMember(id, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#removeTeamMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the team |
 **userId** | **Long**| The ID for the user to remove |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieve"></a>
# **retrieve**
> OrgMaprouletteFrameworkModelGroup retrieve(id)

Retrieves a team

Retrieves a team based on a specific ID.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long id = 789L; // Long | The ID for the team
try {
    OrgMaprouletteFrameworkModelGroup result = apiInstance.retrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#retrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the team |

### Return type

[**OrgMaprouletteFrameworkModelGroup**](OrgMaprouletteFrameworkModelGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setTeamProjectRole"></a>
# **setTeamProjectRole**
> setTeamProjectRole(teamId, projectId, role)

Set granted role of team on project

Grant a team an Admin, Write or Read role on the project, clearing any prior roles

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long teamId = 789L; // Long | The id of the team to be granted the role
Long projectId = 789L; // Long | The id of the project on which the role is to be granted
Integer role = 56; // Integer | Either 1 - Admin, 2 - Write, 3 - Read
try {
    apiInstance.setTeamProjectRole(teamId, projectId, role);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#setTeamProjectRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| The id of the team to be granted the role |
 **projectId** | **Long**| The id of the project on which the role is to be granted |
 **role** | **Integer**| Either 1 - Admin, 2 - Write, 3 - Read |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="teamUsers"></a>
# **teamUsers**
> List&lt;OrgMaprouletteFrameworkModelTeamUser&gt; teamUsers(id)

Retrieves users who are members of a team

Retrieves all the user members of a team

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long id = 789L; // Long | The ID for the team
try {
    List<OrgMaprouletteFrameworkModelTeamUser> result = apiInstance.teamUsers(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#teamUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the team |

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTeamUser&gt;**](OrgMaprouletteFrameworkModelTeamUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMemberRole"></a>
# **updateMemberRole**
> OrgMaprouletteFrameworkModelTeamUser updateMemberRole(id, userId, role)

Update a team member&#x27;s role

Update a team member&#x27;s granted role on the team

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long id = 789L; // Long | The ID for the team
Long userId = 789L; // Long | The ID for the user to invite
Integer role = 56; // Integer | Either 1 - Admin, 2 - Write, 3 - Read
try {
    OrgMaprouletteFrameworkModelTeamUser result = apiInstance.updateMemberRole(id, userId, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#updateMemberRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The ID for the team |
 **userId** | **Long**| The ID for the user to invite |
 **role** | **Integer**| Either 1 - Admin, 2 - Write, 3 - Read |

### Return type

[**OrgMaprouletteFrameworkModelTeamUser**](OrgMaprouletteFrameworkModelTeamUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTeam"></a>
# **updateTeam**
> OrgMaprouletteFrameworkModelGroup updateTeam(body, id)

Update a team

Updates the team info (name, description, avatar URL)

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
OrgMaprouletteFrameworkModelGroup body = new OrgMaprouletteFrameworkModelGroup(); // OrgMaprouletteFrameworkModelGroup | The JSON structure for the team (a group) body
Long id = 789L; // Long | The ID for the team
try {
    OrgMaprouletteFrameworkModelGroup result = apiInstance.updateTeam(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#updateTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrgMaprouletteFrameworkModelGroup**](OrgMaprouletteFrameworkModelGroup.md)| The JSON structure for the team (a group) body |
 **id** | **Long**| The ID for the team |

### Return type

[**OrgMaprouletteFrameworkModelGroup**](OrgMaprouletteFrameworkModelGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userTeamMemberships"></a>
# **userTeamMemberships**
> List&lt;OrgMaprouletteFrameworkModelTeamUser&gt; userTeamMemberships(userId, id)

Retrieves all team memberships for a user

Retrieves all the given user&#x27;s team memberships

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.TeamApi;


TeamApi apiInstance = new TeamApi();
Long userId = 789L; // Long | 
Object id = null; // Object | The ID for the team
try {
    List<OrgMaprouletteFrameworkModelTeamUser> result = apiInstance.userTeamMemberships(userId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#userTeamMemberships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |
 **id** | [**Object**](.md)| The ID for the team |

### Return type

[**List&lt;OrgMaprouletteFrameworkModelTeamUser&gt;**](OrgMaprouletteFrameworkModelTeamUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

