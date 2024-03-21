

# DomainForwardingCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mask** | [**DomainForwardingMask**](DomainForwardingMask.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of fowarding to implement&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;MASKED&lt;/strong&gt; - Prevents the forwarded domain or subdomain URL from displaying in the browser&#39;s address bar.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REDIRECT_PERMANENT*&lt;/strong&gt; - Redirects to the url you specified in the forwardTo field using a &#x60;301 Moved Permanently&#x60; HTTP response. The HTTP 301 response code tells user-agents (including search engines) that the location has permanently moved.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REDIRECT_TEMPORARY&lt;/strong&gt; - Redirects to the url you specified in the forwardTo field using a &#x60;302 Found&#x60; HTTP response. The HTTP 302 response code tells user-agents (including search engines) that the location has temporarily moved.&lt;/li&gt;&lt;/ul&gt; |  |
|**url** | **String** | Forwards http(s) traffic to this destination url (ex. http://www.somedomain.com/) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MASKED | &quot;MASKED&quot; |
| REDIRECT_PERMANENT | &quot;REDIRECT_PERMANENT&quot; |
| REDIRECT_TEMPORARY | &quot;REDIRECT_TEMPORARY&quot; |



