# com.finbourne.identity.model.AuthenticationInformation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuerUrl** | **String** |  | [default to String]
**fallbackIssuerUrls** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**samlIdentityProviderId** | **String** |  | [optional] [default to String]
**support** | [**SupportAccessExpiry**](SupportAccessExpiry.md) |  | [optional] [default to SupportAccessExpiry]
**supportAccessExpiryWithRole** | [**List&lt;SupportAccessExpiryWithRole&gt;**](SupportAccessExpiryWithRole.md) |  | [optional] [default to List<SupportAccessExpiryWithRole>]
**status** | **Boolean** |  | [optional] [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.identity.model.AuthenticationInformation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String IssuerUrl = "example IssuerUrl";
@jakarta.annotation.Nullable List<String> FallbackIssuerUrls = new List<String>();
@jakarta.annotation.Nullable String SamlIdentityProviderId = "example SamlIdentityProviderId";
SupportAccessExpiry Support = new SupportAccessExpiry();
@jakarta.annotation.Nullable List<SupportAccessExpiryWithRole> SupportAccessExpiryWithRole = new List<SupportAccessExpiryWithRole>();
Boolean Status = true;
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AuthenticationInformation authenticationInformationInstance = new AuthenticationInformation()
    .IssuerUrl(IssuerUrl)
    .FallbackIssuerUrls(FallbackIssuerUrls)
    .SamlIdentityProviderId(SamlIdentityProviderId)
    .Support(Support)
    .SupportAccessExpiryWithRole(SupportAccessExpiryWithRole)
    .Status(Status)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
