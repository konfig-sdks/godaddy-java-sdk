

# DomainPurchaseV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**consent** | [**ConsentV2**](ConsentV2.md) |  |  |
|**contacts** | [**DomainContactsCreateV2**](DomainContactsCreateV2.md) |  |  [optional] |
|**domain** | **String** | For internationalized domain names with non-ascii characters, the domain name is converted to punycode before format and pattern validation rules are checked |  |
|**metadata** | **Object** | The domain eligibility data fields as specified by GET /v2/customers/{customerId}/domains/register/schema/{tld} |  [optional] |
|**nameServers** | **List&lt;String&gt;** |  |  [optional] |
|**period** | **Integer** |  |  [optional] |
|**privacy** | **Boolean** |  |  [optional] |
|**renewAuto** | **Boolean** |  |  [optional] |



