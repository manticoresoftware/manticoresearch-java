

# QueryFilter

Object used to apply various conditions, such as full-text matching or attribute filtering, to a search query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**queryString** | **Object** | Filter object defining a query string |  [optional] |
|**match** | **Object** | Filter object defining a match keyword passed as a string or in a Match object |  [optional] |
|**matchPhrase** | **Object** | Filter object defining a match phrase |  [optional] |
|**matchAll** | **Object** | Filter object to select all documents |  [optional] |
|**bool** | [**BoolFilter**](BoolFilter.md) |  |  [optional] |
|**equals** | **Object** |  |  [optional] |
|**in** | **Object** | Filter to match a given set of attribute values. |  [optional] |
|**range** | **Object** | Filter to match a given range of attribute values passed in Range objects |  [optional] |
|**geoDistance** | [**GeoDistance**](GeoDistance.md) |  |  [optional] |



