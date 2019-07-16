package com.covalense.springcore.beans;


import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class EmployeeBean2 {//implements InitializingBean, DisposableBean

	private String name;
	private int id;

	public void init() throws Exception {
		log.info("initialization phase.....");
	}
	
	public void destroy() throws Exception {
		log.info("destroy phase.....");
	}
}
