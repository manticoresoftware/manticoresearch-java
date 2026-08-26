

# AggRange

Group documents into custom numeric or date ranges. Use with the `range` or `date_range` aggregation type. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | Attribute to group by |  |
|**ranges** | [**List&lt;Range&gt;**](Range.md) | Ordered list of ranges |  |
|**keyed** | **Boolean** | Return buckets as an object keyed by range label when true, or as an array when false. Default is false.  |  [optional] |


