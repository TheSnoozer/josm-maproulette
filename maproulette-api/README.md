# maproulette-api

MapRoulette API
- API version: 4.0.0
  - Build date: 2022-11-08T21:39:00.063842+01:00[Europe/Berlin]

API for MapRoulette enabling the creation and maintenance of MapRoulette challenges


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.github.thesnoozer</groupId>
  <artifactId>maproulette-api</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.github.thesnoozer:maproulette-api:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/maproulette-api-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.github.thesnoozer.maproulette.client.*;
import io.github.thesnoozer.maproulette.client.auth.*;
import io.github.thesnoozer.maproulette.client.model.*;
import io.github.thesnoozer.maproulette.client.api.BundleApi;

import java.io.File;
import java.util.*;

public class BundleApiExample {

    public static void main(String[] args) {
        
        BundleApi apiInstance = new BundleApi();
        TaskBundle body = new TaskBundle(); // TaskBundle | The JSON structure for the bundle body.
        String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
        try {
            TaskBundle result = apiInstance.createTaskBundle(body, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#createTaskBundle");
            e.printStackTrace();
        }
    }
}
import io.github.thesnoozer.maproulette.client.*;
import io.github.thesnoozer.maproulette.client.auth.*;
import io.github.thesnoozer.maproulette.client.model.*;
import io.github.thesnoozer.maproulette.client.api.BundleApi;

import java.io.File;
import java.util.*;

public class BundleApiExample {

    public static void main(String[] args) {
        
        BundleApi apiInstance = new BundleApi();
        Long id = 789L; // Long | The id of the Task Bundle
        String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
        Long primaryId = 789L; // Long | 
        try {
            apiInstance.deleteTaskBundle(id, apiKey, primaryId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#deleteTaskBundle");
            e.printStackTrace();
        }
    }
}
import io.github.thesnoozer.maproulette.client.*;
import io.github.thesnoozer.maproulette.client.auth.*;
import io.github.thesnoozer.maproulette.client.model.*;
import io.github.thesnoozer.maproulette.client.api.BundleApi;

import java.io.File;
import java.util.*;

public class BundleApiExample {

    public static void main(String[] args) {
        
        BundleApi apiInstance = new BundleApi();
        Long id = 789L; // Long | The id of the Task Bundle
        String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
        try {
            TaskBundle result = apiInstance.getTaskBundle(id, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#getTaskBundle");
            e.printStackTrace();
        }
    }
}
import io.github.thesnoozer.maproulette.client.*;
import io.github.thesnoozer.maproulette.client.auth.*;
import io.github.thesnoozer.maproulette.client.model.*;
import io.github.thesnoozer.maproulette.client.api.BundleApi;

import java.io.File;
import java.util.*;

public class BundleApiExample {

    public static void main(String[] args) {
        
        BundleApi apiInstance = new BundleApi();
        Long id = 789L; // Long | The id of the Task Bundle
        List<Long> taskIds = Arrays.asList(56L); // List<Long> | The list of task ids to remove from the bundle
        String apiKey = "apiKey_example"; // String | The user's apiKey to authorize the request
        try {
            TaskBundle result = apiInstance.unbundleTasks(id, taskIds, apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#unbundleTasks");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to */api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BundleApi* | [**createTaskBundle**](docs/BundleApi.md#createTaskBundle) | **POST** /taskBundle | Create a task bundle
*BundleApi* | [**deleteTaskBundle**](docs/BundleApi.md#deleteTaskBundle) | **DELETE** /taskBundle/{id} | Deletes a Task Bundle
*BundleApi* | [**getTaskBundle**](docs/BundleApi.md#getTaskBundle) | **GET** /taskBundle/{id} | Gets a Task Bundle
*BundleApi* | [**unbundleTasks**](docs/BundleApi.md#unbundleTasks) | **GET** /taskBundle/{id}/unbundle | Unbundles tasks from Task Bundle
*ChallengeApi* | [**addTasksToChallenge**](docs/ChallengeApi.md#addTasksToChallenge) | **PUT** /challenge/{id}/addTasks | Add tasks to a challenge
*ChallengeApi* | [**addTasksToChallengeFromFile**](docs/ChallengeApi.md#addTasksToChallengeFromFile) | **PUT** /challenge/{id}/addFileTasks | Add tasks to a challenge
*ChallengeApi* | [**archiveChallenge**](docs/ChallengeApi.md#archiveChallenge) | **POST** /challenge/{challengeId}/archive | Update archive status
*ChallengeApi* | [**batchUploadPost**](docs/ChallengeApi.md#batchUploadPost) | **POST** /challenges | Create a batch of Challenges
*ChallengeApi* | [**batchUploadPut**](docs/ChallengeApi.md#batchUploadPut) | **PUT** /challenges | Update a batch of Challenges
*ChallengeApi* | [**bulkArchive**](docs/ChallengeApi.md#bulkArchive) | **POST** /challenges/bulkArchive | Bulk Archive Challenges.
*ChallengeApi* | [**cloneChallenge**](docs/ChallengeApi.md#cloneChallenge) | **PUT** /challenge/{id}/clone/{name} | Clones a Challenge
*ChallengeApi* | [**create**](docs/ChallengeApi.md#create) | **POST** /challenge | Create a Challenge
*ChallengeApi* | [**createChildren**](docs/ChallengeApi.md#createChildren) | **POST** /challenge/{id}/tasks | Create Tasks for Challenge
*ChallengeApi* | [**createFromGithub**](docs/ChallengeApi.md#createFromGithub) | **POST** /project/{projectId}/challenge/{username}/{repo}/{name} | Create Challenge from Github
*ChallengeApi* | [**delete**](docs/ChallengeApi.md#delete) | **DELETE** /challenge/{id} | Deletes an existing Challenge
*ChallengeApi* | [**deleteTagsFromItem**](docs/ChallengeApi.md#deleteTagsFromItem) | **DELETE** /challenge/{id}/tags | Delete Challenge Tags
*ChallengeApi* | [**deleteTasks**](docs/ChallengeApi.md#deleteTasks) | **DELETE** /challenge/{id}/tasks | Deletes all Challenge Tasks
*ChallengeApi* | [**expandedList**](docs/ChallengeApi.md#expandedList) | **GET** /challenge/{id}/children | Retrieves children for Challenge
*ChallengeApi* | [**extendedFind**](docs/ChallengeApi.md#extendedFind) | **GET** /challenges/extendedFind | Extended Find Challenge matching search criteria
*ChallengeApi* | [**extractChallengeReviewHistory**](docs/ChallengeApi.md#extractChallengeReviewHistory) | **GET** /challenge/{id}/extractReviewHistory | Retrieve task review history of a Challenge
*ChallengeApi* | [**extractComments**](docs/ChallengeApi.md#extractComments) | **GET** /challenge/{id}/comments/extract | Retrieve all comments for Challenge
*ChallengeApi* | [**extractPackage**](docs/ChallengeApi.md#extractPackage) | **GET** /challenge/{id}/extract | Extracts a Challenge Package
*ChallengeApi* | [**extractTaskSummaries**](docs/ChallengeApi.md#extractTaskSummaries) | **GET** /challenge/{id}/tasks/extract | Retrieve summaries of all tasks for Challenge
*ChallengeApi* | [**extractTaskSummaries_0**](docs/ChallengeApi.md#extractTaskSummaries_0) | **POST** /challenge/{id}/tasks/extract | Retrieve summaries of all tasks for Challenge
*ChallengeApi* | [**find**](docs/ChallengeApi.md#find) | **GET** /challenges/find | Find Challenge matching search criteria
*ChallengeApi* | [**getChallengeGeoJSON**](docs/ChallengeApi.md#getChallengeGeoJSON) | **GET** /challenge/view/{id} | Retrieves Challenge GeoJSON
*ChallengeApi* | [**getChallengeGeoJSON_0**](docs/ChallengeApi.md#getChallengeGeoJSON_0) | **POST** /challenge/view/{id} | Retrieves Challenge GeoJSON
*ChallengeApi* | [**getClusteredPoints**](docs/ChallengeApi.md#getClusteredPoints) | **GET** /challenge/clustered/{id} | Retrieves clustered Task points
*ChallengeApi* | [**getFeaturedChallenges**](docs/ChallengeApi.md#getFeaturedChallenges) | **GET** /challenges/featured | Featured Challenges.
*ChallengeApi* | [**getHotChallenges**](docs/ChallengeApi.md#getHotChallenges) | **GET** /challenges/hot | Hottest Challenges.
*ChallengeApi* | [**getItemsBasedOnTags**](docs/ChallengeApi.md#getItemsBasedOnTags) | **GET** /challenges/tags | Retrieve challenges based on provided tags
*ChallengeApi* | [**getNearbyTasks**](docs/ChallengeApi.md#getNearbyTasks) | **GET** /challenge/{cid}/tasksNearby/{proximityId} | Retrieves nearby Tasks
*ChallengeApi* | [**getPreferredChallenges**](docs/ChallengeApi.md#getPreferredChallenges) | **GET** /challenges/preferred | Preferred Challenges.
*ChallengeApi* | [**getRandomTasks**](docs/ChallengeApi.md#getRandomTasks) | **GET** /challenge/{cid}/tasks/random | Retrieves random Task
*ChallengeApi* | [**getRandomTasksWithPriority**](docs/ChallengeApi.md#getRandomTasksWithPriority) | **GET** /challenge/{cid}/tasks/prioritizedTasks | Retrieves prioritized random Task
*ChallengeApi* | [**getRandomTasks_0**](docs/ChallengeApi.md#getRandomTasks_0) | **GET** /challenge/{cid}/tasks/randomTasks | Retrieves random Task
*ChallengeApi* | [**getSequentialNextTask**](docs/ChallengeApi.md#getSequentialNextTask) | **GET** /challenge/{cid}/nextTask/{id} | Retrieves next Task
*ChallengeApi* | [**getSequentialPreviousTask**](docs/ChallengeApi.md#getSequentialPreviousTask) | **GET** /challenge/{cid}/previousTask/{id} | Retrieves previous Task
*ChallengeApi* | [**getTagsForChallenge**](docs/ChallengeApi.md#getTagsForChallenge) | **GET** /challenge/{id}/tags | Retrieve tags for Challenge
*ChallengeApi* | [**list**](docs/ChallengeApi.md#list) | **GET** /challenges | List all the Challenges.
*ChallengeApi* | [**listChallenges**](docs/ChallengeApi.md#listChallenges) | **GET** /review/challenges | List all the Challenges with review tasks.
*ChallengeApi* | [**listChildren**](docs/ChallengeApi.md#listChildren) | **GET** /challenge/{id}/tasks | List all the Challenges Tasks.
*ChallengeApi* | [**listing**](docs/ChallengeApi.md#listing) | **GET** /challenges/listing | List challenges in specified projects
*ChallengeApi* | [**matchChangeSets**](docs/ChallengeApi.md#matchChangeSets) | **GET** /challenge/{id}/matchChangesets | Match OSM Changesets
*ChallengeApi* | [**moveChallenge**](docs/ChallengeApi.md#moveChallenge) | **POST** /challenge/{id}/project/{projectId} | Move Challenge to another Project
*ChallengeApi* | [**moveChallenges**](docs/ChallengeApi.md#moveChallenges) | **POST** /challenges/project/{projectId} | Move Challenges to another Project
*ChallengeApi* | [**read**](docs/ChallengeApi.md#read) | **GET** /challenge/{id} | Retrieves an already existing Challenge
*ChallengeApi* | [**readByName**](docs/ChallengeApi.md#readByName) | **GET** /project/{id}/challenge/{name} | Retrieves an already existing Challenge
*ChallengeApi* | [**rebuildChallenge**](docs/ChallengeApi.md#rebuildChallenge) | **PUT** /challenge/{id}/rebuild | Rebuild a Challenge
*ChallengeApi* | [**resetTaskInstructions**](docs/ChallengeApi.md#resetTaskInstructions) | **PUT** /challenge/{id}/resetTaskInstructions | Reset Task Instructions
*ChallengeApi* | [**retrieveComments**](docs/ChallengeApi.md#retrieveComments) | **GET** /challenge/{id}/comments | Retrieve all comments for Challenge
*ChallengeApi* | [**undelete**](docs/ChallengeApi.md#undelete) | **PUT** /challenge/{id}/undelete | Undeletes a Challenge
*ChallengeApi* | [**update**](docs/ChallengeApi.md#update) | **PUT** /challenge/{id} | Updates a Challenge
*ChallengeApi* | [**updateChildren**](docs/ChallengeApi.md#updateChildren) | **PUT** /challenge/{id}/tasks | Create Tasks for Challenge
*ChallengeApi* | [**updateTaskPriorities**](docs/ChallengeApi.md#updateTaskPriorities) | **PUT** /challenge/{id}/updateTaskPriorities | Update Task Priorities
*ChangesApi* | [**applyTagFix**](docs/ChangesApi.md#applyTagFix) | **POST** /task/{taskId}/fix/apply | Apply Tag Changes for task
*ChangesApi* | [**testChange**](docs/ChangesApi.md#testChange) | **POST** /change/test | Test OSM changes (currently only node creation or tag changes)
*ChangesApi* | [**testTagChange**](docs/ChangesApi.md#testTagChange) | **POST** /change/tag/test | Test Changes
*CommentApi* | [**add**](docs/CommentApi.md#add) | **POST** /task/{id}/comment | Adds comment to Task
*CommentApi* | [**addChallengeComment**](docs/CommentApi.md#addChallengeComment) | **POST** /challenge/{id}/comment | Adds comment to Challenge
*CommentApi* | [**addToBundleTasks**](docs/CommentApi.md#addToBundleTasks) | **POST** /taskBundle/{id}/comment | Adds comment to each Task in a Task Bundle
*CommentApi* | [**delete**](docs/CommentApi.md#delete) | **DELETE** /task/{id}/comment/{commentId} | Deletes comment from Task
*CommentApi* | [**find**](docs/CommentApi.md#find) | **GET** /task/{id}/comments | Retrieves comments for a Task
*CommentApi* | [**findChallengeComments**](docs/CommentApi.md#findChallengeComments) | **GET** /challenge/{id}/challengeComments | Retrieves comments for a Challenge
*CommentApi* | [**retrieve**](docs/CommentApi.md#retrieve) | **GET** /comment/{id} | Retrieves a comment
*CommentApi* | [**update**](docs/CommentApi.md#update) | **PUT** /comment/{commentId} | Update comment on Task
*FollowApi* | [**block**](docs/FollowApi.md#block) | **POST** /user/{userId}/block | Block a follower
*FollowApi* | [**follow**](docs/FollowApi.md#follow) | **POST** /user/{userId}/follow | Follow a user
*FollowApi* | [**followedBy**](docs/FollowApi.md#followedBy) | **GET** /user/{userId}/following | Get users being followed by a user
*FollowApi* | [**followersOf**](docs/FollowApi.md#followersOf) | **GET** /user/{userId}/followers | Get users following a user
*FollowApi* | [**unblock**](docs/FollowApi.md#unblock) | **DELETE** /user/{userId}/block | Stop blocking a follower
*FollowApi* | [**unfollow**](docs/FollowApi.md#unfollow) | **DELETE** /user/{userId}/follow | Stop following a user
*KeywordApi* | [**batchUploadPost**](docs/KeywordApi.md#batchUploadPost) | **POST** /keywords | Create a batch of Keywords
*KeywordApi* | [**batchUploadPut**](docs/KeywordApi.md#batchUploadPut) | **PUT** /keywords | Update a batch of Keywords
*KeywordApi* | [**delete**](docs/KeywordApi.md#delete) | **DELETE** /keyword/{id} | Deletes an existing Keyword
*KeywordApi* | [**getTags**](docs/KeywordApi.md#getTags) | **GET** /keywords | Finds Keywords
*KeywordApi* | [**insert**](docs/KeywordApi.md#insert) | **POST** /keyword | Create a Keyword
*KeywordApi* | [**retrieve**](docs/KeywordApi.md#retrieve) | **GET** /keyword/{id} | Retrieves an already existing Keyword
*KeywordApi* | [**update**](docs/KeywordApi.md#update) | **PUT** /keyword/{id} | Updates a Keyword
*LeaderboardApi* | [**getLeaderboardForUser**](docs/LeaderboardApi.md#getLeaderboardForUser) | **GET** /data/user/{userId}/leaderboard | Fetches leaderboard stats with ranking for the user
*LeaderboardApi* | [**getMapperLeaderboard**](docs/LeaderboardApi.md#getMapperLeaderboard) | **GET** /data/user/leaderboard | Fetches the mapper leaderboard stats
*LeaderboardApi* | [**getReviewerLeaderboard**](docs/LeaderboardApi.md#getReviewerLeaderboard) | **GET** /data/reviewer/leaderboard | Fetches the reviewer leaderboard stats
*LeaderboardApi* | [**getUserTopChallenges**](docs/LeaderboardApi.md#getUserTopChallenges) | **GET** /data/user/{userId}/topChallenges | Gets the top challenges worked on by the user
*NotificationApi* | [**deleteNotifications**](docs/NotificationApi.md#deleteNotifications) | **DELETE** /user/{userId}/notifications | Delete user notifications
*NotificationApi* | [**getNotificationSubscriptions**](docs/NotificationApi.md#getNotificationSubscriptions) | **GET** /user/{userId}/notificationSubscriptions | Retrieves Users notification subscriptions
*NotificationApi* | [**getUserNotifications**](docs/NotificationApi.md#getUserNotifications) | **GET** /user/{userId}/notifications | Retrieves Users notifications
*NotificationApi* | [**markNotificationsRead**](docs/NotificationApi.md#markNotificationsRead) | **PUT** /user/{userId}/notifications | Mark user notifications as read
*NotificationApi* | [**updateNotificationSubscriptions**](docs/NotificationApi.md#updateNotificationSubscriptions) | **PUT** /user/{userId}/notificationSubscriptions | Updates user&#x27;s notification subscriptions
*ProjectApi* | [**delete**](docs/ProjectApi.md#delete) | **DELETE** /project/{id} | Deletes an existing Project
*ProjectApi* | [**extractAllTaskSummaries**](docs/ProjectApi.md#extractAllTaskSummaries) | **GET** /project/{projectId}/tasks/extract | Retrieve summaries of all tasks in a Project
*ProjectApi* | [**find**](docs/ProjectApi.md#find) | **GET** /projects | List all the projects.
*ProjectApi* | [**find_0**](docs/ProjectApi.md#find_0) | **GET** /projects/find | Find project matching search criteria. Use GET /projects to find instead.
*ProjectApi* | [**getClusteredPoints**](docs/ProjectApi.md#getClusteredPoints) | **GET** /project/clustered/{id} | Retrieves clustered challenge points
*ProjectApi* | [**getFeaturedProjects**](docs/ProjectApi.md#getFeaturedProjects) | **GET** /projects/featured | Retrieve featured projects
*ProjectApi* | [**getRandomTasks**](docs/ProjectApi.md#getRandomTasks) | **GET** /project/{id}/tasks | Retrieves random Task
*ProjectApi* | [**getSearchedClusteredPoints**](docs/ProjectApi.md#getSearchedClusteredPoints) | **GET** /project/search/clustered | Retrieves clustered challenge points
*ProjectApi* | [**insert**](docs/ProjectApi.md#insert) | **POST** /project | Create a Project
*ProjectApi* | [**listChildren**](docs/ProjectApi.md#listChildren) | **GET** /project/{id}/challenges | List all the projects challenges.
*ProjectApi* | [**listManagedProjects**](docs/ProjectApi.md#listManagedProjects) | **GET** /projects/managed | List all the managed projects.
*ProjectApi* | [**retrieve**](docs/ProjectApi.md#retrieve) | **GET** /project/{id} | Retrieves an already existing Project
*ProjectApi* | [**retrieveByName**](docs/ProjectApi.md#retrieveByName) | **GET** /projectByName/{name} | Retrieves an already existing Project
*ProjectApi* | [**retrieveComments**](docs/ProjectApi.md#retrieveComments) | **GET** /project/{id}/comments | Retrieve all comments for Project
*ProjectApi* | [**retrieveList**](docs/ProjectApi.md#retrieveList) | **GET** /projectsById | Retrieves already existing Projects based on a given list of ids
*ProjectApi* | [**update**](docs/ProjectApi.md#update) | **PUT** /project/{id} | Updates a Project
*ReviewApi* | [**cancelTaskReview**](docs/ReviewApi.md#cancelTaskReview) | **GET** /task/{id}/review/cancel | Cancels a claim on a task for review
*ReviewApi* | [**extractMapperMetrics**](docs/ReviewApi.md#extractMapperMetrics) | **GET** /tasks/review/mappers/export | Retrieve a summary of review coverage for mappers
*ReviewApi* | [**extractMetaReviewCoverage**](docs/ReviewApi.md#extractMetaReviewCoverage) | **GET** /tasks/metareview/reviewers/export | Retrieve a summary of meta-review coverage for reviewers
*ReviewApi* | [**getNearbyReviewTasks**](docs/ReviewApi.md#getNearbyReviewTasks) | **GET** /tasks/review/nearby/{proximityId} | Retrieves nearby Tasks
*ReviewApi* | [**getReviewMetrics**](docs/ReviewApi.md#getReviewMetrics) | **GET** /tasks/review/metrics | Retrieves tasks that need review
*ReviewApi* | [**getReviewRequestedTasks**](docs/ReviewApi.md#getReviewRequestedTasks) | **GET** /tasks/review | Retrieves tasks that need review
*ReviewApi* | [**getReviewTagMetrics**](docs/ReviewApi.md#getReviewTagMetrics) | **GET** /tasks/review/tag/metrics | Retrieves metrics grouped by tag
*ReviewApi* | [**getReviewTaskClusters**](docs/ReviewApi.md#getReviewTaskClusters) | **GET** /taskCluster/review | Retrieves task review clusters
*ReviewApi* | [**getReviewedTasks**](docs/ReviewApi.md#getReviewedTasks) | **GET** /tasks/reviewed | Retrieves reviewed tasks that have been reviewed either by this user or where the user requested the review.
*ReviewApi* | [**nextTaskReview**](docs/ReviewApi.md#nextTaskReview) | **GET** /tasks/review/next | Retrieves and claims a the next review needed Task
*ReviewApi* | [**startTaskReview**](docs/ReviewApi.md#startTaskReview) | **GET** /task/{id}/review/start | Retrieves and claims a review needed Task
*SnapshotApi* | [**delete**](docs/SnapshotApi.md#delete) | **DELETE** /snapshot/{snapshotId} | Deletes a snapshot
*SnapshotApi* | [**exportChallengeSnapshots**](docs/SnapshotApi.md#exportChallengeSnapshots) | **GET** /snapshot/challenge/{challengeId}/export | Creates a csv of all snapshots for a challenge.
*SnapshotApi* | [**getSnapshotList**](docs/SnapshotApi.md#getSnapshotList) | **GET** /snapshot/challenge/{challengeId}/list | Gets the list of snapshots for a challenge
*SnapshotApi* | [**recordChallengeSnapshot**](docs/SnapshotApi.md#recordChallengeSnapshot) | **GET** /snapshot/challenge/{challengeId}/record | Records a snapshot for a challenge
*SnapshotApi* | [**retrieve**](docs/SnapshotApi.md#retrieve) | **GET** /snapshot/{snapshotId} | Gets a snapshot
*TagApi* | [**batchUploadPost**](docs/TagApi.md#batchUploadPost) | **POST** /tags | 
*TagApi* | [**batchUploadPut**](docs/TagApi.md#batchUploadPut) | **PUT** /tags | 
*TagApi* | [**delete**](docs/TagApi.md#delete) | **DELETE** /tag/{id} | 
*TagApi* | [**getTags**](docs/TagApi.md#getTags) | **GET** /tags | 
*TagApi* | [**insert**](docs/TagApi.md#insert) | **POST** /tag | 
*TagApi* | [**retrieve**](docs/TagApi.md#retrieve) | **GET** /tag/{id} | 
*TagApi* | [**update**](docs/TagApi.md#update) | **PUT** /tag/{id} | 
*TaskApi* | [**attachment**](docs/TaskApi.md#attachment) | **GET** /task/{id}/attachment/{attachmentId} | Retrieve task attachment
*TaskApi* | [**attachmentData**](docs/TaskApi.md#attachmentData) | **GET** /task/{id}/attachment/{attachmentId}/data/{filename} | Download task attachment data as file
*TaskApi* | [**batchUploadPost**](docs/TaskApi.md#batchUploadPost) | **POST** /tasks | Create a batch of Tasks
*TaskApi* | [**batchUploadPut**](docs/TaskApi.md#batchUploadPut) | **PUT** /tasks | Update a batch of Tasks
*TaskApi* | [**bulkStatusChange**](docs/TaskApi.md#bulkStatusChange) | **PUT** /tasks/changeStatus | Changes status on tasks matching criteria
*TaskApi* | [**cooperativeWorkChangeXML**](docs/TaskApi.md#cooperativeWorkChangeXML) | **GET** /task/{id}/cooperative/change/{filename} | Retrieve any change XML that is part of this task&#x27;s cooperative work
*TaskApi* | [**create**](docs/TaskApi.md#create) | **POST** /task | Create a Task
*TaskApi* | [**delete**](docs/TaskApi.md#delete) | **DELETE** /task/{id} | Deletes an existing Task
*TaskApi* | [**deleteTagsFromItem**](docs/TaskApi.md#deleteTagsFromItem) | **DELETE** /task/{id}/tags | Delete Task Tags
*TaskApi* | [**find**](docs/TaskApi.md#find) | **GET** /tasks/find | Find Task matching search criteria
*TaskApi* | [**getItemsBasedOnTags**](docs/TaskApi.md#getItemsBasedOnTags) | **GET** /tasks/tags | Retrieve Tasks based on provided tags
*TaskApi* | [**getRandomTasks**](docs/TaskApi.md#getRandomTasks) | **GET** /tasks/random | Retrieves random Task
*TaskApi* | [**getTagsForTask**](docs/TaskApi.md#getTagsForTask) | **GET** /task/{id}/tags | Retrieve tags for Task
*TaskApi* | [**getTaskClusters**](docs/TaskApi.md#getTaskClusters) | **GET** /taskCluster | Retrieves task clusters. USE PUT METHOD
*TaskApi* | [**getTaskClusters_0**](docs/TaskApi.md#getTaskClusters_0) | **PUT** /taskCluster | Retrieves task clusters.
*TaskApi* | [**getTaskHistoryLog**](docs/TaskApi.md#getTaskHistoryLog) | **GET** /task/{id}/history | Retrieves a history for the task
*TaskApi* | [**getTasksInBoundingBox**](docs/TaskApi.md#getTasksInBoundingBox) | **GET** /tasks/box/{left}/{bottom}/{right}/{top} | Retrieves Tasks within a bounding box
*TaskApi* | [**getTasksInBoundingBox_0**](docs/TaskApi.md#getTasksInBoundingBox_0) | **PUT** /tasks/box/{left}/{bottom}/{right}/{top} | Retrieves Tasks within a bounding box
*TaskApi* | [**getTasksInCluster**](docs/TaskApi.md#getTasksInCluster) | **GET** /tasksInCluster/{clusterId} | Retrieves tasks in a cluster
*TaskApi* | [**matchToOSMChangeSet**](docs/TaskApi.md#matchToOSMChangeSet) | **PUT** /task/{id}/changeset | Update Task Changeset
*TaskApi* | [**read**](docs/TaskApi.md#read) | **GET** /task/{id} | Retrieves an already existing Task
*TaskApi* | [**readByName**](docs/TaskApi.md#readByName) | **GET** /challenge/{id}/task/{name} | Retrieves an already existing Task
*TaskApi* | [**refreshTaskLock**](docs/TaskApi.md#refreshTaskLock) | **GET** /task/{id}/refreshLock | Refresh an existing lock on a Task
*TaskApi* | [**releaseTask**](docs/TaskApi.md#releaseTask) | **GET** /task/{id}/release | Release a Task (unlocks it)
*TaskApi* | [**removeReviewRequest**](docs/TaskApi.md#removeReviewRequest) | **PUT** /tasks/review/remove | Changes review status to \&quot;Unnecessary\&quot; on tasks matching criteria
*TaskApi* | [**setBundleMetaReviewStatus**](docs/TaskApi.md#setBundleMetaReviewStatus) | **PUT** /taskBundle/{id}/metareview/{status} | Update Meta Review Status for a Bundle
*TaskApi* | [**setBundleTaskReviewStatus**](docs/TaskApi.md#setBundleTaskReviewStatus) | **PUT** /taskBundle/{id}/review/{status} | Update Task Review Status for a Bundle
*TaskApi* | [**setBundleTaskStatus**](docs/TaskApi.md#setBundleTaskStatus) | **PUT** /taskBundle/{bundleId}/{status} | Update Bundle Task Status
*TaskApi* | [**setMetaReviewStatus**](docs/TaskApi.md#setMetaReviewStatus) | **PUT** /task/{id}/metareview/{status} | Update Task Meta Review Status
*TaskApi* | [**setTaskReviewStatus**](docs/TaskApi.md#setTaskReviewStatus) | **PUT** /task/{id}/review/{status} | Update Task Review Status
*TaskApi* | [**setTaskStatus**](docs/TaskApi.md#setTaskStatus) | **PUT** /task/{id}/{status} | Update Task Status
*TaskApi* | [**startOnTask**](docs/TaskApi.md#startOnTask) | **GET** /task/{id}/start | Start working on a Task (locks it for the user)
*TaskApi* | [**update**](docs/TaskApi.md#update) | **PUT** /task/{id} | Updates a Task
*TaskApi* | [**updateCompletionResponses**](docs/TaskApi.md#updateCompletionResponses) | **PUT** /task/{id}/responses | Update Completion Responses
*TaskApi* | [**updateItemTags**](docs/TaskApi.md#updateItemTags) | **GET** /task/{id}/tags/update | Updates Task Tags
*TeamApi* | [**acceptInvite**](docs/TeamApi.md#acceptInvite) | **PUT** /team/{id}/invite/accept | Accept an invitation to join a team
*TeamApi* | [**addTeamToProject**](docs/TeamApi.md#addTeamToProject) | **POST** /team/{teamId}/project/{projectId}/{role} | Grant role to team on project
*TeamApi* | [**createTeam**](docs/TeamApi.md#createTeam) | **POST** /team | Create a new team
*TeamApi* | [**declineInvite**](docs/TeamApi.md#declineInvite) | **DELETE** /team/{id}/invite | Decline an invitation to join a team
*TeamApi* | [**deleteTeam**](docs/TeamApi.md#deleteTeam) | **DELETE** /team/{id} | Delete a team
*TeamApi* | [**find**](docs/TeamApi.md#find) | **GET** /teams/find | Find teams by name
*TeamApi* | [**getTeamsManagingProject**](docs/TeamApi.md#getTeamsManagingProject) | **GET** /teams/projectManagers/{projectId} | Get teams granted a role on a project
*TeamApi* | [**inviteUser**](docs/TeamApi.md#inviteUser) | **POST** /team/{id}/user/{userId}/invite/{role} | Invites a user to join a team
*TeamApi* | [**removeTeamFromProject**](docs/TeamApi.md#removeTeamFromProject) | **DELETE** /team/{teamId}/project/{projectId} | Remove granted roles on project from team
*TeamApi* | [**removeTeamMember**](docs/TeamApi.md#removeTeamMember) | **DELETE** /team/{id}/user/{userId}/ | Remove a member from a team
*TeamApi* | [**retrieve**](docs/TeamApi.md#retrieve) | **GET** /team/{id} | Retrieves a team
*TeamApi* | [**setTeamProjectRole**](docs/TeamApi.md#setTeamProjectRole) | **PUT** /team/{teamId}/project/{projectId}/{role} | Set granted role of team on project
*TeamApi* | [**teamUsers**](docs/TeamApi.md#teamUsers) | **GET** /team/{id}/userMembers | Retrieves users who are members of a team
*TeamApi* | [**updateMemberRole**](docs/TeamApi.md#updateMemberRole) | **PUT** /team/{id}/user/{userId}/role/{role} | Update a team member&#x27;s role
*TeamApi* | [**updateTeam**](docs/TeamApi.md#updateTeam) | **PUT** /team/{id} | Update a team
*TeamApi* | [**userTeamMemberships**](docs/TeamApi.md#userTeamMemberships) | **GET** /team/all/user/{userId}/memberships | Retrieves all team memberships for a user
*UserApi* | [**addUserToProject**](docs/UserApi.md#addUserToProject) | **POST** /user/{userId}/project/{projectId}/{role} | Grant role to user on project
*UserApi* | [**addUsersToProject**](docs/UserApi.md#addUsersToProject) | **PUT** /user/project/{projectId}/{role} | Grant role on project to a list of users
*UserApi* | [**deleteUser**](docs/UserApi.md#deleteUser) | **DELETE** /user/{osmId} | Deletes a user from the database
*UserApi* | [**generateAPIKey**](docs/UserApi.md#generateAPIKey) | **PUT** /user/{userId}/apikey | Generates an API_KEY for a specified user
*UserApi* | [**getPublicUser**](docs/UserApi.md#getPublicUser) | **GET** /user/{userId}/public | Retrieves Users public Json information
*UserApi* | [**getPublicUserByOSMUsername**](docs/UserApi.md#getPublicUserByOSMUsername) | **GET** /osmuser/{username}/public | Retrieves Users public Json information
*UserApi* | [**getSavedChallenges**](docs/UserApi.md#getSavedChallenges) | **GET** /user/{userId}/saved | Retrieves Users Saved Challenged
*UserApi* | [**getSavedTasks**](docs/UserApi.md#getSavedTasks) | **GET** /user/{userId}/savedTasks | Retrieves Users Saved Tasks
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /user/{userId} | Retrieves Users Json information
*UserApi* | [**getUserByOSMUsername**](docs/UserApi.md#getUserByOSMUsername) | **GET** /osmuser/{username} | Retrieves Users Json information
*UserApi* | [**getUsersManagingProject**](docs/UserApi.md#getUsersManagingProject) | **GET** /user/project/{projectId} | Gets a list of users managing project
*UserApi* | [**refreshProfile**](docs/UserApi.md#refreshProfile) | **PUT** /user/{userId}/refresh | Refresh User Profile
*UserApi* | [**removeUserFromProject**](docs/UserApi.md#removeUserFromProject) | **DELETE** /user/{userId}/project/{projectId}/{role} | Remove granted role on project from user
*UserApi* | [**removeUsersFromProject**](docs/UserApi.md#removeUsersFromProject) | **DELETE** /user/project/{projectId}/{role} | Removes granted role on project from a list of users
*UserApi* | [**saveChallenge**](docs/UserApi.md#saveChallenge) | **POST** /user/{userId}/save/{challengeId} | Saves Challenge for a User
*UserApi* | [**saveTask**](docs/UserApi.md#saveTask) | **POST** /user/{userId}/saveTask/{taskId} | Saves a Task for a User
*UserApi* | [**searchUserByOSMUsername**](docs/UserApi.md#searchUserByOSMUsername) | **GET** /users/find/{username} | Search for users by OSM username
*UserApi* | [**setUserProjectRole**](docs/UserApi.md#setUserProjectRole) | **PUT** /user/{userId}/project/{projectId}/{role} | Set project role for user, removing any prior roles on the project
*UserApi* | [**unsaveChallenge**](docs/UserApi.md#unsaveChallenge) | **DELETE** /user/{userId}/unsave/{challengeId} | Unsaves Challenge for a User
*UserApi* | [**unsaveTask**](docs/UserApi.md#unsaveTask) | **DELETE** /user/{userId}/unsaveTask/{taskId} | Unsaves Task for a User
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PUT** /user/{userId} | Updates UserSettings
*UserApi* | [**whoami**](docs/UserApi.md#whoami) | **GET** /user/whoami | Retrieves current user
*VirtualChallengeApi* | [**create**](docs/VirtualChallengeApi.md#create) | **POST** /virtualchallenge | Create a Virtual Challenge
*VirtualChallengeApi* | [**delete**](docs/VirtualChallengeApi.md#delete) | **DELETE** /virtualchallenge/{id} | Deletes an existing Virtual Challenge
*VirtualChallengeApi* | [**getClusteredPoints**](docs/VirtualChallengeApi.md#getClusteredPoints) | **GET** /virtualchallenge/clustered/{id} | Retrieves clustered Task points
*VirtualChallengeApi* | [**getNearbyTasks**](docs/VirtualChallengeApi.md#getNearbyTasks) | **GET** /virtualchallenge/{id}/tasksNearby/{proximityId} | Retrieves nearby Tasks in Virtual Challenge
*VirtualChallengeApi* | [**getRandomTask**](docs/VirtualChallengeApi.md#getRandomTask) | **GET** /virtualchallenge/{cid}/task | Retrieves random Task
*VirtualChallengeApi* | [**getSequentialNextTask**](docs/VirtualChallengeApi.md#getSequentialNextTask) | **GET** /virtualchallenge/{cid}/nextTask/{id} | Retrieves next Task
*VirtualChallengeApi* | [**getSequentialPreviousTask**](docs/VirtualChallengeApi.md#getSequentialPreviousTask) | **GET** /virtualchallenge/{cid}/previousTask/{id} | Retrieves previous Task
*VirtualChallengeApi* | [**getVirtualChallengeGeoJSON**](docs/VirtualChallengeApi.md#getVirtualChallengeGeoJSON) | **GET** /virtualchallenge/view/{id} | Retrieves Virtual Challenge GeoJSON
*VirtualChallengeApi* | [**list**](docs/VirtualChallengeApi.md#list) | **GET** /virtualchallenges | List all the Virtual Challenge.
*VirtualChallengeApi* | [**listTasks**](docs/VirtualChallengeApi.md#listTasks) | **GET** /virtualchallenge/{id}/tasks | List all the Virtual Challenges Tasks.
*VirtualChallengeApi* | [**read**](docs/VirtualChallengeApi.md#read) | **GET** /virtualchallenge/{id} | Retrieves an already existing Virtual Challenge
*VirtualChallengeApi* | [**readByName**](docs/VirtualChallengeApi.md#readByName) | **GET** /virtualchallengebyname/{name} | Retrieves an already existing Virtual Challenge
*VirtualChallengeApi* | [**update**](docs/VirtualChallengeApi.md#update) | **PUT** /virtualchallenge/{id} | Updates a Virtual Challenge
*VirtualProjectApi* | [**addChallenge**](docs/VirtualProjectApi.md#addChallenge) | **POST** /project/{projectId}/challenge/{id}/add | Add Challenge to a virtual Project
*VirtualProjectApi* | [**removeChallenge**](docs/VirtualProjectApi.md#removeChallenge) | **POST** /project/{projectId}/challenge/{id}/remove | Remove Challenge from a virtual Project

## Documentation for Models

 - [ElementCreate](docs/ElementCreate.md)
 - [ElementTagChange](docs/ElementTagChange.md)
 - [ElementUpdate](docs/ElementUpdate.md)
 - [Keyword](docs/Keyword.md)
 - [OSMChange](docs/OSMChange.md)
 - [OSMChangeSubmission](docs/OSMChangeSubmission.md)
 - [OSMType](docs/OSMType.md)
 - [OrgMaprouletteDataItemType](docs/OrgMaprouletteDataItemType.md)
 - [OrgMaprouletteExceptionStatusMessage](docs/OrgMaprouletteExceptionStatusMessage.md)
 - [OrgMaprouletteFrameworkModelChallenge](docs/OrgMaprouletteFrameworkModelChallenge.md)
 - [OrgMaprouletteFrameworkModelChallengeComment](docs/OrgMaprouletteFrameworkModelChallengeComment.md)
 - [OrgMaprouletteFrameworkModelChallengeCreation](docs/OrgMaprouletteFrameworkModelChallengeCreation.md)
 - [OrgMaprouletteFrameworkModelChallengeExtra](docs/OrgMaprouletteFrameworkModelChallengeExtra.md)
 - [OrgMaprouletteFrameworkModelChallengeGeneral](docs/OrgMaprouletteFrameworkModelChallengeGeneral.md)
 - [OrgMaprouletteFrameworkModelChallengeListing](docs/OrgMaprouletteFrameworkModelChallengeListing.md)
 - [OrgMaprouletteFrameworkModelChallengePriority](docs/OrgMaprouletteFrameworkModelChallengePriority.md)
 - [OrgMaprouletteFrameworkModelClusteredPoint](docs/OrgMaprouletteFrameworkModelClusteredPoint.md)
 - [OrgMaprouletteFrameworkModelComment](docs/OrgMaprouletteFrameworkModelComment.md)
 - [OrgMaprouletteFrameworkModelCustomBasemap](docs/OrgMaprouletteFrameworkModelCustomBasemap.md)
 - [OrgMaprouletteFrameworkModelGrant](docs/OrgMaprouletteFrameworkModelGrant.md)
 - [OrgMaprouletteFrameworkModelGrantTarget](docs/OrgMaprouletteFrameworkModelGrantTarget.md)
 - [OrgMaprouletteFrameworkModelGrantee](docs/OrgMaprouletteFrameworkModelGrantee.md)
 - [OrgMaprouletteFrameworkModelGroup](docs/OrgMaprouletteFrameworkModelGroup.md)
 - [OrgMaprouletteFrameworkModelLocation](docs/OrgMaprouletteFrameworkModelLocation.md)
 - [OrgMaprouletteFrameworkModelMapillaryImage](docs/OrgMaprouletteFrameworkModelMapillaryImage.md)
 - [OrgMaprouletteFrameworkModelNotificationSubscriptions](docs/OrgMaprouletteFrameworkModelNotificationSubscriptions.md)
 - [OrgMaprouletteFrameworkModelOSMProfile](docs/OrgMaprouletteFrameworkModelOSMProfile.md)
 - [OrgMaprouletteFrameworkModelPoint](docs/OrgMaprouletteFrameworkModelPoint.md)
 - [OrgMaprouletteFrameworkModelPointReview](docs/OrgMaprouletteFrameworkModelPointReview.md)
 - [OrgMaprouletteFrameworkModelProjectManager](docs/OrgMaprouletteFrameworkModelProjectManager.md)
 - [OrgMaprouletteFrameworkModelReviewMetrics](docs/OrgMaprouletteFrameworkModelReviewMetrics.md)
 - [OrgMaprouletteFrameworkModelTag](docs/OrgMaprouletteFrameworkModelTag.md)
 - [OrgMaprouletteFrameworkModelTask](docs/OrgMaprouletteFrameworkModelTask.md)
 - [OrgMaprouletteFrameworkModelTaskCluster](docs/OrgMaprouletteFrameworkModelTaskCluster.md)
 - [OrgMaprouletteFrameworkModelTaskReviewFields](docs/OrgMaprouletteFrameworkModelTaskReviewFields.md)
 - [OrgMaprouletteFrameworkModelTeamUser](docs/OrgMaprouletteFrameworkModelTeamUser.md)
 - [OrgMaprouletteFrameworkModelUser](docs/OrgMaprouletteFrameworkModelUser.md)
 - [OrgMaprouletteFrameworkModelUserNotification](docs/OrgMaprouletteFrameworkModelUserNotification.md)
 - [OrgMaprouletteFrameworkModelUserSettings](docs/OrgMaprouletteFrameworkModelUserSettings.md)
 - [OrgMaprouletteModelsVirtualChallenge](docs/OrgMaprouletteModelsVirtualChallenge.md)
 - [OrgMaprouletteSessionSearchChallengeParameters](docs/OrgMaprouletteSessionSearchChallengeParameters.md)
 - [OrgMaprouletteSessionSearchLeaderboardParameters](docs/OrgMaprouletteSessionSearchLeaderboardParameters.md)
 - [OrgMaprouletteSessionSearchLocation](docs/OrgMaprouletteSessionSearchLocation.md)
 - [OrgMaprouletteSessionSearchParameters](docs/OrgMaprouletteSessionSearchParameters.md)
 - [OrgMaprouletteSessionSearchReviewParameters](docs/OrgMaprouletteSessionSearchReviewParameters.md)
 - [OrgMaprouletteSessionSearchTaskParameters](docs/OrgMaprouletteSessionSearchTaskParameters.md)
 - [OrgMaprouletteSessionTaskPropertySearch](docs/OrgMaprouletteSessionTaskPropertySearch.md)
 - [Project](docs/Project.md)
 - [PublicOSMUser](docs/PublicOSMUser.md)
 - [PublicUser](docs/PublicUser.md)
 - [PublicUserSettings](docs/PublicUserSettings.md)
 - [TagChange](docs/TagChange.md)
 - [TagChangeResult](docs/TagChangeResult.md)
 - [TagChangeSubmission](docs/TagChangeSubmission.md)
 - [TaskBundle](docs/TaskBundle.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


