# com.finbourne.identity.model.LogActor
Represents a LogActor resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] [default to String]
**type** | **String** |  | [optional] [default to String]
**alternateId** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**detailEntry** | **Map&lt;String, Object&gt;** |  | [optional] [default to Map<String, Object>]

```java
import com.finbourne.identity.model.LogActor;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String AlternateId = "example AlternateId";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable Map<String, Object> DetailEntry = new Map<String, Object>();


LogActor logActorInstance = new LogActor()
    .Id(Id)
    .Type(Type)
    .AlternateId(AlternateId)
    .DisplayName(DisplayName)
    .DetailEntry(DetailEntry);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
