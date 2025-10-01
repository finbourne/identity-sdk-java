# com.finbourne.identity.model.ExternalTokenIssuerResponse
Response DTO exposed to client for an external token issuer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The External Token Issuer Code | [optional] [default to String]
**issuer** | **String** | Issuer of the External Token Issuer | [optional] [default to String]
**audience** | **String** | Audience of the External Token Issuer | [optional] [default to String]
**description** | **String** | The Description of the External Token Issuer | [optional] [default to String]
**claimMappings** | [**ClaimMappings**](ClaimMappings.md) |  | [optional] [default to ClaimMappings]
**logoutUrl** | **String** | The LogoutUrl of the External Token Issuer | [optional] [default to String]

```java
import com.finbourne.identity.model.ExternalTokenIssuerResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String Issuer = "example Issuer";
@jakarta.annotation.Nullable String Audience = "example Audience";
@jakarta.annotation.Nullable String Description = "example Description";
ClaimMappings ClaimMappings = new ClaimMappings();
@jakarta.annotation.Nullable String LogoutUrl = "example LogoutUrl";


ExternalTokenIssuerResponse externalTokenIssuerResponseInstance = new ExternalTokenIssuerResponse()
    .Code(Code)
    .Issuer(Issuer)
    .Audience(Audience)
    .Description(Description)
    .ClaimMappings(ClaimMappings)
    .LogoutUrl(LogoutUrl);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
