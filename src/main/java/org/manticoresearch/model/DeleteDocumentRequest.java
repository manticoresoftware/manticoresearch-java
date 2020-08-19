/*
 * Manticore Search Client
 * Please note that this client is experimental. For full documentation of the API methods consult https://manual.manticoresearch.com/. 
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
 * Payload for delete request. Documents can be deleted either one by one by specifying the document id or by providing a query object. For more information see  [Delete API](https://docs.manticoresearch.com/latest/html/http_reference/json_delete.html) 
 */
@ApiModel(description = "Payload for delete request. Documents can be deleted either one by one by specifying the document id or by providing a query object. For more information see  [Delete API](https://docs.manticoresearch.com/latest/html/http_reference/json_delete.html) ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-19T15:27:33.619Z[GMT]")
public class DeleteDocumentRequest {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private Object query;


  public DeleteDocumentRequest index(String index) {
    
    this.index = index;
    return this;
  }

   /**
   * Index name
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index name")

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public DeleteDocumentRequest id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document ID")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public DeleteDocumentRequest query(Object query) {
    
    this.query = query;
    return this;
  }

   /**
   * Query tree object
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Query tree object")

  public Object getQuery() {
    return query;
  }


  public void setQuery(Object query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDocumentRequest deleteDocumentRequest = (DeleteDocumentRequest) o;
    return Objects.equals(this.index, deleteDocumentRequest.index) &&
        Objects.equals(this.id, deleteDocumentRequest.id) &&
        Objects.equals(this.query, deleteDocumentRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDocumentRequest {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

