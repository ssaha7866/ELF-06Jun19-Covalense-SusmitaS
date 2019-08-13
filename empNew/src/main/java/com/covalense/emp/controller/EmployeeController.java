package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@Controller
@RequestMapping("/employee")
/*
 * spring mvc: Dispatcher servlet
 */
public class EmployeeController {
	
	 /* ===========Change String to Date=========== */
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		CustomDateEditor editor=new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

        /* ===========loginPage(controller)=========== */

        @GetMapping("/login")
        public String getLoginForm() {

                return "login";
        }

        @PostMapping("/submitForm")
        public String authenticate(int empId, String password, ModelMap map) {
                EmployeeDAO dao = EmployeeDAOFactory.getInstance();
                EmployeeInfoBean bean = dao.getEmployeeinfo(empId);

                // login validation
                if (bean != null & empId == bean.getEmployeeId() &&
password.equals(bean.getPassword())) {

                        map.addAttribute("bean", bean);

                        return "home";

                } else {
                        map.addAttribute("errPswMsg", "Invalid User name or Password");
                        // forwarding the request to login page with error message
                        return "login";

                } // end of else
        }// end of authenticate

        // getRegisterpage
        @GetMapping("/getRegisterPage")
        public String getRegisterPage() {

                return "empRegister";

        }

        // submitRegisterData
        @PostMapping("/submitRegisterData")
        public String submitRegisterData(EmployeeInfoBean empinfoBean, ModelMap map) {

                // creating the hibernate Instance
                EmployeeDAO dao = EmployeeDAOFactory.getInstance();
                if (dao.createEmployeeInfo(empinfoBean)) {
                        map.addAttribute("errPswMsg", "Registration Finished Successfully");
                        return "login";
                } else {
                        map.addAttribute("errPswMsg", " Registration Failed ,Try again");
                        return "login";
                }//end of else
        }//end

}