package com.myProject.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myProject.sms.entity.Student;
import com.myProject.sms.repository.StudentRepository;

@SpringBootApplication
public class DataManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DataManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Nithish", "Reddy", "nithish@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Chenchu", "Reddy", "reddy@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("spring", "boot", "spring@gmail.com");
//		studentRepository.save(student3);
	}

}
