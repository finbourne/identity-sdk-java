# com.finbourne.identity.model.LogRequest
Represents a LogRequest resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipChain** | [**List&lt;LogIpChainEntry&gt;**](LogIpChainEntry.md) |  | [optional] [default to List<LogIpChainEntry>]

```java
import com.finbourne.identity.model.LogRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<LogIpChainEntry> IpChain = new List<LogIpChainEntry>();


LogRequest logRequestInstance = new LogRequest()
    .IpChain(IpChain);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
