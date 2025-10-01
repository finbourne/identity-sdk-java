# com.finbourne.identity.model.NetworkZoneDefinitionResponse
The Client facing representation of a NetworkZone

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The Network Zone Code | [optional] [default to String]
**hierarchy** | **Integer** | Hierarchy of the Network Zone | [optional] [default to Integer]
**description** | **String** | The Description of the Network Zone | [optional] [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Network Zone Creation timestamp | [optional] [default to OffsetDateTime]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the last update | [optional] [default to OffsetDateTime]
**networkZoneIPs** | [**List&lt;IpAddressDefinition&gt;**](IpAddressDefinition.md) | Network zone IP information (IPs and CIDR ranges) | [optional] [default to List<IpAddressDefinition>]
**action** | **String** | Kind of action to apply when a request matches this Network Zone (Block/Allow/NoOp) | [optional] [default to String]
**applyRules** | [**NetworkZonesApplyRules**](NetworkZonesApplyRules.md) |  | [optional] [default to NetworkZonesApplyRules]
**createdBy** | **String** | User Id that created the Network Zone | [optional] [default to String]
**updatedBy** | **String** | User Id of the last update on the Network Zone | [optional] [default to String]

```java
import com.finbourne.identity.model.NetworkZoneDefinitionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Code = "example Code";
Integer Hierarchy = new Integer("100.00");
@jakarta.annotation.Nullable String Description = "example Description";
OffsetDateTime CreatedAt = OffsetDateTime.now();
OffsetDateTime UpdatedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable List<IpAddressDefinition> NetworkZoneIPs = new List<IpAddressDefinition>();
@jakarta.annotation.Nullable String Action = "example Action";
NetworkZonesApplyRules ApplyRules = new NetworkZonesApplyRules();
@jakarta.annotation.Nullable String CreatedBy = "example CreatedBy";
@jakarta.annotation.Nullable String UpdatedBy = "example UpdatedBy";


NetworkZoneDefinitionResponse networkZoneDefinitionResponseInstance = new NetworkZoneDefinitionResponse()
    .Code(Code)
    .Hierarchy(Hierarchy)
    .Description(Description)
    .CreatedAt(CreatedAt)
    .UpdatedAt(UpdatedAt)
    .NetworkZoneIPs(NetworkZoneIPs)
    .Action(Action)
    .ApplyRules(ApplyRules)
    .CreatedBy(CreatedBy)
    .UpdatedBy(UpdatedBy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
