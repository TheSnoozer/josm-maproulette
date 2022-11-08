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
 * OrgMaprouletteFrameworkModelCustomBasemap
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteFrameworkModelCustomBasemap {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("overlay")
  private Boolean overlay = null;

  public OrgMaprouletteFrameworkModelCustomBasemap id(Long id) {
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

  public OrgMaprouletteFrameworkModelCustomBasemap name(String name) {
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

  public OrgMaprouletteFrameworkModelCustomBasemap url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(required = true, description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OrgMaprouletteFrameworkModelCustomBasemap overlay(Boolean overlay) {
    this.overlay = overlay;
    return this;
  }

   /**
   * Get overlay
   * @return overlay
  **/
  @Schema(required = true, description = "")
  public Boolean isOverlay() {
    return overlay;
  }

  public void setOverlay(Boolean overlay) {
    this.overlay = overlay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteFrameworkModelCustomBasemap orgMaprouletteFrameworkModelCustomBasemap = (OrgMaprouletteFrameworkModelCustomBasemap) o;
    return Objects.equals(this.id, orgMaprouletteFrameworkModelCustomBasemap.id) &&
        Objects.equals(this.name, orgMaprouletteFrameworkModelCustomBasemap.name) &&
        Objects.equals(this.url, orgMaprouletteFrameworkModelCustomBasemap.url) &&
        Objects.equals(this.overlay, orgMaprouletteFrameworkModelCustomBasemap.overlay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url, overlay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteFrameworkModelCustomBasemap {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
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