package com.hms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;
import com.twilio.http.TwilioRestClient;

@Configuration
public class TwilioConfig {
    
	private final String accountSid = "AC52b572d805b10d2183c6f672411358c5";
	private final String authToken = "dc1988601651f9577ac90d611be13eae";

	@Bean
    public TwilioRestClient twilioRestClient() {
        // Initialize Twilio with your account SID and auth token
        Twilio.init(accountSid, authToken);
        return new TwilioRestClient.Builder(accountSid, authToken).build();
    }
}
