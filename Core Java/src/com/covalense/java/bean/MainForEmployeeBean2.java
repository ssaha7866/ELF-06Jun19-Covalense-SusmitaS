package com.covalense.java.bean;

import java.util.logging.Logger;

public class MainForEmployeeBean2 {

	private static final Logger log = Logger.getLogger("Output");

	public static void main(String[] args) {

		EmployeeBean2 eb2 = new EmployeeBean2();

		eb2.setAge(13);
		eb2.setName("Susmita");

		log.info("with lombok " + eb2.toString());
	}

}
