# com.finbourne.identity.model.CreateRoleRequest
Specifies the information required to create a new role.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The role name, which must be unique within the system. | [default to String]
**description** | **String** | The description for this role | [optional] [default to String]

```java
import com.finbourne.identity.model.CreateRoleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";


CreateRoleRequest createRoleRequestInstance = new CreateRoleRequest()
    .Name(Name)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
