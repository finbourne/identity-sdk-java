# com.finbourne.identity.model.CreateApiKey
Create an API key

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name for the API key | [default to String]
**deactivationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The optional date at which the key should deactivate | [optional] [default to OffsetDateTime]

```java
import com.finbourne.identity.model.CreateApiKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable OffsetDateTime DeactivationDate = OffsetDateTime.now();


CreateApiKey createApiKeyInstance = new CreateApiKey()
    .DisplayName(DisplayName)
    .DeactivationDate(DeactivationDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
