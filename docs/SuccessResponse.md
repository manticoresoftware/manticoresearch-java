

# SuccessResponse

Response object indicating the success of an operation, such as inserting or updating a document

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **String** | Name of the document index |  [optional] |
|**table** | **String** | Name of the document table (alias of index) |  [optional] |
|**id** | **Long** | ID of the document affected by the request operation |  [optional] |
|**created** | **Boolean** | Indicates whether the document was created as a result of the operation |  [optional] |
|**result** | **String** | Result of the operation, typically &#39;created&#39;, &#39;updated&#39;, or &#39;deleted&#39; |  [optional] |
|**found** | **Boolean** | Indicates whether the document was found in the index |  [optional] |
|**status** | **Integer** | HTTP status code representing the result of the operation |  [optional] |



