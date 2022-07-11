package com.revature.springdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.springdemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	 List<User> findByName(String name);

	List<User> findByAddress(String address);
	
	
	@Query("select u from User u where u.name=:username")
	List<User> findUserByQuery(@Param("username") String name);

}
