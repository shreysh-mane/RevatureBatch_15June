package com.rev.course.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rev.course.dao.CourseInterface;
import com.rev.course.model.Course;


@Service
@Transactional
public class CourseService {
	
	@Autowired
	private CourseInterface courseInterface;

	public Course saveCourse(Course course) {
		// TODO Auto-generated method stub
		return courseInterface.save(course);
	}

	public Course getcoursebyid(long id) {
		// TODO Auto-generated method stub
		return courseInterface.findById(id).get();
	}

}
