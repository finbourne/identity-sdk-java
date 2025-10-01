# com.finbourne.identity.model.SupportAccessRequest
A Request to grant support access to your account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **String** | The duration for which access is requested (in any ISO-8601 format) | [default to String]
**description** | **String** | The description of why the support access has been granted (i.e. support ticket numbers) | [optional] [default to String]
**permittedRoles** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.identity.model.SupportAccessRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Duration = "example Duration";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<String> PermittedRoles = new List<String>();


SupportAccessRequest supportAccessRequestInstance = new SupportAccessRequest()
    .Duration(Duration)
    .Description(Description)
    .PermittedRoles(PermittedRoles);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
