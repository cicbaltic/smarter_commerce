package com.smartercommerce.dao;

import java.util.List;

import com.smartercommerce.pojo.Item;
import com.smartercommerce.pojo.User;

public interface ItemDao {

	Item findById(int id);
	 
    void saveItem(Item item);
     
    void deleteItemById(int id);
     
    List<Item> findAllItems();
    List<Item> findItemByCategory(String category);

}
