package com.rev.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rev.course.model.Course;
import com.rev.course.service.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/savecourse")
	public Course saveuser(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	
	@GetMapping("/getcourse/{id}")
	public Course getbyid(@PathVariable long id) {
		return courseService.getcoursebyid(id);
	}

}
