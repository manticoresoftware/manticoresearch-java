/*
 * Manticore Search Client
 * Experimental low-level client for Manticore Search. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package com.manticoresearch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchResponseHits
 */

public class SearchResponseHits {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_HITS = "hits";
  @SerializedName(SERIALIZED_NAME_HITS)
  private List<Object> hits = null;

  public static final String SERIALIZED_NAME_AGGREGATIONS = "aggregations";
  @SerializedName(SERIALIZED_NAME_AGGREGATIONS)
  private List<Object> aggregations = null;


  public SearchResponseHits total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public SearchResponseHits hits(List<Object> hits) {
    
    this.hits = hits;
    return this;
  }

  public SearchResponseHits addHitsItem(Object hitsItem) {
    if (this.hits == null) {
      this.hits = new ArrayList<Object>();
    }
    this.hits.add(hitsItem);
    return this;
  }

   /**
   * Get hits
   * @return hits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getHits() {
    return hits;
  }


  public void setHits(List<Object> hits) {
    this.hits = hits;
  }


  public SearchResponseHits aggregations(List<Object> aggregations) {
    
    this.aggregations = aggregations;
    return this;
  }

  public SearchResponseHits addAggregationsItem(Object aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new ArrayList<Object>();
    }
    this.aggregations.add(aggregationsItem);
    return this;
  }

   /**
   * Get aggregations
   * @return aggregations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getAggregations() {
    return aggregations;
  }


  public void setAggregations(List<Object> aggregations) {
    this.aggregations = aggregations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseHits searchResponseHits = (SearchResponseHits) o;
    return Objects.equals(this.total, searchResponseHits.total) &&
        Objects.equals(this.hits, searchResponseHits.hits) &&
        Objects.equals(this.aggregations, searchResponseHits.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, hits, aggregations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseHits {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

