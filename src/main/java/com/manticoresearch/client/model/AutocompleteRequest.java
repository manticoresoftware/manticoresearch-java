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
 * Object containing the data for performing an autocomplete search.
 */
@JsonPropertyOrder({
  AutocompleteRequest.JSON_PROPERTY_TABLE,
  AutocompleteRequest.JSON_PROPERTY_QUERY,
  AutocompleteRequest.JSON_PROPERTY_OPTIONS
})
@JsonTypeName("autocompleteRequest")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-26T07:24:06.103497054Z[Etc/UTC]", comments = "Generator version: 7.14.0")
public class AutocompleteRequest {
  public static final String JSON_PROPERTY_TABLE = "table";
  private String table;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private Object options;

  public AutocompleteRequest() { 
  }

  public AutocompleteRequest table(String table) {
    this.table = table;
    return this;
  }

  /**
   * The table to perform the search on
   * @return table
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTable() {
    return table;
  }


  @JsonProperty(JSON_PROPERTY_TABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTable(String table) {
    this.table = table;
  }


  public AutocompleteRequest query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The beginning of the string to autocomplete
   * @return query
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuery(String query) {
    this.query = query;
  }


  public AutocompleteRequest options(Object options) {
    this.options = options;
    return this;
  }

  /**
   * Autocomplete options   - layouts: A comma-separated string of keyboard layout codes to validate and check for spell correction. Available options - us, ru, ua, se, pt, no, it, gr, uk, fr, es, dk, de, ch, br, bg, be. By default, all are enabled.   - fuzziness: (0,1 or 2) Maximum Levenshtein distance for finding typos. Set to 0 to disable fuzzy matching. Default is 2   - prepend: true/false If true, adds an asterisk before the last word for prefix expansion (e.g., *word )   - append:  true/false If true, adds an asterisk after the last word for prefix expansion (e.g., word* )   - expansion_len: Number of characters to expand in the last word. Default is 10. 
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(Object options) {
    this.options = options;
  }


  /**
   * Return true if this autocompleteRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutocompleteRequest autocompleteRequest = (AutocompleteRequest) o;
    return Objects.equals(this.table, autocompleteRequest.table) &&
        Objects.equals(this.query, autocompleteRequest.query) &&
        Objects.equals(this.options, autocompleteRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(table, query, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutocompleteRequest {\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

