package com.pebstone.controller;

import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.stereotype.Component;

//@Component
public class TenoUserEntityExtractor implements PrincipalExtractor {

  @Override
  public Object extractPrincipal(Map<String, Object> map) {
	  System.out.println("=========================================================================Map:"+map);
	 return map.get("user");
  }
}
