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
import com.manticoresearch.client.model.BoolFilter;
import com.manticoresearch.client.model.GeoDistance;
import com.manticoresearch.client.model.Highlight;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Defines a query structure for performing search operations
 */
@JsonPropertyOrder({
  SearchQuery.JSON_PROPERTY_QUERY_STRING,
  SearchQuery.JSON_PROPERTY_MATCH,
  SearchQuery.JSON_PROPERTY_MATCH_PHRASE,
  SearchQuery.JSON_PROPERTY_MATCH_ALL,
  SearchQuery.JSON_PROPERTY_BOOL,
  SearchQuery.JSON_PROPERTY_EQUALS,
  SearchQuery.JSON_PROPERTY_IN,
  SearchQuery.JSON_PROPERTY_RANGE,
  SearchQuery.JSON_PROPERTY_GEO_DISTANCE,
  SearchQuery.JSON_PROPERTY_HIGHLIGHT
})
@JsonTypeName("searchQuery")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-28T06:50:02.569821514Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class SearchQuery {
  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private JsonNullable<Object> queryString = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MATCH = "match";
  private JsonNullable<Object> match = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MATCH_PHRASE = "match_phrase";
  private JsonNullable<Object> matchPhrase = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MATCH_ALL = "match_all";
  private JsonNullable<Object> matchAll = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_BOOL = "bool";
  private BoolFilter bool;

  public static final String JSON_PROPERTY_EQUALS = "equals";
  private JsonNullable<Object> equals = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_IN = "in";
  private JsonNullable<Object> in = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RANGE = "range";
  private JsonNullable<Object> range = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GEO_DISTANCE = "geo_distance";
  private GeoDistance geoDistance;

  public static final String JSON_PROPERTY_HIGHLIGHT = "highlight";
  private Highlight highlight;

  public SearchQuery() { 
  }

  public SearchQuery queryString(Object queryString) {
    this.queryString = JsonNullable.<Object>of(queryString);
    return this;
  }

  /**
   * Filter object defining a query string
   * @return queryString
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getQueryString() {
        return queryString.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getQueryString_JsonNullable() {
    return queryString;
  }
  
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  public void setQueryString_JsonNullable(JsonNullable<Object> queryString) {
    this.queryString = queryString;
  }

  public void setQueryString(Object queryString) {
    this.queryString = JsonNullable.<Object>of(queryString);
  }


  public SearchQuery match(Object match) {
    this.match = JsonNullable.<Object>of(match);
    return this;
  }

  /**
   * Filter object defining a match keyword passed as a string or in a Match object
   * @return match
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getMatch() {
        return match.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMatch_JsonNullable() {
    return match;
  }
  
  @JsonProperty(JSON_PROPERTY_MATCH)
  public void setMatch_JsonNullable(JsonNullable<Object> match) {
    this.match = match;
  }

  public void setMatch(Object match) {
    this.match = JsonNullable.<Object>of(match);
  }


  public SearchQuery matchPhrase(Object matchPhrase) {
    this.matchPhrase = JsonNullable.<Object>of(matchPhrase);
    return this;
  }

  /**
   * Filter object defining a match phrase
   * @return matchPhrase
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getMatchPhrase() {
        return matchPhrase.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATCH_PHRASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMatchPhrase_JsonNullable() {
    return matchPhrase;
  }
  
  @JsonProperty(JSON_PROPERTY_MATCH_PHRASE)
  public void setMatchPhrase_JsonNullable(JsonNullable<Object> matchPhrase) {
    this.matchPhrase = matchPhrase;
  }

  public void setMatchPhrase(Object matchPhrase) {
    this.matchPhrase = JsonNullable.<Object>of(matchPhrase);
  }


  public SearchQuery matchAll(Object matchAll) {
    this.matchAll = JsonNullable.<Object>of(matchAll);
    return this;
  }

  /**
   * Filter object to select all documents
   * @return matchAll
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getMatchAll() {
        return matchAll.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATCH_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMatchAll_JsonNullable() {
    return matchAll;
  }
  
  @JsonProperty(JSON_PROPERTY_MATCH_ALL)
  public void setMatchAll_JsonNullable(JsonNullable<Object> matchAll) {
    this.matchAll = matchAll;
  }

  public void setMatchAll(Object matchAll) {
    this.matchAll = JsonNullable.<Object>of(matchAll);
  }


  public SearchQuery bool(BoolFilter bool) {
    this.bool = bool;
    return this;
  }

  /**
   * Get bool
   * @return bool
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BoolFilter getBool() {
    return bool;
  }


  @JsonProperty(JSON_PROPERTY_BOOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBool(BoolFilter bool) {
    this.bool = bool;
  }


  public SearchQuery equalsDef(Object equals) {
    this.equals = JsonNullable.<Object>of(equals);
    return this;
  }

  /**
   * Get equals
   * @return equals
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getEquals() {
        return equals.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EQUALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEquals_JsonNullable() {
    return equals;
  }
  
  @JsonProperty(JSON_PROPERTY_EQUALS)
  public void setEquals_JsonNullable(JsonNullable<Object> equals) {
    this.equals = equals;
  }

  public void setEquals(Object equals) {
    this.equals = JsonNullable.<Object>of(equals);
  }


  public SearchQuery in(Object in) {
    this.in = JsonNullable.<Object>of(in);
    return this;
  }

  /**
   * Filter to match a given set of attribute values.
   * @return in
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getIn() {
        return in.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getIn_JsonNullable() {
    return in;
  }
  
  @JsonProperty(JSON_PROPERTY_IN)
  public void setIn_JsonNullable(JsonNullable<Object> in) {
    this.in = in;
  }

  public void setIn(Object in) {
    this.in = JsonNullable.<Object>of(in);
  }


  public SearchQuery range(Object range) {
    this.range = JsonNullable.<Object>of(range);
    return this;
  }

  /**
   * Filter to match a given range of attribute values passed in Range objects
   * @return range
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getRange() {
        return range.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRange_JsonNullable() {
    return range;
  }
  
  @JsonProperty(JSON_PROPERTY_RANGE)
  public void setRange_JsonNullable(JsonNullable<Object> range) {
    this.range = range;
  }

  public void setRange(Object range) {
    this.range = JsonNullable.<Object>of(range);
  }


  public SearchQuery geoDistance(GeoDistance geoDistance) {
    this.geoDistance = geoDistance;
    return this;
  }

  /**
   * Get geoDistance
   * @return geoDistance
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GeoDistance getGeoDistance() {
    return geoDistance;
  }


  @JsonProperty(JSON_PROPERTY_GEO_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoDistance(GeoDistance geoDistance) {
    this.geoDistance = geoDistance;
  }


  public SearchQuery highlight(Highlight highlight) {
    this.highlight = highlight;
    return this;
  }

  /**
   * Get highlight
   * @return highlight
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGHLIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Highlight getHighlight() {
    return highlight;
  }


  @JsonProperty(JSON_PROPERTY_HIGHLIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighlight(Highlight highlight) {
    this.highlight = highlight;
  }


  /**
   * Return true if this searchQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchQuery searchQuery = (SearchQuery) o;
    return equalsNullable(this.queryString, searchQuery.queryString) &&
        equalsNullable(this.match, searchQuery.match) &&
        equalsNullable(this.matchPhrase, searchQuery.matchPhrase) &&
        equalsNullable(this.matchAll, searchQuery.matchAll) &&
        Objects.equals(this.bool, searchQuery.bool) &&
        equalsNullable(this.equals, searchQuery.equals) &&
        equalsNullable(this.in, searchQuery.in) &&
        equalsNullable(this.range, searchQuery.range) &&
        Objects.equals(this.geoDistance, searchQuery.geoDistance) &&
        Objects.equals(this.highlight, searchQuery.highlight);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(queryString), hashCodeNullable(match), hashCodeNullable(matchPhrase), hashCodeNullable(matchAll), bool, hashCodeNullable(equals), hashCodeNullable(in), hashCodeNullable(range), geoDistance, highlight);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchQuery {\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchPhrase: ").append(toIndentedString(matchPhrase)).append("\n");
    sb.append("    matchAll: ").append(toIndentedString(matchAll)).append("\n");
    sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
    sb.append("    equals: ").append(toIndentedString(equals)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    geoDistance: ").append(toIndentedString(geoDistance)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
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

