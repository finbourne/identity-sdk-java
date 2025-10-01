# com.finbourne.identity.model.SetPasswordResponse
The result of setting a password

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time at which the password was successfully updated | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.identity.model.SetPasswordResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime UpdatedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


SetPasswordResponse setPasswordResponseInstance = new SetPasswordResponse()
    .UpdatedAt(UpdatedAt)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
