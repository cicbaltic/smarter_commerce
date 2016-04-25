package com.smartercommerce.dao;

import java.util.List;

import com.smartercommerce.pojo.Order;

public interface OrderDao {
	
	List<Order> findAllOrders();

}
