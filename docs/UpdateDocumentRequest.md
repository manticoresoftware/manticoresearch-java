

# UpdateDocumentRequest

Payload for updating a document or multiple documents in an index

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **String** | Name of the document index |  |
|**cluster** | **String** | Name of the document cluster |  [optional] |
|**doc** | **Object** | Object containing the document fields to update |  |
|**id** | **Long** | Document ID |  [optional] |
|**query** | [**QueryFilter**](QueryFilter.md) |  |  [optional] |



