

# ContactDomain


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **String** | Timestamp indicating when the contact was created |  [optional] |
|**deleted** | **Boolean** | Flag indicating if the contact has been logically deleted in the system |  [optional] |
|**modifiedAt** | **String** | Timestamp indicating when the contact was last modified |  [optional] |
|**revision** | **Integer** | The current revision number of the contact. |  [optional] |
|**addressMailing** | [**Address**](Address.md) |  |  |
|**contactId** | **String** | Unique identifier for this Contact |  [optional] |
|**email** | **String** |  |  |
|**encoding** | [**EncodingEnum**](#EncodingEnum) | The encoding of the contact data&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ASCII&lt;/strong&gt; - Data contains only ASCII characters that are not region or language specific&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;UTF-8&lt;/strong&gt; - Data contains characters that are specific to a region or language&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**exposeWhois** | **Boolean** | Whether or not the contact details should be shown in the WHOIS |  |
|**fax** | **String** |  |  [optional] |
|**jobTitle** | **String** |  |  [optional] |
|**metadata** | **Object** | The contact eligibility data fields as specified by GET /v2/customers/{customerId}/domains/contacts/schema/{tld} |  [optional] |
|**nameFirst** | **String** |  |  |
|**nameLast** | **String** |  |  |
|**nameMiddle** | **String** |  |  [optional] |
|**organization** | **String** |  |  [optional] |
|**phone** | **String** |  |  |
|**tlds** | **List&lt;String&gt;** | The tlds that this contact can be assigned to |  [optional] |



## Enum: EncodingEnum

| Name | Value |
|---- | -----|
| ASCII | &quot;ASCII&quot; |
| UTF_8 | &quot;UTF-8&quot; |



