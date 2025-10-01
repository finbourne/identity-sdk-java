# com.finbourne.identity.model.OAuthApplication

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [default to String]
**type** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**secret** | **String** |  | [optional] [default to String]
**clientId** | **String** |  | [default to String]
**issuer** | **String** |  | [default to String]

```java
import com.finbourne.identity.model.OAuthApplication;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String Type = "example Type";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Secret = "example Secret";
String ClientId = "example ClientId";
String Issuer = "example Issuer";


OAuthApplication oAuthApplicationInstance = new OAuthApplication()
    .Id(Id)
    .Type(Type)
    .DisplayName(DisplayName)
    .Secret(Secret)
    .ClientId(ClientId)
    .Issuer(Issuer);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
