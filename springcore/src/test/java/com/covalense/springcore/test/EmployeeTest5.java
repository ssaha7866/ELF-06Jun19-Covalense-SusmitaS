package com.covalense.springcore.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean5;

import lombok.extern.java.Log;

@Log
public class EmployeeTest5 {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring5.xml");

		
		 //details of employee is fetched and printed EmployeeBean
		EmployeeBean5 bean=(EmployeeBean5) applicationContext.getBean("employee");
		log.info(""+bean.toString());
		//log.info(""+bean.getDepartmentBean().toString());
		
		
		
	}

}
