package com.smartercommerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartercommerce.dao.OrderDao;
import com.smartercommerce.pojo.Order;

@Transactional
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao dao;
	
	public List<Order> findAllOrders() {
		return dao.findAllOrders();
	}
}
