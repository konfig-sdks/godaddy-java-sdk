package com.konfigthis.client;

import com.konfigthis.client.api.ActionsApi;
import com.konfigthis.client.api.DomainsApi;
import com.konfigthis.client.api.NotificationsApi;
import com.konfigthis.client.api.V1Api;

public class GoDaddy {
    private ApiClient apiClient;
    public final ActionsApi actions;
    public final DomainsApi domains;
    public final NotificationsApi notifications;
    public final V1Api v1;

    public GoDaddy() {
        this(null);
    }

    public GoDaddy(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.actions = new ActionsApi(this.apiClient);
        this.domains = new DomainsApi(this.apiClient);
        this.notifications = new NotificationsApi(this.apiClient);
        this.v1 = new V1Api(this.apiClient);
    }

}
