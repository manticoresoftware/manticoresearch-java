/*
 * Manticore Search Client
 * Copyright (c) 2020-2021, Manticore Software LTD (https://manticoresearch.com)
 *
 * All rights reserved
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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Success response
 */
@ApiModel(description = "Success response")
@JsonPropertyOrder({
  DeleteResponse.JSON_PROPERTY_INDEX,
  DeleteResponse.JSON_PROPERTY_DELETED,
  DeleteResponse.JSON_PROPERTY_ID,
  DeleteResponse.JSON_PROPERTY_RESULT
})
@JsonIgnoreProperties(ignoreUnknown = true)

public class DeleteResponse {
  public static final String JSON_PROPERTY_INDEX = "_index";
  private String index;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Integer deleted;

  public static final String JSON_PROPERTY_ID = "_id";
  private Long id;

  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;


  public DeleteResponse index(String index) {
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


  public DeleteResponse deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeleted() {
    return deleted;
  }


  public void setDeleted(Integer deleted) {
    this.deleted = deleted;
  }


  public DeleteResponse id(Long id) {
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


  public DeleteResponse result(String result) {
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


  /**
   * Return true if this deleteResponse object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteResponse deleteResponse = (DeleteResponse) o;
    return Objects.equals(this.index, deleteResponse.index) &&
        Objects.equals(this.deleted, deleteResponse.deleted) &&
        Objects.equals(this.id, deleteResponse.id) &&
        Objects.equals(this.result, deleteResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, deleted, id, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteResponse {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
