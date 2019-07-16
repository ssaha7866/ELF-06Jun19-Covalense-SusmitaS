package com.covalense.springcore.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean3;

import lombok.extern.java.Log;

@Log
public class EmployeeTest3 {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring3.xml");

		
		 //details of employee is fetched and printed EmployeeBean
		EmployeeBean3 bean=(EmployeeBean3) applicationContext.getBean("employee");
		log.info(""+bean.toString());
		//log.info(""+bean.getDepartmentBean().toString());
		
		
		
	}

}
