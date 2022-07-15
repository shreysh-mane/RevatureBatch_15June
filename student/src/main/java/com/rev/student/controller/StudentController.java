package com.rev.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rev.student.model.Course;
import com.rev.student.model.Student;
import com.rev.student.model.StudentwithCourse;
import com.rev.student.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/savestudent")
	public Student savestudent(@RequestBody Student student) {
		return studentService.savestudent(student);
	}
	
	@GetMapping("getstudent/{id}")
	public StudentwithCourse getstudentbyid(@PathVariable long id) {
		Student student=studentService.getstudentbyid(id);
		long cid=student.getCid();
		Course co= restTemplate.getForObject("http://localhost:9002/course/api/course/getcourse/"+cid,Course.class);
		
		StudentwithCourse swc=new StudentwithCourse();
		swc.setStudent(student);
		swc.setCourse(co);
		
		
		return swc;
	}
	

}
