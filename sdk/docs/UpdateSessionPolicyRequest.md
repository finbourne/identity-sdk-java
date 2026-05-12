# com.finbourne.identity.model.UpdateSessionPolicyRequest
Session timing settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxSessionIdleMinutes** | **Long** | Maximum minutes a user&#39;s session can be idle before re-authentication is required. Must be between 5 minutes and 12 hours (720 minutes). | [default to Long]
**maxSessionLifetimeMinutes** | **Long** | Maximum minutes a user&#39;s session can live in total. Omit to disable session expiry; otherwise must be between 5 minutes and 24 hours (1440 minutes). | [optional] [default to Long]

```java
import com.finbourne.identity.model.UpdateSessionPolicyRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Long MaxSessionIdleMinutes = new Long("100.00");
@jakarta.annotation.Nullable Long MaxSessionLifetimeMinutes = new Long("100.00");


UpdateSessionPolicyRequest updateSessionPolicyRequestInstance = new UpdateSessionPolicyRequest()
    .MaxSessionIdleMinutes(MaxSessionIdleMinutes)
    .MaxSessionLifetimeMinutes(MaxSessionLifetimeMinutes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
