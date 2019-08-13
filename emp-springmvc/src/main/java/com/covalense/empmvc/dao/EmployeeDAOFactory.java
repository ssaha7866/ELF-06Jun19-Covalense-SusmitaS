package com.covalense.empmvc.dao;

public class EmployeeDAOFactory {

	//private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getInstance(String dbInteractionType) {
		EmployeeDAO dao = null;
		
		if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl();
			
		}
		return dao;

	}// end of getInstance()
}// end of class
