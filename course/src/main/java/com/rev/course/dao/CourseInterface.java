package com.rev.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rev.course.model.Course;

@Repository
public interface CourseInterface extends JpaRepository<Course, Long>{

}
