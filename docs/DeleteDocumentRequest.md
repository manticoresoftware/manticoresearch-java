

# DeleteDocumentRequest

Payload for delete request. Documents can be deleted either one by one by specifying the document id or by providing a query object. For more information see  [Delete API](https://docs.manticoresearch.com/latest/html/http_reference/json_delete.html) 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **String** | Index name | 
**id** | **Long** | Document ID |  [optional]
**query** | **Object** | Query tree object |  [optional]



