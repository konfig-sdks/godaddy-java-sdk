

# ConsentDomainUpdate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agreedAt** | **String** | Timestamp indicating when the end-user consented to these agreements |  |
|**agreedBy** | **String** | Originating client IP address of the end-user&#39;s computer when they consented to the agreements |  |
|**agreementKeys** | [**List&lt;AgreementKeysEnum&gt;**](#List&lt;AgreementKeysEnum&gt;) | Unique identifiers of the agreements to which the end-user has agreed, as required by the elements being updated&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;EXPOSE_WHOIS&lt;/strong&gt; - Required when the exposeWhois field is updated to true&lt;/li&gt;&lt;/ul&gt; |  |



## Enum: List&lt;AgreementKeysEnum&gt;

| Name | Value |
|---- | -----|
| EXPOSE_WHOIS | &quot;EXPOSE_WHOIS&quot; |



