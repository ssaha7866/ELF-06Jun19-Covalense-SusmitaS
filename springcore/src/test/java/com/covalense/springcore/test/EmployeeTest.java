package com.covalense.springcore.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");

		
		/*
		 * //details of employee is fetched and printed EmployeeBean
		 * bean1=(EmployeeBean) applicationContext.getBean("Employee");
		 * log.info(bean1.toString());
		 */

		Scanner scn = new Scanner(System.in);

		// reading the data of employee1 at runtime
		EmployeeBean bean2 = (EmployeeBean) applicationContext.getBean("Employee1");
		log.info("enter the employee1 name: ");
		bean2.setName(scn.nextLine());
		log.info("enter the employee1 id: ");
		bean2.setId(scn.nextInt());
		scn.nextLine();

		// reading the data of employee2 at runtime
		EmployeeBean bean3 = (EmployeeBean) applicationContext.getBean("Employee1");
		log.info("enter the employee2 name: ");
		bean3.setName(scn.nextLine());
		log.info("enter the employee2 id: ");
		bean3.setId(scn.nextInt());
		scn.nextLine();

		// details of employee2 is fetched and printed
		log.info(bean2.toString());
		log.info(bean3.toString());
		scn.close();
		
		
	}

}
