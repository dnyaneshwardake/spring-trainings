package com.test.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.springmvc.beans.Student;
import com.test.springmvc.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	/// When we want add some generic meesages in model and view we can add here ,
	/// it will refered in ModelAndView
	@ModelAttribute
	public void testModelAttribute(Model model) {
		model.addAttribute("headermesssage", "Spring MVC Sessions DAO-BDS");
		model.addAttribute("testmsg", "Test Message");
	}

	// When we dont want to bind particular form fields to MAV do it by below method
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] { "rollno"});
		
	}

	@RequestMapping("/addstudent")
	public ModelAndView addStudent(@ModelAttribute("std") Student student, BindingResult result) throws Exception {

		if (result.hasErrors()) {
			System.out.println("Having errors in binding");
			ModelAndView m = new ModelAndView();
			m.setViewName("index");
			return m;
		}

		System.out.println(student);

		Integer value = studentService.addStudent(student);

		ModelAndView mav = new ModelAndView();
		if (value > 0) {
			mav.setViewName("success");
			mav.addObject("msg", "Successfully added student");
		} else {
			mav.setViewName("success");
			mav.addObject("msg", "Failed to add student");
		}
		return mav;
	}

	@RequestMapping("/updatestudent")
	public ModelAndView updateStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Integer id = Integer.valueOf(request.getParameter("id"));
		String name = request.getParameter("name");
		String rollno = request.getParameter("rollno");
		String city = request.getParameter("city");

		Student student = new Student(id, name, rollno, city);
		System.out.println(student);

		Boolean result = studentService.updateStudent(student);

		ModelAndView mav = new ModelAndView();
		if (result) {
			mav.setViewName("success");
			mav.addObject("msg", "Successfully updated student");
		} else {
			mav.setViewName("success");
			mav.addObject("msg", "Failed to update student");
		}
		return mav;
	}

	@RequestMapping("/deletestudent")
	public ModelAndView deleteStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Student s = new Student(id, "", "", "");
		Boolean result = studentService.deleteStudent(s);

		ModelAndView mav = new ModelAndView();
		if (result) {
			mav.setViewName("success");
			mav.addObject("msg", "Successfully deleted student");
		} else {
			mav.setViewName("success");
			mav.addObject("msg", "Failed to delete Student..");
		}
		return mav;
	}

	@RequestMapping("/findstudent")
	public ModelAndView findStudentById(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Integer id = Integer.valueOf(request.getParameter("id"));

		Student student = studentService.getStudentById(id);

		ModelAndView mav = new ModelAndView();
		if (student != null) {
			mav.setViewName("success");
			mav.addObject("msg", "Successfully fetched student");
			mav.addObject("std", student);
		} else {
			mav.setViewName("success");
			mav.addObject("msg", "Student not found..");
		}
		return mav;
	}

	@RequestMapping("/findallstudents")
	public ModelAndView findAllStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Student> students = studentService.getAllStudents();

		ModelAndView mav = new ModelAndView();

		if (students != null && students.size() > 0) {
			mav.setViewName("success");
			mav.addObject("msg", "Successfully fetched students");
			mav.addObject("std", students);
		} else {
			mav.setViewName("success");
			mav.addObject("msg", "Students not found..");
		}
		return mav;
	}

}
