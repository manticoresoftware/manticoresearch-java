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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Payload for update document
 */
@ApiModel(description = "Payload for update document")
@JsonPropertyOrder({
  UpdateDocumentRequest.JSON_PROPERTY_INDEX,
  UpdateDocumentRequest.JSON_PROPERTY_DOC,
  UpdateDocumentRequest.JSON_PROPERTY_ID,
  UpdateDocumentRequest.JSON_PROPERTY_QUERY
})
@JsonIgnoreProperties(ignoreUnknown = true)

public class UpdateDocumentRequest {
  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_DOC = "doc";
  private Map<String, Object> doc = new HashMap<>();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_QUERY = "query";
  private Map<String, Object> query = null;

  public UpdateDocumentRequest() { 
  }

  public UpdateDocumentRequest index(String index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"gid\":10}", required = true, value = "Index name")
  @JsonProperty(JSON_PROPERTY_DOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getDoc() {
    return doc;
  }


  @JsonProperty(JSON_PROPERTY_DOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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


  public UpdateDocumentRequest query(Map<String, Object> query) {
    this.query = query;
    return this;
  }

  public UpdateDocumentRequest putQueryItem(String key, Object queryItem) {
    if (this.query == null) {
      this.query = new HashMap<>();
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
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuery(Map<String, Object> query) {
    this.query = query;
  }


  /**
   * Return true if this updateDocumentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

