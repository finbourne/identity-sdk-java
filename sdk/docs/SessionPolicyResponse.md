# com.finbourne.identity.model.SessionPolicyResponse
Session timing settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxSessionIdleMinutes** | **Long** | Maximum minutes a user&#39;s session can be idle before re-authentication is required. | [optional] [default to Long]
**maxSessionLifetimeMinutes** | **Long** | Maximum minutes a user&#39;s session can live in total. When absent, sessions do not expire. | [optional] [default to Long]

```java
import com.finbourne.identity.model.SessionPolicyResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Long MaxSessionIdleMinutes = new Long("100.00");
@jakarta.annotation.Nullable Long MaxSessionLifetimeMinutes = new Long("100.00");


SessionPolicyResponse sessionPolicyResponseInstance = new SessionPolicyResponse()
    .MaxSessionIdleMinutes(MaxSessionIdleMinutes)
    .MaxSessionLifetimeMinutes(MaxSessionLifetimeMinutes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
