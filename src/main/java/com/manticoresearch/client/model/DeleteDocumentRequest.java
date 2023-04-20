/*
 * Manticore Search Client
 * Low-level client for Manticore Search. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@manticoresearch.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Payload for delete request. Documents can be deleted either one by one by specifying the document id or by providing a query object. For more information see  [Delete API](https://manual.manticoresearch.com/Deleting_documents) 
 */
@JsonPropertyOrder({
  DeleteDocumentRequest.JSON_PROPERTY_INDEX,
  DeleteDocumentRequest.JSON_PROPERTY_CLUSTER,
  DeleteDocumentRequest.JSON_PROPERTY_ID,
  DeleteDocumentRequest.JSON_PROPERTY_QUERY
})
@JsonTypeName("deleteDocumentRequest")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-19T16:54:33.962336Z[Etc/UTC]")
public class DeleteDocumentRequest {
  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_CLUSTER = "cluster";
  private String cluster;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_QUERY = "query";
  private Object query;

  public DeleteDocumentRequest() { 
  }

  public DeleteDocumentRequest index(String index) {
    this.index = index;
    return this;
  }

   /**
   * Index name
   * @return index
  **/
  @javax.annotation.Nonnull
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


  public DeleteDocumentRequest cluster(String cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * cluster name
   * @return cluster
  **/
  @javax.annotation.Nullable
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


  public DeleteDocumentRequest id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Document ID
   * @return id
  **/
  @javax.annotation.Nullable
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


  public DeleteDocumentRequest query(Object query) {
    this.query = query;
    return this;
  }

   /**
   * Query tree object
   * @return query
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuery(Object query) {
    this.query = query;
  }


  /**
   * Return true if this deleteDocumentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

