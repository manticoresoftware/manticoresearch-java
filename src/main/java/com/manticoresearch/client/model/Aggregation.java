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
import com.manticoresearch.client.model.AggregationComposite;
import com.manticoresearch.client.model.AggregationSortInnerValue;
import com.manticoresearch.client.model.AggregationTerms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Aggregation Alias
 */
@JsonPropertyOrder({
  Aggregation.JSON_PROPERTY_TERMS,
  Aggregation.JSON_PROPERTY_SORT,
  Aggregation.JSON_PROPERTY_COMPOSITE
})
@JsonTypeName("aggregation")
@JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-16T09:24:57.812240843Z[Etc/UTC]")
public class Aggregation {
  public static final String JSON_PROPERTY_TERMS = "terms";
  private AggregationTerms terms;

  public static final String JSON_PROPERTY_SORT = "sort";
  private List<Map<String, AggregationSortInnerValue>> sort;

  public static final String JSON_PROPERTY_COMPOSITE = "composite";
  private AggregationComposite composite;

  public Aggregation() { 
  }

  public Aggregation terms(AggregationTerms terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AggregationTerms getTerms() {
    return terms;
  }


  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerms(AggregationTerms terms) {
    this.terms = terms;
  }


  public Aggregation sort(List<Map<String, AggregationSortInnerValue>> sort) {
    this.sort = sort;
    return this;
  }

  public Aggregation addSortItem(Map<String, AggregationSortInnerValue> sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, AggregationSortInnerValue>> getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(List<Map<String, AggregationSortInnerValue>> sort) {
    this.sort = sort;
  }


  public Aggregation composite(AggregationComposite composite) {
    this.composite = composite;
    return this;
  }

   /**
   * Get composite
   * @return composite
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPOSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AggregationComposite getComposite() {
    return composite;
  }


  @JsonProperty(JSON_PROPERTY_COMPOSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComposite(AggregationComposite composite) {
    this.composite = composite;
  }


  /**
   * Return true if this aggregation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aggregation aggregation = (Aggregation) o;
    return Objects.equals(this.terms, aggregation.terms) &&
        Objects.equals(this.sort, aggregation.sort) &&
        Objects.equals(this.composite, aggregation.composite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terms, sort, composite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aggregation {\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    composite: ").append(toIndentedString(composite)).append("\n");
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

