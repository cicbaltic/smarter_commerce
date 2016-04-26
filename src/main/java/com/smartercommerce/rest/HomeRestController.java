package com.smartercommerce.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smartercommerce.pojo.Item;
import com.smartercommerce.service.ItemService;

@RestController
public class HomeRestController {
	
	@Autowired
	ItemService itemService;

	@RequestMapping(value = {"/{category}+rest"},  method=RequestMethod.GET)
	public List<Item> showCategoryItems(@PathVariable String category){
		List<Item> items = itemService.findItemsByCategory(category);
		return items;
	}
	@RequestMapping(value = {"/+rest/{id}"},  method=RequestMethod.GET)
	public Item showItem(@PathVariable int id){
		Item item = itemService.findById(id);
		return item;
	}
	
	
}
