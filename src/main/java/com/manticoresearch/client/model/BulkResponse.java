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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Success response for bulk search requests
 */
@JsonPropertyOrder({
  BulkResponse.JSON_PROPERTY_ITEMS,
  BulkResponse.JSON_PROPERTY_ERRORS,
  BulkResponse.JSON_PROPERTY_ERROR,
  BulkResponse.JSON_PROPERTY_CURRENT_LINE,
  BulkResponse.JSON_PROPERTY_SKIPPED_LINES
})
@JsonTypeName("bulkResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-28T06:50:02.569821514Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class BulkResponse {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Object> items;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private Boolean errors;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_CURRENT_LINE = "current_line";
  private Integer currentLine;

  public static final String JSON_PROPERTY_SKIPPED_LINES = "skipped_lines";
  private Integer skippedLines;

  public BulkResponse() { 
  }

  public BulkResponse items(List<Object> items) {
    this.items = items;
    return this;
  }

  public BulkResponse addItem(Object itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of results
   * @return items
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<Object> items) {
    this.items = items;
  }


  public BulkResponse errors(Boolean errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Errors occurred during the bulk operation
   * @return errors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(Boolean errors) {
    this.errors = errors;
  }


  public BulkResponse error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error message describing an error if such occurred
   * @return error
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  public BulkResponse currentLine(Integer currentLine) {
    this.currentLine = currentLine;
    return this;
  }

  /**
   * Number of the row returned in the response
   * @return currentLine
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCurrentLine() {
    return currentLine;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentLine(Integer currentLine) {
    this.currentLine = currentLine;
  }


  public BulkResponse skippedLines(Integer skippedLines) {
    this.skippedLines = skippedLines;
    return this;
  }

  /**
   * Number of rows skipped in the response
   * @return skippedLines
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKIPPED_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSkippedLines() {
    return skippedLines;
  }


  @JsonProperty(JSON_PROPERTY_SKIPPED_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkippedLines(Integer skippedLines) {
    this.skippedLines = skippedLines;
  }


  /**
   * Return true if this bulkResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkResponse bulkResponse = (BulkResponse) o;
    return Objects.equals(this.items, bulkResponse.items) &&
        Objects.equals(this.errors, bulkResponse.errors) &&
        Objects.equals(this.error, bulkResponse.error) &&
        Objects.equals(this.currentLine, bulkResponse.currentLine) &&
        Objects.equals(this.skippedLines, bulkResponse.skippedLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, errors, error, currentLine, skippedLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    currentLine: ").append(toIndentedString(currentLine)).append("\n");
    sb.append("    skippedLines: ").append(toIndentedString(skippedLines)).append("\n");
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

