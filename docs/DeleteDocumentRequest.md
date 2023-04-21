

# DeleteDocumentRequest

Payload for delete request. Documents can be deleted either one by one by specifying the document id or by providing a query object. For more information see  [Delete API](https://manual.manticoresearch.com/Deleting_documents) 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **String** | Index name |  |
|**cluster** | **String** | cluster name |  [optional] |
|**id** | **Long** | Document ID |  [optional] |
|**query** | **Object** | Query tree object |  [optional] |





