# com.finbourne.identity.model.ClaimMappings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** |  | [default to String]
**login** | **String** |  | [default to String]
**email** | **String** |  | [default to String]
**firstName** | **String** |  | [default to String]
**lastName** | **String** |  | [default to String]
**userType** | **String** |  | [default to String]
**groups** | **String** |  | [optional] [default to String]

```java
import com.finbourne.identity.model.ClaimMappings;
import java.util.*;
import java.lang.System;
import java.net.URI;

String UserId = "example UserId";
String Login = "example Login";
String Email = "example Email";
String FirstName = "example FirstName";
String LastName = "example LastName";
String UserType = "example UserType";
@jakarta.annotation.Nullable String Groups = "example Groups";


ClaimMappings claimMappingsInstance = new ClaimMappings()
    .UserId(UserId)
    .Login(Login)
    .Email(Email)
    .FirstName(FirstName)
    .LastName(LastName)
    .UserType(UserType)
    .Groups(Groups);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
