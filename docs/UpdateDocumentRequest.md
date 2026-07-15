

# UpdateDocumentRequest

Payload for updating a document or multiple documents in a table

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**table** | **String** | Name of the document table |  |
|**cluster** | **String** | Name of the document cluster |  [optional] |
|**doc** | **Object** | Object containing the document fields to update |  |
|**id** | **Long** | Document ID |  [optional] |
|**query** | [**QueryFilter**](QueryFilter.md) |  |  [optional] |


