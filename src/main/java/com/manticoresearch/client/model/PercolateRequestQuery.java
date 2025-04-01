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
 * PercolateRequestQuery
 */
@JsonPropertyOrder({
  PercolateRequestQuery.JSON_PROPERTY_PERCOLATE
})
@JsonTypeName("percolateRequest_query")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T04:42:17.765433185Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class PercolateRequestQuery {
  public static final String JSON_PROPERTY_PERCOLATE = "percolate";
  private Object percolate;

  public PercolateRequestQuery() { 
  }

  public PercolateRequestQuery percolate(Object percolate) {
    this.percolate = percolate;
    return this;
  }

  /**
   * Object representing the document to percolate
   * @return percolate
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERCOLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPercolate() {
    return percolate;
  }


  @JsonProperty(JSON_PROPERTY_PERCOLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPercolate(Object percolate) {
    this.percolate = percolate;
  }


  /**
   * Return true if this percolateRequest_query object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PercolateRequestQuery percolateRequestQuery = (PercolateRequestQuery) o;
    return Objects.equals(this.percolate, percolateRequestQuery.percolate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percolate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PercolateRequestQuery {\n");
    sb.append("    percolate: ").append(toIndentedString(percolate)).append("\n");
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

