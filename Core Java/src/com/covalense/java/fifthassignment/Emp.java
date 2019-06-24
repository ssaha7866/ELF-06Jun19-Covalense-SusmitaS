package com.covalense.java.fifthassignment;

import lombok.extern.java.Log;
@Log
public class Emp {
	String name;
	int age;
	String designation;
	double salary;

	void set(String name, int age, String designation, double salary) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;

	}

	void get() {
		log.info(""+name);
		log.info(""+age);
		log.info(""+designation);
		log.info(""+salary);
	}

}
