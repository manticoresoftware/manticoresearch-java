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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Query filter
 */
@JsonPropertyOrder({
  NotFilterNumber.JSON_PROPERTY_FILTER_FIELD,
  NotFilterNumber.JSON_PROPERTY_OPERATION,
  NotFilterNumber.JSON_PROPERTY_FILTER_VALUE
})
@JsonTypeName("notFilterNumber")
@JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T11:24:55.908019234Z[Etc/UTC]")
public class NotFilterNumber {
  public static final String JSON_PROPERTY_FILTER_FIELD = "filter_field";
  private String filterField;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_FILTER_VALUE = "filter_value";
  private BigDecimal filterValue;

  public NotFilterNumber() { 
  }

  public NotFilterNumber filterField(String filterField) {
    this.filterField = filterField;
    return this;
  }

   /**
   * Get filterField
   * @return filterField
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILTER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFilterField() {
    return filterField;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilterField(String filterField) {
    this.filterField = filterField;
  }


  public NotFilterNumber operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperation(String operation) {
    this.operation = operation;
  }


  public NotFilterNumber filterValue(BigDecimal filterValue) {
    this.filterValue = filterValue;
    return this;
  }

   /**
   * Get filterValue
   * @return filterValue
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILTER_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getFilterValue() {
    return filterValue;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilterValue(BigDecimal filterValue) {
    this.filterValue = filterValue;
  }


  /**
   * Return true if this notFilterNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotFilterNumber notFilterNumber = (NotFilterNumber) o;
    return Objects.equals(this.filterField, notFilterNumber.filterField) &&
        Objects.equals(this.operation, notFilterNumber.operation) &&
        Objects.equals(this.filterValue, notFilterNumber.filterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterField, operation, filterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFilterNumber {\n");
    sb.append("    filterField: ").append(toIndentedString(filterField)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    filterValue: ").append(toIndentedString(filterValue)).append("\n");
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

