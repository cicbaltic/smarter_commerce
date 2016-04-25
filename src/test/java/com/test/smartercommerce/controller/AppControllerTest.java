package com.test.smartercommerce.controller;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.context.MessageSource;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.smartercommerce.controller.HomeController;
import com.smartercommerce.pojo.Order;
import com.smartercommerce.pojo.User;
import com.smartercommerce.service.OrderService;

import junit.framework.Assert;

public class AppControllerTest {

	@Mock
	OrderService service;
	
	@Mock
	MessageSource message;
	
	@InjectMocks
	HomeController homeController;
	@Spy
	List<Order> orders = new ArrayList<Order>();
	
	@Spy
	ModelMap model;
	
	@Mock
	BindingResult result;
	
	@BeforeClass
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		orders = getOrdersList();
	}
	
	@Test
	public void listItems(){
        when(service.findAllOrders()).thenReturn(orders);
        Assert.assertEquals(homeController.showHomePage(model), "index");
        Assert.assertEquals(model.get("orders"), orders);
        verify(service, atLeastOnce()).findAllOrders();
    }
	
	public List<Order> getOrdersList(){
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
	
}
