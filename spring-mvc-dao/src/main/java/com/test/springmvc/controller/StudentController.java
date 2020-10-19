package com.test.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.springmvc.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/addstudent")
	public ModelAndView addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		String rollno = request.getParameter("rollno");

		System.out.println("name :" + name + " rollno " + rollno);

		studentService.addStudent(name, rollno);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		mav.addObject("msg", "Successfully added student");
		return mav;
	}

}
