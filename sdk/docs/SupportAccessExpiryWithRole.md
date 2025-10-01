# com.finbourne.identity.model.SupportAccessExpiryWithRole
Time at which the support access granted for a role expires

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiry** | [**OffsetDateTime**](OffsetDateTime.md) | DateTimeOffset at which the access will be revoked | [default to OffsetDateTime]
**permittedRole** | **String** | Unique identifier for permitted role.   Use GET /identity/api/authentication/support-roles to lookup role label/code from identifier. | [default to String]

```java
import com.finbourne.identity.model.SupportAccessExpiryWithRole;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Expiry = OffsetDateTime.now();
String PermittedRole = "example PermittedRole";


SupportAccessExpiryWithRole supportAccessExpiryWithRoleInstance = new SupportAccessExpiryWithRole()
    .Expiry(Expiry)
    .PermittedRole(PermittedRole);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
