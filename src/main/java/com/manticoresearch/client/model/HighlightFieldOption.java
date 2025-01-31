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
 * Options for controlling the behavior of highlighting on a per-field basis
 */
@JsonPropertyOrder({
  HighlightFieldOption.JSON_PROPERTY_FRAGMENT_SIZE,
  HighlightFieldOption.JSON_PROPERTY_LIMIT,
  HighlightFieldOption.JSON_PROPERTY_LIMIT_SNIPPETS,
  HighlightFieldOption.JSON_PROPERTY_LIMIT_WORDS,
  HighlightFieldOption.JSON_PROPERTY_NUMBER_OF_FRAGMENTS
})
@JsonTypeName("highlightFieldOption")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T13:59:29.723520242Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class HighlightFieldOption {
  public static final String JSON_PROPERTY_FRAGMENT_SIZE = "fragment_size";
  private Integer fragmentSize;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_LIMIT_SNIPPETS = "limit_snippets";
  private Integer limitSnippets;

  public static final String JSON_PROPERTY_LIMIT_WORDS = "limit_words";
  private Integer limitWords;

  public static final String JSON_PROPERTY_NUMBER_OF_FRAGMENTS = "number_of_fragments";
  private Integer numberOfFragments;

  public HighlightFieldOption() { 
  }

  public HighlightFieldOption fragmentSize(Integer fragmentSize) {
    this.fragmentSize = fragmentSize;
    return this;
  }

  /**
   * Maximum size of the text fragments in highlighted snippets per field
   * @return fragmentSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRAGMENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFragmentSize() {
    return fragmentSize;
  }


  @JsonProperty(JSON_PROPERTY_FRAGMENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFragmentSize(Integer fragmentSize) {
    this.fragmentSize = fragmentSize;
  }


  public HighlightFieldOption limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum size of snippets per field
   * @return limit
   */
  @jakarta.annotation.Nullable
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


  public HighlightFieldOption limitSnippets(Integer limitSnippets) {
    this.limitSnippets = limitSnippets;
    return this;
  }

  /**
   * Maximum number of snippets per field
   * @return limitSnippets
   */
  @jakarta.annotation.Nullable
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


  public HighlightFieldOption limitWords(Integer limitWords) {
    this.limitWords = limitWords;
    return this;
  }

  /**
   * Maximum number of words per field
   * @return limitWords
   */
  @jakarta.annotation.Nullable
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


  public HighlightFieldOption numberOfFragments(Integer numberOfFragments) {
    this.numberOfFragments = numberOfFragments;
    return this;
  }

  /**
   * Total number of highlighted fragments per field
   * @return numberOfFragments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FRAGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfFragments() {
    return numberOfFragments;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FRAGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfFragments(Integer numberOfFragments) {
    this.numberOfFragments = numberOfFragments;
  }


  /**
   * Return true if this highlightFieldOption object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HighlightFieldOption highlightFieldOption = (HighlightFieldOption) o;
    return Objects.equals(this.fragmentSize, highlightFieldOption.fragmentSize) &&
        Objects.equals(this.limit, highlightFieldOption.limit) &&
        Objects.equals(this.limitSnippets, highlightFieldOption.limitSnippets) &&
        Objects.equals(this.limitWords, highlightFieldOption.limitWords) &&
        Objects.equals(this.numberOfFragments, highlightFieldOption.numberOfFragments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fragmentSize, limit, limitSnippets, limitWords, numberOfFragments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HighlightFieldOption {\n");
    sb.append("    fragmentSize: ").append(toIndentedString(fragmentSize)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    limitSnippets: ").append(toIndentedString(limitSnippets)).append("\n");
    sb.append("    limitWords: ").append(toIndentedString(limitWords)).append("\n");
    sb.append("    numberOfFragments: ").append(toIndentedString(numberOfFragments)).append("\n");
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

