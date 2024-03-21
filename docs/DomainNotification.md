

# DomainNotification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addedAt** | **String** | The date the notification was added |  |
|**metadata** | **Object** | The notification data for the given type as specifed by GET /v2/customers/{customerId}/domains/notifications/schema |  [optional] |
|**notificationId** | **String** | The notification ID to be used in POST /v2/customers/{customerId}/domains/notifications to acknowledge the notification |  |
|**requestId** | **String** | A client provided identifier (via X-Request-Id header) indicating the request this notification is for |  [optional] |
|**resource** | **String** | The resource the notification pertains to. |  |
|**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | The type of resource the notification relates to |  |
|**status** | [**StatusEnum**](#StatusEnum) | The resulting status of the action. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of action the notification relates to |  |



## Enum: ResourceTypeEnum

| Name | Value |
|---- | -----|
| CONTACT | &quot;CONTACT&quot; |
| DOMAIN | &quot;DOMAIN&quot; |
| HOST | &quot;HOST&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
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
| BACKORDER | &quot;BACKORDER&quot; |
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



