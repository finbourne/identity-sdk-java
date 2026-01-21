# com.finbourne.identity.model.McpToolSchedulerNotification
A notification configuration for a scheduler job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of notification (e.g., \&quot;Email\&quot;, \&quot;Webhook\&quot;) | [default to String]
**target** | **String** | The target of the notification (e.g., email address, webhook URL) | [default to String]
**trigger** | **String** | When to send the notification (e.g., \&quot;OnSuccess\&quot;, \&quot;OnFailure\&quot;, \&quot;Always\&quot;) | [default to String]

```java
import com.finbourne.identity.model.McpToolSchedulerNotification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Target = "example Target";
String Trigger = "example Trigger";


McpToolSchedulerNotification mcpToolSchedulerNotificationInstance = new McpToolSchedulerNotification()
    .Type(Type)
    .Target(Target)
    .Trigger(Trigger);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
