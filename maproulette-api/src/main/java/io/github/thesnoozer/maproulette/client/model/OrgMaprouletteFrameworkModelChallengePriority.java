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
 * OrgMaprouletteFrameworkModelChallengePriority
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteFrameworkModelChallengePriority {
  @JsonProperty("defaultPriority")
  private Integer defaultPriority = null;

  @JsonProperty("highPriorityRule")
  private String highPriorityRule = null;

  @JsonProperty("mediumPriorityRule")
  private String mediumPriorityRule = null;

  @JsonProperty("lowPriorityRule")
  private String lowPriorityRule = null;

  public OrgMaprouletteFrameworkModelChallengePriority defaultPriority(Integer defaultPriority) {
    this.defaultPriority = defaultPriority;
    return this;
  }

   /**
   * Get defaultPriority
   * @return defaultPriority
  **/
  @Schema(required = true, description = "")
  public Integer getDefaultPriority() {
    return defaultPriority;
  }

  public void setDefaultPriority(Integer defaultPriority) {
    this.defaultPriority = defaultPriority;
  }

  public OrgMaprouletteFrameworkModelChallengePriority highPriorityRule(String highPriorityRule) {
    this.highPriorityRule = highPriorityRule;
    return this;
  }

   /**
   * Get highPriorityRule
   * @return highPriorityRule
  **/
  @Schema(description = "")
  public String getHighPriorityRule() {
    return highPriorityRule;
  }

  public void setHighPriorityRule(String highPriorityRule) {
    this.highPriorityRule = highPriorityRule;
  }

  public OrgMaprouletteFrameworkModelChallengePriority mediumPriorityRule(String mediumPriorityRule) {
    this.mediumPriorityRule = mediumPriorityRule;
    return this;
  }

   /**
   * Get mediumPriorityRule
   * @return mediumPriorityRule
  **/
  @Schema(description = "")
  public String getMediumPriorityRule() {
    return mediumPriorityRule;
  }

  public void setMediumPriorityRule(String mediumPriorityRule) {
    this.mediumPriorityRule = mediumPriorityRule;
  }

  public OrgMaprouletteFrameworkModelChallengePriority lowPriorityRule(String lowPriorityRule) {
    this.lowPriorityRule = lowPriorityRule;
    return this;
  }

   /**
   * Get lowPriorityRule
   * @return lowPriorityRule
  **/
  @Schema(description = "")
  public String getLowPriorityRule() {
    return lowPriorityRule;
  }

  public void setLowPriorityRule(String lowPriorityRule) {
    this.lowPriorityRule = lowPriorityRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteFrameworkModelChallengePriority orgMaprouletteFrameworkModelChallengePriority = (OrgMaprouletteFrameworkModelChallengePriority) o;
    return Objects.equals(this.defaultPriority, orgMaprouletteFrameworkModelChallengePriority.defaultPriority) &&
        Objects.equals(this.highPriorityRule, orgMaprouletteFrameworkModelChallengePriority.highPriorityRule) &&
        Objects.equals(this.mediumPriorityRule, orgMaprouletteFrameworkModelChallengePriority.mediumPriorityRule) &&
        Objects.equals(this.lowPriorityRule, orgMaprouletteFrameworkModelChallengePriority.lowPriorityRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultPriority, highPriorityRule, mediumPriorityRule, lowPriorityRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteFrameworkModelChallengePriority {\n");
    
    sb.append("    defaultPriority: ").append(toIndentedString(defaultPriority)).append("\n");
    sb.append("    highPriorityRule: ").append(toIndentedString(highPriorityRule)).append("\n");
    sb.append("    mediumPriorityRule: ").append(toIndentedString(mediumPriorityRule)).append("\n");
    sb.append("    lowPriorityRule: ").append(toIndentedString(lowPriorityRule)).append("\n");
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
