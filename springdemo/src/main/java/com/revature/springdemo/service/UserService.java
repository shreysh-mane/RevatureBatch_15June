package com.revature.springdemo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.springdemo.dao.UserRepository;
import com.revature.springdemo.model.User;

@Service
@Transactional
public class UserService implements UserServiceInterface {
	
	@Autowired
	private UserRepository userRepository;
	
	public void saveUseService(User user) {
			userRepository.save(user);
	}
}
