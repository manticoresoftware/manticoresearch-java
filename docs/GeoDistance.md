

# GeoDistance

Object to perform geo-distance based filtering on queries

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locationAnchor** | [**GeoDistanceLocationAnchor**](GeoDistanceLocationAnchor.md) |  |  [optional] |
|**locationSource** | **String** | Field name in the document that contains location data |  [optional] |
|**distanceType** | [**DistanceTypeEnum**](#DistanceTypeEnum) | Algorithm used to calculate the distance |  [optional] |
|**distance** | **String** | The distance from the anchor point to filter results by |  [optional] |



## Enum: DistanceTypeEnum

| Name | Value |
|---- | -----|
| ADAPTIVE | &quot;adaptive&quot; |
| HAVERSINE | &quot;haversine&quot; |


