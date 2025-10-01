# com.finbourne.identity.model.PasswordPolicyResponseComplexity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minLength** | **Integer** | The minimum length for a password | [default to Integer]
**excludeFirstName** | **Boolean** | Rule determining whether a user&#39;s first name should be permitted in their password | [default to Boolean]
**excludeLastName** | **Boolean** | Rule determining whether a user&#39;s last name should be permitted in their password | [default to Boolean]

```java
import com.finbourne.identity.model.PasswordPolicyResponseComplexity;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer MinLength = new Integer("100.00");
Boolean ExcludeFirstName = true;
Boolean ExcludeLastName = true;


PasswordPolicyResponseComplexity passwordPolicyResponseComplexityInstance = new PasswordPolicyResponseComplexity()
    .MinLength(MinLength)
    .ExcludeFirstName(ExcludeFirstName)
    .ExcludeLastName(ExcludeLastName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
