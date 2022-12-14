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
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteSessionSearchParameters;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OrgMaprouletteModelsVirtualChallenge
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteModelsVirtualChallenge {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("created")
  private Integer created = null;

  @JsonProperty("modified")
  private Integer modified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("ownerId")
  private Long ownerId = null;

  @JsonProperty("searchParameters")
  private OrgMaprouletteSessionSearchParameters searchParameters = null;

  @JsonProperty("expiry")
  private Integer expiry = null;

  @JsonProperty("taskIdList")
  private List<Long> taskIdList = null;

  public OrgMaprouletteModelsVirtualChallenge id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrgMaprouletteModelsVirtualChallenge name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrgMaprouletteModelsVirtualChallenge created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(required = true, description = "")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public OrgMaprouletteModelsVirtualChallenge modified(Integer modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @Schema(required = true, description = "")
  public Integer getModified() {
    return modified;
  }

  public void setModified(Integer modified) {
    this.modified = modified;
  }

  public OrgMaprouletteModelsVirtualChallenge description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrgMaprouletteModelsVirtualChallenge ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @Schema(required = true, description = "")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public OrgMaprouletteModelsVirtualChallenge searchParameters(OrgMaprouletteSessionSearchParameters searchParameters) {
    this.searchParameters = searchParameters;
    return this;
  }

   /**
   * Get searchParameters
   * @return searchParameters
  **/
  @Schema(required = true, description = "")
  public OrgMaprouletteSessionSearchParameters getSearchParameters() {
    return searchParameters;
  }

  public void setSearchParameters(OrgMaprouletteSessionSearchParameters searchParameters) {
    this.searchParameters = searchParameters;
  }

  public OrgMaprouletteModelsVirtualChallenge expiry(Integer expiry) {
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @Schema(required = true, description = "")
  public Integer getExpiry() {
    return expiry;
  }

  public void setExpiry(Integer expiry) {
    this.expiry = expiry;
  }

  public OrgMaprouletteModelsVirtualChallenge taskIdList(List<Long> taskIdList) {
    this.taskIdList = taskIdList;
    return this;
  }

  public OrgMaprouletteModelsVirtualChallenge addTaskIdListItem(Long taskIdListItem) {
    if (this.taskIdList == null) {
      this.taskIdList = new ArrayList<>();
    }
    this.taskIdList.add(taskIdListItem);
    return this;
  }

   /**
   * Get taskIdList
   * @return taskIdList
  **/
  @Schema(description = "")
  public List<Long> getTaskIdList() {
    return taskIdList;
  }

  public void setTaskIdList(List<Long> taskIdList) {
    this.taskIdList = taskIdList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteModelsVirtualChallenge orgMaprouletteModelsVirtualChallenge = (OrgMaprouletteModelsVirtualChallenge) o;
    return Objects.equals(this.id, orgMaprouletteModelsVirtualChallenge.id) &&
        Objects.equals(this.name, orgMaprouletteModelsVirtualChallenge.name) &&
        Objects.equals(this.created, orgMaprouletteModelsVirtualChallenge.created) &&
        Objects.equals(this.modified, orgMaprouletteModelsVirtualChallenge.modified) &&
        Objects.equals(this.description, orgMaprouletteModelsVirtualChallenge.description) &&
        Objects.equals(this.ownerId, orgMaprouletteModelsVirtualChallenge.ownerId) &&
        Objects.equals(this.searchParameters, orgMaprouletteModelsVirtualChallenge.searchParameters) &&
        Objects.equals(this.expiry, orgMaprouletteModelsVirtualChallenge.expiry) &&
        Objects.equals(this.taskIdList, orgMaprouletteModelsVirtualChallenge.taskIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, created, modified, description, ownerId, searchParameters, expiry, taskIdList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteModelsVirtualChallenge {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    searchParameters: ").append(toIndentedString(searchParameters)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    taskIdList: ").append(toIndentedString(taskIdList)).append("\n");
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
