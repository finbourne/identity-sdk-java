# com.finbourne.identity.model.CurrentUserResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The user&#39;s system supplied unique identifier | [default to String]
**emailAddress** | **String** | The user&#39;s email address which may be null depending on the authentication method | [default to String]
**type** | **String** | The type of user (e.g. Personal or Service) | [default to String]
**domainType** | **String** | The type of domain in which the user exists | [optional] [default to String]
**userExpiry** | [**OffsetDateTime**](OffsetDateTime.md) | The user&#39;s user expiry datetime | [optional] [default to OffsetDateTime]
**groups** | **List&lt;String&gt;** | The groups this user belongs to | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.identity.model.CurrentUserResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String EmailAddress = "example EmailAddress";
String Type = "example Type";
@jakarta.annotation.Nullable String DomainType = "example DomainType";
@jakarta.annotation.Nullable OffsetDateTime UserExpiry = OffsetDateTime.now();
@jakarta.annotation.Nullable List<String> Groups = new List<String>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CurrentUserResponse currentUserResponseInstance = new CurrentUserResponse()
    .Id(Id)
    .EmailAddress(EmailAddress)
    .Type(Type)
    .DomainType(DomainType)
    .UserExpiry(UserExpiry)
    .Groups(Groups)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
