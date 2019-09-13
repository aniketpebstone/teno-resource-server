package com.pebstone.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pebstone.model.TenoUserDetails;
		
@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class TenoRestController {
	
     @PreAuthorize("hasAnyAuthority('TENO_ADMIN') and #oauth2.hasScope('webclient')")
//     @PreAuthorize("hasAnyAuthority('ADMIN')")
	 @GetMapping({ "/oauth2/password" })
     public Object healthCheckOauth2(OAuth2Authentication oauth) {    	 
    	 Object principal=oauth.getPrincipal();
    	 
    	 if(principal instanceof TenoUserDetails)
    	 {
    		 System.err.println("Its a TenoUserDetails");
    		 TenoUserDetails TenoUserDetails=(TenoUserDetails)principal;
    		 return TenoUserDetails.getUser();
    	 }
    	 System.err.println("Its not a TenoUserDetails"); 
         return principal;
    }
	
}
