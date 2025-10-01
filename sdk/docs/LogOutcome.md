# com.finbourne.identity.model.LogOutcome
Represents a LogOutcome resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **String** |  | [optional] [default to String]
**reason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.identity.model.LogOutcome;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Result = "example Result";
@jakarta.annotation.Nullable String Reason = "example Reason";


LogOutcome logOutcomeInstance = new LogOutcome()
    .Result(Result)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
