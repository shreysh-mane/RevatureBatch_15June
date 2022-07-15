package com.revature.course.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.course.dto.CourseRepoInterface;
import com.revature.course.model.Course;


@Service
@Transactional
public class CourseService {

	
	@Autowired
	private CourseRepoInterface corepoin;
	
	public Course saveco(Course co) {
		return corepoin.save(co);
	}

	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return corepoin.findAll();
	}

	public Course getcobyid(long id) {
		// TODO Auto-generated method stub
	   Optional<Course> c =corepoin.findById(id);
	   
	   return c.get();
	}
}
