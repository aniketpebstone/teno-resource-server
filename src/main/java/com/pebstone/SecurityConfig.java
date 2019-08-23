package com.pebstone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;



@Configuration
public class SecurityConfig{
	
    
    /*@Bean
    public RemoteTokenServices LocalTokenService() {
        final RemoteTokenServices tokenService = new RemoteTokenServices();
        tokenService.setCheckTokenEndpointUrl("http://localhost:8901/auth/oauth/check_token");
        tokenService.setClientId("springsecurity");
        tokenService.setClientSecret("Teno2019");
        return tokenService;
    }  */
        
	 @Bean
	    public ResourceServerTokenServices remoteTokenServices() {
	        TenoUserInfoService services = new TenoUserInfoService("http://localhost:8901/auth/user","springsecurity");	      
	        return services;
	    }
}
