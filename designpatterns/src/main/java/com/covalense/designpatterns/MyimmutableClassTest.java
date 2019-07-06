package com.covalense.designpatterns;

import lombok.extern.java.Log;

@Log
public class MyimmutableClassTest {

	public static void main(String[] args) {
		
	
	MyimmutableClass classTest= new MyimmutableClass("ABC", 16, 123456987456L);
	log.info("Name "+ classTest.getName());
}
}