

# DomainSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authCode** | **String** | Authorization code for transferring the Domain |  [optional] |
|**contactAdmin** | [**Contact**](Contact.md) |  |  [optional] |
|**contactBilling** | [**Contact**](Contact.md) |  |  [optional] |
|**contactRegistrant** | [**Contact**](Contact.md) |  |  |
|**contactTech** | [**Contact**](Contact.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Date and time when this domain was created |  |
|**deletedAt** | **OffsetDateTime** | Date and time when this domain was deleted |  [optional] |
|**domain** | **String** | Name of the domain |  |
|**domainId** | **Double** | Unique identifier for this Domain |  |
|**expirationProtected** | **Boolean** | Whether or not the domain is protected from expiration |  |
|**expires** | **OffsetDateTime** | Date and time when this domain will expire |  [optional] |
|**exposeWhois** | **Boolean** | Whether or not the domain contact details should be shown in the WHOIS |  [optional] |
|**holdRegistrar** | **Boolean** | Whether or not the domain is on-hold by the registrar |  |
|**locked** | **Boolean** | Whether or not the domain is locked to prevent transfers |  |
|**nameServers** | **List&lt;String&gt;** | Fully-qualified domain names for DNS servers |  [optional] |
|**privacy** | **Boolean** | Whether or not the domain has privacy protection |  |
|**registrarCreatedAt** | **String** | Date and time when this domain was created by the registrar |  [optional] |
|**renewAuto** | **Boolean** | Whether or not the domain is configured to automatically renew |  |
|**renewDeadline** | **OffsetDateTime** | Date the domain must renew on |  |
|**renewable** | **Boolean** | Whether or not the domain is eligble for renewal based on status |  [optional] |
|**status** | **String** | Processing status of the domain&lt;br/&gt;&lt;ul&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ACTIVE&lt;/strong&gt; - All is well&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;AWAITING*&lt;/strong&gt; - System is waiting for the end-user to complete an action&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CANCELLED*&lt;/strong&gt; - Domain has been cancelled, and may or may not be reclaimable&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CONFISCATED&lt;/strong&gt; - Domain has been confiscated, usually for abuse, chargeback, or fraud&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DISABLED*&lt;/strong&gt; - Domain has been disabled&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;EXCLUDED*&lt;/strong&gt; - Domain has been excluded from Firehose registration&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;EXPIRED*&lt;/strong&gt; - Domain has expired&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;FAILED*&lt;/strong&gt; - Domain has failed a required action, and the system is no longer retrying&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;HELD*&lt;/strong&gt; - Domain has been placed on hold, and likely requires intervention from Support&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;LOCKED*&lt;/strong&gt; - Domain has been locked, and likely requires intervention from Support&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PARKED*&lt;/strong&gt; - Domain has been parked, and likely requires intervention from Support&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING*&lt;/strong&gt; - Domain is working its way through an automated workflow&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RESERVED*&lt;/strong&gt; - Domain is reserved, and likely requires intervention from Support&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REVERTED&lt;/strong&gt; - Domain has been reverted, and likely requires intervention from Support&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SUSPENDED*&lt;/strong&gt; - Domain has been suspended, and likely requires intervention from Support&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFERRED*&lt;/strong&gt; - Domain has been transferred out&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;UNKNOWN&lt;/strong&gt; - Domain is in an unknown state&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;UNLOCKED*&lt;/strong&gt; - Domain has been unlocked, and likely requires intervention from Support&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;UNPARKED*&lt;/strong&gt; - Domain has been unparked, and likely requires intervention from Support&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;UPDATED*&lt;/strong&gt; - Domain ownership has been transferred to another account&lt;/li&gt; &lt;/ul&gt; |  |
|**transferAwayEligibleAt** | **OffsetDateTime** | Date and time when this domain is eligible to transfer |  [optional] |
|**transferProtected** | **Boolean** | Whether or not the domain is protected from transfer |  |



