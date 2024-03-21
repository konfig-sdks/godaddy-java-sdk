

# DomainsContactsBulk


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactAdmin** | [**Contact**](Contact.md) |  |  [optional] |
|**contactBilling** | [**Contact**](Contact.md) |  |  [optional] |
|**contactPresence** | [**Contact**](Contact.md) |  |  [optional] |
|**contactRegistrant** | [**Contact**](Contact.md) |  |  [optional] |
|**contactTech** | [**Contact**](Contact.md) |  |  [optional] |
|**domains** | **List&lt;String&gt;** | An array of domain names to be validated against. Alternatively, you can specify the extracted tlds. However, full domain names are required if the tld is &#x60;uk&#x60; |  |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Canadian Presence Requirement (CA) |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| ABORIGINAL | &quot;ABORIGINAL&quot; |
| ASSOCIATION | &quot;ASSOCIATION&quot; |
| CITIZEN | &quot;CITIZEN&quot; |
| CORPORATION | &quot;CORPORATION&quot; |
| EDUCATIONAL | &quot;EDUCATIONAL&quot; |
| GOVERNMENT | &quot;GOVERNMENT&quot; |
| HOSPITAL | &quot;HOSPITAL&quot; |
| INDIAN_BAND | &quot;INDIAN_BAND&quot; |
| LEGAL_REPRESENTATIVE | &quot;LEGAL_REPRESENTATIVE&quot; |
| LIBRARY_ARCHIVE_MUSEUM | &quot;LIBRARY_ARCHIVE_MUSEUM&quot; |
| MARK_REGISTERED | &quot;MARK_REGISTERED&quot; |
| MARK_TRADE | &quot;MARK_TRADE&quot; |
| PARTNERSHIP | &quot;PARTNERSHIP&quot; |
| POLITICAL_PARTY | &quot;POLITICAL_PARTY&quot; |
| RESIDENT_PERMANENT | &quot;RESIDENT_PERMANENT&quot; |
| TRUST | &quot;TRUST&quot; |
| UNION | &quot;UNION&quot; |



