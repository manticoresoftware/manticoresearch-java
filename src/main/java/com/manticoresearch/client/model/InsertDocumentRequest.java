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
 * Object with document data. 
 */
@ApiModel(description = "Object with document data. ")
@JsonPropertyOrder({
  InsertDocumentRequest.JSON_PROPERTY_INDEX,
  InsertDocumentRequest.JSON_PROPERTY_CLUSTER,
  InsertDocumentRequest.JSON_PROPERTY_ID,
  InsertDocumentRequest.JSON_PROPERTY_DOC
})
@JsonIgnoreProperties(ignoreUnknown = true)

public class InsertDocumentRequest {
  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_CLUSTER = "cluster";
  private String cluster;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_DOC = "doc";
  private Map<String, Object> doc = new HashMap<>();

  public InsertDocumentRequest() { 
  }

  public InsertDocumentRequest index(String index) {
    this.index = index;
    return this;
  }

   /**
   * Name of the index
   * @return index
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the index")
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


  public InsertDocumentRequest cluster(String cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * cluster name
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "cluster name")
  @JsonProperty(JSON_PROPERTY_CLUSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCluster() {
    return cluster;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCluster(String cluster) {
    this.cluster = cluster;
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
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object with document data ")
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


  /**
   * Return true if this insertDocumentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertDocumentRequest insertDocumentRequest = (InsertDocumentRequest) o;
    return Objects.equals(this.index, insertDocumentRequest.index) &&
        Objects.equals(this.cluster, insertDocumentRequest.cluster) &&
        Objects.equals(this.id, insertDocumentRequest.id) &&
        Objects.equals(this.doc, insertDocumentRequest.doc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, cluster, id, doc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertDocumentRequest {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
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

