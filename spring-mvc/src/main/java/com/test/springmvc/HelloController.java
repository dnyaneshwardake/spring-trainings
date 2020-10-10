package com.test.springmvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Inside HelloController..");
		return "welcome"; // if we don't wana use view resolver , we can pass view page name as
							// welcome.jsp
							// (fill name with extention)
	}

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int number1 = Integer.parseInt(request.getParameter("n1"));
		int number2 = Integer.parseInt(request.getParameter("n2"));
		int addition = number1 + number2;
		System.out.println(addition);
		/*
		 * ModelAndView mav = new ModelAndView(); mav.setViewName("displayadd");
		 * mav.addObject("result", addition);
		 */
		Map map = new HashMap();
		map.put("result", addition);
		return new ModelAndView("displayadd.jsp", map);
		// return mav;
	}
}
