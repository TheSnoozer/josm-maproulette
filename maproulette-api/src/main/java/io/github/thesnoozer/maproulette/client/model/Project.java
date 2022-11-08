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
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelGrant;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Project
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class Project {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("owner")
  private Long owner = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("created")
  private Integer created = null;

  @JsonProperty("modified")
  private Integer modified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("grants")
  private List<OrgMaprouletteFrameworkModelGrant> grants = null;

  @JsonProperty("enabled")
  private Boolean enabled = false;

  @JsonProperty("deleted")
  private Boolean deleted = false;

  @JsonProperty("featured")
  private Boolean featured = false;

   /**
   * The ID of the project
   * @return id
  **/
  @Schema(example = "12345", description = "The ID of the project")
  public Long getId() {
    return id;
  }

   /**
   * The OSM identifier of the owner of the project, set automatically
   * @return owner
  **/
  @Schema(description = "The OSM identifier of the owner of the project, set automatically")
  public Long getOwner() {
    return owner;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The internal name of the project
   * @return name
  **/
  @Schema(example = "Project_1234", required = true, description = "The internal name of the project")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * The time that this project was created, set by the database
   * @return created
  **/
  @Schema(description = "The time that this project was created, set by the database")
  public Integer getCreated() {
    return created;
  }

   /**
   * The last time that this project was modified, set by the database
   * @return modified
  **/
  @Schema(description = "The last time that this project was modified, set by the database")
  public Integer getModified() {
    return modified;
  }

  public Project description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description for the project
   * @return description
  **/
  @Schema(example = "This is my project", description = "The description for the project")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The grants associated with the project, which is completely managed by the backend
   * @return grants
  **/
  @Schema(description = "The grants associated with the project, which is completely managed by the backend")
  public List<OrgMaprouletteFrameworkModelGrant> getGrants() {
    return grants;
  }

  public Project enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether this project is enabled for use or not
   * @return enabled
  **/
  @Schema(description = "Whether this project is enabled for use or not")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

   /**
   * Field stating whether this project is ready to be deleted by the system
   * @return deleted
  **/
  @Schema(description = "Field stating whether this project is ready to be deleted by the system")
  public Boolean isDeleted() {
    return deleted;
  }

  public Project featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Whether or not this is a featured project. Only super users can set this field
   * @return featured
  **/
  @Schema(description = "Whether or not this is a featured project. Only super users can set this field")
  public Boolean isFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.owner, project.owner) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.created, project.created) &&
        Objects.equals(this.modified, project.modified) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.grants, project.grants) &&
        Objects.equals(this.enabled, project.enabled) &&
        Objects.equals(this.deleted, project.deleted) &&
        Objects.equals(this.featured, project.featured);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, name, created, modified, description, grants, enabled, deleted, featured);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
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