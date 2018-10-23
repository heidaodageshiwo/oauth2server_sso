package com.sdcncsi.oauth2server.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties(prefix = "newbasegrid.security.oauth2")
public class OAuth2Properties {

    private String jwtSigningKey = "newbasegrid";

    private OAuth2ClientProperties[] clients = {};
}
