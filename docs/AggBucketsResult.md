

# AggBucketsResult

One aggregation result. It is either BUCKET-shaped or METRIC-shaped, never both: which one depends on the aggregation that was requested. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buckets** | **Object** |  |  [optional] |
|**afterKey** | **Object** | Pagination cursor returned by composite aggregations |  [optional] |
|**value** | **Object** |  |  [optional] |
|**valueAsString** | **String** | String rendering of &#x60;value&#x60;, returned alongside it by &#x60;median_absolute_deviation&#x60;.  |  [optional] |
|**values** | **Object** |  |  [optional] |


