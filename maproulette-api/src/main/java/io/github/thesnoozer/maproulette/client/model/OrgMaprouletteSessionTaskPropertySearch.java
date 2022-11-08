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
/**
 * OrgMaprouletteSessionTaskPropertySearch
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteSessionTaskPropertySearch {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueType")
  private String valueType = null;

  @JsonProperty("searchType")
  private String searchType = null;

  @JsonProperty("operationType")
  private String operationType = null;

  @JsonProperty("left")
  private OrgMaprouletteSessionTaskPropertySearch left = null;

  @JsonProperty("right")
  private OrgMaprouletteSessionTaskPropertySearch right = null;

  public OrgMaprouletteSessionTaskPropertySearch key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public OrgMaprouletteSessionTaskPropertySearch value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OrgMaprouletteSessionTaskPropertySearch valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @Schema(description = "")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public OrgMaprouletteSessionTaskPropertySearch searchType(String searchType) {
    this.searchType = searchType;
    return this;
  }

   /**
   * Get searchType
   * @return searchType
  **/
  @Schema(description = "")
  public String getSearchType() {
    return searchType;
  }

  public void setSearchType(String searchType) {
    this.searchType = searchType;
  }

  public OrgMaprouletteSessionTaskPropertySearch operationType(String operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @Schema(description = "")
  public String getOperationType() {
    return operationType;
  }

  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }

  public OrgMaprouletteSessionTaskPropertySearch left(OrgMaprouletteSessionTaskPropertySearch left) {
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @Schema(description = "")
  public OrgMaprouletteSessionTaskPropertySearch getLeft() {
    return left;
  }

  public void setLeft(OrgMaprouletteSessionTaskPropertySearch left) {
    this.left = left;
  }

  public OrgMaprouletteSessionTaskPropertySearch right(OrgMaprouletteSessionTaskPropertySearch right) {
    this.right = right;
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @Schema(description = "")
  public OrgMaprouletteSessionTaskPropertySearch getRight() {
    return right;
  }

  public void setRight(OrgMaprouletteSessionTaskPropertySearch right) {
    this.right = right;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteSessionTaskPropertySearch orgMaprouletteSessionTaskPropertySearch = (OrgMaprouletteSessionTaskPropertySearch) o;
    return Objects.equals(this.key, orgMaprouletteSessionTaskPropertySearch.key) &&
        Objects.equals(this.value, orgMaprouletteSessionTaskPropertySearch.value) &&
        Objects.equals(this.valueType, orgMaprouletteSessionTaskPropertySearch.valueType) &&
        Objects.equals(this.searchType, orgMaprouletteSessionTaskPropertySearch.searchType) &&
        Objects.equals(this.operationType, orgMaprouletteSessionTaskPropertySearch.operationType) &&
        Objects.equals(this.left, orgMaprouletteSessionTaskPropertySearch.left) &&
        Objects.equals(this.right, orgMaprouletteSessionTaskPropertySearch.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, valueType, searchType, operationType, left, right);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteSessionTaskPropertySearch {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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
