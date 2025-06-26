

# Highlight


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fragmentSize** | **Integer** | Maximum size of the text fragments in highlighted snippets per field |  [optional] |
|**limit** | **Integer** | Maximum size of snippets per field |  [optional] |
|**limitSnippets** | **Integer** | Maximum number of snippets per field |  [optional] |
|**limitWords** | **Integer** | Maximum number of words per field |  [optional] |
|**numberOfFragments** | **Integer** | Total number of highlighted fragments per field |  [optional] |
|**afterMatch** | **String** | Text inserted after the matched term, typically used for HTML formatting |  [optional] |
|**allowEmpty** | **Boolean** | Permits an empty string to be returned as the highlighting result. Otherwise, the beginning of the original text would be returned |  [optional] |
|**around** | **Integer** | Number of words around the match to include in the highlight |  [optional] |
|**beforeMatch** | **String** | Text inserted before the match, typically used for HTML formatting |  [optional] |
|**emitZones** | **Boolean** | Emits an HTML tag with the enclosing zone name before each highlighted snippet |  [optional] |
|**encoder** | [**EncoderEnum**](#EncoderEnum) | If set to &#39;html&#39;, retains HTML markup when highlighting |  [optional] |
|**fields** | [**HighlightAllOfFields**](HighlightAllOfFields.md) |  |  [optional] |
|**forceAllWords** | **Boolean** | Ignores the length limit until the result includes all keywords |  [optional] |
|**forceSnippets** | **Boolean** | Forces snippet generation even if limits allow highlighting the entire text |  [optional] |
|**highlightQuery** | [**QueryFilter**](QueryFilter.md) |  |  [optional] |
|**htmlStripMode** | [**HtmlStripModeEnum**](#HtmlStripModeEnum) | Defines the mode for handling HTML markup in the highlight |  [optional] |
|**limitsPerField** | **Boolean** | Determines whether the &#39;limit&#39;, &#39;limit_words&#39;, and &#39;limit_snippets&#39; options operate as individual limits in each field of the document |  [optional] |
|**noMatchSize** | [**NoMatchSizeEnum**](#NoMatchSizeEnum) | If set to 1, allows an empty string to be returned as a highlighting result |  [optional] |
|**order** | [**OrderEnum**](#OrderEnum) | Sets the sorting order of highlighted snippets |  [optional] |
|**preTags** | **String** | Text inserted before each highlighted snippet |  [optional] |
|**postTags** | **String** | Text inserted after each highlighted snippet |  [optional] |
|**startSnippetId** | **Integer** | Sets the starting value of the %SNIPPET_ID% macro |  [optional] |
|**useBoundaries** | **Boolean** | Defines whether to additionally break snippets by phrase boundary characters |  [optional] |



## Enum: EncoderEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| HTML | &quot;html&quot; |



## Enum: HtmlStripModeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| STRIP | &quot;strip&quot; |
| INDEX | &quot;index&quot; |
| RETAIN | &quot;retain&quot; |



## Enum: NoMatchSizeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: OrderEnum

| Name | Value |
|---- | -----|
| ASC | &quot;asc&quot; |
| DESC | &quot;desc&quot; |
| SCORE | &quot;score&quot; |



