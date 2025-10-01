# com.finbourne.identity.model.LogIpChainEntry
Represents a LogIpChainEntry resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ip** | **String** |  | [optional] [default to String]
**geographicalContext** | [**LogGeographicalContext**](LogGeographicalContext.md) |  | [optional] [default to LogGeographicalContext]
**version** | **String** |  | [optional] [default to String]
**source** | **String** |  | [optional] [default to String]

```java
import com.finbourne.identity.model.LogIpChainEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Ip = "example Ip";
LogGeographicalContext GeographicalContext = new LogGeographicalContext();
@jakarta.annotation.Nullable String Version = "example Version";
@jakarta.annotation.Nullable String Source = "example Source";


LogIpChainEntry logIpChainEntryInstance = new LogIpChainEntry()
    .Ip(Ip)
    .GeographicalContext(GeographicalContext)
    .Version(Version)
    .Source(Source);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
