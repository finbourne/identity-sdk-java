# com.finbourne.identity.model.LogSecurityContext
Represents a LogSecurityContext resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asNumber** | **Integer** |  | [optional] [default to Integer]
**asOrg** | **String** |  | [optional] [default to String]
**isp** | **String** |  | [optional] [default to String]
**domain** | **String** |  | [optional] [default to String]
**isProxy** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.identity.model.LogSecurityContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Integer AsNumber = new Integer("100.00");
@jakarta.annotation.Nullable String AsOrg = "example AsOrg";
@jakarta.annotation.Nullable String Isp = "example Isp";
@jakarta.annotation.Nullable String Domain = "example Domain";
@jakarta.annotation.Nullable Boolean IsProxy = true;


LogSecurityContext logSecurityContextInstance = new LogSecurityContext()
    .AsNumber(AsNumber)
    .AsOrg(AsOrg)
    .Isp(Isp)
    .Domain(Domain)
    .IsProxy(IsProxy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
