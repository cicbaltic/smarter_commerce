package com.test.smartercommerce.service;

import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.smartercommerce.dao.UserDao;
import com.smartercommerce.pojo.User;
import com.smartercommerce.service.UserServiceImpl;

import junit.framework.Assert;

public class UserServiceImplTest {
	@Mock
    UserDao dao;
     
    @InjectMocks
    UserServiceImpl userService;
     
    @Spy
    List<User> users = new ArrayList<User>();
     
    @BeforeClass
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        users = getUserList();
    }
    @Test
    public void findAllUsers(){
        when(dao.findAllUsers()).thenReturn(users);
        Assert.assertEquals(userService.findAllUsers(), users);
    }
    
    public List<User> getUserList(){
        User user1 = new User();
        user1.setId(1);
        user1.setName("Axel");
        user1.setJoiningDate(new LocalDate());
        user1.setSalary(new BigDecimal(10000));
        user1.setSsn("XXX111");
         
        User user2 = new User();
        user2.setId(2);
        user2.setName("Jeremy");
        user2.setJoiningDate(new LocalDate());
        user2.setSalary(new BigDecimal(20000));
        user2.setSsn("XXX222");
         
        users.add(user1);
        users.add(user2);
        return users;
    }

}
