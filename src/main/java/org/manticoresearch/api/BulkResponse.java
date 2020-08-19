/*
 * Manticore Search Client
 * Please note that this client is experimental. For full documentation of the API methods consult https://manual.manticoresearch.com/. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package org.manticoresearch.api;

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
import java.util.HashMap;
import java.util.Map;

/**
 * Success bulk response
 */
@ApiModel(description = "Success bulk response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-19T15:03:34.206Z[GMT]")
public class BulkResponse extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private Object items;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Boolean error;


  public BulkResponse items(Object items) {
    
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getItems() {
    return items;
  }


  public void setItems(Object items) {
    this.items = items;
  }


  public BulkResponse error(Boolean error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getError() {
    return error;
  }


  public void setError(Boolean error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkResponse bulkResponse = (BulkResponse) o;
    return Objects.equals(this.items, bulkResponse.items) &&
        Objects.equals(this.error, bulkResponse.error) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, error, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

