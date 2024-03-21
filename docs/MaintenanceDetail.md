

# MaintenanceDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**summary** | **String** | A brief description of what is being performed |  |
|**createdAt** | **String** | Date and time (UTC) when this maintenance was created |  |
|**endsAt** | **String** | Date and time (UTC) when this maintenance will complete |  |
|**environment** | [**EnvironmentEnum**](#EnvironmentEnum) | The environment on which the maintenance will be performed&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;OTE&lt;/strong&gt; - The Operational Testing Environment.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PRODUCTION&lt;/strong&gt; - The Live Production Environment.&lt;/li&gt;&lt;/ul&gt; |  |
|**maintenanceId** | **String** | The identifier for the system maintenance |  |
|**modifiedAt** | **String** | Date and time (UTC) when this maintenance was last modified |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) | The reason for the maintenance being performed&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;EMERGENCY&lt;/strong&gt; - Unexpected Emergency maintenance.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PLANNED&lt;/strong&gt; - Planned system maintenance.&lt;/li&gt;&lt;/ul&gt; |  |
|**startsAt** | **String** | Date and time (UTC) when this maintenance will start |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of maintenance&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ACTIVE&lt;/strong&gt; - The upcoming maintenance is active.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CANCELLED&lt;/strong&gt; - The upcoming maintenance has been cancelled.&lt;/li&gt;&lt;/ul&gt; |  |
|**systems** | [**List&lt;MaintenanceSystem&gt;**](MaintenanceSystem.md) | List of systems that are impacted by the maintenance. |  [optional] |
|**tlds** | **List&lt;String&gt;** | List of tlds that are in maintenance.  Generally only applies when &#x60;type&#x60; is REGISTRY |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of maintenance being performed&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;API&lt;/strong&gt; - Programmatic Api components.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REGISTRY&lt;/strong&gt; - The underlying Registry providing the tld(s).&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;UI&lt;/strong&gt; - User Interface components.&lt;/li&gt;&lt;/ul&gt; |  |



## Enum: EnvironmentEnum

| Name | Value |
|---- | -----|
| OTE | &quot;OTE&quot; |
| PRODUCTION | &quot;PRODUCTION&quot; |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| EMERGENCY | &quot;EMERGENCY&quot; |
| PLANNED | &quot;PLANNED&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |
| REGISTRY | &quot;REGISTRY&quot; |
| UI | &quot;UI&quot; |



