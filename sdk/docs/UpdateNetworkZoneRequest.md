# com.finbourne.identity.model.UpdateNetworkZoneRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  | [optional] [default to String]
**networkZoneIPs** | [**List&lt;IpAddressDefinition&gt;**](IpAddressDefinition.md) |  | [default to List<IpAddressDefinition>]
**action** | **String** |  | [optional] [default to String]
**applyRules** | [**NetworkZonesApplyRules**](NetworkZonesApplyRules.md) |  | [default to NetworkZonesApplyRules]
**hierarchy** | **Integer** |  | [default to Integer]

```java
import com.finbourne.identity.model.UpdateNetworkZoneRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Description = "example Description";
List<IpAddressDefinition> NetworkZoneIPs = new List<IpAddressDefinition>();
@jakarta.annotation.Nullable String Action = "example Action";
NetworkZonesApplyRules ApplyRules = new NetworkZonesApplyRules();
Integer Hierarchy = new Integer("100.00");


UpdateNetworkZoneRequest updateNetworkZoneRequestInstance = new UpdateNetworkZoneRequest()
    .Description(Description)
    .NetworkZoneIPs(NetworkZoneIPs)
    .Action(Action)
    .ApplyRules(ApplyRules)
    .Hierarchy(Hierarchy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
