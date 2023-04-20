

# Highlight

Query HIGHLIGHT expression

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldnames** | **List&lt;String&gt;** |  |  [optional] |
|**fields** | [**List&lt;HighlightField&gt;**](HighlightField.md) |  |  [optional] |
|**encoder** | [**EncoderEnum**](#EncoderEnum) |  |  [optional] |
|**highlightQuery** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**preTags** | **String** |  |  [optional] |
|**postTags** | **String** |  |  [optional] |
|**noMatchSize** | [**NoMatchSizeEnum**](#NoMatchSizeEnum) |  |  [optional] |
|**fragmentSize** | **Integer** |  |  [optional] |
|**numberOfFragments** | **Integer** |  |  [optional] |
|**limit** | **Integer** |  |  [optional] |
|**limitWords** | **Integer** |  |  [optional] |
|**limitSnippets** | **Integer** |  |  [optional] |
|**limitsPerField** | **Boolean** |  |  [optional] |
|**useBoundaries** | **Boolean** |  |  [optional] |
|**forceAllWords** | **Boolean** |  |  [optional] |
|**allowEmpty** | **Boolean** |  |  [optional] |
|**emitZones** | **Boolean** |  |  [optional] |
|**forceSnippets** | **Boolean** |  |  [optional] |
|**around** | **Integer** |  |  [optional] |
|**startSnippetId** | **Integer** |  |  [optional] |
|**htmlStripMode** | [**HtmlStripModeEnum**](#HtmlStripModeEnum) |  |  [optional] |
|**snippetBoundary** | [**SnippetBoundaryEnum**](#SnippetBoundaryEnum) |  |  [optional] |



## Enum: EncoderEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| HTML | &quot;html&quot; |



## Enum: NoMatchSizeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: HtmlStripModeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| STRIP | &quot;strip&quot; |
| INDEX | &quot;index&quot; |
| RETAIN | &quot;retain&quot; |



## Enum: SnippetBoundaryEnum

| Name | Value |
|---- | -----|
| SENTENCE | &quot;sentence&quot; |
| PARAGRAPH | &quot;paragraph&quot; |
| ZONE | &quot;zone&quot; |



