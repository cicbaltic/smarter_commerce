package com.smartercommerce.dao;

import java.util.List;

import com.smartercommerce.pojo.User;

public interface UserDao {

	User findById(int id);
	 
    void saveUser(User user);
     
    void deleteUserBySsn(String ssn);
     
    List<User> findAllUsers();
    User findUserBySsn(String ssn);
}
