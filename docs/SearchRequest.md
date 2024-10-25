

# SearchRequest

Request object for search operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **String** | The index to perform the search on |  |
|**query** | [**SearchQuery**](SearchQuery.md) |  |  [optional] |
|**join** | [**List&lt;Join&gt;**](Join.md) | Join clause to combine search data from multiple tables |  [optional] |
|**highlight** | [**Highlight**](Highlight.md) |  |  [optional] |
|**limit** | **Integer** | Maximum number of results to return |  [optional] |
|**knn** | [**KnnQuery**](KnnQuery.md) |  |  [optional] |
|**aggs** |  | Defines aggregation settings for grouping results |  [optional] |
|**expressions** |  | Expressions to calculate additional values for the result |  [optional] |
|**maxMatches** | **Integer** | Maximum number of matches allowed in the result |  [optional] |
|**offset** | **Integer** | Starting point for pagination of the result |  [optional] |
|**options** | **Object** | Additional search options |  [optional] |
|**profile** | **Boolean** | Enable or disable profiling of the search request |  [optional] |
|**sort** | **Object** |  |  [optional] |
|**source** | **Object** |  |  [optional] |
|**trackScores** | **Boolean** | Enable or disable result weight calculation used for sorting |  [optional] |



