package io.github.thesnoozer.maproulette.client.api;

import io.github.thesnoozer.maproulette.client.ApiException;
import io.github.thesnoozer.maproulette.client.ApiClient;
import io.github.thesnoozer.maproulette.client.Configuration;
import io.github.thesnoozer.maproulette.client.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")public class LeaderboardApi {
  private ApiClient apiClient;

  public LeaderboardApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LeaderboardApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Fetches leaderboard stats with ranking for the user
   * Fetches user&#x27;s current ranking and stats in the leaderboard along with a number of mappers above and below in the rankings.
   * @param userId User id to fetch ranking for. (required)
   * @param bracket How many results before and after the found user to return (optional, default to 0)
   * @param projectIds The optional project ids to search by (optional)
   * @param challengeIds The optional challenge ids to search by (optional)
   * @param countryCodes The optional country codes to search by (optional)
   * @param monthDuration The optional number of past months to search by (with 0 as current month and -1 as all time) (optional)
   * @param start The optional start date when not using monthDuration (optional)
   * @param end The optional end date when not using monthDuration (optional)
   * @param onlyEnabled Limit search to only enabled challenges (optional)
   * @throws ApiException if fails to make API call
   */
  public void getLeaderboardForUser(Long userId, Integer bracket, Object projectIds, Object challengeIds, Object countryCodes, Object monthDuration, Object start, Object end, Object onlyEnabled) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getLeaderboardForUser");
    }
    // create path and map variables
    String localVarPath = "/data/user/{userId}/leaderboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bracket", bracket));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectIds", projectIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "challengeIds", challengeIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCodes", countryCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monthDuration", monthDuration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyEnabled", onlyEnabled));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Fetches the mapper leaderboard stats
   * Fetches the mapper leaderboard stats
   * @param limit  (optional, default to 20)
   * @param offset  (optional, default to 0)
   * @param userIds The optional user ids to search by (optional)
   * @param projectIds The optional project ids to search by (optional)
   * @param challengeIds The optional challenge ids to search by (optional)
   * @param countryCodes The optional country codes to search by (optional)
   * @param monthDuration The optional number of past months to search by (with 0 as current month and -1 as all time) (optional)
   * @param start The optional start date when not using monthDuration (optional)
   * @param end The optional end date when not using monthDuration (optional)
   * @param onlyEnabled Limit search to only enabled challenges (optional)
   * @throws ApiException if fails to make API call
   */
  public void getMapperLeaderboard(Integer limit, Integer offset, Object userIds, Object projectIds, Object challengeIds, Object countryCodes, Object monthDuration, Object start, Object end, Object onlyEnabled) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/data/user/leaderboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userIds", userIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectIds", projectIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "challengeIds", challengeIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCodes", countryCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monthDuration", monthDuration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyEnabled", onlyEnabled));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Fetches the reviewer leaderboard stats
   * Fetches the reviewer leaderboard stats
   * @param limit  (optional, default to 20)
   * @param offset  (optional, default to 0)
   * @param projectIds The optional project ids to search by (optional)
   * @param challengeIds The optional challenge ids to search by (optional)
   * @param monthDuration The optional number of past months to search by (with 0 as current month and -1 as all time) (optional)
   * @param start The optional start date when not using monthDuration (optional)
   * @param end The optional end date when not using monthDuration (optional)
   * @throws ApiException if fails to make API call
   */
  public void getReviewerLeaderboard(Integer limit, Integer offset, Object projectIds, Object challengeIds, Object monthDuration, Object start, Object end) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/data/reviewer/leaderboard";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectIds", projectIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "challengeIds", challengeIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monthDuration", monthDuration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Gets the top challenges worked on by the user
   * Gets the top challenges worked on by the user
   * @param userId User id to fetch challenges for. (required)
   * @param limit  (optional, default to 20)
   * @param offset  (optional, default to 0)
   * @param projectIds The optional project ids to search by (optional)
   * @param challengeIds The optional challenge ids to search by (optional)
   * @param countryCodes The optional country codes to search by (optional)
   * @param monthDuration The optional number of past months to search by (with 0 as current month and -1 as all time) (optional)
   * @param start The optional start date when not using monthDuration (optional)
   * @param end The optional end date when not using monthDuration (optional)
   * @param onlyEnabled Limit search to only enabled challenges (optional)
   * @throws ApiException if fails to make API call
   */
  public void getUserTopChallenges(Long userId, Integer limit, Integer offset, Object projectIds, Object challengeIds, Object countryCodes, Object monthDuration, Object start, Object end, Object onlyEnabled) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserTopChallenges");
    }
    // create path and map variables
    String localVarPath = "/data/user/{userId}/topChallenges";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectIds", projectIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "challengeIds", challengeIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCodes", countryCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monthDuration", monthDuration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyEnabled", onlyEnabled));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
