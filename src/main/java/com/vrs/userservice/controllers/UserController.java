package com.vrs.userservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrs.userservice.entities.User;
import com.vrs.userservice.services.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	// create user
	@PostMapping
	public ResponseEntity<User> saveUser (@RequestBody User user){
		User saveUser = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
	}
	
	// get Single user with Id
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable String userId){
		User userById = userService.getUserById(userId);
		return ResponseEntity.ok(userById);
		
	}
	
	// get all user
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUser = userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}
}
