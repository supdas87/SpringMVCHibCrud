package com.sup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sup.model.Student;
import com.sup.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/saveStduentGet")
	public void saveStudentRecord(Student student) {
		System.out.println("Saving student record...");
		studentService.saveStudent(student);
	}

}
