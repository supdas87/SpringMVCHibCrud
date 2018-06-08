package com.sup.controller;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sup.service.StudentService;

@Controller
//@RequestMapping("/SpringMVCHibernateCrud")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/saveStduentGet")
	public void saveStudentRecord(ServletRequest req, ServletResponse resp) {
		System.out.println("Saving student record...");
		//int id = Integer.parseInt(req.getParameter("id"));
		//studentService.saveStudent(student);
		
	}
	//value="/method2", method=RequestMethod.POST
	@RequestMapping(value="/getStudentById", method=RequestMethod.GET)
	//@RequestMapping("/getStudentById")
	public void getStudentById(ServletRequest req, ServletResponse resp) {
		System.out.println("In controller..");
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println("Studnet id is::"+id);
		studentService.getStudentById(id);
		
	}

}
