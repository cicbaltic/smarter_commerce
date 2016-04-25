package com.smartercommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.smartercommerce.pojo.User;

@Controller
@SessionAttributes("user")
public class TestController {

	@RequestMapping(value="/user", method = RequestMethod.GET)
	public String displayUserGroup(Model model){
		User user = new User();
		user.setName("JAva User Group");
		
		model.addAttribute("user", user);
		return "user";
	}
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
	public String processUser(@ModelAttribute("user") User user){
		System.out.println(user.toString());
		
		return "redirect:welcom";
		
	}
}
