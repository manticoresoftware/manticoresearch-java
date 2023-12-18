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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manticoresearch.client.JSON;


/**
 * Range attribute filter
 */
@JsonPropertyOrder({
  RangeFilter.JSON_PROPERTY_FIELD,
  RangeFilter.JSON_PROPERTY_LTE,
  RangeFilter.JSON_PROPERTY_GTE,
  RangeFilter.JSON_PROPERTY_LT,
  RangeFilter.JSON_PROPERTY_GT
})
@JsonTypeName("rangeFilter")
@JsonIgnoreProperties(ignoreUnknown = true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T10:27:43.373739969Z[Etc/UTC]")
public class RangeFilter {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_LTE = "lte";
  private JsonNullable<BigDecimal> lte = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_GTE = "gte";
  private JsonNullable<BigDecimal> gte = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_LT = "lt";
  private JsonNullable<BigDecimal> lt = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_GT = "gt";
  private JsonNullable<BigDecimal> gt = JsonNullable.<BigDecimal>undefined();

  public RangeFilter() { 
  }

  public RangeFilter field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setField(String field) {
    this.field = field;
  }


  public RangeFilter lte(BigDecimal lte) {
    this.lte = JsonNullable.<BigDecimal>of(lte);
    return this;
  }

   /**
   * Get lte
   * @return lte
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public BigDecimal getLte() {
        return lte.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getLte_JsonNullable() {
    return lte;
  }
  
  @JsonProperty(JSON_PROPERTY_LTE)
  public void setLte_JsonNullable(JsonNullable<BigDecimal> lte) {
    this.lte = lte;
  }

  public void setLte(BigDecimal lte) {
    this.lte = JsonNullable.<BigDecimal>of(lte);
  }


  public RangeFilter gte(BigDecimal gte) {
    this.gte = JsonNullable.<BigDecimal>of(gte);
    return this;
  }

   /**
   * Get gte
   * @return gte
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public BigDecimal getGte() {
        return gte.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getGte_JsonNullable() {
    return gte;
  }
  
  @JsonProperty(JSON_PROPERTY_GTE)
  public void setGte_JsonNullable(JsonNullable<BigDecimal> gte) {
    this.gte = gte;
  }

  public void setGte(BigDecimal gte) {
    this.gte = JsonNullable.<BigDecimal>of(gte);
  }


  public RangeFilter lt(BigDecimal lt) {
    this.lt = JsonNullable.<BigDecimal>of(lt);
    return this;
  }

   /**
   * Get lt
   * @return lt
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public BigDecimal getLt() {
        return lt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getLt_JsonNullable() {
    return lt;
  }
  
  @JsonProperty(JSON_PROPERTY_LT)
  public void setLt_JsonNullable(JsonNullable<BigDecimal> lt) {
    this.lt = lt;
  }

  public void setLt(BigDecimal lt) {
    this.lt = JsonNullable.<BigDecimal>of(lt);
  }


  public RangeFilter gt(BigDecimal gt) {
    this.gt = JsonNullable.<BigDecimal>of(gt);
    return this;
  }

   /**
   * Get gt
   * @return gt
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public BigDecimal getGt() {
        return gt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getGt_JsonNullable() {
    return gt;
  }
  
  @JsonProperty(JSON_PROPERTY_GT)
  public void setGt_JsonNullable(JsonNullable<BigDecimal> gt) {
    this.gt = gt;
  }

  public void setGt(BigDecimal gt) {
    this.gt = JsonNullable.<BigDecimal>of(gt);
  }


  /**
   * Return true if this rangeFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeFilter rangeFilter = (RangeFilter) o;
    return Objects.equals(this.field, rangeFilter.field) &&
        equalsNullable(this.lte, rangeFilter.lte) &&
        equalsNullable(this.gte, rangeFilter.gte) &&
        equalsNullable(this.lt, rangeFilter.lt) &&
        equalsNullable(this.gt, rangeFilter.gt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, hashCodeNullable(lte), hashCodeNullable(gte), hashCodeNullable(lt), hashCodeNullable(gt));
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
    sb.append("class RangeFilter {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
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

