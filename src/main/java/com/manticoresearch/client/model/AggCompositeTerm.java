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
 * Object representing a term to be used in composite aggregation.
 */
@JsonPropertyOrder({
  AggCompositeTerm.JSON_PROPERTY_FIELD
})
@JsonTypeName("aggCompositeTerm")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-28T07:04:51.268969530Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class AggCompositeTerm {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public AggCompositeTerm() { 
  }

  public AggCompositeTerm field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Name of field to operate with
   * @return field
   */
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


  /**
   * Return true if this aggCompositeTerm object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggCompositeTerm aggCompositeTerm = (AggCompositeTerm) o;
    return Objects.equals(this.field, aggCompositeTerm.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggCompositeTerm {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

