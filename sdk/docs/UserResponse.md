# com.finbourne.identity.model.UserResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The user&#39;s system supplied unique identifier | [default to String]
**alternativeUserIds** | **Map&lt;String, String&gt;** | The user&#39;s alternative IDs | [optional] [default to Map<String, String>]
**emailAddress** | **String** | The user&#39;s emailAddress address, which must be unique within the system | [default to String]
**secondEmailAddress** | **String** | The user&#39;s second email address. Only allowed for service users. | [optional] [default to String]
**login** | **String** |  | [default to String]
**firstName** | **String** | The user&#39;s first name | [default to String]
**lastName** | **String** | The user&#39;s last name | [default to String]
**roles** | [**List&lt;RoleResponse&gt;**](RoleResponse.md) | The roles that the user has. | [optional] [default to List<RoleResponse>]
**type** | **String** | The type of user (e.g. Personal or Service) | [default to String]
**status** | **String** | The status of the user | [default to String]
**external** | **Boolean** | Whether or not the user originates from an external identity system | [default to Boolean]
**lastLogin** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the user logged in | [optional] [default to OffsetDateTime]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the user was updated | [optional] [default to OffsetDateTime]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Date the user was created | [optional] [default to OffsetDateTime]
**passwordChanged** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the password was changed for this user | [optional] [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.identity.model.UserResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
@jakarta.annotation.Nullable Map<String, String> AlternativeUserIds = new Map<String, String>();
String EmailAddress = "example EmailAddress";
@jakarta.annotation.Nullable String SecondEmailAddress = "example SecondEmailAddress";
String Login = "example Login";
String FirstName = "example FirstName";
String LastName = "example LastName";
@jakarta.annotation.Nullable List<RoleResponse> Roles = new List<RoleResponse>();
String Type = "example Type";
String Status = "example Status";
Boolean External = true;
@jakarta.annotation.Nullable OffsetDateTime LastLogin = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime LastUpdated = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime Created = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PasswordChanged = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UserResponse userResponseInstance = new UserResponse()
    .Id(Id)
    .AlternativeUserIds(AlternativeUserIds)
    .EmailAddress(EmailAddress)
    .SecondEmailAddress(SecondEmailAddress)
    .Login(Login)
    .FirstName(FirstName)
    .LastName(LastName)
    .Roles(Roles)
    .Type(Type)
    .Status(Status)
    .External(External)
    .LastLogin(LastLogin)
    .LastUpdated(LastUpdated)
    .Created(Created)
    .PasswordChanged(PasswordChanged)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
