package com.pebstone.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pebstone.service.CustomerService;

@RestController
public class TenoRestController {

	
	
	 @GetMapping({ "/token" })
	 public Object healthCheckToken() {
		 return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
	
	 @GetMapping({ "/oauth2/client_credentials" })
     public Object healthCheckOauth2ClientCredentials() {
         return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
	 @GetMapping({ "/oauth2/password" })
     public Object healthCheckOauth2() {
         return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
	 @GetMapping({ "/oauth2/redirect" })
     public Object oauth2Redirect(@RequestParam String code) {
         return "code:"+code;
    }
	 
	@GetMapping({ "/jwt" })
     public Object healthCheckJWT() {
         return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }	 
}
