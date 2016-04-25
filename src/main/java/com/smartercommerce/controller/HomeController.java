package com.smartercommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smartercommerce.pojo.Item;
import com.smartercommerce.pojo.Order;
import com.smartercommerce.pojo.User;
import com.smartercommerce.service.ItemService;
import com.smartercommerce.service.OrderService;
import com.smartercommerce.service.UserService;

@Controller
public class HomeController {

	@Autowired
	ItemService itemService;
	@Autowired
	UserService userService;
	@Autowired
	OrderService orderService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String redirectToHomePage() {

		return "redirect:home";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHomePage(ModelMap model) {
		
		List<Item> items = itemService.findAllItems();
		
			model.addAttribute("items", items );
		
		return "index";
	}
	public List<Order> getOrdersList(){
		List<Order> orders = new ArrayList<Order>();
        Order user1 = new Order();
        user1.setId(1);
        user1.setAddress("Axel");
        user1.setItemsQuantity(12);
         
        Order user2 = new Order();
        user2.setId(2);
        user1.setAddress("Axel");
        user1.setItemsQuantity(12);
         
        orders.add(user1);
        orders.add(user2);
        return orders;
	}
	
	 /* @RequestMapping(value="/home", method=RequestMethod.POST)
	  public String handleLoginRequest(@RequestParam String name, String password, ModelMap model){
	
		  if (!service.validateUser(name, password)){
			  return "index";
		  }
	  
		  model.put("name", name); model.put("password", password);
		  System.out.println(name); return "welcome";
		  }*/
	  
	
	
    @RequestMapping(value = { "/{category}" }, method = RequestMethod.GET)
    public String showOnlyCategory(@PathVariable String category, ModelMap model) {
        List<Item> items = itemService.findItemsByCategory(category);
        model.addAttribute("items", items);
        return "index";
    }
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String showAboutPage(){
		
		return "about";
	}
	@RequestMapping(value="/services", method=RequestMethod.GET)
	public String showServicesPage(){
		
		return "services";
	}
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public String showContactPage(){
		
		return "contact";
	}
	
	
	
	  @RequestMapping(value="/privatePage", method=RequestMethod.GET)
	  public String privatePage(){
	  
		  return "privatePage";
		  
	  }
	 

}
