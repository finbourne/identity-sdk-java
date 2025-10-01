# com.finbourne.identity.model.ApiKey
The metadata of an API key

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique Id of the API key | [default to String]
**displayName** | **String** | The display name of the API key | [default to String]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date of the API key | [default to OffsetDateTime]
**deactivationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The deactivation date of the API key | [optional] [default to OffsetDateTime]

```java
import com.finbourne.identity.model.ApiKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String DisplayName = "example DisplayName";
OffsetDateTime CreatedDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime DeactivationDate = OffsetDateTime.now();


ApiKey apiKeyInstance = new ApiKey()
    .Id(Id)
    .DisplayName(DisplayName)
    .CreatedDate(CreatedDate)
    .DeactivationDate(DeactivationDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
