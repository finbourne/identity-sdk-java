# com.finbourne.identity.model.CreateNetworkZoneRequest
The Create Network Zone Request information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**description** | **String** |  | [optional] [default to String]
**networkZoneIPs** | [**List&lt;IpAddressDefinition&gt;**](IpAddressDefinition.md) |  | [default to List<IpAddressDefinition>]
**action** | **String** |  | [optional] [default to String]
**applyRules** | [**NetworkZonesApplyRules**](NetworkZonesApplyRules.md) |  | [default to NetworkZonesApplyRules]

```java
import com.finbourne.identity.model.CreateNetworkZoneRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String Description = "example Description";
List<IpAddressDefinition> NetworkZoneIPs = new List<IpAddressDefinition>();
@jakarta.annotation.Nullable String Action = "example Action";
NetworkZonesApplyRules ApplyRules = new NetworkZonesApplyRules();


CreateNetworkZoneRequest createNetworkZoneRequestInstance = new CreateNetworkZoneRequest()
    .Code(Code)
    .Description(Description)
    .NetworkZoneIPs(NetworkZoneIPs)
    .Action(Action)
    .ApplyRules(ApplyRules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
