package com.pebstone.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserEntity {
	
	@Id
	private int id;
	private String password;
	private String phone;
	private String email;
	private String token;
	private String role;
	
	public UserEntity() {
	
	}

	public UserEntity(int id, String password, String phone, String email, String token,String role) {
		super();
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.token = token;
		this.role=role;
	}
	

}
