# com.finbourne.identity.model.UserSummary
Lightweight view of an user details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The user id | [optional] [default to String]
**login** | **String** | The user login | [optional] [default to String]
**email** | **String** | The email address registered for that user | [optional] [default to String]
**secondEmail** | **String** |  | [optional] [default to String]
**firstName** | **String** | User&#39;s first name | [optional] [default to String]
**lastName** | **String** | User&#39;s last name | [optional] [default to String]
**type** | **String** | User&#39;s type (Personal, Service...) | [optional] [default to String]
**alternativeUserIds** | **Map&lt;String, String&gt;** | User&#39;s alternative user IDs. Only returned for the current user | [optional] [default to Map<String, String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.identity.model.UserSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String Login = "example Login";
@jakarta.annotation.Nullable String Email = "example Email";
@jakarta.annotation.Nullable String SecondEmail = "example SecondEmail";
@jakarta.annotation.Nullable String FirstName = "example FirstName";
@jakarta.annotation.Nullable String LastName = "example LastName";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable Map<String, String> AlternativeUserIds = new Map<String, String>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UserSummary userSummaryInstance = new UserSummary()
    .Id(Id)
    .Login(Login)
    .Email(Email)
    .SecondEmail(SecondEmail)
    .FirstName(FirstName)
    .LastName(LastName)
    .Type(Type)
    .AlternativeUserIds(AlternativeUserIds)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
