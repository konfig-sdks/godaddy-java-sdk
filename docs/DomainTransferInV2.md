

# DomainTransferInV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authCode** | **String** | Authorization code from registrar for transferring a domain |  |
|**consent** | [**ConsentV2**](ConsentV2.md) |  |  |
|**contacts** | [**DomainContactsCreateV2**](DomainContactsCreateV2.md) |  |  [optional] |
|**identityDocumentId** | **String** | Unique identifier of the identify document that the user wants to associate with the domain being transferred in. This is required only if the gaining registry has a requirement for an approved identity document |  [optional] |
|**metadata** | **Object** | The domain eligibility data fields as specified by GET /v2/customers/{customerId}/domains/register/schema/{tld} |  [optional] |
|**period** | **Integer** | Can be more than 1 but no more than 10 years total including current registration length |  [optional] |
|**privacy** | **Boolean** | Whether or not privacy has been requested |  [optional] |
|**renewAuto** | **Boolean** | Whether or not the domain should be configured to automatically renew |  [optional] |



