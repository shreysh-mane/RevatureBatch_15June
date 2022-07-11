package com.revature.springdemo.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<User> getAllUser() {
		List<User> userlist=userRepository.findAll();
		for(User u: userlist) {
			System.out.println(u.getName());
		}
		return userlist;
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		Optional<User> useroptional=userRepository.findById(id);
		if(useroptional.isPresent()) {
			User u=useroptional.get();
			System.out.println(u.getName());
			return u;
		}
		
		
		return null;
	}

	@Override
	public void findUserByName(String name) {
		// TODO Auto-generated method stub
		List<User> uslist=userRepository.findByName(name);
		for(User user:uslist) {
			System.out.println(user.getName());
			System.out.println(user.getUid());
		}
	}

	@Override
	public void findUserByAddress(String address) {
		// TODO Auto-generated method stub
		List<User> uslist=userRepository.findByAddress(address);
		for(User user:uslist) {
			System.out.println(user.getName());
			System.out.println(user.getUid());
		}
	}

	@Override
	public void fingUserByQuery(String name) {
		// TODO Auto-generated method stub
		
		List<User> uslist=userRepository.findUserByQuery(name);
		for(User user:uslist) {
			System.out.println(user.getName());
			System.out.println(user.getUid());
		}
	}
	
	
	
}
