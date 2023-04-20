

# SearchRequest

Payload for search operation

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
|**sortOld** | **List&lt;Object&gt;** |  |  [optional] |
|**aggs** | [**List&lt;Aggregation&gt;**](Aggregation.md) |  |  [optional] |
|**expressions** | **List&lt;Object&gt;** |  |  [optional] |
|**highlight** | [**Highlight**](Highlight.md) |  |  [optional] |
|**source** | **Object** |  |  [optional] |
|**options** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**profile** | **Boolean** |  |  [optional] |
|**trackScores** | **Boolean** |  |  [optional] |



