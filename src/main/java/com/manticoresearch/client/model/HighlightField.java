/*
 * Manticore Search Client
 * Сlient for Manticore Search. 
 *
 * The version of the OpenAPI document: 3.3.0
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
 * Query Highlight field with options set
 */
@JsonPropertyOrder({
  HighlightField.JSON_PROPERTY_NAME,
  HighlightField.JSON_PROPERTY_LIMIT,
  HighlightField.JSON_PROPERTY_LIMIT_WORDS,
  HighlightField.JSON_PROPERTY_LIMIT_SNIPPETS
})
@JsonTypeName("highlightField")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-28T11:55:17.809597Z[Etc/UTC]")
public class HighlightField {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit = 256;

  public static final String JSON_PROPERTY_LIMIT_WORDS = "limit_words";
  private Integer limitWords = 0;

  public static final String JSON_PROPERTY_LIMIT_SNIPPETS = "limit_snippets";
  private Integer limitSnippets = 0;

  public HighlightField() { 
  }

  public HighlightField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public HighlightField limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public HighlightField limitWords(Integer limitWords) {
    this.limitWords = limitWords;
    return this;
  }

   /**
   * Get limitWords
   * @return limitWords
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimitWords() {
    return limitWords;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitWords(Integer limitWords) {
    this.limitWords = limitWords;
  }


  public HighlightField limitSnippets(Integer limitSnippets) {
    this.limitSnippets = limitSnippets;
    return this;
  }

   /**
   * Get limitSnippets
   * @return limitSnippets
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT_SNIPPETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimitSnippets() {
    return limitSnippets;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_SNIPPETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitSnippets(Integer limitSnippets) {
    this.limitSnippets = limitSnippets;
  }


  /**
   * Return true if this highlightField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HighlightField highlightField = (HighlightField) o;
    return Objects.equals(this.name, highlightField.name) &&
        Objects.equals(this.limit, highlightField.limit) &&
        Objects.equals(this.limitWords, highlightField.limitWords) &&
        Objects.equals(this.limitSnippets, highlightField.limitSnippets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, limit, limitWords, limitSnippets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HighlightField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    limitWords: ").append(toIndentedString(limitWords)).append("\n");
    sb.append("    limitSnippets: ").append(toIndentedString(limitSnippets)).append("\n");
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

