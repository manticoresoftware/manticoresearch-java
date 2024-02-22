/*
 * Manticore Search Client
 * Сlient for Manticore Search. 
 *
 * The version of the OpenAPI document: 3.3.1
 * Contact: info@manticoresearch.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.manticoresearch.client.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.manticoresearch.client.model.SearchResponseHits;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Response object of a search request
 */
@JsonPropertyOrder({
  SearchResponse.JSON_PROPERTY_TOOK,
  SearchResponse.JSON_PROPERTY_TIMED_OUT,
  SearchResponse.JSON_PROPERTY_AGGREGATIONS,
  SearchResponse.JSON_PROPERTY_HITS,
  SearchResponse.JSON_PROPERTY_PROFILE,
  SearchResponse.JSON_PROPERTY_WARNING
})
@JsonTypeName("searchResponse")
@JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T08:36:02.662182043Z[Etc/UTC]")
public class SearchResponse {
  public static final String JSON_PROPERTY_TOOK = "took";
  private Integer took;

  public static final String JSON_PROPERTY_TIMED_OUT = "timed_out";
  private Boolean timedOut;

  public static final String JSON_PROPERTY_AGGREGATIONS = "aggregations";
  private Map<String, Object> aggregations = new HashMap<>();

  public static final String JSON_PROPERTY_HITS = "hits";
  private SearchResponseHits hits;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private Object profile;

  public static final String JSON_PROPERTY_WARNING = "warning";
  private Map<String, Object> warning = new HashMap<>();

  public SearchResponse() { 
  }

  public SearchResponse took(Integer took) {
    this.took = took;
    return this;
  }

   /**
   * Get took
   * @return took
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTook() {
    return took;
  }


  @JsonProperty(JSON_PROPERTY_TOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTook(Integer took) {
    this.took = took;
  }


  public SearchResponse timedOut(Boolean timedOut) {
    this.timedOut = timedOut;
    return this;
  }

   /**
   * Get timedOut
   * @return timedOut
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMED_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTimedOut() {
    return timedOut;
  }


  @JsonProperty(JSON_PROPERTY_TIMED_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimedOut(Boolean timedOut) {
    this.timedOut = timedOut;
  }


  public SearchResponse aggregations(Map<String, Object> aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  public SearchResponse putAggregationsItem(String key, Object aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new HashMap<>();
    }
    this.aggregations.put(key, aggregationsItem);
    return this;
  }

   /**
   * Get aggregations
   * @return aggregations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATIONS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getAggregations() {
    return aggregations;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATIONS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregations(Map<String, Object> aggregations) {
    this.aggregations = aggregations;
  }


  public SearchResponse hits(SearchResponseHits hits) {
    this.hits = hits;
    return this;
  }

   /**
   * Get hits
   * @return hits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchResponseHits getHits() {
    return hits;
  }


  @JsonProperty(JSON_PROPERTY_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHits(SearchResponseHits hits) {
    this.hits = hits;
  }


  public SearchResponse profile(Object profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getProfile() {
    return profile;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfile(Object profile) {
    this.profile = profile;
  }


  public SearchResponse warning(Map<String, Object> warning) {
    this.warning = warning;
    return this;
  }

  public SearchResponse putWarningItem(String key, Object warningItem) {
    if (this.warning == null) {
      this.warning = new HashMap<>();
    }
    this.warning.put(key, warningItem);
    return this;
  }

   /**
   * Get warning
   * @return warning
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getWarning() {
    return warning;
  }


  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarning(Map<String, Object> warning) {
    this.warning = warning;
  }


  /**
   * Return true if this searchResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponse searchResponse = (SearchResponse) o;
    return Objects.equals(this.took, searchResponse.took) &&
        Objects.equals(this.timedOut, searchResponse.timedOut) &&
        Objects.equals(this.aggregations, searchResponse.aggregations) &&
        Objects.equals(this.hits, searchResponse.hits) &&
        Objects.equals(this.profile, searchResponse.profile) &&
        Objects.equals(this.warning, searchResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(took, timedOut, aggregations, hits, profile, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponse {\n");
    sb.append("    took: ").append(toIndentedString(took)).append("\n");
    sb.append("    timedOut: ").append(toIndentedString(timedOut)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

