package com.covalense.empmvc.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.empmvc.dto.UserBean;

@Controller
@RequestMapping("/form")
public class FormHandlingController {

	@GetMapping("/getForm")
	public String getForm() {
		return "myForm";
	}

	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest request) {

		int userid = Integer.parseInt(request.getParameter("userId"));
		String password = request.getParameter("password");

		request.setAttribute("userId", userid);
		request.setAttribute("password", password);
		return "formDataDisplay";
	}

	@PostMapping("/formSubmit2")
	public String submitForm(int userid, String password, ModelMap modelMap) {

		modelMap.addAttribute("userId", userid);
		modelMap.addAttribute("password", password);
		return "formDataDisplay";
	}
	@PostMapping("/formSubmit3")
	public String submitForm(UserBean userBean, ModelMap modelMap) {

		modelMap.addAttribute("userBean", userBean);
		return "formDataBeanDisplay";
	}
	
	@PostMapping("/formSubmit4")
	public String submitForm4(@RequestParam(name="userId") int userid,
			@RequestParam(name="password")String password, ModelMap modelMap) {

		modelMap.addAttribute("userId", userid);
		modelMap.addAttribute("password", password);
		return "formDataDisplay";
	}
	
	@PostMapping("/formSubmit5")
	public String submitForm5(@RequestParam(name="userId") int userid,
			@RequestParam(name="password")String password, ModelMap modelMap) {

		modelMap.addAttribute("userId", userid);
		modelMap.addAttribute("password", password);
		return "formDataDisplayEL";
	}
	
	@PostMapping("/formSubmit6")
	public String submitForm6(UserBean userBean, ModelMap modelMap) {

		modelMap.addAttribute("userBean", userBean);
		return "formDataDisplayEL";
	}
}
