# com.finbourne.identity.model.CreateUserRequest
Details necessary for creating a new user

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** | The first name of the user | [default to String]
**lastName** | **String** | The last name of the user | [default to String]
**emailAddress** | **String** | The user&#39;s email address - to which the account validation email will be sent. For user accounts  this should exactly match the Login. | [default to String]
**secondEmailAddress** | **String** | The user&#39;s second email address. Only allowed for Service users | [optional] [default to String]
**login** | **String** | The user&#39;s login username, in the form of an email address, which must be unique within the system.  For user accounts this should exactly match the user&#39;s email address. | [default to String]
**alternativeUserIds** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**roles** | [**List&lt;RoleId&gt;**](RoleId.md) | Optional. Any known roles the user should be created with. | [optional] [default to List<RoleId>]
**type** | **String** | The type of user (e.g. Personal or Service) | [default to String]

```java
import com.finbourne.identity.model.CreateUserRequest;
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
String Type = "example Type";


CreateUserRequest createUserRequestInstance = new CreateUserRequest()
    .FirstName(FirstName)
    .LastName(LastName)
    .EmailAddress(EmailAddress)
    .SecondEmailAddress(SecondEmailAddress)
    .Login(Login)
    .AlternativeUserIds(AlternativeUserIds)
    .Roles(Roles)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
