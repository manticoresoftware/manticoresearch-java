

# Knn

Object representing a k-nearest neighbor search query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | Field to perform the k-nearest neighbor search on |  |
|**k** | **Integer** | Deprecated. Use the top-level &#x60;limit&#x60; parameter instead. |  [optional] |
|**query** | [**KnnQuery**](KnnQuery.md) |  |  [optional] |
|**queryVector** | **List&lt;BigDecimal&gt;** | The vector used as input for the KNN search |  [optional] |
|**docId** | **Long** | The document ID used as input for the KNN search |  [optional] |
|**ef** | **Integer** | Optional parameter controlling the accuracy of the search |  [optional] |
|**rescore** | **Boolean** | Optional parameter enabling KNN rescoring (disabled by default) |  [optional] |
|**oversampling** | **BigDecimal** | Optional parameter setting a factor by which k is multiplied when executing the KNN search |  [optional] |
|**filter** | [**QueryFilter**](QueryFilter.md) |  |  [optional] |


