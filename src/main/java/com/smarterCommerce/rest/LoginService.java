package com.smarterCommerce.rest;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String name, String password){
		
		return name.equalsIgnoreCase("Liudas") &&
				password.equals("psw");
	}
}
