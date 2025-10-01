# com.finbourne.identity.model.AddScimResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseUrl** | [**URI**](URI.md) |  | [optional] [default to URI]
**apiToken** | **String** |  | [optional] [default to String]

```java
import com.finbourne.identity.model.AddScimResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI BaseUrl = URI.create("http://example.com/BaseUrl");
@jakarta.annotation.Nullable String ApiToken = "example ApiToken";


AddScimResponse addScimResponseInstance = new AddScimResponse()
    .BaseUrl(BaseUrl)
    .ApiToken(ApiToken);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
