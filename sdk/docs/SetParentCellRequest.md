# com.finbourne.identity.model.SetParentCellRequest
Request body for setting the parent cell.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adminDomainName** | **String** | The name of the admin domain in the parent cell. | [default to String]
**confirm** | **Boolean** | Whether to confirm the parent cell attachment (second invocation). First call with false creates a Proposed state; second call with true transitions to Attaching. | [default to Boolean]

```java
import com.finbourne.identity.model.SetParentCellRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String AdminDomainName = "example AdminDomainName";
Boolean Confirm = true;


SetParentCellRequest setParentCellRequestInstance = new SetParentCellRequest()
    .AdminDomainName(AdminDomainName)
    .Confirm(Confirm);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
