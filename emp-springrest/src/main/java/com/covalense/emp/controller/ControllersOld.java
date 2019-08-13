package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.commons.EMPConstant;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory2;
import com.covalense.emp.dto.EmployeeAddInfoBean;
import com.covalense.emp.dto.EmployeeEducationalInfoBean;
import com.covalense.emp.dto.EmployeeExperienceInfoBean;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;


@PropertySource(EMPConstant.PROP_FILENAME)
@Controller
@RequestMapping("/login")
public class ControllersOld {

	@Autowired
	@Qualifier(EMPConstant.DBINTERACTIONTYPE)
	EmployeeDAO dao;
	
/*================================for changing format of date and time=====================================*/
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
/*================================NEW EMPLOYEE REGISTRATION (create)=====================================*/
	
	
	@GetMapping("/registration")
	public String getRegistrationForm() {
		return EMPConstant.GET_REGISTRATION_PAGE;
	}

	@PostMapping("/registrationForm")
	public String registrationForm(EmployeeInfoBean infoBean, ModelMap modelMap,

			@Value("${registraionFailed}") String registraionFailed,
			@Value("${registraionSuccess}") String registraionSuccess) {

		// setting values of address info bean
		List<EmployeeAddInfoBean> addInfoBeans = infoBean.getEmployeeAddInfoBean();
		for (EmployeeAddInfoBean addInfoBean : addInfoBeans) {
			addInfoBean.getAddressPKBean().setInfoBean(infoBean);
		}

		// setting values of education info bean
		List<EmployeeEducationalInfoBean> educationalInfoBeans = infoBean.getEducationalInfoBean();

		for (EmployeeEducationalInfoBean educationalInfoBean : educationalInfoBeans) {
			educationalInfoBean.getEducationalPKBean().setInfoBean(infoBean);
		}

		// setting values of experience info bean
		List<EmployeeExperienceInfoBean> experienceInfoBeans = infoBean.getExperienceInfoBean();

		for (EmployeeExperienceInfoBean experienceInfoBean : experienceInfoBeans) {
			experienceInfoBean.getExperiencePKBean().setInfoBean(infoBean);
		}
		// setting values of experience info bean
				EmployeeOtherInfoBean otherInfoBeans = infoBean.getEmployeeOtherInfoBean();

				otherInfoBeans.setEmployeeInfoBean(infoBean);
				

		if (dao.createEmployeeInfo(infoBean)) {
			modelMap.addAttribute("registraionSuccess", registraionSuccess);
			
			return EMPConstant.VIEW_LOGIN_PAGE;
		}
		modelMap.addAttribute("registraionFailed", registraionFailed);
		return EMPConstant.GET_REGISTRATION_PAGE;

	}// end of employee registration
	
	/*
	 * TO GET THE LOGIN PAGE
	 */
	@GetMapping("/getLoginPage")
	public String loginPage() {
		return EMPConstant.VIEW_LOGIN_PAGE;
	}// End of loginHandler
		
	/*
	 * VERIFICATION OF LOGIN CREDENCIALS AND LOGGING IN
	 */
	
	@PostMapping("/authenticate")
	public String authenticate(int employeeId, String password, HttpServletRequest request,
			@Value("${loginErrMesg}") String loginErrMesg, @Value("${homePageMesg}") String homePageMesg,
			@Value("${dbInteractionType}") String dbInteractionType) {

		EmployeeInfoBean bean = dao.getEmployeeinfo(employeeId);

		if (bean == null || !bean.getPassword().equals(password)) {

			request.setAttribute("msg1", loginErrMesg);
			return EMPConstant.VIEW_LOGIN_PAGE;
		} else {
			HttpSession session = request.getSession(true);
			session.setAttribute("bean", bean);

			session.setAttribute("msg2", homePageMesg);
			return "homePage";
		}
	}// end of authentication Handler
	
	
	/*
	 * TO UPDATE EMPLOYEE DETAILS (update)
	 */
		@GetMapping("/updateEmployeee")
		public String getUpdateEmployee() {
			return "home"; 
		}
		
		@PostMapping("/updateEmployee")
		public String getUpdateEmployee(EmployeeInfoBean infoBean, int managerId){ 
		EmployeeInfoBean managerBean = dao.getEmployeeinfo(managerId);
		infoBean.setManagerId(managerBean);
		dao.updateEmployeeInfo(infoBean);
			return "home";
		}
		
		/*
		 * TO SEARCH A PERTICULAR EMPLOYEE DETAILS
		 */
		
		@GetMapping("/search")
		public String getSearch(HttpServletRequest request, ModelMap map, @RequestParam String employeeId, @Value("${dbInteractionType}") String dbInteractionType) {
			try {
				EmployeeDAO dao=EmployeeDAOFactory2.getInstanceOfHibernate();
				EmployeeInfoBean bean=dao.getEmployeeinfo(employeeId);
				map.addAttribute("bean", bean);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return "home";
		}//end of getSearch1
		
		/*
		 * FOR LOGGING OUT
		 */
		public String logoutPage(HttpSession session, ModelMap map, @Value("${logoutMsg}") String logoutMsg) {
			session.setAttribute("msg3", logoutMsg);
			session.invalidate();
			return EMPConstant.VIEW_LOGIN_PAGE;

		}// end of log out
	

}
