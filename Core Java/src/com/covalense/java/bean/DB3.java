package com.covalense.java.bean;

import lombok.extern.java.Log;

@Log
public class DB3 {

	void recieve(Employee e) {
		log.info("" + "Gender is " + e.getGender());
		log.info("" + "Name is " + e.getName());
		log.info("" + "Salary is " + e.getSalary());
	}

}
