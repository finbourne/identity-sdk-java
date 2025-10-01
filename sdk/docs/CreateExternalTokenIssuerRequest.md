# com.finbourne.identity.model.CreateExternalTokenIssuerRequest
Client input for creating an external token issuer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**issuer** | **String** |  | [default to String]
**audience** | **String** |  | [default to String]
**description** | **String** |  | [optional] [default to String]
**claimMappings** | [**ClaimMappings**](ClaimMappings.md) |  | [optional] [default to ClaimMappings]
**logoutUrl** | [**URI**](URI.md) |  | [default to URI]

```java
import com.finbourne.identity.model.CreateExternalTokenIssuerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String Issuer = "example Issuer";
String Audience = "example Audience";
@jakarta.annotation.Nullable String Description = "example Description";
ClaimMappings ClaimMappings = new ClaimMappings();
URI LogoutUrl = URI.create("http://example.com/LogoutUrl");


CreateExternalTokenIssuerRequest createExternalTokenIssuerRequestInstance = new CreateExternalTokenIssuerRequest()
    .Code(Code)
    .Issuer(Issuer)
    .Audience(Audience)
    .Description(Description)
    .ClaimMappings(ClaimMappings)
    .LogoutUrl(LogoutUrl);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
