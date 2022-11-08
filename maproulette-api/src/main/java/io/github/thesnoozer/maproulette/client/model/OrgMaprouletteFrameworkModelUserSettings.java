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
import io.github.thesnoozer.maproulette.client.model.OrgMaprouletteFrameworkModelCustomBasemap;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OrgMaprouletteFrameworkModelUserSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-08T21:39:00.063842+01:00[Europe/Berlin]")
public class OrgMaprouletteFrameworkModelUserSettings {
  @JsonProperty("defaultEditor")
  private Integer defaultEditor = null;

  @JsonProperty("defaultBasemap")
  private Integer defaultBasemap = null;

  @JsonProperty("defaultBasemapId")
  private String defaultBasemapId = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("emailOptIn")
  private Boolean emailOptIn = null;

  @JsonProperty("leaderboardOptOut")
  private Boolean leaderboardOptOut = null;

  @JsonProperty("needsReview")
  private Integer needsReview = null;

  @JsonProperty("isReviewer")
  private Boolean isReviewer = null;

  @JsonProperty("allowFollowing")
  private Boolean allowFollowing = null;

  @JsonProperty("theme")
  private Integer theme = null;

  @JsonProperty("customBasemaps")
  private List<OrgMaprouletteFrameworkModelCustomBasemap> customBasemaps = null;

  @JsonProperty("seeTagFixSuggestions")
  private Boolean seeTagFixSuggestions = null;

  public OrgMaprouletteFrameworkModelUserSettings defaultEditor(Integer defaultEditor) {
    this.defaultEditor = defaultEditor;
    return this;
  }

   /**
   * Get defaultEditor
   * @return defaultEditor
  **/
  @Schema(description = "")
  public Integer getDefaultEditor() {
    return defaultEditor;
  }

  public void setDefaultEditor(Integer defaultEditor) {
    this.defaultEditor = defaultEditor;
  }

  public OrgMaprouletteFrameworkModelUserSettings defaultBasemap(Integer defaultBasemap) {
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

  public OrgMaprouletteFrameworkModelUserSettings defaultBasemapId(String defaultBasemapId) {
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

  public OrgMaprouletteFrameworkModelUserSettings locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @Schema(description = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public OrgMaprouletteFrameworkModelUserSettings email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OrgMaprouletteFrameworkModelUserSettings emailOptIn(Boolean emailOptIn) {
    this.emailOptIn = emailOptIn;
    return this;
  }

   /**
   * Get emailOptIn
   * @return emailOptIn
  **/
  @Schema(description = "")
  public Boolean isEmailOptIn() {
    return emailOptIn;
  }

  public void setEmailOptIn(Boolean emailOptIn) {
    this.emailOptIn = emailOptIn;
  }

  public OrgMaprouletteFrameworkModelUserSettings leaderboardOptOut(Boolean leaderboardOptOut) {
    this.leaderboardOptOut = leaderboardOptOut;
    return this;
  }

   /**
   * Get leaderboardOptOut
   * @return leaderboardOptOut
  **/
  @Schema(description = "")
  public Boolean isLeaderboardOptOut() {
    return leaderboardOptOut;
  }

  public void setLeaderboardOptOut(Boolean leaderboardOptOut) {
    this.leaderboardOptOut = leaderboardOptOut;
  }

  public OrgMaprouletteFrameworkModelUserSettings needsReview(Integer needsReview) {
    this.needsReview = needsReview;
    return this;
  }

   /**
   * Get needsReview
   * @return needsReview
  **/
  @Schema(description = "")
  public Integer getNeedsReview() {
    return needsReview;
  }

  public void setNeedsReview(Integer needsReview) {
    this.needsReview = needsReview;
  }

  public OrgMaprouletteFrameworkModelUserSettings isReviewer(Boolean isReviewer) {
    this.isReviewer = isReviewer;
    return this;
  }

   /**
   * Get isReviewer
   * @return isReviewer
  **/
  @Schema(description = "")
  public Boolean isIsReviewer() {
    return isReviewer;
  }

  public void setIsReviewer(Boolean isReviewer) {
    this.isReviewer = isReviewer;
  }

  public OrgMaprouletteFrameworkModelUserSettings allowFollowing(Boolean allowFollowing) {
    this.allowFollowing = allowFollowing;
    return this;
  }

   /**
   * Get allowFollowing
   * @return allowFollowing
  **/
  @Schema(description = "")
  public Boolean isAllowFollowing() {
    return allowFollowing;
  }

  public void setAllowFollowing(Boolean allowFollowing) {
    this.allowFollowing = allowFollowing;
  }

  public OrgMaprouletteFrameworkModelUserSettings theme(Integer theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @Schema(description = "")
  public Integer getTheme() {
    return theme;
  }

  public void setTheme(Integer theme) {
    this.theme = theme;
  }

  public OrgMaprouletteFrameworkModelUserSettings customBasemaps(List<OrgMaprouletteFrameworkModelCustomBasemap> customBasemaps) {
    this.customBasemaps = customBasemaps;
    return this;
  }

  public OrgMaprouletteFrameworkModelUserSettings addCustomBasemapsItem(OrgMaprouletteFrameworkModelCustomBasemap customBasemapsItem) {
    if (this.customBasemaps == null) {
      this.customBasemaps = new ArrayList<>();
    }
    this.customBasemaps.add(customBasemapsItem);
    return this;
  }

   /**
   * Get customBasemaps
   * @return customBasemaps
  **/
  @Schema(description = "")
  public List<OrgMaprouletteFrameworkModelCustomBasemap> getCustomBasemaps() {
    return customBasemaps;
  }

  public void setCustomBasemaps(List<OrgMaprouletteFrameworkModelCustomBasemap> customBasemaps) {
    this.customBasemaps = customBasemaps;
  }

  public OrgMaprouletteFrameworkModelUserSettings seeTagFixSuggestions(Boolean seeTagFixSuggestions) {
    this.seeTagFixSuggestions = seeTagFixSuggestions;
    return this;
  }

   /**
   * Get seeTagFixSuggestions
   * @return seeTagFixSuggestions
  **/
  @Schema(description = "")
  public Boolean isSeeTagFixSuggestions() {
    return seeTagFixSuggestions;
  }

  public void setSeeTagFixSuggestions(Boolean seeTagFixSuggestions) {
    this.seeTagFixSuggestions = seeTagFixSuggestions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMaprouletteFrameworkModelUserSettings orgMaprouletteFrameworkModelUserSettings = (OrgMaprouletteFrameworkModelUserSettings) o;
    return Objects.equals(this.defaultEditor, orgMaprouletteFrameworkModelUserSettings.defaultEditor) &&
        Objects.equals(this.defaultBasemap, orgMaprouletteFrameworkModelUserSettings.defaultBasemap) &&
        Objects.equals(this.defaultBasemapId, orgMaprouletteFrameworkModelUserSettings.defaultBasemapId) &&
        Objects.equals(this.locale, orgMaprouletteFrameworkModelUserSettings.locale) &&
        Objects.equals(this.email, orgMaprouletteFrameworkModelUserSettings.email) &&
        Objects.equals(this.emailOptIn, orgMaprouletteFrameworkModelUserSettings.emailOptIn) &&
        Objects.equals(this.leaderboardOptOut, orgMaprouletteFrameworkModelUserSettings.leaderboardOptOut) &&
        Objects.equals(this.needsReview, orgMaprouletteFrameworkModelUserSettings.needsReview) &&
        Objects.equals(this.isReviewer, orgMaprouletteFrameworkModelUserSettings.isReviewer) &&
        Objects.equals(this.allowFollowing, orgMaprouletteFrameworkModelUserSettings.allowFollowing) &&
        Objects.equals(this.theme, orgMaprouletteFrameworkModelUserSettings.theme) &&
        Objects.equals(this.customBasemaps, orgMaprouletteFrameworkModelUserSettings.customBasemaps) &&
        Objects.equals(this.seeTagFixSuggestions, orgMaprouletteFrameworkModelUserSettings.seeTagFixSuggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultEditor, defaultBasemap, defaultBasemapId, locale, email, emailOptIn, leaderboardOptOut, needsReview, isReviewer, allowFollowing, theme, customBasemaps, seeTagFixSuggestions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMaprouletteFrameworkModelUserSettings {\n");
    
    sb.append("    defaultEditor: ").append(toIndentedString(defaultEditor)).append("\n");
    sb.append("    defaultBasemap: ").append(toIndentedString(defaultBasemap)).append("\n");
    sb.append("    defaultBasemapId: ").append(toIndentedString(defaultBasemapId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailOptIn: ").append(toIndentedString(emailOptIn)).append("\n");
    sb.append("    leaderboardOptOut: ").append(toIndentedString(leaderboardOptOut)).append("\n");
    sb.append("    needsReview: ").append(toIndentedString(needsReview)).append("\n");
    sb.append("    isReviewer: ").append(toIndentedString(isReviewer)).append("\n");
    sb.append("    allowFollowing: ").append(toIndentedString(allowFollowing)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    customBasemaps: ").append(toIndentedString(customBasemaps)).append("\n");
    sb.append("    seeTagFixSuggestions: ").append(toIndentedString(seeTagFixSuggestions)).append("\n");
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
