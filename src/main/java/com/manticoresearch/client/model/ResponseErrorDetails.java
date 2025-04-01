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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Detailed error information returned in case of an error response
 */
@JsonPropertyOrder({
  ResponseErrorDetails.JSON_PROPERTY_TYPE,
  ResponseErrorDetails.JSON_PROPERTY_REASON,
  ResponseErrorDetails.JSON_PROPERTY_TABLE
})
@JsonTypeName("responseErrorDetails")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T04:42:17.765433185Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class ResponseErrorDetails {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_REASON = "reason";
  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TABLE = "table";
  private JsonNullable<String> table = JsonNullable.<String>undefined();

  public ResponseErrorDetails() { 
  }

  public ResponseErrorDetails type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type or category of the error
   * @return type
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public ResponseErrorDetails reason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
    return this;
  }

  /**
   * Detailed explanation of why the error occurred
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getReason() {
        return reason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReason_JsonNullable() {
    return reason;
  }
  
  @JsonProperty(JSON_PROPERTY_REASON)
  public void setReason_JsonNullable(JsonNullable<String> reason) {
    this.reason = reason;
  }

  public void setReason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
  }


  public ResponseErrorDetails table(String table) {
    this.table = JsonNullable.<String>of(table);
    return this;
  }

  /**
   * The table related to the error, if applicable
   * @return table
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getTable() {
        return table.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTable_JsonNullable() {
    return table;
  }
  
  @JsonProperty(JSON_PROPERTY_TABLE)
  public void setTable_JsonNullable(JsonNullable<String> table) {
    this.table = table;
  }

  public void setTable(String table) {
    this.table = JsonNullable.<String>of(table);
  }


  /**
   * Return true if this responseErrorDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseErrorDetails responseErrorDetails = (ResponseErrorDetails) o;
    return Objects.equals(this.type, responseErrorDetails.type) &&
        equalsNullable(this.reason, responseErrorDetails.reason) &&
        equalsNullable(this.table, responseErrorDetails.table);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hashCodeNullable(reason), hashCodeNullable(table));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseErrorDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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

