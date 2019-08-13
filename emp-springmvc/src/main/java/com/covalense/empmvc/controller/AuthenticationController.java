package com.covalense.empmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.empmvc.dao.EmployeeDAO;
import com.covalense.empmvc.dao.EmployeeDAOFactory;
import com.covalense.empmvc.dto.EmployeeInfoBean;

@PropertySource("classpath:emp.properties")
@Controller
@RequestMapping("/login")
public class AuthenticationController {

	
	 /*================================accessing logIn form=====================================*/
	 
	@GetMapping("/getLoginForm")
	public String getForm() {
		return "loginPage";
	}// end of getForm()

	
	 /*===================Authenticating the credentials using session object========================*/
	

	@PostMapping("/authentication")
	public String authentication(int employeeId, String password, ModelMap modelMap, 
			HttpServletRequest req, @Value("${dbInteractionType}") String dbInteractionType) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInteractionType );
		EmployeeInfoBean bean = dao.getEmployeeinfo(employeeId);
		String msg = "";
		if (bean == null || password.equals(bean.getPassword())) {
			HttpSession session = req.getSession(true);
			msg = "Successful Logged In!!";
			modelMap.addAttribute("bean", bean);
			return "home";
		} else {
			msg = "Opps!!!!UserName or password is incorrect!!";
			modelMap.addAttribute("msg", msg);
			return "Login";
		}
	}// end of authentication()

	
	/*=====================validation code for each and every hyper link clicked==========================*/
	 

// validating get methods
	@GetMapping("/validate/{url}")
	public String validateGetSession(HttpServletRequest request, ModelMap map, @PathVariable("url") String url) {
		if (request.getSession(false) == null) {
			map.addAttribute("msg", "Please login first");
			return "login";
		}
		return "forward:/login/" + url;
	}// end of validateGetSession()

// validating post methods
	@PostMapping("/validate/{url}")
	public String validatePostSession(HttpServletRequest request, ModelMap map, @PathVariable("url") String url) {
		return validateGetSession(request, map, url);
	}// end of validatePostSession()
	

	/*============================creating search controller==============================*/
	
	@GetMapping("/search")
	public String getSearch(HttpServletRequest request, ModelMap map, @RequestParam String employeeId, @Value("${dbInteractionType}") String dbInteractionType) {
		try {
			EmployeeDAO dao=EmployeeDAOFactory.getInstance(dbInteractionType);
			EmployeeInfoBean bean=dao.getEmployeeinfo(employeeId);
			map.addAttribute("bean", bean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "homePage";
	}//end of getSearch1
}
