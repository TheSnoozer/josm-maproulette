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
/**
 * OrgMaprouletteFrameworkModelChallengeListing
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteFrameworkModelChallengeListing {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("parent")
  private Long parent = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  public OrgMaprouletteFrameworkModelChallengeListing id(Long id) {
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

  public OrgMaprouletteFrameworkModelChallengeListing parent(Long parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Schema(required = true, description = "")
  public Long getParent() {
    return parent;
  }

  public void setParent(Long parent) {
    this.parent = parent;
  }

  public OrgMaprouletteFrameworkModelChallengeListing name(String name) {
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

  public OrgMaprouletteFrameworkModelChallengeListing enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(required = true, description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public OrgMaprouletteFrameworkModelChallengeListing status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public OrgMaprouletteFrameworkModelChallengeListing isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Get isArchived
   * @return isArchived
  **/
  @Schema(required = true, description = "")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteFrameworkModelChallengeListing orgMaprouletteFrameworkModelChallengeListing = (OrgMaprouletteFrameworkModelChallengeListing) o;
    return Objects.equals(this.id, orgMaprouletteFrameworkModelChallengeListing.id) &&
        Objects.equals(this.parent, orgMaprouletteFrameworkModelChallengeListing.parent) &&
        Objects.equals(this.name, orgMaprouletteFrameworkModelChallengeListing.name) &&
        Objects.equals(this.enabled, orgMaprouletteFrameworkModelChallengeListing.enabled) &&
        Objects.equals(this.status, orgMaprouletteFrameworkModelChallengeListing.status) &&
        Objects.equals(this.isArchived, orgMaprouletteFrameworkModelChallengeListing.isArchived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parent, name, enabled, status, isArchived);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteFrameworkModelChallengeListing {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
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
