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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Filter helper object defining a match keyword and match options
 */
@JsonPropertyOrder({
  Match.JSON_PROPERTY_QUERY,
  Match.JSON_PROPERTY_OPERATOR,
  Match.JSON_PROPERTY_BOOST
})
@JsonTypeName("_match")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:06:34.794647478Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class Match {
  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  /**
   * Gets or Sets operator
   */
  public enum OperatorEnum {
    OR("or"),
    
    AND("and");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private OperatorEnum operator;

  public static final String JSON_PROPERTY_BOOST = "boost";
  private BigDecimal boost;

  public Match() { 
  }

  public Match query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
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


  public Match operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperatorEnum getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public Match boost(BigDecimal boost) {
    this.boost = boost;
    return this;
  }

  /**
   * Get boost
   * @return boost
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBoost() {
    return boost;
  }


  @JsonProperty(JSON_PROPERTY_BOOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBoost(BigDecimal boost) {
    this.boost = boost;
  }


  /**
   * Return true if this _match object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Match match = (Match) o;
    return Objects.equals(this.query, match.query) &&
        Objects.equals(this.operator, match.operator) &&
        Objects.equals(this.boost, match.boost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, operator, boost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Match {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    boost: ").append(toIndentedString(boost)).append("\n");
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

