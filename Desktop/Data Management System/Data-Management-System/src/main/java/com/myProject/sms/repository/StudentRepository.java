package com.myProject.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
