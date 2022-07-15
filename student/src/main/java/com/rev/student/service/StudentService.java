package com.rev.student.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rev.student.dao.StudentRepository;
import com.rev.student.model.Student;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public Student savestudent(Student student) {
		
		return studentRepository.save(student);
	}

	public Student getstudentbyid(long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}
	
	
	
	

}
