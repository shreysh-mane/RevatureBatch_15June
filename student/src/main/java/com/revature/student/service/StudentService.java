package com.revature.student.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.student.dao.StudentRepoInterface;
import com.revature.student.model.Student;

@Service
@Transactional
public class StudentService {

	
	@Autowired
	private StudentRepoInterface strepoin;
	
	public Student savest(Student student) {
		
		return strepoin.save(student);
		
		
		
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return strepoin.findAll();
	}

	public Student getstid(long id) {
			Optional<Student> s	=strepoin.findById(id);
			
			return s.get();
	}
}
