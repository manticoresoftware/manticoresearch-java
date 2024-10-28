/*
 * Manticore Search Client
 * Сlient for Manticore Search. 
 *
 * The version of the OpenAPI document: 5.0.0
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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Defines a type of filter for full-text search queries
 */
@JsonPropertyOrder({
  FulltextFilter.JSON_PROPERTY_QUERY_STRING,
  FulltextFilter.JSON_PROPERTY_MATCH,
  FulltextFilter.JSON_PROPERTY_MATCH_PHRASE,
  FulltextFilter.JSON_PROPERTY_MATCH_ALL
})
@JsonTypeName("fulltextFilter")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-28T07:04:51.268969530Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class FulltextFilter {
  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_MATCH = "match";
  private Object match;

  public static final String JSON_PROPERTY_MATCH_PHRASE = "match_phrase";
  private Object matchPhrase;

  public static final String JSON_PROPERTY_MATCH_ALL = "match_all";
  private Object matchAll;

  public FulltextFilter() { 
  }

  public FulltextFilter queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Filter object defining a query string
   * @return queryString
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQueryString() {
    return queryString;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }


  public FulltextFilter match(Object match) {
    this.match = match;
    return this;
  }

  /**
   * Filter object defining a match keyword passed as a string or in a Match object
   * @return match
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMatch() {
    return match;
  }


  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatch(Object match) {
    this.match = match;
  }


  public FulltextFilter matchPhrase(Object matchPhrase) {
    this.matchPhrase = matchPhrase;
    return this;
  }

  /**
   * Filter object defining a match phrase
   * @return matchPhrase
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_PHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMatchPhrase() {
    return matchPhrase;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_PHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchPhrase(Object matchPhrase) {
    this.matchPhrase = matchPhrase;
  }


  public FulltextFilter matchAll(Object matchAll) {
    this.matchAll = matchAll;
    return this;
  }

  /**
   * Filter object to select all documents
   * @return matchAll
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMatchAll() {
    return matchAll;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchAll(Object matchAll) {
    this.matchAll = matchAll;
  }


  /**
   * Return true if this fulltextFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulltextFilter fulltextFilter = (FulltextFilter) o;
    return Objects.equals(this.queryString, fulltextFilter.queryString) &&
        Objects.equals(this.match, fulltextFilter.match) &&
        Objects.equals(this.matchPhrase, fulltextFilter.matchPhrase) &&
        Objects.equals(this.matchAll, fulltextFilter.matchAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryString, match, matchPhrase, matchAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulltextFilter {\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchPhrase: ").append(toIndentedString(matchPhrase)).append("\n");
    sb.append("    matchAll: ").append(toIndentedString(matchAll)).append("\n");
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

