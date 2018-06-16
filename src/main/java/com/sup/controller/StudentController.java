package com.sup.controller;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sup.service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/saveStduentGet")
	public void saveStudentRecord(ServletRequest req, ServletResponse resp) {
		System.out.println("Saving student record...");
	}
	@RequestMapping(value="/getStudentById", method=RequestMethod.GET)
	public ModelAndView getStudentById(ServletRequest req, ServletResponse resp) {
		System.out.println("In controller..");
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println("Studnet id is::"+id);
		String studentRoll = studentService.getStudentById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student-details");
		mv.addObject("studentRoll", studentRoll);
		System.out.println("Controller::"+studentRoll);
		return mv;
	}
}
