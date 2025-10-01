# com.finbourne.identity.model.RoleResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The role&#39;s system supplied unique identifier | [default to String]
**roleId** | [**RoleId**](RoleId.md) |  | [default to RoleId]
**source** | **String** | The source of the role | [default to String]
**name** | **String** | The role name, which must be unique within the system. | [default to String]
**description** | **String** | The description for this role | [optional] [default to String]
**samlName** | **String** | The name to use on the SAML request if assigning this role via SAML Just in Time (JIT) | [optional] [default to String]

```java
import com.finbourne.identity.model.RoleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
RoleId RoleId = new RoleId();
String Source = "example Source";
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String SamlName = "example SamlName";


RoleResponse roleResponseInstance = new RoleResponse()
    .Id(Id)
    .RoleId(RoleId)
    .Source(Source)
    .Name(Name)
    .Description(Description)
    .SamlName(SamlName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
