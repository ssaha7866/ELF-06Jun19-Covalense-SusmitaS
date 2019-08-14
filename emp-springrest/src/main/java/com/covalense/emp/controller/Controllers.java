package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.zip.CRC32;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dto.ControllersResponse;
import com.covalense.emp.dto.EmployeeInfoBean;




@RestController
@RequestMapping("/employee")
/*
 * spring mvc: controller
 */
public class Controllers {
	
	
    @Autowired
    @Qualifier("hibernate")
    EmployeeDAO dao;
    
    ControllersResponse response;
    
    // avoiding the Bind exception for date value
    @InitBinder
    public void initBinder(WebDataBinder binder) {
            CustomDateEditor dateFormat = new CustomDateEditor(new
SimpleDateFormat("yyyy-MM-dd"), true);

            binder.registerCustomEditor(Date.class, dateFormat);
    }
    
    
    
    @PostMapping(path = "/createEmployee", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ControllersResponse createEmployee(@RequestBody EmployeeInfoBean empinfoBean) {

    	System.out.println(empinfoBean.getEmployeeId());
    	response= new ControllersResponse();
    	
    	if(dao.createEmployeeInfo(empinfoBean)) {
    		response.setStatusCode(201);
    		response.setMessage("Successful");
    	}
    	else {
    		response.setStatusCode(404);
    		response.setMessage("Could not create employee");
    		response.setDescription("Inserting data into database failed");
    	}
    	return response;
           // return dao.createEmployeeInfo(empinfoBean);
    }

    @PutMapping(path = "/updateEmployee", produces = {MediaType.APPLICATION_XML_VALUE})
    public ControllersResponse updateEmployee(@RequestBody EmployeeInfoBean empinfoBean, HttpServletRequest request) {
        
    	response = new ControllersResponse();
    	if(request.getSession(false)!=null) {
    	if(dao.updateEmployeeInfo(empinfoBean)) {
    		response.setStatusCode(201);
    		response.setMessage("Successful");
    	}
    	else {
    		response.setStatusCode(404);
    		response.setMessage("Could not update employee");
    		response.setDescription("Inserting data into database failed");
    	}
    	}else {
    		response.setStatusCode(501);
    		response.setMessage("loggin failed");
    		response.setDescription("Session expired..please log in again");
    	}
    	return response;
    	// return dao.updateEmployeeInfo(empinfoBean);
    }
    

    @DeleteMapping(path = "/deleteEmployee", produces = {MediaType.APPLICATION_XML_VALUE})
    public ControllersResponse deleteEmployee(@RequestParam("id") int id, HttpServletRequest request) {
    	
    	response = new ControllersResponse();
    	if(request.getSession(false)!=null) {
    	if(dao.deleteEmployeeInfo(id)) {
    		response.setStatusCode(201);
    		response.setMessage("Successful");
    	}
    	else {
    		response.setStatusCode(404);
    		response.setMessage("Could not delete employee");
    		response.setDescription("Deleting data from database failed");
    	}
    	}else {
    		response.setStatusCode(501);
    		response.setMessage("loggin failed");
    		response.setDescription("Session expired..please log in again");
    	}
    	return response;
        //    return dao.deleteEmployeeInfo(id);
    }

    
    @GetMapping(path="/getEmployee", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ControllersResponse getEmployee(@RequestParam("id") int id, HttpServletRequest request) {
    	EmployeeInfoBean bean = dao.getEmployeeinfo(id);
    	response = new ControllersResponse();
    	if(request.getSession(false)!=null) {
    	if(bean!=null) {
    		response.setStatusCode(201);
    		response.setMessage("Successful");
    		response.setBeans(Arrays.asList(bean));
    	}
    	else {
    		response.setStatusCode(404);
    		response.setMessage("Could not delete employee");
    		response.setDescription("Deleting data from database failed");
    	}
    	
    	}else {
    		response.setStatusCode(501);
    		response.setMessage("loggin failed");
    		response.setDescription("Session expired..please log in again");
    	}
    	return response;
            //return dao.getEmployeeinfo(id);
    }
    
    
    @GetMapping(path="/getAllEmployee", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ControllersResponse getAllEmployee(HttpServletRequest request) {
    	List<EmployeeInfoBean> bean = dao.getAllEmployeeInfo();
    	response = new ControllersResponse();
    	if(request.getSession(false)!=null) {
    	if(bean!=null) {
    		response.setStatusCode(201);
    		response.setMessage("Successful");
    	}
    	else {
    		response.setStatusCode(404);
    		response.setMessage("Could not delete employee");
    		response.setDescription("Deleting data from database failed");
    	}
    	}else {
    		response.setStatusCode(501);
    		response.setMessage("loggin failed");
    		response.setDescription("Session expired..please log in again");
    		
    	}
    	return response;
            //return dao.getAllEmployeeInfo();
    }



}
