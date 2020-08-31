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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Object with document data. 
 */
@ApiModel(description = "Object with document data. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T09:15:48.272Z[GMT]")
public class InsertDocumentRequest {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_DOC = "doc";
  @SerializedName(SERIALIZED_NAME_DOC)
  private Map<String, Object> doc = new HashMap<String, Object>();


  public InsertDocumentRequest index(String index) {
    
    this.index = index;
    return this;
  }

   /**
   * Name of the index
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Name of the index")

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public InsertDocumentRequest id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document ID. 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document ID. ")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public InsertDocumentRequest doc(Map<String, Object> doc) {
    
    this.doc = doc;
    return this;
  }

  public InsertDocumentRequest putDocItem(String key, Object docItem) {
    this.doc.put(key, docItem);
    return this;
  }

   /**
   * Object with document data 
   * @return doc
  **/
  @ApiModelProperty(required = true, value = "Object with document data ")

  public Map<String, Object> getDoc() {
    return doc;
  }


  public void setDoc(Map<String, Object> doc) {
    this.doc = doc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertDocumentRequest insertDocumentRequest = (InsertDocumentRequest) o;
    return Objects.equals(this.index, insertDocumentRequest.index) &&
        Objects.equals(this.id, insertDocumentRequest.id) &&
        Objects.equals(this.doc, insertDocumentRequest.doc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, doc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertDocumentRequest {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
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

