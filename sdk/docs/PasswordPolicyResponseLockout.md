# com.finbourne.identity.model.PasswordPolicyResponseLockout

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxAttempts** | **Integer** | The maximum number of unsuccessful attempts before the user is locked out of their account | [default to Integer]

```java
import com.finbourne.identity.model.PasswordPolicyResponseLockout;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer MaxAttempts = new Integer("100.00");


PasswordPolicyResponseLockout passwordPolicyResponseLockoutInstance = new PasswordPolicyResponseLockout()
    .MaxAttempts(MaxAttempts);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
