package com.test.smartercommerce.controller;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

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
import com.smartercommerce.pojo.Item;
import com.smartercommerce.pojo.Order;
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
	List<Item> items = new ArrayList<Item>();
	
	@Spy
	ModelMap model;
	
	@Mock
	BindingResult result;
	/*
	@BeforeClass
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		items = homeController.g();
	}*/
	
	/*@Test
	public void listItems(){
        when(service.findAllOrders()).thenReturn(items);
        Assert.assertEquals(homeController.showHomePage(model), "index");
        Assert.assertEquals(model.get("items"), items);
        verify(service, atLeastOnce()).findAllOrders();
    }*/
	

}
