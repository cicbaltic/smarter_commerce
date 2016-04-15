package com.smarterCommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smarterCommerce.rest.LoginService;




@Controller
public class HomeController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String showHomePage(){
		
		return "index";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, String password, ModelMap model){
		
		if (!service.validateUser(name, password)){
			return "index";
		}
		
		model.put("name", name);
		model.put("password", password);
		System.out.println(name);
		return "welcome";
	}
}
