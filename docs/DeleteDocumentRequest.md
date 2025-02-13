

# DeleteDocumentRequest

Payload for delete request. Documents can be deleted either one by one by specifying the document id or by providing a query object. For more information see  [Delete API](https://manual.manticoresearch.com/Deleting_documents) 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**table** | **String** | Table name |  |
|**cluster** | **String** | Cluster name |  [optional] |
|**id** | **Long** | The ID of document for deletion |  [optional] |
|**query** | **Object** | Defines the criteria to match documents for deletion |  [optional] |



