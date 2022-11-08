/*
 * MapRoulette API
 * API for MapRoulette enabling the creation and maintenance of MapRoulette challenges
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.github.thesnoozer.maproulette.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OrgMaprouletteSessionSearchLeaderboardParameters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteSessionSearchLeaderboardParameters {
  @JsonProperty("userFilter")
  private List<Long> userFilter = null;

  @JsonProperty("projectFilter")
  private List<Long> projectFilter = null;

  @JsonProperty("challengeFilter")
  private List<Long> challengeFilter = null;

  @JsonProperty("countryCodeFilter")
  private List<String> countryCodeFilter = null;

  @JsonProperty("monthDuration")
  private Integer monthDuration = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("end")
  private Integer end = null;

  @JsonProperty("onlyEnabled")
  private Boolean onlyEnabled = null;

  public OrgMaprouletteSessionSearchLeaderboardParameters userFilter(List<Long> userFilter) {
    this.userFilter = userFilter;
    return this;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters addUserFilterItem(Long userFilterItem) {
    if (this.userFilter == null) {
      this.userFilter = new ArrayList<>();
    }
    this.userFilter.add(userFilterItem);
    return this;
  }

   /**
   * Get userFilter
   * @return userFilter
  **/
  @Schema(description = "")
  public List<Long> getUserFilter() {
    return userFilter;
  }

  public void setUserFilter(List<Long> userFilter) {
    this.userFilter = userFilter;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters projectFilter(List<Long> projectFilter) {
    this.projectFilter = projectFilter;
    return this;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters addProjectFilterItem(Long projectFilterItem) {
    if (this.projectFilter == null) {
      this.projectFilter = new ArrayList<>();
    }
    this.projectFilter.add(projectFilterItem);
    return this;
  }

   /**
   * Get projectFilter
   * @return projectFilter
  **/
  @Schema(description = "")
  public List<Long> getProjectFilter() {
    return projectFilter;
  }

  public void setProjectFilter(List<Long> projectFilter) {
    this.projectFilter = projectFilter;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters challengeFilter(List<Long> challengeFilter) {
    this.challengeFilter = challengeFilter;
    return this;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters addChallengeFilterItem(Long challengeFilterItem) {
    if (this.challengeFilter == null) {
      this.challengeFilter = new ArrayList<>();
    }
    this.challengeFilter.add(challengeFilterItem);
    return this;
  }

   /**
   * Get challengeFilter
   * @return challengeFilter
  **/
  @Schema(description = "")
  public List<Long> getChallengeFilter() {
    return challengeFilter;
  }

  public void setChallengeFilter(List<Long> challengeFilter) {
    this.challengeFilter = challengeFilter;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters countryCodeFilter(List<String> countryCodeFilter) {
    this.countryCodeFilter = countryCodeFilter;
    return this;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters addCountryCodeFilterItem(String countryCodeFilterItem) {
    if (this.countryCodeFilter == null) {
      this.countryCodeFilter = new ArrayList<>();
    }
    this.countryCodeFilter.add(countryCodeFilterItem);
    return this;
  }

   /**
   * Get countryCodeFilter
   * @return countryCodeFilter
  **/
  @Schema(description = "")
  public List<String> getCountryCodeFilter() {
    return countryCodeFilter;
  }

  public void setCountryCodeFilter(List<String> countryCodeFilter) {
    this.countryCodeFilter = countryCodeFilter;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters monthDuration(Integer monthDuration) {
    this.monthDuration = monthDuration;
    return this;
  }

   /**
   * Get monthDuration
   * @return monthDuration
  **/
  @Schema(description = "")
  public Integer getMonthDuration() {
    return monthDuration;
  }

  public void setMonthDuration(Integer monthDuration) {
    this.monthDuration = monthDuration;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(description = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @Schema(description = "")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public OrgMaprouletteSessionSearchLeaderboardParameters onlyEnabled(Boolean onlyEnabled) {
    this.onlyEnabled = onlyEnabled;
    return this;
  }

   /**
   * Get onlyEnabled
   * @return onlyEnabled
  **/
  @Schema(required = true, description = "")
  public Boolean isOnlyEnabled() {
    return onlyEnabled;
  }

  public void setOnlyEnabled(Boolean onlyEnabled) {
    this.onlyEnabled = onlyEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteSessionSearchLeaderboardParameters orgMaprouletteSessionSearchLeaderboardParameters = (OrgMaprouletteSessionSearchLeaderboardParameters) o;
    return Objects.equals(this.userFilter, orgMaprouletteSessionSearchLeaderboardParameters.userFilter) &&
        Objects.equals(this.projectFilter, orgMaprouletteSessionSearchLeaderboardParameters.projectFilter) &&
        Objects.equals(this.challengeFilter, orgMaprouletteSessionSearchLeaderboardParameters.challengeFilter) &&
        Objects.equals(this.countryCodeFilter, orgMaprouletteSessionSearchLeaderboardParameters.countryCodeFilter) &&
        Objects.equals(this.monthDuration, orgMaprouletteSessionSearchLeaderboardParameters.monthDuration) &&
        Objects.equals(this.start, orgMaprouletteSessionSearchLeaderboardParameters.start) &&
        Objects.equals(this.end, orgMaprouletteSessionSearchLeaderboardParameters.end) &&
        Objects.equals(this.onlyEnabled, orgMaprouletteSessionSearchLeaderboardParameters.onlyEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFilter, projectFilter, challengeFilter, countryCodeFilter, monthDuration, start, end, onlyEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteSessionSearchLeaderboardParameters {\n");
    
    sb.append("    userFilter: ").append(toIndentedString(userFilter)).append("\n");
    sb.append("    projectFilter: ").append(toIndentedString(projectFilter)).append("\n");
    sb.append("    challengeFilter: ").append(toIndentedString(challengeFilter)).append("\n");
    sb.append("    countryCodeFilter: ").append(toIndentedString(countryCodeFilter)).append("\n");
    sb.append("    monthDuration: ").append(toIndentedString(monthDuration)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    onlyEnabled: ").append(toIndentedString(onlyEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}