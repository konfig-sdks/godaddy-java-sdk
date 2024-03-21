package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "http://api.ote-godaddy.com";
        
        configuration.apiKey  = "YOUR API KEY";
        
        configuration.apiSecret  = "YOUR API KEY";
        GoDaddy client = new GoDaddy(configuration);
        assertNotNull(client);
    }
}
