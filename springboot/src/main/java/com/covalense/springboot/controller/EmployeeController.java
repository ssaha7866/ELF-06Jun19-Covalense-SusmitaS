package com.covalense.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeAddInfoBean;
import com.covalense.springboot.dto.EmployeeEducationalInfoBean;
import com.covalense.springboot.dto.EmployeeExperienceInfoBean;
import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeOtherInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello World";
	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {

		bean.getEmployeeOtherInfoBean().setEmployeeInfoBean(bean);
		for (EmployeeAddInfoBean addInfoBean : bean.getEmployeeAddInfoBean()) {
			addInfoBean.getAddressPKBean().setInfoBean(bean);
		}

		for (EmployeeEducationalInfoBean educationalInfoBean : bean.getEducationalInfoBean()) {
			educationalInfoBean.getEducationalPKBean().setInfoBean(bean);
		}

		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBean()) {
			experienceInfoBean.getExperiencePKBean().setInfoBean(bean);
		}

		EmployeeInfoBean manager = bean.getManagerId();
		if (manager != null) {
			manager = repository.findById(manager.getEmployeeId()).get();
			bean.setManagerId(manager);
		}
		//bean.setManagerId(repository.findById(bean.getManagerId().getEmployeeId()).get());

		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(bean.getEmployeeId())) {
			repository.save(bean);
			response.setStatusCode(2000);
			response.setMessage("Successful");
			response.setDescription("Employee Data saved successfully");
		} else {
			response.setStatusCode(2001);
			response.setMessage("Not Successful");
			response.setDescription("Employee Data could not be saved");
		}
		return response;
	}

	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean) {

		bean.getEmployeeOtherInfoBean().setEmployeeInfoBean(bean);
		
		
		for (EmployeeAddInfoBean addInfoBean : bean.getEmployeeAddInfoBean()) {
			addInfoBean.getAddressPKBean().setInfoBean(bean);
		}

		for (EmployeeEducationalInfoBean educationalInfoBean : bean.getEducationalInfoBean()) {
			educationalInfoBean.getEducationalPKBean().setInfoBean(bean);
		}

		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBean()) {
			experienceInfoBean.getExperiencePKBean().setInfoBean(bean);
		}

		EmployeeInfoBean manager = bean.getManagerId();
		if (manager != null) {
			manager = repository.findById(manager.getEmployeeId()).get();
			bean.setManagerId(manager);
		}

		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(bean.getEmployeeId())) {
			bean.getEmployeeOtherInfoBean()
			.setOtherInfoId(repository
								.findByEmployeeId(bean)
								.getOtherInfoId());
			//bean.setManagerId(repository.findById(bean.getManagerId().getEmployeeId()).get());
			repository.save(bean);
			response.setStatusCode(2000);
			response.setMessage("Successful");
			response.setDescription("Employee Data saved successfully");
		} else {
			response.setStatusCode(2001);
			response.setMessage("Not Successful");
			response.setDescription("Employee Data could not be saved");
		}
		return response;
	}

	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(id)) {
			repository.deleteById(id);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee Data deleted successfully");
		} else {
			response.setStatusCode(201);
			response.setMessage("Not Successful");
			response.setDescription("Employee Data does not exist");
		}
		return response;
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(id)) {
			EmployeeInfoBean bean = repository.findById(id).get();
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee Data found");
			response.setBeans(Arrays.asList(bean));
		} else {
			response.setStatusCode(201);
			response.setMessage("Not Successful");
			response.setDescription("Employee Data could not be found");
		}
		return response;
	}
	
	@GetMapping(path = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {
		EmployeeResponse response = new EmployeeResponse();
		Iterable<EmployeeInfoBean> bean =repository.findAll();
			
		return response;
	}
	
	@GetMapping(value ="/getotherinfo",  produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeOtherInfoBean getOtherInfo(int id) {
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setEmployeeId(id);
		return repository.findByEmployeeId(bean);
		
	}

}
