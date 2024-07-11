package com.vrs.userservice.services;

import java.util.List;

import com.vrs.userservice.entities.User;

public interface UserService {
	
	// user operations
	
	// creatting user
	User saveUser(User user);
	
	
	// get all user
	List<User> getAllUser();
	
	// get single user with specified Id
	User getUserById(String userId);
	
	//delete
	
	// update

}
