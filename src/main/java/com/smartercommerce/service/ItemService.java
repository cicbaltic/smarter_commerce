package com.smartercommerce.service;

import java.util.List;

import com.smartercommerce.pojo.Item;

public interface ItemService {

	Item findById(int id);
	 
    void saveItem(Item item);
     
    void deleteItemById(int id);
     
    List<Item> findAllItems();
    List<Item> findItemsByCategory(String category);
}
