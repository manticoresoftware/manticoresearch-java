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
import com.manticoresearch.client.model.QueryFilter;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;


/**
 * Highlight
 */
@JsonPropertyOrder({
  Highlight.JSON_PROPERTY_FRAGMENT_SIZE,
  Highlight.JSON_PROPERTY_LIMIT,
  Highlight.JSON_PROPERTY_LIMIT_SNIPPETS,
  Highlight.JSON_PROPERTY_LIMIT_WORDS,
  Highlight.JSON_PROPERTY_NUMBER_OF_FRAGMENTS,
  Highlight.JSON_PROPERTY_AFTER_MATCH,
  Highlight.JSON_PROPERTY_ALLOW_EMPTY,
  Highlight.JSON_PROPERTY_AROUND,
  Highlight.JSON_PROPERTY_BEFORE_MATCH,
  Highlight.JSON_PROPERTY_EMIT_ZONES,
  Highlight.JSON_PROPERTY_ENCODER,
  Highlight.JSON_PROPERTY_FIELDS,
  Highlight.JSON_PROPERTY_FORCE_ALL_WORDS,
  Highlight.JSON_PROPERTY_FORCE_SNIPPETS,
  Highlight.JSON_PROPERTY_HIGHLIGHT_QUERY,
  Highlight.JSON_PROPERTY_HTML_STRIP_MODE,
  Highlight.JSON_PROPERTY_LIMITS_PER_FIELD,
  Highlight.JSON_PROPERTY_NO_MATCH_SIZE,
  Highlight.JSON_PROPERTY_ORDER,
  Highlight.JSON_PROPERTY_PRE_TAGS,
  Highlight.JSON_PROPERTY_POST_TAGS,
  Highlight.JSON_PROPERTY_START_SNIPPET_ID,
  Highlight.JSON_PROPERTY_USE_BOUNDARIES
})
@JsonTypeName("highlight")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T04:42:17.765433185Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
public class Highlight {
  public static final String JSON_PROPERTY_FRAGMENT_SIZE = "fragment_size";
  private JsonNullable<Object> fragmentSize = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private JsonNullable<Object> limit = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_LIMIT_SNIPPETS = "limit_snippets";
  private JsonNullable<Object> limitSnippets = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_LIMIT_WORDS = "limit_words";
  private JsonNullable<Object> limitWords = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_NUMBER_OF_FRAGMENTS = "number_of_fragments";
  private JsonNullable<Object> numberOfFragments = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_AFTER_MATCH = "after_match";
  private String afterMatch = "</strong>";

  public static final String JSON_PROPERTY_ALLOW_EMPTY = "allow_empty";
  private Boolean allowEmpty;

  public static final String JSON_PROPERTY_AROUND = "around";
  private Integer around;

  public static final String JSON_PROPERTY_BEFORE_MATCH = "before_match";
  private String beforeMatch = "<strong>";

  public static final String JSON_PROPERTY_EMIT_ZONES = "emit_zones";
  private Boolean emitZones;

  /**
   * If set to &#39;html&#39;, retains HTML markup when highlighting
   */
  public enum EncoderEnum {
    DEFAULT("default"),
    
    HTML("html");

    private String value;

    EncoderEnum(String value) {
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
    public static EncoderEnum fromValue(String value) {
      for (EncoderEnum b : EncoderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENCODER = "encoder";
  private EncoderEnum encoder;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private JsonNullable<Object> fields = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_FORCE_ALL_WORDS = "force_all_words";
  private Boolean forceAllWords;

  public static final String JSON_PROPERTY_FORCE_SNIPPETS = "force_snippets";
  private Boolean forceSnippets;

  public static final String JSON_PROPERTY_HIGHLIGHT_QUERY = "highlight_query";
  private JsonNullable<QueryFilter> highlightQuery = JsonNullable.<QueryFilter>undefined();

  /**
   * Defines the mode for handling HTML markup in the highlight
   */
  public enum HtmlStripModeEnum {
    NONE("none"),
    
    STRIP("strip"),
    
    INDEX("index"),
    
    RETAIN("retain");

    private String value;

    HtmlStripModeEnum(String value) {
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
    public static HtmlStripModeEnum fromValue(String value) {
      for (HtmlStripModeEnum b : HtmlStripModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_HTML_STRIP_MODE = "html_strip_mode";
  private HtmlStripModeEnum htmlStripMode;

  public static final String JSON_PROPERTY_LIMITS_PER_FIELD = "limits_per_field";
  private Boolean limitsPerField;

  /**
   * If set to 1, allows an empty string to be returned as a highlighting result
   */
  public enum NoMatchSizeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    NoMatchSizeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NoMatchSizeEnum fromValue(Integer value) {
      for (NoMatchSizeEnum b : NoMatchSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NO_MATCH_SIZE = "no_match_size";
  private NoMatchSizeEnum noMatchSize;

  /**
   * Sets the sorting order of highlighted snippets
   */
  public enum OrderEnum {
    ASC("asc"),
    
    DESC("desc"),
    
    SCORE("score");

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

  public static final String JSON_PROPERTY_PRE_TAGS = "pre_tags";
  private String preTags = "<strong>";

  public static final String JSON_PROPERTY_POST_TAGS = "post_tags";
  private String postTags = "</strong>";

  public static final String JSON_PROPERTY_START_SNIPPET_ID = "start_snippet_id";
  private Integer startSnippetId;

  public static final String JSON_PROPERTY_USE_BOUNDARIES = "use_boundaries";
  private Boolean useBoundaries;

  public Highlight() { 
  }

  public Highlight fragmentSize(Object fragmentSize) {
    this.fragmentSize = JsonNullable.<Object>of(fragmentSize);
    return this;
  }

  /**
   * Maximum size of the text fragments in highlighted snippets per field
   * @return fragmentSize
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getFragmentSize() {
        return fragmentSize.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRAGMENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFragmentSize_JsonNullable() {
    return fragmentSize;
  }
  
  @JsonProperty(JSON_PROPERTY_FRAGMENT_SIZE)
  public void setFragmentSize_JsonNullable(JsonNullable<Object> fragmentSize) {
    this.fragmentSize = fragmentSize;
  }

  public void setFragmentSize(Object fragmentSize) {
    this.fragmentSize = JsonNullable.<Object>of(fragmentSize);
  }


  public Highlight limit(Object limit) {
    this.limit = JsonNullable.<Object>of(limit);
    return this;
  }

  /**
   * Maximum size of snippets per field
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getLimit() {
        return limit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLimit_JsonNullable() {
    return limit;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT)
  public void setLimit_JsonNullable(JsonNullable<Object> limit) {
    this.limit = limit;
  }

  public void setLimit(Object limit) {
    this.limit = JsonNullable.<Object>of(limit);
  }


  public Highlight limitSnippets(Object limitSnippets) {
    this.limitSnippets = JsonNullable.<Object>of(limitSnippets);
    return this;
  }

  /**
   * Maximum number of snippets per field
   * @return limitSnippets
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getLimitSnippets() {
        return limitSnippets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT_SNIPPETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLimitSnippets_JsonNullable() {
    return limitSnippets;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT_SNIPPETS)
  public void setLimitSnippets_JsonNullable(JsonNullable<Object> limitSnippets) {
    this.limitSnippets = limitSnippets;
  }

  public void setLimitSnippets(Object limitSnippets) {
    this.limitSnippets = JsonNullable.<Object>of(limitSnippets);
  }


  public Highlight limitWords(Object limitWords) {
    this.limitWords = JsonNullable.<Object>of(limitWords);
    return this;
  }

  /**
   * Maximum number of words per field
   * @return limitWords
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getLimitWords() {
        return limitWords.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLimitWords_JsonNullable() {
    return limitWords;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT_WORDS)
  public void setLimitWords_JsonNullable(JsonNullable<Object> limitWords) {
    this.limitWords = limitWords;
  }

  public void setLimitWords(Object limitWords) {
    this.limitWords = JsonNullable.<Object>of(limitWords);
  }


  public Highlight numberOfFragments(Object numberOfFragments) {
    this.numberOfFragments = JsonNullable.<Object>of(numberOfFragments);
    return this;
  }

  /**
   * Total number of highlighted fragments per field
   * @return numberOfFragments
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getNumberOfFragments() {
        return numberOfFragments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FRAGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getNumberOfFragments_JsonNullable() {
    return numberOfFragments;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FRAGMENTS)
  public void setNumberOfFragments_JsonNullable(JsonNullable<Object> numberOfFragments) {
    this.numberOfFragments = numberOfFragments;
  }

  public void setNumberOfFragments(Object numberOfFragments) {
    this.numberOfFragments = JsonNullable.<Object>of(numberOfFragments);
  }


  public Highlight afterMatch(String afterMatch) {
    this.afterMatch = afterMatch;
    return this;
  }

  /**
   * Text inserted after the matched term, typically used for HTML formatting
   * @return afterMatch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFTER_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfterMatch() {
    return afterMatch;
  }


  @JsonProperty(JSON_PROPERTY_AFTER_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAfterMatch(String afterMatch) {
    this.afterMatch = afterMatch;
  }


  public Highlight allowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

  /**
   * Permits an empty string to be returned as the highlighting result. Otherwise, the beginning of the original text would be returned
   * @return allowEmpty
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowEmpty() {
    return allowEmpty;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
  }


  public Highlight around(Integer around) {
    this.around = around;
    return this;
  }

  /**
   * Number of words around the match to include in the highlight
   * @return around
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAround() {
    return around;
  }


  @JsonProperty(JSON_PROPERTY_AROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAround(Integer around) {
    this.around = around;
  }


  public Highlight beforeMatch(String beforeMatch) {
    this.beforeMatch = beforeMatch;
    return this;
  }

  /**
   * Text inserted before the match, typically used for HTML formatting
   * @return beforeMatch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEFORE_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBeforeMatch() {
    return beforeMatch;
  }


  @JsonProperty(JSON_PROPERTY_BEFORE_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeforeMatch(String beforeMatch) {
    this.beforeMatch = beforeMatch;
  }


  public Highlight emitZones(Boolean emitZones) {
    this.emitZones = emitZones;
    return this;
  }

  /**
   * Emits an HTML tag with the enclosing zone name before each highlighted snippet
   * @return emitZones
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMIT_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmitZones() {
    return emitZones;
  }


  @JsonProperty(JSON_PROPERTY_EMIT_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmitZones(Boolean emitZones) {
    this.emitZones = emitZones;
  }


  public Highlight encoder(EncoderEnum encoder) {
    this.encoder = encoder;
    return this;
  }

  /**
   * If set to &#39;html&#39;, retains HTML markup when highlighting
   * @return encoder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EncoderEnum getEncoder() {
    return encoder;
  }


  @JsonProperty(JSON_PROPERTY_ENCODER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncoder(EncoderEnum encoder) {
    this.encoder = encoder;
  }


  public Highlight fields(Object fields) {
    this.fields = JsonNullable.<Object>of(fields);
    return this;
  }

  /**
   * Get fields
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getFields() {
        return fields.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFields_JsonNullable() {
    return fields;
  }
  
  @JsonProperty(JSON_PROPERTY_FIELDS)
  public void setFields_JsonNullable(JsonNullable<Object> fields) {
    this.fields = fields;
  }

  public void setFields(Object fields) {
    this.fields = JsonNullable.<Object>of(fields);
  }


  public Highlight forceAllWords(Boolean forceAllWords) {
    this.forceAllWords = forceAllWords;
    return this;
  }

  /**
   * Ignores the length limit until the result includes all keywords
   * @return forceAllWords
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORCE_ALL_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForceAllWords() {
    return forceAllWords;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_ALL_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceAllWords(Boolean forceAllWords) {
    this.forceAllWords = forceAllWords;
  }


  public Highlight forceSnippets(Boolean forceSnippets) {
    this.forceSnippets = forceSnippets;
    return this;
  }

  /**
   * Forces snippet generation even if limits allow highlighting the entire text
   * @return forceSnippets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORCE_SNIPPETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForceSnippets() {
    return forceSnippets;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_SNIPPETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceSnippets(Boolean forceSnippets) {
    this.forceSnippets = forceSnippets;
  }


  public Highlight highlightQuery(QueryFilter highlightQuery) {
    this.highlightQuery = JsonNullable.<QueryFilter>of(highlightQuery);
    return this;
  }

  /**
   * Get highlightQuery
   * @return highlightQuery
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public QueryFilter getHighlightQuery() {
        return highlightQuery.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIGHLIGHT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<QueryFilter> getHighlightQuery_JsonNullable() {
    return highlightQuery;
  }
  
  @JsonProperty(JSON_PROPERTY_HIGHLIGHT_QUERY)
  public void setHighlightQuery_JsonNullable(JsonNullable<QueryFilter> highlightQuery) {
    this.highlightQuery = highlightQuery;
  }

  public void setHighlightQuery(QueryFilter highlightQuery) {
    this.highlightQuery = JsonNullable.<QueryFilter>of(highlightQuery);
  }


  public Highlight htmlStripMode(HtmlStripModeEnum htmlStripMode) {
    this.htmlStripMode = htmlStripMode;
    return this;
  }

  /**
   * Defines the mode for handling HTML markup in the highlight
   * @return htmlStripMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_STRIP_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HtmlStripModeEnum getHtmlStripMode() {
    return htmlStripMode;
  }


  @JsonProperty(JSON_PROPERTY_HTML_STRIP_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlStripMode(HtmlStripModeEnum htmlStripMode) {
    this.htmlStripMode = htmlStripMode;
  }


  public Highlight limitsPerField(Boolean limitsPerField) {
    this.limitsPerField = limitsPerField;
    return this;
  }

  /**
   * Determines whether the &#39;limit&#39;, &#39;limit_words&#39;, and &#39;limit_snippets&#39; options operate as individual limits in each field of the document
   * @return limitsPerField
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMITS_PER_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLimitsPerField() {
    return limitsPerField;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS_PER_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitsPerField(Boolean limitsPerField) {
    this.limitsPerField = limitsPerField;
  }


  public Highlight noMatchSize(NoMatchSizeEnum noMatchSize) {
    this.noMatchSize = noMatchSize;
    return this;
  }

  /**
   * If set to 1, allows an empty string to be returned as a highlighting result
   * @return noMatchSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_MATCH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NoMatchSizeEnum getNoMatchSize() {
    return noMatchSize;
  }


  @JsonProperty(JSON_PROPERTY_NO_MATCH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoMatchSize(NoMatchSizeEnum noMatchSize) {
    this.noMatchSize = noMatchSize;
  }


  public Highlight order(OrderEnum order) {
    this.order = order;
    return this;
  }

  /**
   * Sets the sorting order of highlighted snippets
   * @return order
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderEnum getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(OrderEnum order) {
    this.order = order;
  }


  public Highlight preTags(String preTags) {
    this.preTags = preTags;
    return this;
  }

  /**
   * Text inserted before each highlighted snippet
   * @return preTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreTags() {
    return preTags;
  }


  @JsonProperty(JSON_PROPERTY_PRE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreTags(String preTags) {
    this.preTags = preTags;
  }


  public Highlight postTags(String postTags) {
    this.postTags = postTags;
    return this;
  }

  /**
   * Text inserted after each highlighted snippet
   * @return postTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostTags() {
    return postTags;
  }


  @JsonProperty(JSON_PROPERTY_POST_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostTags(String postTags) {
    this.postTags = postTags;
  }


  public Highlight startSnippetId(Integer startSnippetId) {
    this.startSnippetId = startSnippetId;
    return this;
  }

  /**
   * Sets the starting value of the %SNIPPET_ID% macro
   * @return startSnippetId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_SNIPPET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartSnippetId() {
    return startSnippetId;
  }


  @JsonProperty(JSON_PROPERTY_START_SNIPPET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartSnippetId(Integer startSnippetId) {
    this.startSnippetId = startSnippetId;
  }


  public Highlight useBoundaries(Boolean useBoundaries) {
    this.useBoundaries = useBoundaries;
    return this;
  }

  /**
   * Defines whether to additionally break snippets by phrase boundary characters
   * @return useBoundaries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_BOUNDARIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseBoundaries() {
    return useBoundaries;
  }


  @JsonProperty(JSON_PROPERTY_USE_BOUNDARIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseBoundaries(Boolean useBoundaries) {
    this.useBoundaries = useBoundaries;
  }


  /**
   * Return true if this highlight object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Highlight highlight = (Highlight) o;
    return equalsNullable(this.fragmentSize, highlight.fragmentSize) &&
        equalsNullable(this.limit, highlight.limit) &&
        equalsNullable(this.limitSnippets, highlight.limitSnippets) &&
        equalsNullable(this.limitWords, highlight.limitWords) &&
        equalsNullable(this.numberOfFragments, highlight.numberOfFragments) &&
        Objects.equals(this.afterMatch, highlight.afterMatch) &&
        Objects.equals(this.allowEmpty, highlight.allowEmpty) &&
        Objects.equals(this.around, highlight.around) &&
        Objects.equals(this.beforeMatch, highlight.beforeMatch) &&
        Objects.equals(this.emitZones, highlight.emitZones) &&
        Objects.equals(this.encoder, highlight.encoder) &&
        equalsNullable(this.fields, highlight.fields) &&
        Objects.equals(this.forceAllWords, highlight.forceAllWords) &&
        Objects.equals(this.forceSnippets, highlight.forceSnippets) &&
        equalsNullable(this.highlightQuery, highlight.highlightQuery) &&
        Objects.equals(this.htmlStripMode, highlight.htmlStripMode) &&
        Objects.equals(this.limitsPerField, highlight.limitsPerField) &&
        Objects.equals(this.noMatchSize, highlight.noMatchSize) &&
        Objects.equals(this.order, highlight.order) &&
        Objects.equals(this.preTags, highlight.preTags) &&
        Objects.equals(this.postTags, highlight.postTags) &&
        Objects.equals(this.startSnippetId, highlight.startSnippetId) &&
        Objects.equals(this.useBoundaries, highlight.useBoundaries);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fragmentSize), hashCodeNullable(limit), hashCodeNullable(limitSnippets), hashCodeNullable(limitWords), hashCodeNullable(numberOfFragments), afterMatch, allowEmpty, around, beforeMatch, emitZones, encoder, hashCodeNullable(fields), forceAllWords, forceSnippets, hashCodeNullable(highlightQuery), htmlStripMode, limitsPerField, noMatchSize, order, preTags, postTags, startSnippetId, useBoundaries);
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
    sb.append("class Highlight {\n");
    sb.append("    fragmentSize: ").append(toIndentedString(fragmentSize)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    limitSnippets: ").append(toIndentedString(limitSnippets)).append("\n");
    sb.append("    limitWords: ").append(toIndentedString(limitWords)).append("\n");
    sb.append("    numberOfFragments: ").append(toIndentedString(numberOfFragments)).append("\n");
    sb.append("    afterMatch: ").append(toIndentedString(afterMatch)).append("\n");
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    around: ").append(toIndentedString(around)).append("\n");
    sb.append("    beforeMatch: ").append(toIndentedString(beforeMatch)).append("\n");
    sb.append("    emitZones: ").append(toIndentedString(emitZones)).append("\n");
    sb.append("    encoder: ").append(toIndentedString(encoder)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    forceAllWords: ").append(toIndentedString(forceAllWords)).append("\n");
    sb.append("    forceSnippets: ").append(toIndentedString(forceSnippets)).append("\n");
    sb.append("    highlightQuery: ").append(toIndentedString(highlightQuery)).append("\n");
    sb.append("    htmlStripMode: ").append(toIndentedString(htmlStripMode)).append("\n");
    sb.append("    limitsPerField: ").append(toIndentedString(limitsPerField)).append("\n");
    sb.append("    noMatchSize: ").append(toIndentedString(noMatchSize)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    preTags: ").append(toIndentedString(preTags)).append("\n");
    sb.append("    postTags: ").append(toIndentedString(postTags)).append("\n");
    sb.append("    startSnippetId: ").append(toIndentedString(startSnippetId)).append("\n");
    sb.append("    useBoundaries: ").append(toIndentedString(useBoundaries)).append("\n");
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

