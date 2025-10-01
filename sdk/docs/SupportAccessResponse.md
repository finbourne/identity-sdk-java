# com.finbourne.identity.model.SupportAccessResponse
Timestamped successful response to grant access to your account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the support access request | [default to String]
**duration** | **String** | The duration for which access is requested (in any ISO-8601 format) | [default to String]
**description** | **String** | The description of why the support access has been granted (i.e. support ticket numbers) | [optional] [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | DateTimeOffset at which the access was granted | [default to OffsetDateTime]
**expiry** | [**OffsetDateTime**](OffsetDateTime.md) | DateTimeOffset at which the access will be revoked | [default to OffsetDateTime]
**createdBy** | **String** | Obfuscated UserId of the user who granted the support access | [default to String]
**terminated** | **Boolean** | Whether or not that access has been invalidated | [optional] [default to Boolean]
**terminatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | DateTimeOffset at which the access was invalidated | [optional] [default to OffsetDateTime]
**terminatedBy** | **String** | Obfuscated UserId of the user who revoked the access | [optional] [default to String]
**permittedRoles** | **List&lt;String&gt;** | A list of permitted roles, valid for support staff to assume, for the duration of the access request | [optional] [default to List<String>]

```java
import com.finbourne.identity.model.SupportAccessResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String Duration = "example Duration";
@jakarta.annotation.Nullable String Description = "example Description";
OffsetDateTime CreatedAt = OffsetDateTime.now();
OffsetDateTime Expiry = OffsetDateTime.now();
String CreatedBy = "example CreatedBy";
Boolean Terminated = true;
@jakarta.annotation.Nullable OffsetDateTime TerminatedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String TerminatedBy = "example TerminatedBy";
@jakarta.annotation.Nullable List<String> PermittedRoles = new List<String>();


SupportAccessResponse supportAccessResponseInstance = new SupportAccessResponse()
    .Id(Id)
    .Duration(Duration)
    .Description(Description)
    .CreatedAt(CreatedAt)
    .Expiry(Expiry)
    .CreatedBy(CreatedBy)
    .Terminated(Terminated)
    .TerminatedAt(TerminatedAt)
    .TerminatedBy(TerminatedBy)
    .PermittedRoles(PermittedRoles);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
