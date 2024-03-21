

# ConsentV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agreedAt** | **String** | Timestamp indicating when the end-user consented to these legal agreements |  |
|**agreedBy** | **String** | Originating client IP address of the end-user&#39;s computer when they consented to these legal agreements |  |
|**agreementKeys** | **List&lt;String&gt;** | Unique identifiers of the legal agreements to which the end-user has agreed, as returned from the/domains/agreements endpoint |  |
|**claimToken** | **String** | The trademark claim token, only needed if the domain has an active trademark claim |  [optional] |
|**currency** | **String** | Currency in which the &#x60;price&#x60; is listed |  |
|**price** | **Integer** | Price of the domain excluding taxes or fees. Please use GET /v1/domains/available to retrieve the price and currency for the domain |  |
|**registryPremiumPricing** | **Boolean** | Only required for hosted registrar if domain is premium. If true indicates that the &#x60;price&#x60; and &#x60;currency&#x60; listed are the registry premium price and currency for the domain |  [optional] |



