package io.pivotal.pcf.haash.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class DashboardClient {

	private final String id = UUID.randomUUID().toString();
	private final String redirectURI = "http://example.com";
	private final String secret = "secret";

	@JsonProperty("redirect_uri")
	public String getRedirectURI() {
		return redirectURI;
	}

	public String getId() {
		return id;
	}

	public String getSecret() {
		return secret;
	}

}
