package com.revature.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.student.model.Student;

@Repository
public interface StudentRepoInterface extends JpaRepository<Student, Long>{

}
