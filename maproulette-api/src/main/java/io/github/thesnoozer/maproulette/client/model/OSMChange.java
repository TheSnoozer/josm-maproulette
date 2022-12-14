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
import io.github.thesnoozer.maproulette.client.model.ElementCreate;
import io.github.thesnoozer.maproulette.client.model.ElementUpdate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OSMChange
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OSMChange {
  @JsonProperty("creates")
  private List<ElementCreate> creates = null;

  @JsonProperty("updates")
  private List<ElementUpdate> updates = null;

  public OSMChange creates(List<ElementCreate> creates) {
    this.creates = creates;
    return this;
  }

  public OSMChange addCreatesItem(ElementCreate createsItem) {
    if (this.creates == null) {
      this.creates = new ArrayList<>();
    }
    this.creates.add(createsItem);
    return this;
  }

   /**
   * Set of features to create
   * @return creates
  **/
  @Schema(description = "Set of features to create")
  public List<ElementCreate> getCreates() {
    return creates;
  }

  public void setCreates(List<ElementCreate> creates) {
    this.creates = creates;
  }

  public OSMChange updates(List<ElementUpdate> updates) {
    this.updates = updates;
    return this;
  }

  public OSMChange addUpdatesItem(ElementUpdate updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<>();
    }
    this.updates.add(updatesItem);
    return this;
  }

   /**
   * Set of features to update
   * @return updates
  **/
  @Schema(description = "Set of features to update")
  public List<ElementUpdate> getUpdates() {
    return updates;
  }

  public void setUpdates(List<ElementUpdate> updates) {
    this.updates = updates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSMChange osMChange = (OSMChange) o;
    return Objects.equals(this.creates, osMChange.creates) &&
        Objects.equals(this.updates, osMChange.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creates, updates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSMChange {\n");
    
    sb.append("    creates: ").append(toIndentedString(creates)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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
