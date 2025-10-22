

# DeleteResponse

Response object for successful delete request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**table** | **String** | The name of the table from which the document was deleted |  [optional] |
|**deleted** | **Integer** | Number of documents deleted |  [optional] |
|**id** | **Long** | The ID of the deleted document. If multiple documents are deleted, the ID of the first deleted document is returned |  [optional] |
|**found** | **Boolean** | Indicates whether any documents to be deleted were found |  [optional] |
|**result** | **String** | Result of the delete operation, typically &#39;deleted&#39; |  [optional] |


