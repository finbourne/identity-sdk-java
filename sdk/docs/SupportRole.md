# com.finbourne.identity.model.SupportRole

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**roleIdentifier** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**internalIdentifier** | **String** |  | [optional] [default to String]

```java
import com.finbourne.identity.model.SupportRole;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Label = "example Label";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable Map<String, String> RoleIdentifier = new Map<String, String>();
@jakarta.annotation.Nullable String InternalIdentifier = "example InternalIdentifier";


SupportRole supportRoleInstance = new SupportRole()
    .Label(Label)
    .Description(Description)
    .RoleIdentifier(RoleIdentifier)
    .InternalIdentifier(InternalIdentifier);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
