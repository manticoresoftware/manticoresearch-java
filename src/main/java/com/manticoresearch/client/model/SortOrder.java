/*
 * Manticore Search Client
 * Сlient for Manticore Search. 
 *
 * The version of the OpenAPI document: 3.3.1
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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Query sort expression
 */
@JsonPropertyOrder({
  SortOrder.JSON_PROPERTY_ATTR,
  SortOrder.JSON_PROPERTY_ORDER
})
@JsonTypeName("sortOrder")
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-16T16:10:26.238505Z[Etc/UTC]")
public class SortOrder {
  public static final String JSON_PROPERTY_ATTR = "attr";
  private String attr;

  /**
   * Gets or Sets order
   */
  public enum OrderEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    OrderEnum(String value) {
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
    public static OrderEnum fromValue(String value) {
      for (OrderEnum b : OrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ORDER = "order";
  private OrderEnum order;

  public SortOrder() { 
  }

  public SortOrder attr(String attr) {
    this.attr = attr;
    return this;
  }

   /**
   * Get attr
   * @return attr
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAttr() {
    return attr;
  }


  @JsonProperty(JSON_PROPERTY_ATTR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttr(String attr) {
    this.attr = attr;
  }


  public SortOrder order(OrderEnum order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrderEnum getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrder(OrderEnum order) {
    this.order = order;
  }


  /**
   * Return true if this sortOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortOrder sortOrder = (SortOrder) o;
    return Objects.equals(this.attr, sortOrder.attr) &&
        Objects.equals(this.order, sortOrder.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attr, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortOrder {\n");
    sb.append("    attr: ").append(toIndentedString(attr)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

