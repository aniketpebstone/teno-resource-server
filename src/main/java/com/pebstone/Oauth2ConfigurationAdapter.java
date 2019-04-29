package com.pebstone;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.stereotype.Component;


@Order(1)
@Component
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Oauth2ConfigurationAdapter extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()               
       // .antMatchers(HttpMethod.GET,"/oauth2/password").access("#oauth2.hasScope('webclient')")
        .anyRequest().authenticated()
        .and()
        .csrf().disable();
        } 
    
  /*  @Bean
    public PrincipalExtractor getPrincipalExtractor() {
        return new TenoUserEntityExtractor();
    }*/
    
    @Bean
    public RemoteTokenServices LocalTokenService() {
        final RemoteTokenServices tokenService = new RemoteTokenServices();
        tokenService.setCheckTokenEndpointUrl("http://localhost:8901/auth/oauth/check_token");
        tokenService.setClientId("springsecurity");
        tokenService.setClientSecret("Teno2019");
        return tokenService;
    }
}
