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
 * Payload for delete request. Documents can be deleted either one by one by specifying the document id or by providing a query object. For more information see  [Delete API](https://docs.manticoresearch.com/latest/html/http_reference/json_delete.html) 
 */
@ApiModel(description = "Payload for delete request. Documents can be deleted either one by one by specifying the document id or by providing a query object. For more information see  [Delete API](https://docs.manticoresearch.com/latest/html/http_reference/json_delete.html) ")
@JsonPropertyOrder({
  DeleteDocumentRequest.JSON_PROPERTY_INDEX,
  DeleteDocumentRequest.JSON_PROPERTY_CLUSTER,
  DeleteDocumentRequest.JSON_PROPERTY_ID,
  DeleteDocumentRequest.JSON_PROPERTY_QUERY
})
@JsonIgnoreProperties(ignoreUnknown = true)

public class DeleteDocumentRequest {
  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_CLUSTER = "cluster";
  private String cluster;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_QUERY = "query";
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
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public DeleteDocumentRequest cluster(String cluster) {
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


  public void setCluster(String cluster) {
    this.cluster = cluster;
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
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getQuery() {
    return query;
  }


  public void setQuery(Object query) {
    this.query = query;
  }


  /**
   * Return true if this deleteDocumentRequest object is equal to o.
   */
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
        Objects.equals(this.cluster, deleteDocumentRequest.cluster) &&
        Objects.equals(this.id, deleteDocumentRequest.id) &&
        Objects.equals(this.query, deleteDocumentRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, cluster, id, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDocumentRequest {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
