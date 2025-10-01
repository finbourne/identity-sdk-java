# com.finbourne.identity.model.PasswordPolicyResponseConditions
Password policy conditions for a password policy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complexity** | [**PasswordPolicyResponseComplexity**](PasswordPolicyResponseComplexity.md) |  | [default to PasswordPolicyResponseComplexity]
**age** | [**PasswordPolicyResponseAge**](PasswordPolicyResponseAge.md) |  | [default to PasswordPolicyResponseAge]
**lockout** | [**PasswordPolicyResponseLockout**](PasswordPolicyResponseLockout.md) |  | [default to PasswordPolicyResponseLockout]

```java
import com.finbourne.identity.model.PasswordPolicyResponseConditions;
import java.util.*;
import java.lang.System;
import java.net.URI;

PasswordPolicyResponseComplexity Complexity = new PasswordPolicyResponseComplexity();
PasswordPolicyResponseAge Age = new PasswordPolicyResponseAge();
PasswordPolicyResponseLockout Lockout = new PasswordPolicyResponseLockout();


PasswordPolicyResponseConditions passwordPolicyResponseConditionsInstance = new PasswordPolicyResponseConditions()
    .Complexity(Complexity)
    .Age(Age)
    .Lockout(Lockout);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
