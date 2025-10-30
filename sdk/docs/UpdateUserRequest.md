# com.finbourne.identity.model.UpdateUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** |  | [default to String]
**lastName** | **String** |  | [default to String]
**emailAddress** | **String** |  | [default to String]
**secondEmailAddress** | **String** |  | [optional] [default to String]
**login** | **String** | The user&#39;s login username, in the form of an email address, which must be unique within the system. For user accounts this should exactly match the user&#39;s email address. | [default to String]
**alternativeUserIds** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**roles** | [**List&lt;RoleId&gt;**](RoleId.md) | Deprecated. To update a user&#39;s roles use the AddUserToRole and RemoveUserFromRole endpoints | [optional] [default to List<RoleId>]
**userExpiry** | [**OffsetDateTime**](OffsetDateTime.md) | The user&#39;s expiry unix datetime | [optional] [default to OffsetDateTime]

```java
import com.finbourne.identity.model.UpdateUserRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FirstName = "example FirstName";
String LastName = "example LastName";
String EmailAddress = "example EmailAddress";
@jakarta.annotation.Nullable String SecondEmailAddress = "example SecondEmailAddress";
String Login = "example Login";
@jakarta.annotation.Nullable Map<String, String> AlternativeUserIds = new Map<String, String>();
@jakarta.annotation.Nullable List<RoleId> Roles = new List<RoleId>();
@jakarta.annotation.Nullable OffsetDateTime UserExpiry = OffsetDateTime.now();


UpdateUserRequest updateUserRequestInstance = new UpdateUserRequest()
    .FirstName(FirstName)
    .LastName(LastName)
    .EmailAddress(EmailAddress)
    .SecondEmailAddress(SecondEmailAddress)
    .Login(Login)
    .AlternativeUserIds(AlternativeUserIds)
    .Roles(Roles)
    .UserExpiry(UserExpiry);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
