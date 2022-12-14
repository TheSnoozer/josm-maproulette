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
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteSessionTaskPropertySearch;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OrgMaprouletteSessionSearchTaskParameters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteSessionSearchTaskParameters {
  @JsonProperty("taskTags")
  private List<String> taskTags = null;

  @JsonProperty("taskTagConjunction")
  private Boolean taskTagConjunction = null;

  @JsonProperty("taskSearch")
  private String taskSearch = null;

  @JsonProperty("taskStatus")
  private List<Integer> taskStatus = null;

  @JsonProperty("taskId")
  private Long taskId = null;

  @JsonProperty("taskReviewStatus")
  private List<Integer> taskReviewStatus = null;

  @JsonProperty("taskPropertySearchType")
  private String taskPropertySearchType = null;

  @JsonProperty("taskPropertySearch")
  private OrgMaprouletteSessionTaskPropertySearch taskPropertySearch = null;

  @JsonProperty("taskPriorities")
  private List<Integer> taskPriorities = null;

  @JsonProperty("excludeTaskIds")
  private List<Long> excludeTaskIds = null;

  @JsonProperty("taskMappedOn")
  private String taskMappedOn = null;

  public OrgMaprouletteSessionSearchTaskParameters taskTags(List<String> taskTags) {
    this.taskTags = taskTags;
    return this;
  }

  public OrgMaprouletteSessionSearchTaskParameters addTaskTagsItem(String taskTagsItem) {
    if (this.taskTags == null) {
      this.taskTags = new ArrayList<>();
    }
    this.taskTags.add(taskTagsItem);
    return this;
  }

   /**
   * Get taskTags
   * @return taskTags
  **/
  @Schema(description = "")
  public List<String> getTaskTags() {
    return taskTags;
  }

  public void setTaskTags(List<String> taskTags) {
    this.taskTags = taskTags;
  }

  public OrgMaprouletteSessionSearchTaskParameters taskTagConjunction(Boolean taskTagConjunction) {
    this.taskTagConjunction = taskTagConjunction;
    return this;
  }

   /**
   * Get taskTagConjunction
   * @return taskTagConjunction
  **/
  @Schema(description = "")
  public Boolean isTaskTagConjunction() {
    return taskTagConjunction;
  }

  public void setTaskTagConjunction(Boolean taskTagConjunction) {
    this.taskTagConjunction = taskTagConjunction;
  }

  public OrgMaprouletteSessionSearchTaskParameters taskSearch(String taskSearch) {
    this.taskSearch = taskSearch;
    return this;
  }

   /**
   * Get taskSearch
   * @return taskSearch
  **/
  @Schema(description = "")
  public String getTaskSearch() {
    return taskSearch;
  }

  public void setTaskSearch(String taskSearch) {
    this.taskSearch = taskSearch;
  }

  public OrgMaprouletteSessionSearchTaskParameters taskStatus(List<Integer> taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

  public OrgMaprouletteSessionSearchTaskParameters addTaskStatusItem(Integer taskStatusItem) {
    if (this.taskStatus == null) {
      this.taskStatus = new ArrayList<>();
    }
    this.taskStatus.add(taskStatusItem);
    return this;
  }

   /**
   * Get taskStatus
   * @return taskStatus
  **/
  @Schema(description = "")
  public List<Integer> getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(List<Integer> taskStatus) {
    this.taskStatus = taskStatus;
  }

  public OrgMaprouletteSessionSearchTaskParameters taskId(Long taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @Schema(description = "")
  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }

  public OrgMaprouletteSessionSearchTaskParameters taskReviewStatus(List<Integer> taskReviewStatus) {
    this.taskReviewStatus = taskReviewStatus;
    return this;
  }

  public OrgMaprouletteSessionSearchTaskParameters addTaskReviewStatusItem(Integer taskReviewStatusItem) {
    if (this.taskReviewStatus == null) {
      this.taskReviewStatus = new ArrayList<>();
    }
    this.taskReviewStatus.add(taskReviewStatusItem);
    return this;
  }

   /**
   * Get taskReviewStatus
   * @return taskReviewStatus
  **/
  @Schema(description = "")
  public List<Integer> getTaskReviewStatus() {
    return taskReviewStatus;
  }

  public void setTaskReviewStatus(List<Integer> taskReviewStatus) {
    this.taskReviewStatus = taskReviewStatus;
  }

  public OrgMaprouletteSessionSearchTaskParameters taskPropertySearchType(String taskPropertySearchType) {
    this.taskPropertySearchType = taskPropertySearchType;
    return this;
  }

   /**
   * Get taskPropertySearchType
   * @return taskPropertySearchType
  **/
  @Schema(description = "")
  public String getTaskPropertySearchType() {
    return taskPropertySearchType;
  }

  public void setTaskPropertySearchType(String taskPropertySearchType) {
    this.taskPropertySearchType = taskPropertySearchType;
  }

  public OrgMaprouletteSessionSearchTaskParameters taskPropertySearch(OrgMaprouletteSessionTaskPropertySearch taskPropertySearch) {
    this.taskPropertySearch = taskPropertySearch;
    return this;
  }

   /**
   * Get taskPropertySearch
   * @return taskPropertySearch
  **/
  @Schema(description = "")
  public OrgMaprouletteSessionTaskPropertySearch getTaskPropertySearch() {
    return taskPropertySearch;
  }

  public void setTaskPropertySearch(OrgMaprouletteSessionTaskPropertySearch taskPropertySearch) {
    this.taskPropertySearch = taskPropertySearch;
  }

  public OrgMaprouletteSessionSearchTaskParameters taskPriorities(List<Integer> taskPriorities) {
    this.taskPriorities = taskPriorities;
    return this;
  }

  public OrgMaprouletteSessionSearchTaskParameters addTaskPrioritiesItem(Integer taskPrioritiesItem) {
    if (this.taskPriorities == null) {
      this.taskPriorities = new ArrayList<>();
    }
    this.taskPriorities.add(taskPrioritiesItem);
    return this;
  }

   /**
   * Get taskPriorities
   * @return taskPriorities
  **/
  @Schema(description = "")
  public List<Integer> getTaskPriorities() {
    return taskPriorities;
  }

  public void setTaskPriorities(List<Integer> taskPriorities) {
    this.taskPriorities = taskPriorities;
  }

  public OrgMaprouletteSessionSearchTaskParameters excludeTaskIds(List<Long> excludeTaskIds) {
    this.excludeTaskIds = excludeTaskIds;
    return this;
  }

  public OrgMaprouletteSessionSearchTaskParameters addExcludeTaskIdsItem(Long excludeTaskIdsItem) {
    if (this.excludeTaskIds == null) {
      this.excludeTaskIds = new ArrayList<>();
    }
    this.excludeTaskIds.add(excludeTaskIdsItem);
    return this;
  }

   /**
   * Get excludeTaskIds
   * @return excludeTaskIds
  **/
  @Schema(description = "")
  public List<Long> getExcludeTaskIds() {
    return excludeTaskIds;
  }

  public void setExcludeTaskIds(List<Long> excludeTaskIds) {
    this.excludeTaskIds = excludeTaskIds;
  }

  public OrgMaprouletteSessionSearchTaskParameters taskMappedOn(String taskMappedOn) {
    this.taskMappedOn = taskMappedOn;
    return this;
  }

   /**
   * Get taskMappedOn
   * @return taskMappedOn
  **/
  @Schema(description = "")
  public String getTaskMappedOn() {
    return taskMappedOn;
  }

  public void setTaskMappedOn(String taskMappedOn) {
    this.taskMappedOn = taskMappedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteSessionSearchTaskParameters orgMaprouletteSessionSearchTaskParameters = (OrgMaprouletteSessionSearchTaskParameters) o;
    return Objects.equals(this.taskTags, orgMaprouletteSessionSearchTaskParameters.taskTags) &&
        Objects.equals(this.taskTagConjunction, orgMaprouletteSessionSearchTaskParameters.taskTagConjunction) &&
        Objects.equals(this.taskSearch, orgMaprouletteSessionSearchTaskParameters.taskSearch) &&
        Objects.equals(this.taskStatus, orgMaprouletteSessionSearchTaskParameters.taskStatus) &&
        Objects.equals(this.taskId, orgMaprouletteSessionSearchTaskParameters.taskId) &&
        Objects.equals(this.taskReviewStatus, orgMaprouletteSessionSearchTaskParameters.taskReviewStatus) &&
        Objects.equals(this.taskPropertySearchType, orgMaprouletteSessionSearchTaskParameters.taskPropertySearchType) &&
        Objects.equals(this.taskPropertySearch, orgMaprouletteSessionSearchTaskParameters.taskPropertySearch) &&
        Objects.equals(this.taskPriorities, orgMaprouletteSessionSearchTaskParameters.taskPriorities) &&
        Objects.equals(this.excludeTaskIds, orgMaprouletteSessionSearchTaskParameters.excludeTaskIds) &&
        Objects.equals(this.taskMappedOn, orgMaprouletteSessionSearchTaskParameters.taskMappedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskTags, taskTagConjunction, taskSearch, taskStatus, taskId, taskReviewStatus, taskPropertySearchType, taskPropertySearch, taskPriorities, excludeTaskIds, taskMappedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteSessionSearchTaskParameters {\n");
    
    sb.append("    taskTags: ").append(toIndentedString(taskTags)).append("\n");
    sb.append("    taskTagConjunction: ").append(toIndentedString(taskTagConjunction)).append("\n");
    sb.append("    taskSearch: ").append(toIndentedString(taskSearch)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskReviewStatus: ").append(toIndentedString(taskReviewStatus)).append("\n");
    sb.append("    taskPropertySearchType: ").append(toIndentedString(taskPropertySearchType)).append("\n");
    sb.append("    taskPropertySearch: ").append(toIndentedString(taskPropertySearch)).append("\n");
    sb.append("    taskPriorities: ").append(toIndentedString(taskPriorities)).append("\n");
    sb.append("    excludeTaskIds: ").append(toIndentedString(excludeTaskIds)).append("\n");
    sb.append("    taskMappedOn: ").append(toIndentedString(taskMappedOn)).append("\n");
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
