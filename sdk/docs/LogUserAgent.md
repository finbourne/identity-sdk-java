# com.finbourne.identity.model.LogUserAgent
Represents a LogUserAgent resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rawUserAgent** | **String** |  | [optional] [default to String]
**operatingSystem** | **String** |  | [optional] [default to String]
**browser** | **String** |  | [optional] [default to String]

```java
import com.finbourne.identity.model.LogUserAgent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String RawUserAgent = "example RawUserAgent";
@jakarta.annotation.Nullable String OperatingSystem = "example OperatingSystem";
@jakarta.annotation.Nullable String Browser = "example Browser";


LogUserAgent logUserAgentInstance = new LogUserAgent()
    .RawUserAgent(RawUserAgent)
    .OperatingSystem(OperatingSystem)
    .Browser(Browser);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
