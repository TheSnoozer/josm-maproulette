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
 * OrgMaprouletteFrameworkModelPointReview
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteFrameworkModelPointReview {
  @JsonProperty("reviewStatus")
  private Integer reviewStatus = null;

  @JsonProperty("reviewRequestedBy")
  private Long reviewRequestedBy = null;

  @JsonProperty("reviewedBy")
  private Long reviewedBy = null;

  @JsonProperty("reviewedAt")
  private Integer reviewedAt = null;

  @JsonProperty("metaReviewStatus")
  private Integer metaReviewStatus = null;

  @JsonProperty("metaReviewedBy")
  private Long metaReviewedBy = null;

  @JsonProperty("metaReviewedAt")
  private Integer metaReviewedAt = null;

  @JsonProperty("reviewStartedAt")
  private Integer reviewStartedAt = null;

  @JsonProperty("additionalReviewers")
  private List<Long> additionalReviewers = null;

  public OrgMaprouletteFrameworkModelPointReview reviewStatus(Integer reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

   /**
   * Get reviewStatus
   * @return reviewStatus
  **/
  @Schema(description = "")
  public Integer getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(Integer reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public OrgMaprouletteFrameworkModelPointReview reviewRequestedBy(Long reviewRequestedBy) {
    this.reviewRequestedBy = reviewRequestedBy;
    return this;
  }

   /**
   * Get reviewRequestedBy
   * @return reviewRequestedBy
  **/
  @Schema(description = "")
  public Long getReviewRequestedBy() {
    return reviewRequestedBy;
  }

  public void setReviewRequestedBy(Long reviewRequestedBy) {
    this.reviewRequestedBy = reviewRequestedBy;
  }

  public OrgMaprouletteFrameworkModelPointReview reviewedBy(Long reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }

   /**
   * Get reviewedBy
   * @return reviewedBy
  **/
  @Schema(description = "")
  public Long getReviewedBy() {
    return reviewedBy;
  }

  public void setReviewedBy(Long reviewedBy) {
    this.reviewedBy = reviewedBy;
  }

  public OrgMaprouletteFrameworkModelPointReview reviewedAt(Integer reviewedAt) {
    this.reviewedAt = reviewedAt;
    return this;
  }

   /**
   * Get reviewedAt
   * @return reviewedAt
  **/
  @Schema(description = "")
  public Integer getReviewedAt() {
    return reviewedAt;
  }

  public void setReviewedAt(Integer reviewedAt) {
    this.reviewedAt = reviewedAt;
  }

  public OrgMaprouletteFrameworkModelPointReview metaReviewStatus(Integer metaReviewStatus) {
    this.metaReviewStatus = metaReviewStatus;
    return this;
  }

   /**
   * Get metaReviewStatus
   * @return metaReviewStatus
  **/
  @Schema(description = "")
  public Integer getMetaReviewStatus() {
    return metaReviewStatus;
  }

  public void setMetaReviewStatus(Integer metaReviewStatus) {
    this.metaReviewStatus = metaReviewStatus;
  }

  public OrgMaprouletteFrameworkModelPointReview metaReviewedBy(Long metaReviewedBy) {
    this.metaReviewedBy = metaReviewedBy;
    return this;
  }

   /**
   * Get metaReviewedBy
   * @return metaReviewedBy
  **/
  @Schema(description = "")
  public Long getMetaReviewedBy() {
    return metaReviewedBy;
  }

  public void setMetaReviewedBy(Long metaReviewedBy) {
    this.metaReviewedBy = metaReviewedBy;
  }

  public OrgMaprouletteFrameworkModelPointReview metaReviewedAt(Integer metaReviewedAt) {
    this.metaReviewedAt = metaReviewedAt;
    return this;
  }

   /**
   * Get metaReviewedAt
   * @return metaReviewedAt
  **/
  @Schema(description = "")
  public Integer getMetaReviewedAt() {
    return metaReviewedAt;
  }

  public void setMetaReviewedAt(Integer metaReviewedAt) {
    this.metaReviewedAt = metaReviewedAt;
  }

  public OrgMaprouletteFrameworkModelPointReview reviewStartedAt(Integer reviewStartedAt) {
    this.reviewStartedAt = reviewStartedAt;
    return this;
  }

   /**
   * Get reviewStartedAt
   * @return reviewStartedAt
  **/
  @Schema(description = "")
  public Integer getReviewStartedAt() {
    return reviewStartedAt;
  }

  public void setReviewStartedAt(Integer reviewStartedAt) {
    this.reviewStartedAt = reviewStartedAt;
  }

  public OrgMaprouletteFrameworkModelPointReview additionalReviewers(List<Long> additionalReviewers) {
    this.additionalReviewers = additionalReviewers;
    return this;
  }

  public OrgMaprouletteFrameworkModelPointReview addAdditionalReviewersItem(Long additionalReviewersItem) {
    if (this.additionalReviewers == null) {
      this.additionalReviewers = new ArrayList<>();
    }
    this.additionalReviewers.add(additionalReviewersItem);
    return this;
  }

   /**
   * Get additionalReviewers
   * @return additionalReviewers
  **/
  @Schema(description = "")
  public List<Long> getAdditionalReviewers() {
    return additionalReviewers;
  }

  public void setAdditionalReviewers(List<Long> additionalReviewers) {
    this.additionalReviewers = additionalReviewers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteFrameworkModelPointReview orgMaprouletteFrameworkModelPointReview = (OrgMaprouletteFrameworkModelPointReview) o;
    return Objects.equals(this.reviewStatus, orgMaprouletteFrameworkModelPointReview.reviewStatus) &&
        Objects.equals(this.reviewRequestedBy, orgMaprouletteFrameworkModelPointReview.reviewRequestedBy) &&
        Objects.equals(this.reviewedBy, orgMaprouletteFrameworkModelPointReview.reviewedBy) &&
        Objects.equals(this.reviewedAt, orgMaprouletteFrameworkModelPointReview.reviewedAt) &&
        Objects.equals(this.metaReviewStatus, orgMaprouletteFrameworkModelPointReview.metaReviewStatus) &&
        Objects.equals(this.metaReviewedBy, orgMaprouletteFrameworkModelPointReview.metaReviewedBy) &&
        Objects.equals(this.metaReviewedAt, orgMaprouletteFrameworkModelPointReview.metaReviewedAt) &&
        Objects.equals(this.reviewStartedAt, orgMaprouletteFrameworkModelPointReview.reviewStartedAt) &&
        Objects.equals(this.additionalReviewers, orgMaprouletteFrameworkModelPointReview.additionalReviewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewStatus, reviewRequestedBy, reviewedBy, reviewedAt, metaReviewStatus, metaReviewedBy, metaReviewedAt, reviewStartedAt, additionalReviewers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteFrameworkModelPointReview {\n");
    
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    reviewRequestedBy: ").append(toIndentedString(reviewRequestedBy)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    reviewedAt: ").append(toIndentedString(reviewedAt)).append("\n");
    sb.append("    metaReviewStatus: ").append(toIndentedString(metaReviewStatus)).append("\n");
    sb.append("    metaReviewedBy: ").append(toIndentedString(metaReviewedBy)).append("\n");
    sb.append("    metaReviewedAt: ").append(toIndentedString(metaReviewedAt)).append("\n");
    sb.append("    reviewStartedAt: ").append(toIndentedString(reviewStartedAt)).append("\n");
    sb.append("    additionalReviewers: ").append(toIndentedString(additionalReviewers)).append("\n");
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
