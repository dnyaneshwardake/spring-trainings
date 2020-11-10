package com.test.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.springmvc.beans.Student;

@Controller
public class StudentController {

	@RequestMapping("/addstudent")
	public ModelAndView addStudent(@Valid @ModelAttribute("std") Student student, BindingResult result)
			throws Exception {
		System.out.println(student);
		if (result.hasErrors()) {
			System.out.println("Having errors in binding");
			ModelAndView m = new ModelAndView();
			m.setViewName("index");
			return m;
		}

		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		mav.addObject("msg", "Successfully added student");

		return mav;

	}

	@RequestMapping("/testapp")
	public ModelAndView testapp() throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		mav.addObject("msg", "Successfully tested app");

		return mav;

	}

}
