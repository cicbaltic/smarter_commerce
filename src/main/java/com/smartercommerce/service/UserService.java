package com.smartercommerce.service;

import java.util.List;

import com.smartercommerce.pojo.User;

public interface UserService {
	User findById(int id);
    
    void saveUser(User user);
     
    void updateUser(User user);
     
    void deleteUserBySsn(String ssn);
 
    List<User> findAllUsers(); 
     
    User findUserBySsn(String ssn);
 
    boolean isUserSsnUnique(Integer id, String ssn);
}
