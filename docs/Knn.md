

# Knn

Object representing a k-nearest neighbor search query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | Field to perform the k-nearest neighbor search on |  |
|**k** | **Integer** | The number of nearest neighbors to return |  |
|**query** | [**KnnQuery**](KnnQuery.md) |  |  [optional] |
|**queryVector** | **List&lt;BigDecimal&gt;** | The vector used as input for the KNN search |  [optional] |
|**docId** | **Long** | The docuemnt ID used as input for the KNN search |  [optional] |
|**ef** | **Integer** | Optional parameter controlling the accuracy of the search |  [optional] |
|**filter** | [**QueryFilter**](QueryFilter.md) |  |  [optional] |


