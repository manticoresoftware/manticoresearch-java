

# SearchResponse

Response object containing search results. For conversational search requests that include a `chat` object, the optional chat fields below are also populated. For conversational search response fields see [Conversational search](https://manual.manticoresearch.com/Searching/Conversational_search#Response) 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**took** | **Integer** | Time taken to execute the search |  [optional] |
|**timedOut** | **Boolean** | Indicates whether the search operation timed out |  [optional] |
|**aggregations** | [**Map&lt;String, AggBucketsResult&gt;**](AggBucketsResult.md) | Aggregated search results grouped by the specified criteria. Each named aggregation typically contains a &#x60;buckets&#x60; array (or keyed map) of bucket objects with &#x60;key&#x60;, &#x60;doc_count&#x60;, and optional &#x60;status&#x60;.  |  [optional] |
|**hits** | [**SearchResponseHits**](SearchResponseHits.md) |  |  [optional] |
|**profile** | **Object** | Profile information about the search execution, if profiling is enabled |  [optional] |
|**scroll** | **String** | Scroll token to be used fo pagination |  [optional] |
|**warning** | **Object** | Warnings encountered during the search operation |  [optional] |
|**conversationUuid** | **String** | Existing or generated conversation id (conversational search) |  [optional] |
|**userQuery** | **String** | Original user query (conversational search) |  [optional] |
|**searchQuery** | **String** | Standalone search query used for KNN retrieval (conversational search) |  [optional] |
|**response** | **String** | LLM answer as generated (conversational search) |  [optional] |
|**sources** | **String** | JSON string containing retrieved source rows used as LLM context (conversational search).  |  [optional] |


