# com.finbourne.identity.model.ErrorDetail
Provides details about an entity error that occured

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Id of the entity this error relates to | [optional] [default to String]
**type** | **String** | Error type | [optional] [default to String]
**detail** | **String** | Human readable description of the error | [optional] [default to String]

```java
import com.finbourne.identity.model.ErrorDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Detail = "example Detail";


ErrorDetail errorDetailInstance = new ErrorDetail()
    .Id(Id)
    .Type(Type)
    .Detail(Detail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
