package com.test.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.test.springmvc.beans.Student;
import com.test.springmvc.service.StudentService;

@Controller
@ResponseBody
@SessionAttributes({ "stdname", "rollno" })
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/addstudent")
	public ModelAndView addStudent(@RequestParam String name, @RequestParam(name = "rollno") String rollno)
			throws Exception {

		// String name = request.getParameter("name");
		// String rollno = request.getParameter("rollno");

		System.out.println("name :" + name + " rollno " + rollno);

		studentService.addStudent(name, rollno);

		// We must add objectes into modelAndView in order get it added in
		// @SessionAttributes
		// Otherwise it will not get added in current session

		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		mav.addObject("msg", "Successfully added student");
		mav.addObject("stdname", name);
		mav.addObject("rollno", rollno);
		return mav;
	}

	@RequestMapping("/search/{rollno}")
	public ModelAndView testPathVariable(@PathVariable(name = "rollno") String rollno) throws Exception {
		System.out.println("Roll No is : " + rollno);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		mav.addObject("msg", "Read roll no with @Pathvariable ");
		mav.addObject("rollno", rollno);
		return mav;

	}

	@RequestMapping("/getstudent/{rollno}")
	public String getStudent(@PathVariable(name = "rollno") Integer rollno) throws Exception {
		System.out.println("Roll No is : " + rollno);

		Student student = new Student(rollno, "Sam", "Abc");

		return student.toString();

	}

}
