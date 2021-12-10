/*
 * Manticore Search Client
 * Experimental low-level client for Manticore Search. 
 *
 * Contact: https://manticoresearch.com/contact-us/
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Object with documents to percolate
 */
@ApiModel(description = "Object with documents to percolate")
@JsonPropertyOrder({
  PercolateRequest.JSON_PROPERTY_QUERY
})

public class PercolateRequest {
  public static final String JSON_PROPERTY_QUERY = "query";
  private Map<String, Object> query;


  public PercolateRequest query(Map<String, Object> query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(example = "{\"percolate\":{\"document\":{\"title\":\"some text to match\"}}}", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getQuery() {
    return query;
  }


  public void setQuery(Map<String, Object> query) {
    this.query = query;
  }


  /**
   * Return true if this percolateRequest object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PercolateRequest percolateRequest = (PercolateRequest) o;
    return Objects.equals(this.query, percolateRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PercolateRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

