# com.finbourne.identity.model.UpdatePasswordPolicyRequestLockout

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxAttempts** | **Integer** | The maximum number of unsuccessful attempts before the user is locked out of their account.  0 indicates no limit | [default to Integer]

```java
import com.finbourne.identity.model.UpdatePasswordPolicyRequestLockout;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer MaxAttempts = new Integer("100.00");


UpdatePasswordPolicyRequestLockout updatePasswordPolicyRequestLockoutInstance = new UpdatePasswordPolicyRequestLockout()
    .MaxAttempts(MaxAttempts);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
