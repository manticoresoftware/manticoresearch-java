

# SearchResponse

Response object containing the results of a search request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**took** | **Integer** | Time taken to execute the search |  [optional] |
|**timedOut** | **Boolean** | Indicates whether the search operation timed out |  [optional] |
|**aggregations** | **Object** | Aggregated search results grouped by the specified criteria |  [optional] |
|**hits** | [**SearchResponseHits**](SearchResponseHits.md) |  |  [optional] |
|**profile** | **Object** | Profile information about the search execution, if profiling is enabled |  [optional] |
|**warning** | **Object** | Warnings encountered during the search operation |  [optional] |



