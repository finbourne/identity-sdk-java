# com.finbourne.identity.model.McpToolSchedulerPayload
Payload data for a Scheduler job MCP tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobScope** | **String** | The scope of the scheduler job to run | [default to String]
**jobCode** | **String** | The code of the scheduler job to run | [default to String]
**arguments** | **Map&lt;String, String&gt;** | Arguments to pass to the scheduler job (key-value pairs) | [optional] [default to Map<String, String>]
**runAs** | **String** | Optional service user identifier to run the job as (if not the current user) | [optional] [default to String]
**notifications** | [**List&lt;McpToolSchedulerNotification&gt;**](McpToolSchedulerNotification.md) | Optional additional notifications for the job | [optional] [default to List<McpToolSchedulerNotification>]

```java
import com.finbourne.identity.model.McpToolSchedulerPayload;
import java.util.*;
import java.lang.System;
import java.net.URI;

String JobScope = "example JobScope";
String JobCode = "example JobCode";
@jakarta.annotation.Nullable Map<String, String> Arguments = new Map<String, String>();
@jakarta.annotation.Nullable String RunAs = "example RunAs";
@jakarta.annotation.Nullable List<McpToolSchedulerNotification> Notifications = new List<McpToolSchedulerNotification>();


McpToolSchedulerPayload mcpToolSchedulerPayloadInstance = new McpToolSchedulerPayload()
    .JobScope(JobScope)
    .JobCode(JobCode)
    .Arguments(Arguments)
    .RunAs(RunAs)
    .Notifications(Notifications);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
