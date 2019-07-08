package com.covalense.designpatterns.builder;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyimmutableClassTest {

	public static void main(String[] args) {
		
	
	MyimmutableClass classTest= new MyimmutableClass("ABC", 16, 123456987456L);
	log.info("Name "+ classTest.getName());
	
	SimpleDateFormat format=new  SimpleDateFormat("yyyy-mm-dd");
	Date date=null;
	try {
		date = format.parse("2018.30.3");
	} catch (ParseException e) {
		log.info(""+e);
	}
	
	EmployeeData data=new EmployeeData(1, "sita", 22, "female", 29000.0, 54864514758L, 
										date, 15497489156489945L, "xddh@bcg.com", 
										"tester", date, 10, 120);
	
	log.info("Employee Data"+ data.toString());
	
	EmployeeData2 data2= new EmployeeData2
							.EmployeeData2Builder()
							.id(123)
							.name("praveen")
							.age(30)
							.gender("male")
							.salary(12345.4)
							.phone(1234567892L)
							.joiningDate(date)
							.accountNumber(125478962L)
							.email("abcd@gmail.com")
							.designation("tester")
							.dob(date)
							.departmentId(10)
							.managerId(120)
							.build();
	
	log.info("Employee Data2"+ data2.toString());
	
	EmployeeData3 data3= new EmployeeData3
								.EmployeeData3Builder()
								.employeeId(123)
								.employeeName("praveen")
								.age(30)
								.gender("male")
								.salary(12345.4)
								.phone(1234567892L)
								.joiningDate(date)
								.accountNumber(125478962L)
								.email("abcd@gmail.com")
								.designation("tester")
								.dob(date)
								.departmentId(10)
								.managerId(120)
								.build();

		log.info("Employee Data3"+ data3.toString());
	}
}