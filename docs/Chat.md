

# Chat

Conversational search request handled by Manticore Buddy via `CALL CHAT`. When this object is set, the `/search` endpoint answers through an LLM using KNN-retrieved rows as context instead of returning regular search hits. Required fields are `query`, `table`, and `model_name`. Chat model management (`CREATE CHAT MODEL`, etc.) remains SQL-only. For more information see [Conversational search](https://manual.manticoresearch.com/Searching/Conversational_search#HTTP-JSON-syntax) 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**query** | **String** | User question to send to the chat model |  |
|**table** | **String** | Vectorized table to retrieve context from |  |
|**modelName** | **String** | Name of the chat model |  |
|**conversationUuid** | **String** | Existing conversation id to continue the dialog, or an empty string to start a new conversation. If omitted, a new id is generated.  |  [optional] |
|**vectorField** | **String** | A specific vector field to search by. If omitted, Buddy uses the first &#x60;FLOAT_VECTOR&#x60; field from &#x60;SHOW CREATE TABLE&#x60;.  |  [optional] |
|**fields** | **String** | Legacy alias for &#x60;vector_field&#x60;. A request must not include both &#x60;vector_field&#x60; and &#x60;fields&#x60;.  |  [optional] |


