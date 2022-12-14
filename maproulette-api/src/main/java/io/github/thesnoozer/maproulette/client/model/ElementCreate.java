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
import io.github.thesnoozer.maproulette.client.model.OSMType;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ElementCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class ElementCreate {
  @JsonProperty("osmId")
  private Long osmId = null;

  @JsonProperty("osmType")
  private OSMType osmType = null;

  @JsonProperty("fields")
  private Object fields = null;

  @JsonProperty("tags")
  private Object tags = null;

   /**
   * The OSM identifier of the newly created feature
   * @return osmId
  **/
  @Schema(description = "The OSM identifier of the newly created feature")
  public Long getOsmId() {
    return osmId;
  }

  public ElementCreate osmType(OSMType osmType) {
    this.osmType = osmType;
    return this;
  }

   /**
   * Get osmType
   * @return osmType
  **/
  @Schema(description = "")
  public OSMType getOsmType() {
    return osmType;
  }

  public void setOsmType(OSMType osmType) {
    this.osmType = osmType;
  }

  public ElementCreate fields(Object fields) {
    this.fields = fields;
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @Schema(description = "")
  public Object getFields() {
    return fields;
  }

  public void setFields(Object fields) {
    this.fields = fields;
  }

  public ElementCreate tags(Object tags) {
    this.tags = tags;
    return this;
  }

   /**
   * The tags that should be included with the creation of the feature
   * @return tags
  **/
  @Schema(description = "The tags that should be included with the creation of the feature")
  public Object getTags() {
    return tags;
  }

  public void setTags(Object tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementCreate elementCreate = (ElementCreate) o;
    return Objects.equals(this.osmId, elementCreate.osmId) &&
        Objects.equals(this.osmType, elementCreate.osmType) &&
        Objects.equals(this.fields, elementCreate.fields) &&
        Objects.equals(this.tags, elementCreate.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osmId, osmType, fields, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementCreate {\n");
    
    sb.append("    osmId: ").append(toIndentedString(osmId)).append("\n");
    sb.append("    osmType: ").append(toIndentedString(osmType)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
