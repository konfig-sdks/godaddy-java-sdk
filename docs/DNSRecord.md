

# DNSRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **String** |  |  |
|**name** | **String** |  |  |
|**port** | **Integer** | Service port (SRV only) |  [optional] |
|**priority** | **Integer** | Record priority (MX and SRV only) |  [optional] |
|**protocol** | **String** | Service protocol (SRV only) |  [optional] |
|**service** | **String** | Service type (SRV only) |  [optional] |
|**ttl** | **Integer** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**weight** | **Integer** | Record weight (SRV only) |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| AAAA | &quot;AAAA&quot; |
| CNAME | &quot;CNAME&quot; |
| MX | &quot;MX&quot; |
| NS | &quot;NS&quot; |
| SOA | &quot;SOA&quot; |
| SRV | &quot;SRV&quot; |
| TXT | &quot;TXT&quot; |



