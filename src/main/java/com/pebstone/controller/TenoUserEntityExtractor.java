package com.pebstone.controller;

import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.pebstone.model.TenoUserDetails;
import com.pebstone.model.UserEntity;

@Component
public class TenoUserEntityExtractor implements PrincipalExtractor {

  @Override
  public Object extractPrincipal(Map<String, Object> map) {
	  System.out.println("=========================================================================Map:"+map);
	 UserEntity tenoUser=new UserEntity();
	 List<Map> roles= (List<Map>) map.get("authorities");
	 List<String> scope= (List<String>) map.get("scope");
	 System.out.println("Roles:"+roles.get(0).get("authority"));
	 System.out.println("Scope:"+scope.get(0));
	 String userName=(String) map.get("user_name");
	 String email=(String) map.get("email");
	 String phone=(String) map.get("phone");
	 System.out.println("UserName:"+userName);
	 tenoUser.setId(Integer.parseInt(userName));
	 tenoUser.setRole(roles.get(0).get("authority").toString());
	 tenoUser.setEmail(email);
	 tenoUser.setPhone(phone);
	 TenoUserDetails userDetails=new TenoUserDetails(tenoUser);
	 userDetails.setScope(scope.get(0));	 
	 return userDetails;	
  } 
}
