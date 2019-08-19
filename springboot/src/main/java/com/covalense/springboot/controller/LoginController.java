package com.covalense.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class LoginController {

	@Autowired
	EmployeeRepository repository;
	
	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password) {
		
		EmployeeResponse response = new EmployeeResponse();
		if(repository.existsById(id)) {
			EmployeeInfoBean bean = repository.findById(id).get();
			if(password.equals(bean.getPassword())){
				response.setStatusCode(2000);
				response.setMessage("Welcome back");
				response.setDescription("You are successfully logged in");
			}else {
				response.setStatusCode(2001);
				response.setMessage("Invalid password");
				response.setDescription("Password you have entered in incorrect. Please try again");
			}
		}else {
			response.setStatusCode(2001);
			response.setMessage("Invalid id");
			response.setDescription("Account doesnot exist. Please create account before you log In");
		}
		return response;
		
	}
	
	
	
	
	
}
