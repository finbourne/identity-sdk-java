# com.finbourne.identity.model.CreateApplicationRequest
A request to create an application for authenticating the source of token requests

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The Display Name of the application | [default to String]
**clientId** | **String** | The OpenID Connect ClientId of the application | [default to String]
**type** | **String** | The Type of the application. This must be either Native or Web | [default to String]
**redirectUris** | **List&lt;String&gt;** | A web application&#39;s acceptable list of post-login redirect URIs | [optional] [default to List<String>]
**postLogoutRedirectUris** | **List&lt;String&gt;** | A web application&#39;s acceptable list of post-logout redirect URIs | [optional] [default to List<String>]

```java
import com.finbourne.identity.model.CreateApplicationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
String ClientId = "example ClientId";
String Type = "example Type";
@jakarta.annotation.Nullable List<String> RedirectUris = new List<String>();
@jakarta.annotation.Nullable List<String> PostLogoutRedirectUris = new List<String>();


CreateApplicationRequest createApplicationRequestInstance = new CreateApplicationRequest()
    .DisplayName(DisplayName)
    .ClientId(ClientId)
    .Type(Type)
    .RedirectUris(RedirectUris)
    .PostLogoutRedirectUris(PostLogoutRedirectUris);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
