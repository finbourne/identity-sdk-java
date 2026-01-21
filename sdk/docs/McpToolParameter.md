# com.finbourne.identity.model.McpToolParameter
A parameter definition for an MCP tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the parameter (identifier format) | [default to String]
**dataType** | **String** | The data type of the parameter | [default to String]
**description** | **String** | A description of what the parameter is used for | [optional] [default to String]

```java
import com.finbourne.identity.model.McpToolParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String DataType = "example DataType";
@jakarta.annotation.Nullable String Description = "example Description";


McpToolParameter mcpToolParameterInstance = new McpToolParameter()
    .Name(Name)
    .DataType(DataType)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
