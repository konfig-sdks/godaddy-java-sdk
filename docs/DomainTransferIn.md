

# DomainTransferIn


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authCode** | **String** | Authorization code from registrar for transferring a domain |  |
|**consent** | [**Consent**](Consent.md) |  |  |
|**contactAdmin** | [**Contact**](Contact.md) |  |  [optional] |
|**contactBilling** | [**Contact**](Contact.md) |  |  [optional] |
|**contactRegistrant** | [**Contact**](Contact.md) |  |  [optional] |
|**contactTech** | [**Contact**](Contact.md) |  |  [optional] |
|**period** | **Integer** | Can be more than 1 but no more than 10 years total including current registration length |  [optional] |
|**privacy** | **Boolean** | Whether or not privacy has been requested |  [optional] |
|**renewAuto** | **Boolean** | Whether or not the domain should be configured to automatically renew |  [optional] |



