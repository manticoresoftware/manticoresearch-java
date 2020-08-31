/*
 * Manticore Search Client
 * Experimental low-level client for Manticore Search. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package org.manticoresearch.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Success response
 */
@ApiModel(description = "Success response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T09:15:48.272Z[GMT]")
public class UpdateResponse {
  public static final String SERIALIZED_NAME_INDEX = "_index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private Integer updated;

  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;


  public UpdateResponse index(String index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public UpdateResponse updated(Integer updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUpdated() {
    return updated;
  }


  public void setUpdated(Integer updated) {
    this.updated = updated;
  }


  public UpdateResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public UpdateResponse result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateResponse updateResponse = (UpdateResponse) o;
    return Objects.equals(this.index, updateResponse.index) &&
        Objects.equals(this.updated, updateResponse.updated) &&
        Objects.equals(this.id, updateResponse.id) &&
        Objects.equals(this.result, updateResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, updated, id, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateResponse {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

