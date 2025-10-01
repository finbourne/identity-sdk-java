# com.finbourne.identity.model.LogClientInfo
Represents a LogClientInfo resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userAgent** | [**LogUserAgent**](LogUserAgent.md) |  | [optional] [default to LogUserAgent]
**zone** | **String** |  | [optional] [default to String]
**device** | **String** |  | [optional] [default to String]
**id** | **String** |  | [optional] [default to String]
**ipAddress** | **String** |  | [optional] [default to String]
**geographicalContext** | [**LogGeographicalContext**](LogGeographicalContext.md) |  | [optional] [default to LogGeographicalContext]

```java
import com.finbourne.identity.model.LogClientInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

LogUserAgent UserAgent = new LogUserAgent();
@jakarta.annotation.Nullable String Zone = "example Zone";
@jakarta.annotation.Nullable String Device = "example Device";
@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String IpAddress = "example IpAddress";
LogGeographicalContext GeographicalContext = new LogGeographicalContext();


LogClientInfo logClientInfoInstance = new LogClientInfo()
    .UserAgent(UserAgent)
    .Zone(Zone)
    .Device(Device)
    .Id(Id)
    .IpAddress(IpAddress)
    .GeographicalContext(GeographicalContext);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
