package com.revature.springdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.springdemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
