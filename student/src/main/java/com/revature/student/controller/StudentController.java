package com.revature.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.student.model.Course;
import com.revature.student.model.Student;
import com.revature.student.model.StwithCourse;
import com.revature.student.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;

	
	@PostMapping("/savestudent")
	public Student saveSt(@RequestBody Student student) {
		return studentService.savest(student);
	}
	
	
	@GetMapping("/getallstudents")
	public List<Student> saveSt(){
		return studentService.getAllStudents();
	}
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getstudentid/{id}")
	public StwithCourse getSById(@PathVariable long id) {
		Student s=studentService.getstid(id);
		long cid=s.getCid();
		
		Course co=restTemplate.getForObject("http://localhost:9002/course/api/course/getcoursebyid/"+cid, Course.class);
		
		StwithCourse stwc=new StwithCourse();
		stwc.setStname(s.getStname());
		stwc.setCoursename(co.getCouresName());
		
		return stwc;
		
		
		
	}
}
