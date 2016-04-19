package com.smartercommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartercommerce.pojo.User;

@RestController
public class UsersReportController {

	@RequestMapping("/users")
	public List<User> getUsers() {
		
		List<User> users = new ArrayList<>();
		
		User user1 = new User();
		user1.set_name("Bandymas");
		users.add(user1);
		
		User user2 = new User();
		user2.set_name("Angular");
		users.add(user2);
		
		return users;
	}
}
