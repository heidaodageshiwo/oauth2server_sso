package com.sdcncsi.client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class Client1Application {

	public static void main(String[] args) {
		SpringApplication.run(Client1Application.class, args);
	}
	@Autowired
	OAuth2RestTemplate oAuth2RestTemplate;

	@GetMapping("/user")
	public Authentication user(Authentication user) {
		return user;
	}

	@Value("${messages.url:http://localhost:8085}/resource/api")
	String messagesUrl;
	@RequestMapping("/api")
	String home(Model model) {
		String result = oAuth2RestTemplate.getForObject(messagesUrl + "/2", String.class);
		return result;
	}
	@Bean
	OAuth2RestTemplate oAuth2RestTemplate(OAuth2ClientContext oAuth2ClientContext, OAuth2ProtectedResourceDetails details){
		return new OAuth2RestTemplate(details,oAuth2ClientContext);
	}
}
