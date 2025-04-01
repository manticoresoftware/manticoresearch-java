/*
 * Manticore Search Client
 * Сlient for Manticore Search. 
 *
 * The version of the OpenAPI document: 5.0.0
 * Contact: info@manticoresearch.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.manticoresearch.client.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Object containing the document data for replacing an existing document in a table.
 */
@JsonPropertyOrder({
  ReplaceDocumentRequest.JSON_PROPERTY_DOC
})
@JsonTypeName("replaceDocumentRequest")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:06:34.794647478Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class ReplaceDocumentRequest {
  public static final String JSON_PROPERTY_DOC = "doc";
  private Object doc;

  public ReplaceDocumentRequest() { 
  }

  public ReplaceDocumentRequest doc(Object doc) {
    this.doc = doc;
    return this;
  }

  /**
   * Object containing the new document data to replace the existing one.
   * @return doc
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDoc() {
    return doc;
  }


  @JsonProperty(JSON_PROPERTY_DOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDoc(Object doc) {
    this.doc = doc;
  }


  /**
   * Return true if this replaceDocumentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceDocumentRequest replaceDocumentRequest = (ReplaceDocumentRequest) o;
    return Objects.equals(this.doc, replaceDocumentRequest.doc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceDocumentRequest {\n");
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

