/*
 * Manticore Search Client
 * Copyright (c) 2020-2021, Manticore Software LTD (https://manticoresearch.com)
 *
 * All rights reserved
 */


package com.manticoresearch.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Payload for search operation
 */
@ApiModel(description = "Payload for search operation")
@JsonPropertyOrder({
  SearchRequest.JSON_PROPERTY_INDEX,
  SearchRequest.JSON_PROPERTY_QUERY,
  SearchRequest.JSON_PROPERTY_LIMIT,
  SearchRequest.JSON_PROPERTY_OFFSET,
  SearchRequest.JSON_PROPERTY_MAX_MATCHES,
  SearchRequest.JSON_PROPERTY_SORT,
  SearchRequest.JSON_PROPERTY_AGGS,
  SearchRequest.JSON_PROPERTY_EXPRESSIONS,
  SearchRequest.JSON_PROPERTY_HIGHLIGHT,
  SearchRequest.JSON_PROPERTY_SOURCE,
  SearchRequest.JSON_PROPERTY_PROFILE
})
@JsonIgnoreProperties(ignoreUnknown = true)

public class SearchRequest {
  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_QUERY = "query";
  private Map<String, Object> query = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Integer offset;

  public static final String JSON_PROPERTY_MAX_MATCHES = "max_matches";
  private Integer maxMatches;

  public static final String JSON_PROPERTY_SORT = "sort";
  private List<Object> sort = null;

  public static final String JSON_PROPERTY_AGGS = "aggs";
  private Map<String, Object> aggs = null;

  public static final String JSON_PROPERTY_EXPRESSIONS = "expressions";
  private Object expressions;

  public static final String JSON_PROPERTY_HIGHLIGHT = "highlight";
  private Object highlight;

  public static final String JSON_PROPERTY_SOURCE = "_source";
  private List<String> source = null;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private Boolean profile;


  public SearchRequest index(String index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(example = "test", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public SearchRequest query(Map<String, Object> query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getQuery() {
    return query;
  }


  public void setQuery(Map<String, Object> query) {
    this.query = query;
  }


  public SearchRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public SearchRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public SearchRequest maxMatches(Integer maxMatches) {
    this.maxMatches = maxMatches;
    return this;
  }

   /**
   * Get maxMatches
   * @return maxMatches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxMatches() {
    return maxMatches;
  }


  public void setMaxMatches(Integer maxMatches) {
    this.maxMatches = maxMatches;
  }


  public SearchRequest sort(List<Object> sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getSort() {
    return sort;
  }


  public void setSort(List<Object> sort) {
    this.sort = sort;
  }


  public SearchRequest aggs(Map<String, Object> aggs) {
    this.aggs = aggs;
    return this;
  }

   /**
   * Get aggs
   * @return aggs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getAggs() {
    return aggs;
  }


  public void setAggs(Map<String, Object> aggs) {
    this.aggs = aggs;
  }


  public SearchRequest expressions(Object expressions) {
    this.expressions = expressions;
    return this;
  }

   /**
   * Get expressions
   * @return expressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPRESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getExpressions() {
    return expressions;
  }


  public void setExpressions(Object expressions) {
    this.expressions = expressions;
  }


  public SearchRequest highlight(Object highlight) {
    this.highlight = highlight;
    return this;
  }

   /**
   * Get highlight
   * @return highlight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIGHLIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getHighlight() {
    return highlight;
  }


  public void setHighlight(Object highlight) {
    this.highlight = highlight;
  }


  public SearchRequest source(List<String> source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSource() {
    return source;
  }


  public void setSource(List<String> source) {
    this.source = source;
  }


  public SearchRequest profile(Boolean profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProfile() {
    return profile;
  }


  public void setProfile(Boolean profile) {
    this.profile = profile;
  }


  /**
   * Return true if this searchRequest object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequest searchRequest = (SearchRequest) o;
    return Objects.equals(this.index, searchRequest.index) &&
        Objects.equals(this.query, searchRequest.query) &&
        Objects.equals(this.limit, searchRequest.limit) &&
        Objects.equals(this.offset, searchRequest.offset) &&
        Objects.equals(this.maxMatches, searchRequest.maxMatches) &&
        Objects.equals(this.sort, searchRequest.sort) &&
        Objects.equals(this.aggs, searchRequest.aggs) &&
        Objects.equals(this.expressions, searchRequest.expressions) &&
        Objects.equals(this.highlight, searchRequest.highlight) &&
        Objects.equals(this.source, searchRequest.source) &&
        Objects.equals(this.profile, searchRequest.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, query, limit, offset, maxMatches, sort, aggs, expressions, highlight, source, profile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequest {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    maxMatches: ").append(toIndentedString(maxMatches)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    aggs: ").append(toIndentedString(aggs)).append("\n");
    sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
