# com.finbourne.identity.model.LogAuthenticationContext
Represents a LogAuthenticationContext resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationProvider** | **String** |  | [optional] [default to String]
**credentialProvider** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**credentialType** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**issuer** | [**LogIssuer**](LogIssuer.md) |  | [optional] [default to LogIssuer]
**_interface** | **String** |  | [optional] [default to String]
**authenticationStep** | **Integer** |  | [optional] [default to Integer]
**externalSessionId** | **String** |  | [optional] [default to String]

```java
import com.finbourne.identity.model.LogAuthenticationContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String AuthenticationProvider = "example AuthenticationProvider";
@jakarta.annotation.Nullable List<String> CredentialProvider = new List<String>();
@jakarta.annotation.Nullable List<String> CredentialType = new List<String>();
LogIssuer Issuer = new LogIssuer();
@jakarta.annotation.Nullable String Interface = "example Interface";
@jakarta.annotation.Nullable Integer AuthenticationStep = new Integer("100.00");
@jakarta.annotation.Nullable String ExternalSessionId = "example ExternalSessionId";


LogAuthenticationContext logAuthenticationContextInstance = new LogAuthenticationContext()
    .AuthenticationProvider(AuthenticationProvider)
    .CredentialProvider(CredentialProvider)
    .CredentialType(CredentialType)
    .Issuer(Issuer)
    .Interface(Interface)
    .AuthenticationStep(AuthenticationStep)
    .ExternalSessionId(ExternalSessionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
