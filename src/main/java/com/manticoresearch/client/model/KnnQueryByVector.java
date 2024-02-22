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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Request object for knn search operation
 */
@JsonPropertyOrder({
  KnnQueryByVector.JSON_PROPERTY_FIELD,
  KnnQueryByVector.JSON_PROPERTY_QUERY_VECTOR,
  KnnQueryByVector.JSON_PROPERTY_K,
  KnnQueryByVector.JSON_PROPERTY_FILTER
})
@JsonTypeName("knnQueryByVector")
@JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T08:36:02.662182043Z[Etc/UTC]")
public class KnnQueryByVector {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field = "";

  public static final String JSON_PROPERTY_QUERY_VECTOR = "query_vector";
  private List<BigDecimal> queryVector = new ArrayList<>();

  public static final String JSON_PROPERTY_K = "k";
  private Integer k;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private Map<String, Object> filter = new HashMap<>();

  public KnnQueryByVector() { 
  }

  public KnnQueryByVector field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setField(String field) {
    this.field = field;
  }


  public KnnQueryByVector queryVector(List<BigDecimal> queryVector) {
    this.queryVector = queryVector;
    return this;
  }

  public KnnQueryByVector addQueryVectorItem(BigDecimal queryVectorItem) {
    if (this.queryVector == null) {
      this.queryVector = new ArrayList<>();
    }
    this.queryVector.add(queryVectorItem);
    return this;
  }

   /**
   * Get queryVector
   * @return queryVector
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUERY_VECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<BigDecimal> getQueryVector() {
    return queryVector;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_VECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueryVector(List<BigDecimal> queryVector) {
    this.queryVector = queryVector;
  }


  public KnnQueryByVector k(Integer k) {
    this.k = k;
    return this;
  }

   /**
   * Get k
   * @return k
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_K)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getK() {
    return k;
  }


  @JsonProperty(JSON_PROPERTY_K)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setK(Integer k) {
    this.k = k;
  }


  public KnnQueryByVector filter(Map<String, Object> filter) {
    this.filter = filter;
    return this;
  }

  public KnnQueryByVector putFilterItem(String key, Object filterItem) {
    if (this.filter == null) {
      this.filter = new HashMap<>();
    }
    this.filter.put(key, filterItem);
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getFilter() {
    return filter;
  }


  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(Map<String, Object> filter) {
    this.filter = filter;
  }


  /**
   * Return true if this knnQueryByVector object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnnQueryByVector knnQueryByVector = (KnnQueryByVector) o;
    return Objects.equals(this.field, knnQueryByVector.field) &&
        Objects.equals(this.queryVector, knnQueryByVector.queryVector) &&
        Objects.equals(this.k, knnQueryByVector.k) &&
        Objects.equals(this.filter, knnQueryByVector.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, queryVector, k, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnnQueryByVector {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    queryVector: ").append(toIndentedString(queryVector)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

