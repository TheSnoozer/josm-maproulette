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
 * OrgMaprouletteFrameworkModelChallengeGeneral
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteFrameworkModelChallengeGeneral {
  @JsonProperty("owner")
  private Long owner = null;

  @JsonProperty("parent")
  private Long parent = null;

  @JsonProperty("instruction")
  private String instruction = null;

  @JsonProperty("difficulty")
  private Integer difficulty = null;

  @JsonProperty("blurb")
  private String blurb = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("featured")
  private Boolean featured = null;

  @JsonProperty("cooperativeType")
  private Integer cooperativeType = null;

  @JsonProperty("popularity")
  private Integer popularity = null;

  @JsonProperty("checkinComment")
  private String checkinComment = null;

  @JsonProperty("checkinSource")
  private String checkinSource = null;

  @JsonProperty("changesetUrl")
  private Boolean changesetUrl = null;

  @JsonProperty("virtualParents")
  private List<Long> virtualParents = null;

  @JsonProperty("requiresLocal")
  private Boolean requiresLocal = null;

  public OrgMaprouletteFrameworkModelChallengeGeneral owner(Long owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(required = true, description = "")
  public Long getOwner() {
    return owner;
  }

  public void setOwner(Long owner) {
    this.owner = owner;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral parent(Long parent) {
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

  public OrgMaprouletteFrameworkModelChallengeGeneral instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

   /**
   * Get instruction
   * @return instruction
  **/
  @Schema(required = true, description = "")
  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral difficulty(Integer difficulty) {
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Get difficulty
   * @return difficulty
  **/
  @Schema(required = true, description = "")
  public Integer getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(Integer difficulty) {
    this.difficulty = difficulty;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral blurb(String blurb) {
    this.blurb = blurb;
    return this;
  }

   /**
   * Get blurb
   * @return blurb
  **/
  @Schema(description = "")
  public String getBlurb() {
    return blurb;
  }

  public void setBlurb(String blurb) {
    this.blurb = blurb;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral enabled(Boolean enabled) {
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

  public OrgMaprouletteFrameworkModelChallengeGeneral featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @Schema(required = true, description = "")
  public Boolean isFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral cooperativeType(Integer cooperativeType) {
    this.cooperativeType = cooperativeType;
    return this;
  }

   /**
   * Get cooperativeType
   * @return cooperativeType
  **/
  @Schema(required = true, description = "")
  public Integer getCooperativeType() {
    return cooperativeType;
  }

  public void setCooperativeType(Integer cooperativeType) {
    this.cooperativeType = cooperativeType;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral popularity(Integer popularity) {
    this.popularity = popularity;
    return this;
  }

   /**
   * Get popularity
   * @return popularity
  **/
  @Schema(description = "")
  public Integer getPopularity() {
    return popularity;
  }

  public void setPopularity(Integer popularity) {
    this.popularity = popularity;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral checkinComment(String checkinComment) {
    this.checkinComment = checkinComment;
    return this;
  }

   /**
   * Get checkinComment
   * @return checkinComment
  **/
  @Schema(required = true, description = "")
  public String getCheckinComment() {
    return checkinComment;
  }

  public void setCheckinComment(String checkinComment) {
    this.checkinComment = checkinComment;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral checkinSource(String checkinSource) {
    this.checkinSource = checkinSource;
    return this;
  }

   /**
   * Get checkinSource
   * @return checkinSource
  **/
  @Schema(required = true, description = "")
  public String getCheckinSource() {
    return checkinSource;
  }

  public void setCheckinSource(String checkinSource) {
    this.checkinSource = checkinSource;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral changesetUrl(Boolean changesetUrl) {
    this.changesetUrl = changesetUrl;
    return this;
  }

   /**
   * Get changesetUrl
   * @return changesetUrl
  **/
  @Schema(required = true, description = "")
  public Boolean isChangesetUrl() {
    return changesetUrl;
  }

  public void setChangesetUrl(Boolean changesetUrl) {
    this.changesetUrl = changesetUrl;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral virtualParents(List<Long> virtualParents) {
    this.virtualParents = virtualParents;
    return this;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral addVirtualParentsItem(Long virtualParentsItem) {
    if (this.virtualParents == null) {
      this.virtualParents = new ArrayList<>();
    }
    this.virtualParents.add(virtualParentsItem);
    return this;
  }

   /**
   * Get virtualParents
   * @return virtualParents
  **/
  @Schema(description = "")
  public List<Long> getVirtualParents() {
    return virtualParents;
  }

  public void setVirtualParents(List<Long> virtualParents) {
    this.virtualParents = virtualParents;
  }

  public OrgMaprouletteFrameworkModelChallengeGeneral requiresLocal(Boolean requiresLocal) {
    this.requiresLocal = requiresLocal;
    return this;
  }

   /**
   * Get requiresLocal
   * @return requiresLocal
  **/
  @Schema(required = true, description = "")
  public Boolean isRequiresLocal() {
    return requiresLocal;
  }

  public void setRequiresLocal(Boolean requiresLocal) {
    this.requiresLocal = requiresLocal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteFrameworkModelChallengeGeneral orgMaprouletteFrameworkModelChallengeGeneral = (OrgMaprouletteFrameworkModelChallengeGeneral) o;
    return Objects.equals(this.owner, orgMaprouletteFrameworkModelChallengeGeneral.owner) &&
        Objects.equals(this.parent, orgMaprouletteFrameworkModelChallengeGeneral.parent) &&
        Objects.equals(this.instruction, orgMaprouletteFrameworkModelChallengeGeneral.instruction) &&
        Objects.equals(this.difficulty, orgMaprouletteFrameworkModelChallengeGeneral.difficulty) &&
        Objects.equals(this.blurb, orgMaprouletteFrameworkModelChallengeGeneral.blurb) &&
        Objects.equals(this.enabled, orgMaprouletteFrameworkModelChallengeGeneral.enabled) &&
        Objects.equals(this.featured, orgMaprouletteFrameworkModelChallengeGeneral.featured) &&
        Objects.equals(this.cooperativeType, orgMaprouletteFrameworkModelChallengeGeneral.cooperativeType) &&
        Objects.equals(this.popularity, orgMaprouletteFrameworkModelChallengeGeneral.popularity) &&
        Objects.equals(this.checkinComment, orgMaprouletteFrameworkModelChallengeGeneral.checkinComment) &&
        Objects.equals(this.checkinSource, orgMaprouletteFrameworkModelChallengeGeneral.checkinSource) &&
        Objects.equals(this.changesetUrl, orgMaprouletteFrameworkModelChallengeGeneral.changesetUrl) &&
        Objects.equals(this.virtualParents, orgMaprouletteFrameworkModelChallengeGeneral.virtualParents) &&
        Objects.equals(this.requiresLocal, orgMaprouletteFrameworkModelChallengeGeneral.requiresLocal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, parent, instruction, difficulty, blurb, enabled, featured, cooperativeType, popularity, checkinComment, checkinSource, changesetUrl, virtualParents, requiresLocal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteFrameworkModelChallengeGeneral {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    blurb: ").append(toIndentedString(blurb)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    cooperativeType: ").append(toIndentedString(cooperativeType)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    checkinComment: ").append(toIndentedString(checkinComment)).append("\n");
    sb.append("    checkinSource: ").append(toIndentedString(checkinSource)).append("\n");
    sb.append("    changesetUrl: ").append(toIndentedString(changesetUrl)).append("\n");
    sb.append("    virtualParents: ").append(toIndentedString(virtualParents)).append("\n");
    sb.append("    requiresLocal: ").append(toIndentedString(requiresLocal)).append("\n");
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