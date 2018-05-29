package com.sup.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AddController {
	
	@RequestMapping("/addVal")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Add controller....");
		int fNo = Integer.parseInt(req.getParameter("firstNo"));
		int sNo = Integer.parseInt(req.getParameter("secondNo"));
		int result = fNo + sNo;
		System.out.println(result);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		mv.addObject("result", result);
		return mv;
	}

}
