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
 * OrgMaprouletteFrameworkModelChallengeExtra
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteFrameworkModelChallengeExtra {
  @JsonProperty("defaultZoom")
  private Integer defaultZoom = null;

  @JsonProperty("minZoom")
  private Integer minZoom = null;

  @JsonProperty("maxZoom")
  private Integer maxZoom = null;

  @JsonProperty("defaultBasemap")
  private Integer defaultBasemap = null;

  @JsonProperty("defaultBasemapId")
  private String defaultBasemapId = null;

  @JsonProperty("customBasemap")
  private String customBasemap = null;

  @JsonProperty("updateTasks")
  private Boolean updateTasks = null;

  @JsonProperty("exportableProperties")
  private String exportableProperties = null;

  @JsonProperty("osmIdProperty")
  private String osmIdProperty = null;

  @JsonProperty("preferredTags")
  private String preferredTags = null;

  @JsonProperty("preferredReviewTags")
  private String preferredReviewTags = null;

  @JsonProperty("limitTags")
  private Boolean limitTags = null;

  @JsonProperty("limitReviewTags")
  private Boolean limitReviewTags = null;

  @JsonProperty("taskStyles")
  private String taskStyles = null;

  @JsonProperty("taskBundleIdProperty")
  private String taskBundleIdProperty = null;

  @JsonProperty("isArchived")
  private Boolean isArchived = null;

  @JsonProperty("systemArchivedAt")
  private Integer systemArchivedAt = null;

  @JsonProperty("presets")
  private List<String> presets = null;

  public OrgMaprouletteFrameworkModelChallengeExtra defaultZoom(Integer defaultZoom) {
    this.defaultZoom = defaultZoom;
    return this;
  }

   /**
   * Get defaultZoom
   * @return defaultZoom
  **/
  @Schema(required = true, description = "")
  public Integer getDefaultZoom() {
    return defaultZoom;
  }

  public void setDefaultZoom(Integer defaultZoom) {
    this.defaultZoom = defaultZoom;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra minZoom(Integer minZoom) {
    this.minZoom = minZoom;
    return this;
  }

   /**
   * Get minZoom
   * @return minZoom
  **/
  @Schema(required = true, description = "")
  public Integer getMinZoom() {
    return minZoom;
  }

  public void setMinZoom(Integer minZoom) {
    this.minZoom = minZoom;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra maxZoom(Integer maxZoom) {
    this.maxZoom = maxZoom;
    return this;
  }

   /**
   * Get maxZoom
   * @return maxZoom
  **/
  @Schema(required = true, description = "")
  public Integer getMaxZoom() {
    return maxZoom;
  }

  public void setMaxZoom(Integer maxZoom) {
    this.maxZoom = maxZoom;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra defaultBasemap(Integer defaultBasemap) {
    this.defaultBasemap = defaultBasemap;
    return this;
  }

   /**
   * Get defaultBasemap
   * @return defaultBasemap
  **/
  @Schema(description = "")
  public Integer getDefaultBasemap() {
    return defaultBasemap;
  }

  public void setDefaultBasemap(Integer defaultBasemap) {
    this.defaultBasemap = defaultBasemap;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra defaultBasemapId(String defaultBasemapId) {
    this.defaultBasemapId = defaultBasemapId;
    return this;
  }

   /**
   * Get defaultBasemapId
   * @return defaultBasemapId
  **/
  @Schema(description = "")
  public String getDefaultBasemapId() {
    return defaultBasemapId;
  }

  public void setDefaultBasemapId(String defaultBasemapId) {
    this.defaultBasemapId = defaultBasemapId;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra customBasemap(String customBasemap) {
    this.customBasemap = customBasemap;
    return this;
  }

   /**
   * Get customBasemap
   * @return customBasemap
  **/
  @Schema(description = "")
  public String getCustomBasemap() {
    return customBasemap;
  }

  public void setCustomBasemap(String customBasemap) {
    this.customBasemap = customBasemap;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra updateTasks(Boolean updateTasks) {
    this.updateTasks = updateTasks;
    return this;
  }

   /**
   * Get updateTasks
   * @return updateTasks
  **/
  @Schema(required = true, description = "")
  public Boolean isUpdateTasks() {
    return updateTasks;
  }

  public void setUpdateTasks(Boolean updateTasks) {
    this.updateTasks = updateTasks;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra exportableProperties(String exportableProperties) {
    this.exportableProperties = exportableProperties;
    return this;
  }

   /**
   * Get exportableProperties
   * @return exportableProperties
  **/
  @Schema(description = "")
  public String getExportableProperties() {
    return exportableProperties;
  }

  public void setExportableProperties(String exportableProperties) {
    this.exportableProperties = exportableProperties;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra osmIdProperty(String osmIdProperty) {
    this.osmIdProperty = osmIdProperty;
    return this;
  }

   /**
   * Get osmIdProperty
   * @return osmIdProperty
  **/
  @Schema(description = "")
  public String getOsmIdProperty() {
    return osmIdProperty;
  }

  public void setOsmIdProperty(String osmIdProperty) {
    this.osmIdProperty = osmIdProperty;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra preferredTags(String preferredTags) {
    this.preferredTags = preferredTags;
    return this;
  }

   /**
   * Get preferredTags
   * @return preferredTags
  **/
  @Schema(description = "")
  public String getPreferredTags() {
    return preferredTags;
  }

  public void setPreferredTags(String preferredTags) {
    this.preferredTags = preferredTags;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra preferredReviewTags(String preferredReviewTags) {
    this.preferredReviewTags = preferredReviewTags;
    return this;
  }

   /**
   * Get preferredReviewTags
   * @return preferredReviewTags
  **/
  @Schema(description = "")
  public String getPreferredReviewTags() {
    return preferredReviewTags;
  }

  public void setPreferredReviewTags(String preferredReviewTags) {
    this.preferredReviewTags = preferredReviewTags;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra limitTags(Boolean limitTags) {
    this.limitTags = limitTags;
    return this;
  }

   /**
   * Get limitTags
   * @return limitTags
  **/
  @Schema(required = true, description = "")
  public Boolean isLimitTags() {
    return limitTags;
  }

  public void setLimitTags(Boolean limitTags) {
    this.limitTags = limitTags;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra limitReviewTags(Boolean limitReviewTags) {
    this.limitReviewTags = limitReviewTags;
    return this;
  }

   /**
   * Get limitReviewTags
   * @return limitReviewTags
  **/
  @Schema(required = true, description = "")
  public Boolean isLimitReviewTags() {
    return limitReviewTags;
  }

  public void setLimitReviewTags(Boolean limitReviewTags) {
    this.limitReviewTags = limitReviewTags;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra taskStyles(String taskStyles) {
    this.taskStyles = taskStyles;
    return this;
  }

   /**
   * Get taskStyles
   * @return taskStyles
  **/
  @Schema(description = "")
  public String getTaskStyles() {
    return taskStyles;
  }

  public void setTaskStyles(String taskStyles) {
    this.taskStyles = taskStyles;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra taskBundleIdProperty(String taskBundleIdProperty) {
    this.taskBundleIdProperty = taskBundleIdProperty;
    return this;
  }

   /**
   * Get taskBundleIdProperty
   * @return taskBundleIdProperty
  **/
  @Schema(description = "")
  public String getTaskBundleIdProperty() {
    return taskBundleIdProperty;
  }

  public void setTaskBundleIdProperty(String taskBundleIdProperty) {
    this.taskBundleIdProperty = taskBundleIdProperty;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra isArchived(Boolean isArchived) {
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

  public OrgMaprouletteFrameworkModelChallengeExtra systemArchivedAt(Integer systemArchivedAt) {
    this.systemArchivedAt = systemArchivedAt;
    return this;
  }

   /**
   * Get systemArchivedAt
   * @return systemArchivedAt
  **/
  @Schema(description = "")
  public Integer getSystemArchivedAt() {
    return systemArchivedAt;
  }

  public void setSystemArchivedAt(Integer systemArchivedAt) {
    this.systemArchivedAt = systemArchivedAt;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra presets(List<String> presets) {
    this.presets = presets;
    return this;
  }

  public OrgMaprouletteFrameworkModelChallengeExtra addPresetsItem(String presetsItem) {
    if (this.presets == null) {
      this.presets = new ArrayList<>();
    }
    this.presets.add(presetsItem);
    return this;
  }

   /**
   * Get presets
   * @return presets
  **/
  @Schema(description = "")
  public List<String> getPresets() {
    return presets;
  }

  public void setPresets(List<String> presets) {
    this.presets = presets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteFrameworkModelChallengeExtra orgMaprouletteFrameworkModelChallengeExtra = (OrgMaprouletteFrameworkModelChallengeExtra) o;
    return Objects.equals(this.defaultZoom, orgMaprouletteFrameworkModelChallengeExtra.defaultZoom) &&
        Objects.equals(this.minZoom, orgMaprouletteFrameworkModelChallengeExtra.minZoom) &&
        Objects.equals(this.maxZoom, orgMaprouletteFrameworkModelChallengeExtra.maxZoom) &&
        Objects.equals(this.defaultBasemap, orgMaprouletteFrameworkModelChallengeExtra.defaultBasemap) &&
        Objects.equals(this.defaultBasemapId, orgMaprouletteFrameworkModelChallengeExtra.defaultBasemapId) &&
        Objects.equals(this.customBasemap, orgMaprouletteFrameworkModelChallengeExtra.customBasemap) &&
        Objects.equals(this.updateTasks, orgMaprouletteFrameworkModelChallengeExtra.updateTasks) &&
        Objects.equals(this.exportableProperties, orgMaprouletteFrameworkModelChallengeExtra.exportableProperties) &&
        Objects.equals(this.osmIdProperty, orgMaprouletteFrameworkModelChallengeExtra.osmIdProperty) &&
        Objects.equals(this.preferredTags, orgMaprouletteFrameworkModelChallengeExtra.preferredTags) &&
        Objects.equals(this.preferredReviewTags, orgMaprouletteFrameworkModelChallengeExtra.preferredReviewTags) &&
        Objects.equals(this.limitTags, orgMaprouletteFrameworkModelChallengeExtra.limitTags) &&
        Objects.equals(this.limitReviewTags, orgMaprouletteFrameworkModelChallengeExtra.limitReviewTags) &&
        Objects.equals(this.taskStyles, orgMaprouletteFrameworkModelChallengeExtra.taskStyles) &&
        Objects.equals(this.taskBundleIdProperty, orgMaprouletteFrameworkModelChallengeExtra.taskBundleIdProperty) &&
        Objects.equals(this.isArchived, orgMaprouletteFrameworkModelChallengeExtra.isArchived) &&
        Objects.equals(this.systemArchivedAt, orgMaprouletteFrameworkModelChallengeExtra.systemArchivedAt) &&
        Objects.equals(this.presets, orgMaprouletteFrameworkModelChallengeExtra.presets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultZoom, minZoom, maxZoom, defaultBasemap, defaultBasemapId, customBasemap, updateTasks, exportableProperties, osmIdProperty, preferredTags, preferredReviewTags, limitTags, limitReviewTags, taskStyles, taskBundleIdProperty, isArchived, systemArchivedAt, presets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteFrameworkModelChallengeExtra {\n");
    
    sb.append("    defaultZoom: ").append(toIndentedString(defaultZoom)).append("\n");
    sb.append("    minZoom: ").append(toIndentedString(minZoom)).append("\n");
    sb.append("    maxZoom: ").append(toIndentedString(maxZoom)).append("\n");
    sb.append("    defaultBasemap: ").append(toIndentedString(defaultBasemap)).append("\n");
    sb.append("    defaultBasemapId: ").append(toIndentedString(defaultBasemapId)).append("\n");
    sb.append("    customBasemap: ").append(toIndentedString(customBasemap)).append("\n");
    sb.append("    updateTasks: ").append(toIndentedString(updateTasks)).append("\n");
    sb.append("    exportableProperties: ").append(toIndentedString(exportableProperties)).append("\n");
    sb.append("    osmIdProperty: ").append(toIndentedString(osmIdProperty)).append("\n");
    sb.append("    preferredTags: ").append(toIndentedString(preferredTags)).append("\n");
    sb.append("    preferredReviewTags: ").append(toIndentedString(preferredReviewTags)).append("\n");
    sb.append("    limitTags: ").append(toIndentedString(limitTags)).append("\n");
    sb.append("    limitReviewTags: ").append(toIndentedString(limitReviewTags)).append("\n");
    sb.append("    taskStyles: ").append(toIndentedString(taskStyles)).append("\n");
    sb.append("    taskBundleIdProperty: ").append(toIndentedString(taskBundleIdProperty)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    systemArchivedAt: ").append(toIndentedString(systemArchivedAt)).append("\n");
    sb.append("    presets: ").append(toIndentedString(presets)).append("\n");
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
