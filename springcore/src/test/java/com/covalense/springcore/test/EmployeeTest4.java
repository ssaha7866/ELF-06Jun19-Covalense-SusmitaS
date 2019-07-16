package com.covalense.springcore.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean4;

import lombok.extern.java.Log;

@Log
public class EmployeeTest4 {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring4.xml");

		
		 //details of employee is fetched and printed EmployeeBean
		EmployeeBean4 bean=(EmployeeBean4) applicationContext.getBean("employee");
		log.info(""+bean.toString());
		//log.info(""+bean.getDepartmentBean().toString());
		
		
		
	}

}
