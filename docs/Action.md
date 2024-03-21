

# Action


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completedAt** | **String** | Timestamp indicating when the action was completed |  [optional] |
|**createdAt** | **String** | Timestamp indicating when the action was created |  |
|**modifiedAt** | **String** | Timestamp indicating when the action was last modified |  [optional] |
|**origination** | [**OriginationEnum**](#OriginationEnum) | The origination of the action&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;USER&lt;/strong&gt; - These are user requests.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SYSTEM&lt;/strong&gt; - These are system processing actions.&lt;/li&gt;&lt;/ul&gt; |  |
|**reason** | [**ActionReason**](ActionReason.md) |  |  [optional] |
|**requestId** | **String** | A client provided identifier (via X-Request-Id header) used for tracking individual requests |  [optional] |
|**startedAt** | **String** | Timestamp indicating when the action was started |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the action&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ACCEPTED&lt;/strong&gt; - The action has been queued, processing has not started.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;AWAITING&lt;/strong&gt; - The action is waiting on a user input.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CANCELLED&lt;/strong&gt; - The action has been cancelled by the user.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;FAILED&lt;/strong&gt; - An error occurred while the action was processing, no more processing will be performed.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING&lt;/strong&gt; - The action is being processed.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SUCCESS&lt;/strong&gt; - The action has completed, no additional processing is required.&lt;/li&gt;&lt;/ul&gt; |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of action being performed&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;AUTH_CODE_PURCHASE&lt;/strong&gt; - Request for an auth code for a .de domain via POST /v2/customers/{customerId}/domains/{domain}/purchaseAuthCode.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;AUTH_CODE_REGENERATE&lt;/strong&gt; - Request to regenerate the authCode for a domain via POST /v2/customers/{customerId}/domains/{domain}/regenerateAuthCode&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;AUTO_RENEWAL&lt;/strong&gt; - A Domain Auto Renew is in progress.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;BACKORDER_PURCHASE&lt;/strong&gt; - Request to purchase a domain backorder via POST /v2/customers/{customerId}/domains/backorders/purchase.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;BACKORDER_DELETE&lt;/strong&gt; - Request to cancel the current domain backorder via DELETE /v2/customers/{customerId}/domains/backorders/{domain}.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;BACKORDER_UPDATE&lt;/strong&gt; - Request update the current domain backorder via PATCH /v2/customers/{customerId}/domains/backorders/{domain}.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CONTACT_CREATE&lt;/strong&gt; - Request to create a contact via POST /v2/customers/{customerId}/domains/contacts.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CONTACT_DELETE&lt;/strong&gt; - Request to delete a contact via DELETE /v2/customers/{customerId}/domains/contacts/{contactId}&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CONTACT_UPDATE&lt;/strong&gt; - Request to update a contact via PATCH /v2/customers/{customerId}/domains/contacts/{contactId}&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DNS_VERIFICATION&lt;/strong&gt; - Domain requires zone file setup.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DNSSEC_CREATE&lt;/strong&gt; - Request to create DNSSEC record for the domain via PATCH /v2/customers/{customerId}/domains/{domain}/dnssecRecords.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DNSSEC_DELETE&lt;/strong&gt; - Request to delete DNSSEC record for the domain via DELETE /v2/customers/{customerId}/domains/{domain}/dnssecRecords.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DOMAIN_DELETE&lt;/strong&gt; - Request to delete the domain via DELETE /v2/customers/{customerId}/domains/{domain}&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DOMAIN_UPDATE&lt;/strong&gt; - Request to update the domain via PATCH /v2/customers/{customerId}/domains/{domain}&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DOMAIN_UPDATE_CONTACTS&lt;/strong&gt; -Request to update the domain contacts via PATCH /v2/customers/{customerId}/domains/{domain}/contacts&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DOMAIN_UPDATE_NAME_SERVERS&lt;/strong&gt; - Request to update the domain name servers via PUT /v2/customers/{customerId}/domains/{domain}/nameServers&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;EXPIRY&lt;/strong&gt; - A Domain Expiration is in progress.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;HOST_CREATE&lt;/strong&gt; - Request to create a hostname via PUT /v2/customers/{customerId}/domains/{domain}/hosts/{hostname}&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;HOST_DELETE&lt;/strong&gt; - Request to delete a hostname via DELETE /v2/customers/{customerId}/domains/{domain}/hosts/{hostname}&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ICANN_VERIFICATION&lt;/strong&gt; - Domain requires registrant verification for Icann.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PREMIUM&lt;/strong&gt; - Premium Domain domain sale is in progress.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PRIVACY_PURCHASE&lt;/strong&gt; - Request to purchase privacy for a domain via POST /v2/customers/{customerId}/domains/{domain}/privacy/purchase&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PRIVACY_DELETE&lt;/strong&gt; - Request to remove privacy from a domain via DELETE /v2/customers/{customerId}/domains/{domain}/privacy&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REDEEM&lt;/strong&gt; - Request to redeem a domain via POST /v2/customers/{customerId}/domains/{domain}/redeem&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REGISTER&lt;/strong&gt; - Request to register a domain via POST /v2/customers/{customerId}/domains/{domain}/register&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RENEW&lt;/strong&gt; - Request to renew a domain via POST /v2/customers/{customerId}/domains/{domain}/renew&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RENEW_UNDO&lt;/strong&gt; - Request to undo a renewal for a uk domain via POST /v2/customers/{customerId}/domains/{domain}/undoRenew&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRADE&lt;/strong&gt; - A domain trade request is in progress&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRADE_CANCEL&lt;/strong&gt; - Request to cancel a trade for a domain via POST /v2/customers/{customerId}/domains/{domain}/tradeCancel&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRADE_PURCHASE&lt;/strong&gt; - Request to purchase a trade for a domain via POST /v2/customers/{customerId}/domains/{domain}/tradePurchase&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRADE_PURCHASE_AUTH_TEXT_MESSAGE&lt;/strong&gt; - Request for a trade purchase text message for a domain via POST /v2/customers/{customerId}/domains/{domain}/tradePurchaseAuthorizationTextMessage&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRADE_RESEND_AUTH_EMAIL&lt;/strong&gt; - Request to resend the trade auth email message for a domain via POST /v2/customers/{customerId}/domains/{domain}/tradeResendAuthorizationEmail&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER&lt;/strong&gt; - Request to transfer a domain via POST /v2/customers/{customerId}/domains/{domain}/transfer&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER_IN&lt;/strong&gt; - A domain transfer in request is in progress.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER_IN_ACCEPT&lt;/strong&gt; - Request to accept a domain transfer in via POST /v2/customers/{customerId}/domains/{domain}/transferInAccept&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER_IN_CANCEL&lt;/strong&gt; - Request to cancel a domain transfer via POST /v2/customers/{customerId}/domains/{domain}/transferInCancel&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER_IN_RESTART&lt;/strong&gt; - Request to restart a domain transfer in via POST /v2/customers/{customerId}/domains/{domain}/transferInRestart&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER_IN_RETRY&lt;/strong&gt; - Request to retry a domain transfer in via POST /v2/customers/{customerId}/domains/{domain}/transferInRetry&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER_OUT&lt;/strong&gt; - A domain transfer out request is in progress.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER_OUT_ACCEPT&lt;/strong&gt; - Request to accept a transfer out request for a domain via POST /v2/customers/{customerId}/domains/{domain}/transferOutAccept&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER_OUT_REJECT&lt;/strong&gt; - Request to reject a transfer out request for a domain via POST /v2/customers/{customerId}/domains/{domain}/transferOutReject&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSFER_OUT_REQUESTED&lt;/strong&gt; - Request to transfer out for a domain (.de) via POST /v2/customers/{customerId}/domains/{domain}/transferOut&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;TRANSIT&lt;/strong&gt; - Request to transit a de or at domain at the registry via POST /v2/customers/{customerId}/domains/{domain}/transit&lt;/li&gt;&lt;/ul&gt; |  |



## Enum: OriginationEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| SYSTEM | &quot;SYSTEM&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;ACCEPTED&quot; |
| AWAITING | &quot;AWAITING&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| FAILED | &quot;FAILED&quot; |
| PENDING | &quot;PENDING&quot; |
| SUCCESS | &quot;SUCCESS&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTH_CODE_PURCHASE | &quot;AUTH_CODE_PURCHASE&quot; |
| AUTH_CODE_REGENERATE | &quot;AUTH_CODE_REGENERATE&quot; |
| AUTO_RENEWAL | &quot;AUTO_RENEWAL&quot; |
| BACKORDER_PURCHASE | &quot;BACKORDER_PURCHASE&quot; |
| BACKORDER_DELETE | &quot;BACKORDER_DELETE&quot; |
| BACKORDER_UPDATE | &quot;BACKORDER_UPDATE&quot; |
| CONTACT_CREATE | &quot;CONTACT_CREATE&quot; |
| CONTACT_DELETE | &quot;CONTACT_DELETE&quot; |
| CONTACT_UPDATE | &quot;CONTACT_UPDATE&quot; |
| DNS_VERIFICATION | &quot;DNS_VERIFICATION&quot; |
| DNSSEC_CREATE | &quot;DNSSEC_CREATE&quot; |
| DNSSEC_DELETE | &quot;DNSSEC_DELETE&quot; |
| DOMAIN_DELETE | &quot;DOMAIN_DELETE&quot; |
| DOMAIN_UPDATE | &quot;DOMAIN_UPDATE&quot; |
| DOMAIN_UPDATE_CONTACTS | &quot;DOMAIN_UPDATE_CONTACTS&quot; |
| DOMAIN_UPDATE_NAME_SERVERS | &quot;DOMAIN_UPDATE_NAME_SERVERS&quot; |
| EXPIRY | &quot;EXPIRY&quot; |
| HOST_CREATE | &quot;HOST_CREATE&quot; |
| HOST_DELETE | &quot;HOST_DELETE&quot; |
| ICANN_VERIFICATION | &quot;ICANN_VERIFICATION&quot; |
| MIGRATE | &quot;MIGRATE&quot; |
| MIGRATE_IN | &quot;MIGRATE_IN&quot; |
| PREMIUM | &quot;PREMIUM&quot; |
| PRIVACY_PURCHASE | &quot;PRIVACY_PURCHASE&quot; |
| PRIVACY_DELETE | &quot;PRIVACY_DELETE&quot; |
| REDEEM | &quot;REDEEM&quot; |
| REGISTER | &quot;REGISTER&quot; |
| RENEW | &quot;RENEW&quot; |
| RENEW_UNDO | &quot;RENEW_UNDO&quot; |
| TRADE | &quot;TRADE&quot; |
| TRADE_CANCEL | &quot;TRADE_CANCEL&quot; |
| TRADE_PURCHASE | &quot;TRADE_PURCHASE&quot; |
| TRADE_PURCHASE_AUTH_TEXT_MESSAGE | &quot;TRADE_PURCHASE_AUTH_TEXT_MESSAGE&quot; |
| TRADE_RESEND_AUTH_EMAIL | &quot;TRADE_RESEND_AUTH_EMAIL&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| TRANSFER_IN | &quot;TRANSFER_IN&quot; |
| TRANSFER_IN_ACCEPT | &quot;TRANSFER_IN_ACCEPT&quot; |
| TRANSFER_IN_CANCEL | &quot;TRANSFER_IN_CANCEL&quot; |
| TRANSFER_IN_RESTART | &quot;TRANSFER_IN_RESTART&quot; |
| TRANSFER_IN_RETRY | &quot;TRANSFER_IN_RETRY&quot; |
| TRANSFER_OUT | &quot;TRANSFER_OUT&quot; |
| TRANSFER_OUT_ACCEPT | &quot;TRANSFER_OUT_ACCEPT&quot; |
| TRANSFER_OUT_REJECT | &quot;TRANSFER_OUT_REJECT&quot; |
| TRANSFER_OUT_REQUESTED | &quot;TRANSFER_OUT_REQUESTED&quot; |
| TRANSIT | &quot;TRANSIT&quot; |



