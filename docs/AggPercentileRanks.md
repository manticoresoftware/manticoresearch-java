

# AggPercentileRanks

Object to use percentile ranks in aggregation. For more information see [Grouping](https://manual.manticoresearch.com/Searching/Grouping#PERCENTILE_RANKS(),-MEDIAN_ABSOLUTE_DEVIATION()) 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | Numeric field to calculate percentile ranks for |  |
|**values** | **List&lt;BigDecimal&gt;** | Input values to rank |  |
|**keyed** | **Boolean** | Return an object keyed by input value when true, or an array when false. Default is false.  |  [optional] |
|**tdigest** | [**AggTDigest**](AggTDigest.md) |  |  [optional] |


