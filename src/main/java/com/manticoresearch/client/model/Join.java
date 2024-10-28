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
import com.manticoresearch.client.model.FulltextFilter;
import com.manticoresearch.client.model.JoinOn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Join
 */
@JsonPropertyOrder({
  Join.JSON_PROPERTY_TYPE,
  Join.JSON_PROPERTY_ON,
  Join.JSON_PROPERTY_QUERY,
  Join.JSON_PROPERTY_TABLE
})
@JsonTypeName("join")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-28T06:50:02.569821514Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class Join {
  /**
   * Type of the join operation
   */
  public enum TypeEnum {
    INNER("inner"),
    
    LEFT("left");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_ON = "on";
  private List<JoinOn> on = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY = "query";
  private FulltextFilter query;

  public static final String JSON_PROPERTY_TABLE = "table";
  private String table;

  public Join() { 
  }

  public Join type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the join operation
   * @return type
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Join on(List<JoinOn> on) {
    this.on = on;
    return this;
  }

  public Join addItem(JoinOn onItem) {
    if (this.on == null) {
      this.on = new ArrayList<>();
    }
    this.on.add(onItem);
    return this;
  }

  /**
   * List of objects defining joined tables
   * @return on
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<JoinOn> getOn() {
    return on;
  }


  @JsonProperty(JSON_PROPERTY_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOn(List<JoinOn> on) {
    this.on = on;
  }


  public Join query(FulltextFilter query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FulltextFilter getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuery(FulltextFilter query) {
    this.query = query;
  }


  public Join table(String table) {
    this.table = table;
    return this;
  }

  /**
   * Basic table of the join operation
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


  /**
   * Return true if this join object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Join join = (Join) o;
    return Objects.equals(this.type, join.type) &&
        Objects.equals(this.on, join.on) &&
        Objects.equals(this.query, join.query) &&
        Objects.equals(this.table, join.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, on, query, table);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Join {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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

