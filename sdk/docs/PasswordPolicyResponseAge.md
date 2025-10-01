# com.finbourne.identity.model.PasswordPolicyResponseAge

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxAgeDays** | **Integer** | The maximum age (in days) a password can be before expiring and needing to be changed | [default to Integer]
**historyCount** | **Integer** | The number of unique passwords that need to be used before a previous password is permitted again | [default to Integer]

```java
import com.finbourne.identity.model.PasswordPolicyResponseAge;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer MaxAgeDays = new Integer("100.00");
Integer HistoryCount = new Integer("100.00");


PasswordPolicyResponseAge passwordPolicyResponseAgeInstance = new PasswordPolicyResponseAge()
    .MaxAgeDays(MaxAgeDays)
    .HistoryCount(HistoryCount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
