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
 * Response object indicating the success of an operation, such as inserting or updating a document
 */
@JsonPropertyOrder({
  SuccessResponse.JSON_PROPERTY_INDEX,
  SuccessResponse.JSON_PROPERTY_ID,
  SuccessResponse.JSON_PROPERTY_CREATED,
  SuccessResponse.JSON_PROPERTY_RESULT,
  SuccessResponse.JSON_PROPERTY_FOUND,
  SuccessResponse.JSON_PROPERTY_STATUS
})
@JsonTypeName("successResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-28T06:50:02.569821514Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class SuccessResponse {
  public static final String JSON_PROPERTY_INDEX = "_index";
  private String index;

  public static final String JSON_PROPERTY_ID = "_id";
  private Long id;

  public static final String JSON_PROPERTY_CREATED = "created";
  private Boolean created;

  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public static final String JSON_PROPERTY_FOUND = "found";
  private Boolean found;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public SuccessResponse() { 
  }

  public SuccessResponse index(String index) {
    this.index = index;
    return this;
  }

  /**
   * Name of the document index
   * @return index
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(String index) {
    this.index = index;
  }


  public SuccessResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the document affected by the request operation
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public SuccessResponse created(Boolean created) {
    this.created = created;
    return this;
  }

  /**
   * Indicates whether the document was created as a result of the operation
   * @return created
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(Boolean created) {
    this.created = created;
  }


  public SuccessResponse result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Result of the operation, typically &#39;created&#39;, &#39;updated&#39;, or &#39;deleted&#39;
   * @return result
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(String result) {
    this.result = result;
  }


  public SuccessResponse found(Boolean found) {
    this.found = found;
    return this;
  }

  /**
   * Indicates whether the document was found in the index
   * @return found
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFound() {
    return found;
  }


  @JsonProperty(JSON_PROPERTY_FOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFound(Boolean found) {
    this.found = found;
  }


  public SuccessResponse status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code representing the result of the operation
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  /**
   * Return true if this successResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessResponse successResponse = (SuccessResponse) o;
    return Objects.equals(this.index, successResponse.index) &&
        Objects.equals(this.id, successResponse.id) &&
        Objects.equals(this.created, successResponse.created) &&
        Objects.equals(this.result, successResponse.result) &&
        Objects.equals(this.found, successResponse.found) &&
        Objects.equals(this.status, successResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, created, result, found, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessResponse {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

