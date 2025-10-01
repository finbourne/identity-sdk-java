# com.finbourne.identity.model.SystemLog
A system log event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**LogActor**](LogActor.md) |  | [optional] [default to LogActor]
**authenticationContext** | [**LogAuthenticationContext**](LogAuthenticationContext.md) |  | [optional] [default to LogAuthenticationContext]
**clientInfo** | [**LogClientInfo**](LogClientInfo.md) |  | [optional] [default to LogClientInfo]
**debugContext** | [**LogDebugContext**](LogDebugContext.md) |  | [optional] [default to LogDebugContext]
**displayMessage** | **String** | Represents a DisplayMessage resource in the Okta API | [optional] [default to String]
**eventType** | **String** | Represents a EventType resource in the Okta API | [optional] [default to String]
**legacyEventType** | **String** | Represents a LegacyEventType resource in the Okta API | [optional] [default to String]
**outcome** | [**LogOutcome**](LogOutcome.md) |  | [optional] [default to LogOutcome]
**published** | [**OffsetDateTime**](OffsetDateTime.md) | Represents when Published in the Okta API | [optional] [default to OffsetDateTime]
**request** | [**LogRequest**](LogRequest.md) |  | [optional] [default to LogRequest]
**securityContext** | [**LogSecurityContext**](LogSecurityContext.md) |  | [optional] [default to LogSecurityContext]
**severity** | [**LogSeverity**](LogSeverity.md) |  | [optional] [default to LogSeverity]
**target** | [**List&lt;LogTarget&gt;**](LogTarget.md) | Represents a LogTarget resource in the Okta API | [optional] [default to List<LogTarget>]
**transaction** | [**LogTransaction**](LogTransaction.md) |  | [optional] [default to LogTransaction]
**uuid** | **String** | Represents Uuid in the Okta API | [optional] [default to String]
**version** | **String** | Represents a Version in the Okta API | [optional] [default to String]

```java
import com.finbourne.identity.model.SystemLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

LogActor Actor = new LogActor();
LogAuthenticationContext AuthenticationContext = new LogAuthenticationContext();
LogClientInfo ClientInfo = new LogClientInfo();
LogDebugContext DebugContext = new LogDebugContext();
@jakarta.annotation.Nullable String DisplayMessage = "example DisplayMessage";
@jakarta.annotation.Nullable String EventType = "example EventType";
@jakarta.annotation.Nullable String LegacyEventType = "example LegacyEventType";
LogOutcome Outcome = new LogOutcome();
@jakarta.annotation.Nullable OffsetDateTime Published = OffsetDateTime.now();
LogRequest Request = new LogRequest();
LogSecurityContext SecurityContext = new LogSecurityContext();
LogSeverity Severity = new LogSeverity();
@jakarta.annotation.Nullable List<LogTarget> Target = new List<LogTarget>();
LogTransaction Transaction = new LogTransaction();
@jakarta.annotation.Nullable String Uuid = "example Uuid";
@jakarta.annotation.Nullable String Version = "example Version";


SystemLog systemLogInstance = new SystemLog()
    .Actor(Actor)
    .AuthenticationContext(AuthenticationContext)
    .ClientInfo(ClientInfo)
    .DebugContext(DebugContext)
    .DisplayMessage(DisplayMessage)
    .EventType(EventType)
    .LegacyEventType(LegacyEventType)
    .Outcome(Outcome)
    .Published(Published)
    .Request(Request)
    .SecurityContext(SecurityContext)
    .Severity(Severity)
    .Target(Target)
    .Transaction(Transaction)
    .Uuid(Uuid)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
