package com.sdcncsi.oauth2server.properties;

import lombok.Data;


@Data
public class OAuth2ClientProperties {

    private String clientId;

    private String clientSecret;

    private String clientUrl;

    private Integer accessTokenValiditySeconds = 7200;
}
