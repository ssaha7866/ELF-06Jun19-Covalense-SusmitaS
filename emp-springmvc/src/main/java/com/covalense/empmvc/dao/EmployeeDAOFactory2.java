package com.covalense.empmvc.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory2 {

	
	@Bean("jdbc")
	public EmployeeDAO getInstanceOfJDBC() {
		return new EmployeeDAOJDBCImpl();
		}
		 
	@Bean("hibernate")
	public EmployeeDAO getInstanceOfHibernate() {
		return new EmployeeDAOHibernateImpl();
		}

	
}// end of class
