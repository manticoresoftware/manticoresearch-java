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
import com.manticoresearch.client.model.QueryFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * BoolFilter
 */
@JsonPropertyOrder({
  BoolFilter.JSON_PROPERTY_MUST,
  BoolFilter.JSON_PROPERTY_MUST_NOT,
  BoolFilter.JSON_PROPERTY_SHOULD
})
@JsonTypeName("boolFilter")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T13:59:29.723520242Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class BoolFilter {
  public static final String JSON_PROPERTY_MUST = "must";
  private List<QueryFilter> must;

  public static final String JSON_PROPERTY_MUST_NOT = "must_not";
  private List<QueryFilter> mustNot;

  public static final String JSON_PROPERTY_SHOULD = "should";
  private List<QueryFilter> should;

  public BoolFilter() { 
  }

  public BoolFilter must(List<QueryFilter> must) {
    this.must = must;
    return this;
  }

  public BoolFilter addMustItem(QueryFilter mustItem) {
    if (this.must == null) {
      this.must = new ArrayList<>();
    }
    this.must.add(mustItem);
    return this;
  }

  /**
   * Query clauses that must match for the document to be included
   * @return must
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QueryFilter> getMust() {
    return must;
  }


  @JsonProperty(JSON_PROPERTY_MUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMust(List<QueryFilter> must) {
    this.must = must;
  }


  public BoolFilter mustNot(List<QueryFilter> mustNot) {
    this.mustNot = mustNot;
    return this;
  }

  public BoolFilter addMustNotItem(QueryFilter mustNotItem) {
    if (this.mustNot == null) {
      this.mustNot = new ArrayList<>();
    }
    this.mustNot.add(mustNotItem);
    return this;
  }

  /**
   * Query clauses that must not match for the document to be included
   * @return mustNot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MUST_NOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QueryFilter> getMustNot() {
    return mustNot;
  }


  @JsonProperty(JSON_PROPERTY_MUST_NOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMustNot(List<QueryFilter> mustNot) {
    this.mustNot = mustNot;
  }


  public BoolFilter should(List<QueryFilter> should) {
    this.should = should;
    return this;
  }

  public BoolFilter addShouldItem(QueryFilter shouldItem) {
    if (this.should == null) {
      this.should = new ArrayList<>();
    }
    this.should.add(shouldItem);
    return this;
  }

  /**
   * Query clauses that should be matched, but are not required
   * @return should
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOULD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QueryFilter> getShould() {
    return should;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShould(List<QueryFilter> should) {
    this.should = should;
  }


  /**
   * Return true if this boolFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoolFilter boolFilter = (BoolFilter) o;
    return Objects.equals(this.must, boolFilter.must) &&
        Objects.equals(this.mustNot, boolFilter.mustNot) &&
        Objects.equals(this.should, boolFilter.should);
  }

  @Override
  public int hashCode() {
    return Objects.hash(must, mustNot, should);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoolFilter {\n");
    sb.append("    must: ").append(toIndentedString(must)).append("\n");
    sb.append("    mustNot: ").append(toIndentedString(mustNot)).append("\n");
    sb.append("    should: ").append(toIndentedString(should)).append("\n");
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

