package com.smartercommerce.service;

import java.util.List;

import com.smartercommerce.pojo.Order;

public interface OrderService {

	List<Order> findAllOrders();
}
