

# DomainDetailV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actions** | [**List&lt;Action&gt;**](Action.md) | List of current actions in progress for this domain |  [optional] |
|**authCode** | **String** | Authorization code for transferring the Domain |  |
|**contacts** | [**DomainContactsV2**](DomainContactsV2.md) |  |  |
|**createdAt** | **String** | Date and time when this domain was created |  |
|**deletedAt** | **String** | Date and time when this domain was deleted |  [optional] |
|**dnssecRecords** | [**List&lt;DomainDnssec&gt;**](DomainDnssec.md) | List of active DNSSEC records for this domain |  [optional] |
|**domain** | **String** | Name of the domain |  |
|**domainId** | **String** | Unique identifier for this Domain |  |
|**expirationProtected** | **Boolean** | Whether or not the domain is protected from expiration |  |
|**expiresAt** | **String** | Date and time when this domain will expire |  [optional] |
|**holdRegistrar** | **Boolean** | Whether or not the domain is on-hold by the registrar |  |
|**hostnames** | **List&lt;String&gt;** | Hostnames owned by the domain |  [optional] |
|**locked** | **Boolean** | Whether or not the domain is locked to prevent transfers |  |
|**modifiedAt** | **String** | Date and time when this domain was last modified |  [optional] |
|**nameServers** | **List&lt;String&gt;** | Fully-qualified domain names for DNS servers |  |
|**privacy** | **Boolean** | Whether or not the domain has privacy protection |  |
|**registrarCreatedAt** | **String** | Date and time when this domain was created by the registrar |  [optional] |
|**registryStatusCodes** | [**List&lt;RegistryStatusCodesEnum&gt;**](#List&lt;RegistryStatusCodesEnum&gt;) | The current registry status codes of the domain&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ADD_PERIOD&lt;/strong&gt; - This grace period is provided after the initial registration of a domain name.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;AUTO_RENEW_PERIOD&lt;/strong&gt; - This grace period is provided after a domain name registration period expires and is extended (renewed) automatically by the registry.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CLIENT_DELETE_PROHIBITED&lt;/strong&gt; - This status code tells your domain&#39;s registry to reject requests to delete the domain.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CLIENT_HOLD&lt;/strong&gt; - This status code tells your domain&#39;s registry to not activate your domain in the DNS and as a consequence, it will not resolve.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CLIENT_RENEW_PROHIBITED&lt;/strong&gt; - This status code tells your domain&#39;s registry to reject requests to renew your domain.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CLIENT_TRANSFER_PROHIBITED&lt;/strong&gt; - This status code tells your domain&#39;s registry to reject requests to transfer the domain from your current registrar to another.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CLIENT_UPDATE_PROHIBITED&lt;/strong&gt; - This status code tells your domain&#39;s registry to reject requests to update the domain.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;INACTIVE&lt;/strong&gt; - This status code indicates that delegation information (name servers) has not been associated with your domain.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;OK&lt;/strong&gt; - This is the standard status for a domain, meaning it has no pending operations or prohibitions.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING_CREATE&lt;/strong&gt; - This status code indicates that a request to create your domain has been received and is being processed.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING_DELETE&lt;/strong&gt; - This status code indicates that the domain is either in a redemption period if combined with either REDEMPTION_PERIOD or PENDING_RESTORE, if not combined with these, then indicates that the redemption period for the domain has ended and domain will be be purged and dropped from the registry database.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING_RENEW&lt;/strong&gt; - This status code indicates that a request to renew your domain has been received and is being processed.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING_RESTORE&lt;/strong&gt; - This status code indicates that your registrar has asked the registry to restore your domain that was in REDEMPTION_PERIOD status&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING_TRANSFER&lt;/strong&gt; - This status code indicates that a request to transfer your domain to a new registrar has been received and is being processed.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING_UPDATE&lt;/strong&gt; - This status code indicates that a request to update your domain has been received and is being processed.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REDEMPTION_PERIOD&lt;/strong&gt; - This status code indicates that your registrar has asked the registry to delete your domain.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RENEW_PERIOD&lt;/strong&gt; - This grace period is provided after a domain name registration period is explicitly extended (renewed) by the registrar.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SERVER_DELETE_PROHIBITED&lt;/strong&gt; - This status code prevents your domain from being deleted. &lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SERVER_HOLD&lt;/strong&gt; - This status code is set by your domain&#39;s Registry Operator. Your domain is not activated in the DNS.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SERVER_RENEW_PROHIBITED&lt;/strong&gt; - This status code indicates your domain&#39;s Registry Operator will not allow your registrar to renew your domain.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SERVER_TRANSFER_PROHIBITED&lt;/strong&gt; - This status code prevents your domain from being transferred from your current registrar to another. &lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SERVER_UPDATE_PROHIBITED&lt;/strong&gt; - This status code locks your domain preventing it from being updated.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER_PERIOD&lt;/strong&gt; - This grace period is provided after the successful transfer of a domain name from one registrar to another. &lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**renewAuto** | **Boolean** | Whether or not the domain is configured to automatically renew |  |
|**renewDeadline** | **String** | Date the domain must renew on |  |
|**renewal** | [**RenewalDetails**](RenewalDetails.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the domain&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ACTIVE&lt;/strong&gt; - Domain has been registered and is active.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CANCELLED&lt;/strong&gt; - Domain has been cancelled by the user or system, and is not be reclaimable.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DELETED_REDEEMABLE&lt;/strong&gt; - Domain is deleted but is redeemable.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;EXPIRED&lt;/strong&gt; - Domain has expired.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;FAILED&lt;/strong&gt; - Domain registration or transfer error.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;LOCKED_REGISTRAR&lt;/strong&gt; - Domain is locked at the registrar - this is usually the result of a spam, abuse, etc.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PARKED&lt;/strong&gt; - Domain has been parked.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;HELD_REGISTRAR&lt;/strong&gt; - Domain is held at the registrar and cannot be transferred or modified - this is usually the result of a dispute.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;OWNERSHIP_CHANGED&lt;/strong&gt; - Domain has been moved to another account.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING_TRANSFER&lt;/strong&gt; - Domain transfer has been requested and is pending the transfer process.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING_REGISTRATION&lt;/strong&gt; - Domain is pending setup at the registry.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REPOSSESSED&lt;/strong&gt; - Domain has been confiscated - this is usually the result of a chargeback, fraud, abuse, etc.).&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SUSPENDED&lt;/strong&gt; - Domain is in violation and has been suspended.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFERRED&lt;/strong&gt; - Domain has been transferred to another registrar.&lt;/li&gt;&lt;/ul&gt; |  |
|**subaccountId** | **String** | Reseller subaccount shopperid who can manage the domain |  [optional] |
|**transferAwayEligibleAt** | **String** | Date and time when this domain is eligible to transfer |  [optional] |
|**transferProtected** | **Boolean** | Whether or not the domain is protected from transfer |  |
|**verifications** | [**VerificationsDomainV2**](VerificationsDomainV2.md) |  |  [optional] |



## Enum: List&lt;RegistryStatusCodesEnum&gt;

| Name | Value |
|---- | -----|
| ADD_PERIOD | &quot;ADD_PERIOD&quot; |
| AUTO_RENEW_PERIOD | &quot;AUTO_RENEW_PERIOD&quot; |
| CLIENT_DELETE_PROHIBITED | &quot;CLIENT_DELETE_PROHIBITED&quot; |
| CLIENT_HOLD | &quot;CLIENT_HOLD&quot; |
| CLIENT_RENEW_PROHIBITED | &quot;CLIENT_RENEW_PROHIBITED&quot; |
| CLIENT_TRANSFER_PROHIBITED | &quot;CLIENT_TRANSFER_PROHIBITED&quot; |
| CLIENT_UPDATE_PROHIBITED | &quot;CLIENT_UPDATE_PROHIBITED&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| OK | &quot;OK&quot; |
| PENDING_CREATE | &quot;PENDING_CREATE&quot; |
| PENDING_DELETE | &quot;PENDING_DELETE&quot; |
| PENDING_RENEW | &quot;PENDING_RENEW&quot; |
| PENDING_RESTORE | &quot;PENDING_RESTORE&quot; |
| PENDING_TRANSFER | &quot;PENDING_TRANSFER&quot; |
| PENDING_UPDATE | &quot;PENDING_UPDATE&quot; |
| REDEMPTION_PERIOD | &quot;REDEMPTION_PERIOD&quot; |
| RENEW_PERIOD | &quot;RENEW_PERIOD&quot; |
| SERVER_DELETE_PROHIBITED | &quot;SERVER_DELETE_PROHIBITED&quot; |
| SERVER_HOLD | &quot;SERVER_HOLD&quot; |
| SERVER_RENEW_PROHIBITED | &quot;SERVER_RENEW_PROHIBITED&quot; |
| SERVER_TRANSFER_PROHIBITED | &quot;SERVER_TRANSFER_PROHIBITED&quot; |
| SERVER_UPDATE_PROHIBITED | &quot;SERVER_UPDATE_PROHIBITED&quot; |
| TRANSFER_PERIOD | &quot;TRANSFER_PERIOD&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| DELETED_REDEEMABLE | &quot;DELETED_REDEEMABLE&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| FAILED | &quot;FAILED&quot; |
| LOCKED_REGISTRAR | &quot;LOCKED_REGISTRAR&quot; |
| PARKED | &quot;PARKED&quot; |
| HELD_REGISTRAR | &quot;HELD_REGISTRAR&quot; |
| OWNERSHIP_CHANGED | &quot;OWNERSHIP_CHANGED&quot; |
| PENDING_TRANSFER | &quot;PENDING_TRANSFER&quot; |
| PENDING_REGISTRATION | &quot;PENDING_REGISTRATION&quot; |
| REPOSSESSED | &quot;REPOSSESSED&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |
| TRANSFERRED | &quot;TRANSFERRED&quot; |



