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
import com.manticoresearch.client.model.AggCompositeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Object to perform composite aggregation, i.e., grouping search results by multiple fields
 */
@JsonPropertyOrder({
  AggComposite.JSON_PROPERTY_SIZE,
  AggComposite.JSON_PROPERTY_SOURCES
})
@JsonTypeName("aggComposite")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-28T12:56:08.804080940Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class AggComposite {
  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<Map<String, AggCompositeSource>> sources;

  public AggComposite() { 
  }

  public AggComposite size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Maximum number of composite buckets in the result
   * @return size
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public AggComposite sources(List<Map<String, AggCompositeSource>> sources) {
    this.sources = sources;
    return this;
  }

  public AggComposite addItem(Map<String, AggCompositeSource> sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Get sources
   * @return sources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, AggCompositeSource>> getSources() {
    return sources;
  }


  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSources(List<Map<String, AggCompositeSource>> sources) {
    this.sources = sources;
  }


  /**
   * Return true if this aggComposite object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggComposite aggComposite = (AggComposite) o;
    return Objects.equals(this.size, aggComposite.size) &&
        Objects.equals(this.sources, aggComposite.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggComposite {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

