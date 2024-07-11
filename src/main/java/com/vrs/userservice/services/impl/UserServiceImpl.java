package com.vrs.userservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrs.userservice.entities.User;
import com.vrs.userservice.exceptions.ResourceNotFoundException;
import com.vrs.userservice.repositories.UserRepository;
import com.vrs.userservice.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		String uuid = UUID.randomUUID().toString();
		user.setUserId(uuid);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(String userId) {
		return userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User with given ID not prsent ! : " + userId));
	}

}
