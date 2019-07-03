package com.covalense.jdbcapp.common;

public class MainMethodClass {

	public static void main(String[] args) {
		
		//MyInterface ref=new ClassA();
		Connection ref=DriverManager.getConnection(args[0]); 
		ref.getConnection();
	}

}
