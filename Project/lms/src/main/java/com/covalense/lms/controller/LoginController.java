package com.covalense.lms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.UserInfoBean;
import com.covalense.lms.dto.UserResponse;
import com.covalense.lms.repository.UserRepository;

@RestController
public class LoginController {

	@Autowired
	UserRepository repository;
	
	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(int id, String password, HttpServletRequest request) {
		
		UserResponse response = new UserResponse();
		if(repository.existsById(id)) {
		UserInfoBean bean = repository.findById(id).get();
			if(password.equals(bean.getPassword())){
				response.setStatusCode(2000);
				response.setMessage("Welcome back");
				response.setDescription("You are successfully logged in");
				request.getSession(true);
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
