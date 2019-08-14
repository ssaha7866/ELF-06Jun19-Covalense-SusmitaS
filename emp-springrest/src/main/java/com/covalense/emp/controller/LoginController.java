package com.covalense.emp.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.emp.commons.EMPConstant;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dto.ControllersResponse;
import com.covalense.emp.dto.EmployeeInfoBean;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	@Qualifier(EMPConstant.DBINTERACTIONTYPE)
	private EmployeeDAO dao;
	ControllersResponse response;

	@PostMapping(value = "/loginform", produces = MediaType.APPLICATION_JSON_VALUE)
	public ControllersResponse login(int id, String password, HttpServletRequest request) {
		EmployeeInfoBean bean = dao.getEmployeeinfo(id);
		response = new ControllersResponse();
		if (bean != null || bean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMessage("Successfully Logged In");
			response.setBeans(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);

		} else {
			response.setStatusCode(404);
			response.setMessage("Could not log in");
			response.setDescription("Invalid login credentials");
		}
		return response;
	}

	@GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public ControllersResponse logout(HttpSession session) {
		session.invalidate();
		response = new ControllersResponse();
		response.setStatusCode(201);
		response.setMessage("Successfully Logged Out");
		return response;
	}

	@GetMapping(value = "/readcookie", produces = MediaType.APPLICATION_JSON_VALUE)
	public ControllersResponse readCookie(@CookieValue(name = "JSESSIONID") String sessionId) {
		response = new ControllersResponse();
		response = new ControllersResponse();
		response.setStatusCode(201);
		response.setMessage("Successfully created cookie");
		response.setDescription("JSESSIONID"+sessionId);
		return response;
	}
	
	
	
}
