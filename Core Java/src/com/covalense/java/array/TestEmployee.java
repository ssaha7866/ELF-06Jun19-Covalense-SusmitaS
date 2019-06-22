package com.covalense.java.array;

import lombok.extern.java.Log;

@Log
public class TestEmployee {

	public static void main(String[] args) {
		EmployeeArray[] emp = new EmployeeArray[4];
		EmployeeArray e1 = new EmployeeArray();
		e1.setName("Anil");
		e1.setSalary(50000);
		e1.setAge(45);
		EmployeeArray e2 = new EmployeeArray();
		e2.setName("Ajay");
		e2.setSalary(20000);
		e2.setAge(25);
		EmployeeArray e3 = new EmployeeArray();
		e3.setName("Ashoke");
		e3.setSalary(30000);
		e3.setAge(30);
		EmployeeArray e4 = new EmployeeArray();
		e4.setName("Anita");
		e4.setSalary(100000);
		e4.setAge(40);

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;

		for (EmployeeArray e : emp) {
			log.info("Name is " + e.getName());
			log.info("Age is " + e.getAge());
			log.info("Salary is " + e.getSalary());
			log.info("");
		}
	}

}
