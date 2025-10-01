# com.finbourne.identity.model.LogGeolocation
Represents a LogGeolocation resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**longitude** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.identity.model.LogGeolocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal Latitude = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Longitude = new java.math.BigDecimal("100.00");


LogGeolocation logGeolocationInstance = new LogGeolocation()
    .Latitude(Latitude)
    .Longitude(Longitude);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
