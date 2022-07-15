package com.revature.course.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.course.model.Course;

public interface CourseRepoInterface extends JpaRepository<Course, Long>{

}
