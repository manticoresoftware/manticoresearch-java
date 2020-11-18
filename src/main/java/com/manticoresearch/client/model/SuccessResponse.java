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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Success response
 */
@ApiModel(description = "Success response")
@JsonPropertyOrder({
  SuccessResponse.JSON_PROPERTY_INDEX,
  SuccessResponse.JSON_PROPERTY_ID,
  SuccessResponse.JSON_PROPERTY_CREATED,
  SuccessResponse.JSON_PROPERTY_RESULT,
  SuccessResponse.JSON_PROPERTY_FOUND
})

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


  public SuccessResponse index(String index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public SuccessResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public SuccessResponse created(Boolean created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreated() {
    return created;
  }


  public void setCreated(Boolean created) {
    this.created = created;
  }


  public SuccessResponse result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public SuccessResponse found(Boolean found) {
    this.found = found;
    return this;
  }

   /**
   * Get found
   * @return found
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFound() {
    return found;
  }


  public void setFound(Boolean found) {
    this.found = found;
  }


  /**
   * Return true if this successResponse object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.found, successResponse.found);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, created, result, found);
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

