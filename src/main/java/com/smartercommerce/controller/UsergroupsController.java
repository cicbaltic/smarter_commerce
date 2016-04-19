package com.smartercommerce.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.smartercommerce.pojo.Usergroups;

@SessionAttributes("usergroups")
@Controller
public class UsergroupsController {

	@RequestMapping(value="/usergroups", method=RequestMethod.GET)
	public String displayUsergroups(Model model){
		Usergroups usergroups = new Usergroups();
		model.addAttribute("usergroups", usergroups);
		
		return "usergroups";
		
	}
	
	@RequestMapping(value="/usergroups", method=RequestMethod.POST)
	public String processUsergroups(@Valid Usergroups usergroups, BindingResult result, Model m){
		System.out.println(usergroups);
		
		if (result.hasErrors()){
			return "usergroups";
		}
		return "redirect:welcom";
	}
}
