package com.covalense.java.bean;

public class Test5 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setGender("FEMALE");
		emp.setName("SUSMITA");
		emp.setSalary(30000);

		DB3 d3 = new DB3();
		d3.recieve(emp);
	}

}
