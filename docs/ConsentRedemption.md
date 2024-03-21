

# ConsentRedemption


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agreedAt** | **String** | Timestamp indicating when the end-user consented to these legal agreements |  |
|**agreedBy** | **String** | Originating client IP address of the end-user&#39;s computer when they consented to these legal agreements |  |
|**currency** | **String** | Currency in which the &#x60;price&#x60; and &#x60;fee&#x60; are listed |  |
|**fee** | **Integer** | Fee charged for the domain redemption. Please use GET /v2/customers/{customerId}/domains/{domain} to retrieve the redemption fee and currency for the domain |  |
|**price** | **Integer** | Price for the domain renewal (if domain renewal required for redemption). Please use GET /v2/customers/{customerId}/domains/{domain} to retrieve the redemption price and currency for the domain |  |



