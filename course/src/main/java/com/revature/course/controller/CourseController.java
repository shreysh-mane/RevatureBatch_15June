package com.revature.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.course.model.Course;
import com.revature.course.service.CourseService;


@RestController
@RequestMapping("/api/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	
	@PostMapping("/savecourse")
	public Course saveSt(@RequestBody Course co) {
		return courseService.saveco(co);
	}
	
	
	@GetMapping("/getallcourse")
	public List<Course> getCo(){
		return courseService.getAllCourses();
	}
	
	@GetMapping("/getcoursebyid/{id}")
	public Course getcobyid(@PathVariable long id) {
		
		return courseService.getcobyid(id);
	}
	

}
