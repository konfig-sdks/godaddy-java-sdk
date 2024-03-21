

# ErrorFieldDomainContactsValidate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Short identifier for the error, suitable for indicating the specific error within client code |  |
|**domains** | **List&lt;String&gt;** | An array of domain names the error is for. If tlds are specified in the request, &#x60;domains&#x60; will contain tlds. For example, if &#x60;domains&#x60; in request is [\&quot;test1.com\&quot;, \&quot;test2.uk\&quot;, \&quot;net\&quot;], and the field is invalid for com and net, then one of the &#x60;fields&#x60; in response will have [\&quot;test1.com\&quot;, \&quot;net\&quot;] as &#x60;domains&#x60; |  |
|**message** | **String** | Human-readable, English description of the problem with the contents of the field |  [optional] |
|**path** | **String** | 1) JSONPath referring to the field within the data containing an error&lt;br/&gt;or&lt;br/&gt;2) JSONPath referring to an object containing an error |  |
|**pathRelated** | **String** | JSONPath referring to the field on the object referenced by &#x60;path&#x60; containing an error |  [optional] |



