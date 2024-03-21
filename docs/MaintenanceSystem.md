

# MaintenanceSystem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**impact** | [**List&lt;ImpactEnum&gt;**](#List&lt;ImpactEnum&gt;) | The impact of the maintenance to the system&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DELAYED&lt;/strong&gt; - This response generally applies to systems where the request is queued up and processed once the system is back online.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DOWN&lt;/strong&gt; - The system will be entirely offline; errors are expected.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;NON_AUTHORITATIVE&lt;/strong&gt; - This response generally applies to DOMAIN_CHECKS and DOMAIN_MANAGEMENT &#x60;system&#x60; values where a cached answer will be supplied.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PARTIAL&lt;/strong&gt; - The system will experience partial feature outages; some errors are expected.&lt;/li&gt;&lt;/ul&gt; |  |
|**name** | [**NameEnum**](#NameEnum) | The name of the system affected by the maintenance&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DOMAIN_CHECKS&lt;/strong&gt; - Refers to domain availability checks.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DOMAIN_MANAGEMENT&lt;/strong&gt; - Refers to domain management options including various update options on the domain, contacts, records, etc.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DOMAIN_REGISTRATION&lt;/strong&gt; - Refers to domain registrations, renewals, transfers.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DOMAIN_REGISTRATION_DATA&lt;/strong&gt; - Refers to RDAP and WHOIS Service queries for domains.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DOMAIN_RESOLUTION&lt;/strong&gt; - Refers to DNS resolution for domains.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RESELLER_ADMIN_PORTAL&lt;/strong&gt; - Refers to Admin portals to manage the reseller account and settings.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RESELLER_STOREFRONT&lt;/strong&gt; - Refers to the Reseller Storefront features (Standard and Custom).&lt;/li&gt;&lt;/ul&gt; |  |



## Enum: List&lt;ImpactEnum&gt;

| Name | Value |
|---- | -----|
| DELAYED | &quot;DELAYED&quot; |
| DOWN | &quot;DOWN&quot; |
| NON_AUTHORITATIVE | &quot;NON_AUTHORITATIVE&quot; |
| PARTIAL | &quot;PARTIAL&quot; |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| DOMAIN_CHECKS | &quot;DOMAIN_CHECKS&quot; |
| DOMAIN_MANAGEMENT | &quot;DOMAIN_MANAGEMENT&quot; |
| DOMAIN_REGISTRATION | &quot;DOMAIN_REGISTRATION&quot; |
| DOMAIN_REGISTRATION_DATA | &quot;DOMAIN_REGISTRATION_DATA&quot; |
| DOMAIN_RESOLUTION | &quot;DOMAIN_RESOLUTION&quot; |
| RESELLER_ADMIN_PORTAL | &quot;RESELLER_ADMIN_PORTAL&quot; |
| RESELLER_STOREFRONT | &quot;RESELLER_STOREFRONT&quot; |



