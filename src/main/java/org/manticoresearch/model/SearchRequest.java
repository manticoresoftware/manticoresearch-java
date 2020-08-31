/*
 * Manticore Search Client
 * Experimental low-level client for Manticore Search. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package org.manticoresearch.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Payload for search operation
 */
@ApiModel(description = "Payload for search operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T09:15:48.272Z[GMT]")
public class SearchRequest {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private Map<String, Object> query = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_MAX_MATCHES = "max_matches";
  @SerializedName(SERIALIZED_NAME_MAX_MATCHES)
  private Integer maxMatches;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private List<Object> sort = null;

  public static final String SERIALIZED_NAME_SCRIPT_FIELDS = "script_fields";
  @SerializedName(SERIALIZED_NAME_SCRIPT_FIELDS)
  private Object scriptFields;

  public static final String SERIALIZED_NAME_HIGHLIGHT = "highlight";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT)
  private Object highlight;

  public static final String SERIALIZED_NAME_SOURCE = "_source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private List<String> source = null;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
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

  public SearchRequest putQueryItem(String key, Object queryItem) {
    this.query.put(key, queryItem);
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(required = true, value = "")

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

  public SearchRequest addSortItem(Object sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<Object>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getSort() {
    return sort;
  }


  public void setSort(List<Object> sort) {
    this.sort = sort;
  }


  public SearchRequest scriptFields(Object scriptFields) {
    
    this.scriptFields = scriptFields;
    return this;
  }

   /**
   * Get scriptFields
   * @return scriptFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getScriptFields() {
    return scriptFields;
  }


  public void setScriptFields(Object scriptFields) {
    this.scriptFields = scriptFields;
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

  public SearchRequest addSourceItem(String sourceItem) {
    if (this.source == null) {
      this.source = new ArrayList<String>();
    }
    this.source.add(sourceItem);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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

  public Boolean getProfile() {
    return profile;
  }


  public void setProfile(Boolean profile) {
    this.profile = profile;
  }


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
        Objects.equals(this.scriptFields, searchRequest.scriptFields) &&
        Objects.equals(this.highlight, searchRequest.highlight) &&
        Objects.equals(this.source, searchRequest.source) &&
        Objects.equals(this.profile, searchRequest.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, query, limit, offset, maxMatches, sort, scriptFields, highlight, source, profile);
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
    sb.append("    scriptFields: ").append(toIndentedString(scriptFields)).append("\n");
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

