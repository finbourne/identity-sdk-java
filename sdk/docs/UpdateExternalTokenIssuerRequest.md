# com.finbourne.identity.model.UpdateExternalTokenIssuerRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuer** | **String** |  | [optional] [default to String]
**audience** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**claimMappings** | [**ClaimMappings**](ClaimMappings.md) |  | [optional] [default to ClaimMappings]
**logoutUrl** | [**URI**](URI.md) |  | [optional] [default to URI]

```java
import com.finbourne.identity.model.UpdateExternalTokenIssuerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Issuer = "example Issuer";
@jakarta.annotation.Nullable String Audience = "example Audience";
@jakarta.annotation.Nullable String Description = "example Description";
ClaimMappings ClaimMappings = new ClaimMappings();
@jakarta.annotation.Nullable URI LogoutUrl = URI.create("http://example.com/LogoutUrl");


UpdateExternalTokenIssuerRequest updateExternalTokenIssuerRequestInstance = new UpdateExternalTokenIssuerRequest()
    .Issuer(Issuer)
    .Audience(Audience)
    .Description(Description)
    .ClaimMappings(ClaimMappings)
    .LogoutUrl(LogoutUrl);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
