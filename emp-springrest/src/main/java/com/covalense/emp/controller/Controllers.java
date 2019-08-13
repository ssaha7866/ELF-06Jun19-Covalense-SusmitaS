package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import com.covalense.emp.dto.EmployeeInfoBean;




@RestController
@RequestMapping("/login")
/*
 * spring mvc: controller
 */
public class Controllers {
	
	
    @Autowired
    @Qualifier("hibernate")
    EmployeeDAO dao;

    
    // avoiding the Bind exception for date value
    @InitBinder
    public void initBinder(WebDataBinder binder) {
            CustomDateEditor dateFormat = new CustomDateEditor(new
SimpleDateFormat("yyyy-MM-dd"), true);

            binder.registerCustomEditor(Date.class, dateFormat);
    }
    
    
    
    @PostMapping("/createEmployee")
    public boolean createEmployee(@RequestBody
EmployeeInfoBean empinfoBean) {

            return dao.createEmployeeInfo(empinfoBean);
    }

    @PutMapping("/updateEmployee")
    public boolean updateEmployee(EmployeeInfoBean empinfoBean) {
            return dao.updateEmployeeInfo(empinfoBean);
    }
    

    @DeleteMapping("/deleteEmployee")
    public boolean deleteEmployee(@RequestParam("id") int id) {
            return dao.deleteEmployeeInfo(id);
    }

    
    @GetMapping(path="/getEmployee", produces = {MediaType.APPLICATION_JSON_VALUE})
    public EmployeeInfoBean getEmployee(@RequestParam("id") int id) {
            return dao.getEmployeeinfo(id);
    }
    
    
    @GetMapping(path="/getAllEmployee", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<EmployeeInfoBean> getAllEmployee() {
            return dao.getAllEmployeeInfo();
    }



}
