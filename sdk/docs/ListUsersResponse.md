# com.finbourne.identity.model.ListUsersResponse
Users directory query response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | Uri of this response | [optional] [default to URI]
**values** | [**Map&lt;String, UserSummary&gt;**](UserSummary.md) | Successful entities, indexed by their id | [optional] [default to Map<String, UserSummary>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | Failed entities, indexed by their id | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.identity.model.ListUsersResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, UserSummary> Values = new Map<String, UserSummary>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ListUsersResponse listUsersResponseInstance = new ListUsersResponse()
    .Href(Href)
    .Values(Values)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
