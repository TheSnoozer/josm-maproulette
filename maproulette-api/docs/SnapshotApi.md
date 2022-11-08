# SnapshotApi

All URIs are relative to */api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](SnapshotApi.md#delete) | **DELETE** /snapshot/{snapshotId} | Deletes a snapshot
[**exportChallengeSnapshots**](SnapshotApi.md#exportChallengeSnapshots) | **GET** /snapshot/challenge/{challengeId}/export | Creates a csv of all snapshots for a challenge.
[**getSnapshotList**](SnapshotApi.md#getSnapshotList) | **GET** /snapshot/challenge/{challengeId}/list | Gets the list of snapshots for a challenge
[**recordChallengeSnapshot**](SnapshotApi.md#recordChallengeSnapshot) | **GET** /snapshot/challenge/{challengeId}/record | Records a snapshot for a challenge
[**retrieve**](SnapshotApi.md#retrieve) | **GET** /snapshot/{snapshotId} | Gets a snapshot

<a name="delete"></a>
# **delete**
> delete(snapshotId, id)

Deletes a snapshot

Deletes a challenge snapshot

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
Long snapshotId = 789L; // Long | 
Object id = null; // Object | The id of the snapshot to delete
try {
    apiInstance.delete(snapshotId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotId** | **Long**|  |
 **id** | [**Object**](.md)| The id of the snapshot to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="exportChallengeSnapshots"></a>
# **exportChallengeSnapshots**
> exportChallengeSnapshots(challengeId)

Creates a csv of all snapshots for a challenge.

Creates a csv export of all snaphshots for a challenge.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
Long challengeId = 789L; // Long | The id of the challenge
try {
    apiInstance.exportChallengeSnapshots(challengeId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#exportChallengeSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **challengeId** | **Long**| The id of the challenge |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSnapshotList"></a>
# **getSnapshotList**
> getSnapshotList(challengeId, includeAllData)

Gets the list of snapshots for a challenge

Retrieves a list challenge snapshots

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
Long challengeId = 789L; // Long | The id of the challenge
Boolean includeAllData = false; // Boolean | Whether to include all the snapshot data or just a brief summary
try {
    apiInstance.getSnapshotList(challengeId, includeAllData);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshotList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **challengeId** | **Long**| The id of the challenge |
 **includeAllData** | **Boolean**| Whether to include all the snapshot data or just a brief summary | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="recordChallengeSnapshot"></a>
# **recordChallengeSnapshot**
> recordChallengeSnapshot(challengeId)

Records a snapshot for a challenge

Creates a challenge snapshot.

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
Long challengeId = 789L; // Long | The id of the challenge to snapshot
try {
    apiInstance.recordChallengeSnapshot(challengeId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#recordChallengeSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **challengeId** | **Long**| The id of the challenge to snapshot |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieve"></a>
# **retrieve**
> retrieve(snapshotId, id)

Gets a snapshot

Retrieves a challenge snapshot

### Example
```java
// Import classes:
//import io.github.thesnoozer.maproulette.client.ApiException;
//import io.github.thesnoozer.maproulette.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
Long snapshotId = 789L; // Long | 
Object id = null; // Object | The id of the snapshot to get
try {
    apiInstance.retrieve(snapshotId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#retrieve");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotId** | **Long**|  |
 **id** | [**Object**](.md)| The id of the snapshot to get |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

