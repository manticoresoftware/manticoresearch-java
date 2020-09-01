/*
 * Manticore Search Client
 * Experimental low-level client for Manticore Search. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package org.manticoresearch.client.model;

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
 * Payload for update document
 */
@ApiModel(description = "Payload for update document")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-01T08:52:23.169Z[GMT]")
public class UpdateDocumentRequest {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index;

  public static final String SERIALIZED_NAME_DOC = "doc";
  @SerializedName(SERIALIZED_NAME_DOC)
  private Map<String, Object> doc = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private Map<String, Object> query = null;


  public UpdateDocumentRequest index(String index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(required = true, value = "")

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public UpdateDocumentRequest doc(Map<String, Object> doc) {
    
    this.doc = doc;
    return this;
  }

  public UpdateDocumentRequest putDocItem(String key, Object docItem) {
    this.doc.put(key, docItem);
    return this;
  }

   /**
   * Index name
   * @return doc
  **/
  @ApiModelProperty(example = "{\"gid\":10}", required = true, value = "Index name")

  public Map<String, Object> getDoc() {
    return doc;
  }


  public void setDoc(Map<String, Object> doc) {
    this.doc = doc;
  }


  public UpdateDocumentRequest id(Long id) {
    
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


  public UpdateDocumentRequest query(Map<String, Object> query) {
    
    this.query = query;
    return this;
  }

  public UpdateDocumentRequest putQueryItem(String key, Object queryItem) {
    if (this.query == null) {
      this.query = new HashMap<String, Object>();
    }
    this.query.put(key, queryItem);
    return this;
  }

   /**
   * Query tree object
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"query\":{\"match\":{\"title\":\"match me\"}}}", value = "Query tree object")

  public Map<String, Object> getQuery() {
    return query;
  }


  public void setQuery(Map<String, Object> query) {
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
    UpdateDocumentRequest updateDocumentRequest = (UpdateDocumentRequest) o;
    return Objects.equals(this.index, updateDocumentRequest.index) &&
        Objects.equals(this.doc, updateDocumentRequest.doc) &&
        Objects.equals(this.id, updateDocumentRequest.id) &&
        Objects.equals(this.query, updateDocumentRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, doc, id, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDocumentRequest {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
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

