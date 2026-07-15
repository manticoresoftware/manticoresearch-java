

# AggPercentiles

Object to use percentile values in aggregation. For more information see [Grouping](https://manual.manticoresearch.com/Searching/Grouping#PERCENTILES(),-PERCENTILE_RANKS(),-MEDIAN_ABSOLUTE_DEVIATION()) 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | Numeric field to calculate percentiles for |  |
|**values** | **List&lt;BigDecimal&gt;** | Percentile points to compute (0-100). Defaults to 1, 5, 25, 50, 75, 95, and 99 when omitted.  |  [optional] |
|**keyed** | **Boolean** | Return an object keyed by percentile when true, or an array when false. Default is false.  |  [optional] |
|**tdigest** | [**AggTDigest**](AggTDigest.md) |  |  [optional] |


