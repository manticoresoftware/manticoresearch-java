

# GeoDistanceFilter

Geo distance attribute filter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locationAnchor** | [**GeoDistanceFilterLocationAnchor**](GeoDistanceFilterLocationAnchor.md) |  |  [optional] |
|**locationSource** | **String** | Attribute containing latitude and longitude data |  [optional] |
|**distanceType** | [**DistanceTypeEnum**](#DistanceTypeEnum) |  |  [optional] |
|**distance** | **String** |  |  [optional] |

[[Using in search requests]](SearchRequest.md#GeoDistanceFilter)



## Enum: DistanceTypeEnum

| Name | Value |
|---- | -----|
| ADAPTIVE | &quot;adaptive&quot; |
| HAVERSINE | &quot;haversine&quot; |



