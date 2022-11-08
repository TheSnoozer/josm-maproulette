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
 * OrgMaprouletteExceptionStatusMessage
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteExceptionStatusMessage {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("message")
  private String message = null;

  public OrgMaprouletteExceptionStatusMessage status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OrgMaprouletteExceptionStatusMessage message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(required = true, description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteExceptionStatusMessage orgMaprouletteExceptionStatusMessage = (OrgMaprouletteExceptionStatusMessage) o;
    return Objects.equals(this.status, orgMaprouletteExceptionStatusMessage.status) &&
        Objects.equals(this.message, orgMaprouletteExceptionStatusMessage.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteExceptionStatusMessage {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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