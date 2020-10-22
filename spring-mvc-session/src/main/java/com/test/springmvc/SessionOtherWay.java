package com.test.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.springmvc.service.StudentService;

@Controller
public class SessionOtherWay {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/add")
	public ModelAndView addStudent(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		String rollno = request.getParameter("rollno");

		System.out.println("name :" + name + " rollno " + rollno);
		
		studentService.addStudent(name, rollno);
		
		session.setAttribute("stdname", name);
		session.setAttribute("rollno", rollno);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		mav.addObject("msg", "Successfully added student");
		//mav.addObject("stdname", name);
		//mav.addObject("rollno", rollno);
		return mav;
	}
}
