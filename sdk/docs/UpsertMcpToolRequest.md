# com.finbourne.identity.model.UpsertMcpToolRequest
Request to create or update an MCP tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the MCP tool (alphanumeric, underscore, and hyphen) | [default to String]
**title** | **String** | The title of the MCP tool | [default to String]
**description** | **String** | The description of the MCP tool | [default to String]
**destructive** | **Boolean** | Whether the tool is destructive | [optional] [default to Boolean]
**idempotent** | **Boolean** | Whether the tool is idempotent | [optional] [default to Boolean]
**openWorld** | **Boolean** | Whether the tool operates in open world | [optional] [default to Boolean]
**readOnly** | **Boolean** | Whether the tool is read-only | [optional] [default to Boolean]
**parameters** | [**List&lt;McpToolParameter&gt;**](McpToolParameter.md) | The parameters for this MCP tool | [optional] [default to List<McpToolParameter>]
**luminescePayload** | [**McpToolLuminescePayload**](McpToolLuminescePayload.md) |  | [optional] [default to McpToolLuminescePayload]
**schedulerPayload** | [**McpToolSchedulerPayload**](McpToolSchedulerPayload.md) |  | [optional] [default to McpToolSchedulerPayload]

```java
import com.finbourne.identity.model.UpsertMcpToolRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Title = "example Title";
String Description = "example Description";
Boolean Destructive = true;
Boolean Idempotent = true;
Boolean OpenWorld = true;
Boolean ReadOnly = true;
@jakarta.annotation.Nullable List<McpToolParameter> Parameters = new List<McpToolParameter>();
McpToolLuminescePayload LuminescePayload = new McpToolLuminescePayload();
McpToolSchedulerPayload SchedulerPayload = new McpToolSchedulerPayload();


UpsertMcpToolRequest upsertMcpToolRequestInstance = new UpsertMcpToolRequest()
    .Name(Name)
    .Title(Title)
    .Description(Description)
    .Destructive(Destructive)
    .Idempotent(Idempotent)
    .OpenWorld(OpenWorld)
    .ReadOnly(ReadOnly)
    .Parameters(Parameters)
    .LuminescePayload(LuminescePayload)
    .SchedulerPayload(SchedulerPayload);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
