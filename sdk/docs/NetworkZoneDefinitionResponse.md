

# NetworkZoneDefinitionResponse

The Client facing representation of a NetworkZone

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The Network Zone Code |  [optional] |
|**hierarchy** | **Integer** | Hierarchy of the Network Zone |  [optional] |
|**description** | **String** | The Description of the Network Zone |  [optional] |
|**createdAt** | **OffsetDateTime** | Network Zone Creation timestamp |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp of the last update |  [optional] |
|**networkZoneIPs** | [**List&lt;IpAddressDefinition&gt;**](IpAddressDefinition.md) | Network zone IP information (IPs and CIDR ranges) |  [optional] |
|**action** | **String** | Kind of action to apply when a request matches this Network Zone (Block/Allow/NoOp) |  [optional] |
|**applyRules** | [**NetworkZonesApplyRules**](NetworkZonesApplyRules.md) |  |  [optional] |
|**createdBy** | **String** | User Id that created the Network Zone |  [optional] |
|**updatedBy** | **String** | User Id of the last update on the Network Zone |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


