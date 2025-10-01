# com.finbourne.identity.model.LogTransaction
Represents a LogTransaction resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [optional] [default to String]
**id** | **String** |  | [optional] [default to String]
**detail** | **Map&lt;String, Object&gt;** |  | [optional] [default to Map<String, Object>]

```java
import com.finbourne.identity.model.LogTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable Map<String, Object> Detail = new Map<String, Object>();


LogTransaction logTransactionInstance = new LogTransaction()
    .Type(Type)
    .Id(Id)
    .Detail(Detail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
