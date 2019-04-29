package com.pebstone.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
		
@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class TenoRestController {
	
     @PreAuthorize("hasAnyAuthority('ADMIN') and #oauth2.hasScope('webclient')")
	 @GetMapping({ "/oauth2/password" })
     public Object healthCheckOauth2(Principal user) {
		 
         return user;
    }
	
}
