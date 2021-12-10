/*
 * Manticore Search Client
 * Experimental low-level client for Manticore Search. 
 *
 * Contact: https://manticoresearch.com/contact-us/
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * SearchResponseHits
 */
@JsonPropertyOrder({
  SearchResponseHits.JSON_PROPERTY_MAX_SCORE,
  SearchResponseHits.JSON_PROPERTY_TOTAL,
  SearchResponseHits.JSON_PROPERTY_HITS
})

public class SearchResponseHits {
  public static final String JSON_PROPERTY_MAX_SCORE = "max_score";
  private Integer maxScore;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_HITS = "hits";
  private List<Object> hits = null;


  public SearchResponseHits maxScore(Integer maxScore) {
    this.maxScore = maxScore;
    return this;
  }

   /**
   * Get maxScore
   * @return maxScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxScore() {
    return maxScore;
  }


  public void setMaxScore(Integer maxScore) {
    this.maxScore = maxScore;
  }


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
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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

   /**
   * Get hits
   * @return hits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getHits() {
    return hits;
  }


  public void setHits(List<Object> hits) {
    this.hits = hits;
  }


  /**
   * Return true if this searchResponse_hits object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseHits searchResponseHits = (SearchResponseHits) o;
    return Objects.equals(this.maxScore, searchResponseHits.maxScore) &&
        Objects.equals(this.total, searchResponseHits.total) &&
        Objects.equals(this.hits, searchResponseHits.hits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxScore, total, hits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseHits {\n");
    sb.append("    maxScore: ").append(toIndentedString(maxScore)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
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

