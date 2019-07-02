package com.covalense.jdbcapp.common;

public class DriverManager {

	private DriverManager(){
		
	}
	public static Connection getConnection(String str) {
		
		Connection ref=null;
		if(str.equals("One")) {
			ref=new ClassA();
		}else {
			ref=new ClassB();
		}
		return ref;
	}

}

