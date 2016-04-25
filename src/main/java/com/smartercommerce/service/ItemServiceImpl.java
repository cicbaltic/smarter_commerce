package com.smartercommerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartercommerce.dao.ItemDao;
import com.smartercommerce.pojo.Item;

@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemDao dao;
	
	public Item findById(int id){
		return dao.findById(id);
		
	}
	public void saveItem(Item item) {
		dao.saveItem(item);
	}
	public void deleteItemById(int id){
		dao.deleteItemById(id);
	}
	public List<Item> findAllItems(){
		return dao.findAllItems();
	}
	public List<Item> findItemsByCategory(String category){
		return dao.findItemByCategory(category);
	}
	
	
	
	
}
