# com.finbourne.identity.model.SupportAccessExpiry
Time at which the support access expires

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiry** | [**OffsetDateTime**](OffsetDateTime.md) | DateTimeOffset at which the access will be revoked | [default to OffsetDateTime]

```java
import com.finbourne.identity.model.SupportAccessExpiry;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Expiry = OffsetDateTime.now();


SupportAccessExpiry supportAccessExpiryInstance = new SupportAccessExpiry()
    .Expiry(Expiry);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
