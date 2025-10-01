# com.finbourne.identity.model.UpdatePasswordPolicyRequestConditions
Password policy conditions for a password policy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complexity** | [**UpdatePasswordPolicyRequestComplexity**](UpdatePasswordPolicyRequestComplexity.md) |  | [default to UpdatePasswordPolicyRequestComplexity]
**age** | [**UpdatePasswordPolicyRequestAge**](UpdatePasswordPolicyRequestAge.md) |  | [default to UpdatePasswordPolicyRequestAge]
**lockout** | [**UpdatePasswordPolicyRequestLockout**](UpdatePasswordPolicyRequestLockout.md) |  | [default to UpdatePasswordPolicyRequestLockout]

```java
import com.finbourne.identity.model.UpdatePasswordPolicyRequestConditions;
import java.util.*;
import java.lang.System;
import java.net.URI;

UpdatePasswordPolicyRequestComplexity Complexity = new UpdatePasswordPolicyRequestComplexity();
UpdatePasswordPolicyRequestAge Age = new UpdatePasswordPolicyRequestAge();
UpdatePasswordPolicyRequestLockout Lockout = new UpdatePasswordPolicyRequestLockout();


UpdatePasswordPolicyRequestConditions updatePasswordPolicyRequestConditionsInstance = new UpdatePasswordPolicyRequestConditions()
    .Complexity(Complexity)
    .Age(Age)
    .Lockout(Lockout);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
