package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("/getMessage")
	public ModelAndView getMessage() {
		
		ModelAndView modelAndView =new ModelAndView();
		//modelAndView.setViewName("../WEB-INF/views/messagePage.jsp");
		modelAndView.setViewName("messagePage");
		
		return modelAndView;
	}
	@GetMapping("/seeMessage")
	public ModelAndView getMessage(ModelAndView modelAndView) {
		//modelAndView.setViewName("../WEB-INF/views/messagePage.jsp");
		modelAndView.setViewName("messagePage");
		return modelAndView;
	}

}
