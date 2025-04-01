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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Filter helper object defining the &#39;range&#39; condition
 */
@JsonPropertyOrder({
  Range.JSON_PROPERTY_LT,
  Range.JSON_PROPERTY_LTE,
  Range.JSON_PROPERTY_GT,
  Range.JSON_PROPERTY_GTE
})
@JsonTypeName("range")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:06:34.794647478Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class Range {
  public static final String JSON_PROPERTY_LT = "lt";
  private JsonNullable<Object> lt = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_LTE = "lte";
  private JsonNullable<Object> lte = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_GT = "gt";
  private JsonNullable<Object> gt = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_GTE = "gte";
  private JsonNullable<Object> gte = JsonNullable.<Object>undefined();

  public Range() { 
  }

  public Range lt(Object lt) {
    this.lt = JsonNullable.<Object>of(lt);
    return this;
  }

  /**
   * Get lt
   * @return lt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getLt() {
        return lt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLt_JsonNullable() {
    return lt;
  }
  
  @JsonProperty(JSON_PROPERTY_LT)
  public void setLt_JsonNullable(JsonNullable<Object> lt) {
    this.lt = lt;
  }

  public void setLt(Object lt) {
    this.lt = JsonNullable.<Object>of(lt);
  }


  public Range lte(Object lte) {
    this.lte = JsonNullable.<Object>of(lte);
    return this;
  }

  /**
   * Get lte
   * @return lte
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getLte() {
        return lte.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLte_JsonNullable() {
    return lte;
  }
  
  @JsonProperty(JSON_PROPERTY_LTE)
  public void setLte_JsonNullable(JsonNullable<Object> lte) {
    this.lte = lte;
  }

  public void setLte(Object lte) {
    this.lte = JsonNullable.<Object>of(lte);
  }


  public Range gt(Object gt) {
    this.gt = JsonNullable.<Object>of(gt);
    return this;
  }

  /**
   * Get gt
   * @return gt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getGt() {
        return gt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGt_JsonNullable() {
    return gt;
  }
  
  @JsonProperty(JSON_PROPERTY_GT)
  public void setGt_JsonNullable(JsonNullable<Object> gt) {
    this.gt = gt;
  }

  public void setGt(Object gt) {
    this.gt = JsonNullable.<Object>of(gt);
  }


  public Range gte(Object gte) {
    this.gte = JsonNullable.<Object>of(gte);
    return this;
  }

  /**
   * Get gte
   * @return gte
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getGte() {
        return gte.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGte_JsonNullable() {
    return gte;
  }
  
  @JsonProperty(JSON_PROPERTY_GTE)
  public void setGte_JsonNullable(JsonNullable<Object> gte) {
    this.gte = gte;
  }

  public void setGte(Object gte) {
    this.gte = JsonNullable.<Object>of(gte);
  }


  /**
   * Return true if this range object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Range range = (Range) o;
    return equalsNullable(this.lt, range.lt) &&
        equalsNullable(this.lte, range.lte) &&
        equalsNullable(this.gt, range.gt) &&
        equalsNullable(this.gte, range.gte);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(lt), hashCodeNullable(lte), hashCodeNullable(gt), hashCodeNullable(gte));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Range {\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
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

