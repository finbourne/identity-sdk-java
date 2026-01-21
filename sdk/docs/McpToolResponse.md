# com.finbourne.identity.model.McpToolResponse
The response representation of an MCP tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the MCP tool | [optional] [default to String]
**code** | **String** | The code of the MCP tool | [optional] [default to String]
**name** | **String** | The name of the MCP tool | [optional] [default to String]
**version** | **Integer** | The version number of this MCP tool | [optional] [default to Integer]
**title** | **String** | The title of the MCP tool | [optional] [default to String]
**description** | **String** | The description of the MCP tool | [optional] [default to String]
**destructive** | **Boolean** | Whether the tool is destructive | [optional] [default to Boolean]
**idempotent** | **Boolean** | Whether the tool is idempotent | [optional] [default to Boolean]
**openWorld** | **Boolean** | Whether the tool operates in open world | [optional] [default to Boolean]
**readOnly** | **Boolean** | Whether the tool is read-only | [optional] [default to Boolean]
**parameters** | [**List&lt;McpToolParameter&gt;**](McpToolParameter.md) | The parameters for this MCP tool | [optional] [default to List<McpToolParameter>]
**payloadType** | **String** | The type of payload (Luminesce or Scheduler) | [optional] [default to String]
**luminescePayload** | [**McpToolLuminescePayload**](McpToolLuminescePayload.md) |  | [optional] [default to McpToolLuminescePayload]
**schedulerPayload** | [**McpToolSchedulerPayload**](McpToolSchedulerPayload.md) |  | [optional] [default to McpToolSchedulerPayload]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the MCP tool was created | [optional] [default to OffsetDateTime]
**createdBy** | **String** | Who created the MCP tool | [optional] [default to String]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the MCP tool was last updated | [optional] [default to OffsetDateTime]
**updatedBy** | **String** | Who last updated the MCP tool | [optional] [default to String]

```java
import com.finbourne.identity.model.McpToolResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String Name = "example Name";
Integer Version = new Integer("100.00");
@jakarta.annotation.Nullable String Title = "example Title";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean Destructive = true;
Boolean Idempotent = true;
Boolean OpenWorld = true;
Boolean ReadOnly = true;
@jakarta.annotation.Nullable List<McpToolParameter> Parameters = new List<McpToolParameter>();
@jakarta.annotation.Nullable String PayloadType = "example PayloadType";
McpToolLuminescePayload LuminescePayload = new McpToolLuminescePayload();
McpToolSchedulerPayload SchedulerPayload = new McpToolSchedulerPayload();
OffsetDateTime CreatedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String CreatedBy = "example CreatedBy";
OffsetDateTime UpdatedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String UpdatedBy = "example UpdatedBy";


McpToolResponse mcpToolResponseInstance = new McpToolResponse()
    .Scope(Scope)
    .Code(Code)
    .Name(Name)
    .Version(Version)
    .Title(Title)
    .Description(Description)
    .Destructive(Destructive)
    .Idempotent(Idempotent)
    .OpenWorld(OpenWorld)
    .ReadOnly(ReadOnly)
    .Parameters(Parameters)
    .PayloadType(PayloadType)
    .LuminescePayload(LuminescePayload)
    .SchedulerPayload(SchedulerPayload)
    .CreatedAt(CreatedAt)
    .CreatedBy(CreatedBy)
    .UpdatedAt(UpdatedAt)
    .UpdatedBy(UpdatedBy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
