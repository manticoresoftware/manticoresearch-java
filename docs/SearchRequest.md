

# SearchRequest

Request object for search operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **String** |  |  |
|**query** | **Object** |  |  [optional] |
|**fulltextFilter** | **Object** |  |  [optional] |
|**attrFilter** | **Object** |  |  [optional] |
|**limit** | **Integer** |  |  [optional] |
|**offset** | **Integer** |  |  [optional] |
|**maxMatches** | **Integer** |  |  [optional] |
|**sort** | **List&lt;Object&gt;** |  |  [optional] |
|**aggs** | [**List&lt;Aggregation&gt;**](Aggregation.md) |  |  [optional] |
|**expressions** | **List&lt;Object&gt;** |  |  [optional] |
|**highlight** | [**Highlight**](Highlight.md) |  |  [optional] |
|**source** | **Object** |  |  [optional] |
|**options** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**profile** | **Boolean** |  |  [optional] |
|**trackScores** | **Boolean** |  |  [optional] |


## Building a search request

[[Docs on search options in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Options#Search-options)
```java

searchRequest.setIndex("movies");

Map<String,Object> query = new HashMap<>();
query.put("query_string", "Star");
searchRequest.setQuery(query);

searchRequest.setLimit(10);
searchRequest.setTrackScores(false);

Map<String,Object> options = new HashMap<String,Object>();
options.put("cutoff", 2);
options.put("ranker", "bm25");
searchRequest.setOptions(options);

searchRequest.setSource("title");

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```


### SourceByRules

[[SourceByRules - input parameters]](SourceByRules.md)

[[Docs on the `source` property in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Search_results#Source-selection)
```java
//Setting the `Source` property with an auxiliary object:
List<String> includes = Arrays.asList("title", "year");
List<String> excludes = Arrays.asList("code");
SourceByRules source = new SourceByRules();
source.setIncludes(includes);
source.setExcludes(excludes);
searchRequest.setSource(source);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```


### Sort
```java
//Setting the `Sort` property:
List<Object> sort = new ArrayList<Object>( Arrays.asList("year") );
searchRequest.setSort(sort);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

### SortOrder

[[SortOrder - input parameters]](SortOrder.md)

### SortMVA

[[SortMVA - input parameters](SortMVA.md)

[[Docs on sorting in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Sorting_and_ranking#HTTP)
```java
//Setting the `Sort` property with an auxiliary object:
List<Object> sort = new ArrayList<Object>();
SortOrder sort1 = new SortOrder();
sort1.setAttr("rating");
sort1.setOrder(SortOrder.OrderEnum.ASC);
sort.add(sort1);

SortMVA sort2 = new SortMVA();
sort2.setAttr("code");
sort2.setOrder(SortMVA.OrderEnum.DESC);
sort2.setMode(SortMVA.ModeEnum.MAX);
sort.add(sort2);

searchRequest.setSort(sort);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

### Expressions

[[Docs on expressions in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Expressions#Expressions-in-HTTP-JSON)
```java    
//Setting the `expressions` property:
Map<String,String> expr = new HashMap<String,String>();
expr.put("expr1", "min(year,2900)");
List<Object> expressions = new ArrayList<Object>();
expressions.add(expr);
expressions.add( 
	new HashMap<String,String>()
);
searchRequest.setExpressions(expressions);
					        	
SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

### Aggregation

[[Aggregation - input parameters]](Aggregation.md)

[[Docs on aggregations in Manticore Search Manual](https://manual.manticoresearch.com/Searching/Faceted_search#Aggregations)
```java    
//Setting the `aggs` property with an auxiliary object:
Aggregation agg = new Aggregation();
agg.setName("agg1");
agg.setField("year");
agg.setSize(10);
searchRequest.setAggs( new ArrayList<Aggregation>( Arrays.asList(agg) ) );

agg = new Aggregation();
agg.setName("agg2");
agg.setField("rating");
List<Aggregation> aggs = searchRequest.getAggs();
aggs.add(agg);
searchRequest.setAggs(aggs);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

### Highlight

[[Highlight - input parameters]](Highlight.md)

[[Docs on highlighting in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Highlighting#Highlighting)
```java
//Settting the `highlight` property with an auxiliary object:
Highlight highlight = new Highlight();
highlight.setFieldnames( Arrays.asList("title") );
highlight.setPostTags("</post_tag>");
highlight.setEncoder(Highlight.EncoderEnum.DEFAULT);
highlight.setSnippetBoundary(Highlight.SnippetBoundaryEnum.SENTENCE);
searchRequest.setHighlight(highlight);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

#### HighlightField

[[HighlightField - input parameters]](HighlightField.md)

[[Docs on highlight fields in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Highlighting#Highlighting)
```java
// settting `highlight.fields` property with an auxiliary HighlightField object
HighlightField highlightField = new HighlightField();
highlightField.setName("title");
highlightField.setLimit(5);
List<HighlightField> highlightFields = new ArrayList<HighlightField>( Arrays.asList(highlightField) );
highlight.setFields(highlightFields);
searchRequest.setHighlight(highlight);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

### FulltextFilter
#### QueryFilter

[[Docs on fulltext filters in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP-JSON)

[[QueryFilter - input parameters]](QueryFilter.md)
```java    
//Setting the `FulltextFilter` property using different fulltext filter objects:

//Using a QueryFilter object
QueryFilter queryFilter = new QueryFilter();
queryFilter.setQueryString("Star Trek 2");								
searchRequest.setFulltextFilter(queryFilter);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

#### MatchFilter

[[MatchFilter - input parameters]](MatchFilter.md)
```java    
//Using a MatchFilter object
MatchFilter matchFilter = new MatchFilter();
matchFilter.setQueryString("Nemesis");
matchFilter.setQueryFields("title");	
searchRequest.setFulltextFilter(matchFilter);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

#### MatchPhraseFilter

[[MatchPhraseFilter - input parameters]](MatchPhraseFilter.md)
```java    
//Using a MatchPhraseFilter object
MatchPhraseFilter matchPhraseFilter = new MatchPhraseFilter();
matchPhraseFilter.setQueryPhrase("Star Trek 2");
matchPhraseFilter.setQueryFields("title");
searchRequest.setFulltextFilter(matchPhraseFilter);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

#### MatchOpFilter

[[MatchOpFilter - input parameters]](MatchOpFilter.md)
```java
//Using a MatchOpFilter object
MatchOpFilter matchOpFilter = new MatchOpFilter();
matchOpFilter.setQueryString("Enterprise test");
matchOpFilter.setQueryFields("title,plot");
matchOpFilter.setOperator(MatchOpFilter.OperatorEnum.OR);
searchRequest.setFulltextFilter(matchOpFilter);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```    


### AttrFilter
#### EqualsFilter

[[EqualsFilter - input parameters]](EqualsFilter.md)

[[Docs on equality filters in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Filters#Equality-filters)
```java
//Setting the `AttrFilter` property using different attribute filter objects:

//Using an EqualsFilter object
EqualsFilter equalsFilter = new EqualsFilter();
equalsFilter.setField("year");
equalsFilter.setValue(2003);
searchRequest.setAttrFilter(equalsFilter);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

#### InFilter

[[InFilter - input parameters]](InFilter.md)

[[Docs on set filters in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Filters#Set-filters)
```java
//Using InFilter object
InFilter inFilter = new InFilter();
inFilter.setField("year");
inFilter.setValues( Arrays.asList(2001, 2002) );
searchRequest.setAttrFilter(inFilter);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

#### RangeFilter

[[RangeFilter - input parameters]](RangeFilter.md)

[[Docs on range filters in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Filters#Range-filters)
```java
//Using a RangeFilter object
RangeFilter rangeFilter = new RangeFilter();
rangeFilter.setField("year");
rangeFilter.setLte(BigDecimal.valueOf(2001));
rangeFilter.setGte(BigDecimal.valueOf(1000));
searchRequest.setAttrFilter(rangeFilter);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

#### GeoDistanceFilter

[[GeoDistanceFilter - input parameters]](GeoDistanceFilter.md)

[[Docs on geo distance filters in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Filters#Geo-distance-filters)
```java
//Using a GeoDistanceFilter object
searchRequest.setIndex("geo");

GeoDistanceFilter geoFilter = new GeoDistanceFilter();
GeoDistanceFilterLocationAnchor locAnchor = new GeoDistanceFilterLocationAnchor();
locAnchor.setLat(10);
locAnchor.setLon(20);
geoFilter.setLocationAnchor(locAnchor);
geoFilter.setLocationSource("field3,field4");
geoFilter.setDistanceType(GeoDistanceFilter.DistanceTypeEnum.ADAPTIVE);
geoFilter.setDistance("100km");

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```

#### BoolFilter

[[BoolFilter - input parameters]](BoolFilter.md)

[[Docs on bool queries in Manticore Search Manual]](https://manual.manticoresearch.com/Searching/Filters#bool-query)
```java
//Setting the `AttrFilter` property using a bool filter object:
searchRequest.setIndex("movies");

BoolFilter boolFilter = new BoolFilter();
EqualsFilter equalsFilter = new EqualsFilter();
equalsFilter.setField("year");
equalsFilter.setValue(2003);
boolFilter.setMust( new ArrayList<Object>( Arrays.asList(equalsFilter) ) );

rangeFilter = new RangeFilter();
rangeFilter.setField("rating");
rangeFilter.setLte(BigDecimal.valueOf(6.5));
List<Object> mustFilter = boolFilter.getMust();
mustFilter.add(rangeFilter);
boolFilter.setMust(mustFilter);

searchRequest.setAttrFilter(boolFilter);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );

equalsFilter = new EqualsFilter();
equalsFilter.setField("year");
equalsFilter.setValue(2001);
boolFilter.setMustNot( Arrays.asList(equalsFilter) );
searchRequest.setAttrFilter(boolFilter);

searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );

//Using nested bool filters
boolFilter = new BoolFilter();
	
MatchFilter fulltextFilter = new MatchFilter();
fulltextFilter.setQueryString("Star");
fulltextFilter.setQueryFields("title");
BoolFilter nestedBoolFilter = new BoolFilter();
equalsFilter = new EqualsFilter();
equalsFilter.setField("rating");
equalsFilter.setValue(6.5);
nestedBoolFilter.setShould( Arrays.asList(equalsFilter, fulltextFilter) );
boolFilter.setMust( Arrays.asList(nestedBoolFilter) );
searchRequest.setAttrFilter(boolFilter);

SearchResponse searchResponse = searchApi.search(searchRequest);
System.out.println( searchResponse.toString() );
```





