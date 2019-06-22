package com.covalense.java.constructor;

import lombok.extern.java.Log;

@Log
public class Student {
	String name;
	int age;
	double percentage;
	
	Student (String name, int age, double percentage)
	{
		this. name =name;
		this. age=age;
		this. percentage=percentage;
	}
	
	void display()
	{
		log.info(""+"NAME "+name);
		log.info(""+"AGE "+age);
		log.info(""+"PERCENTAGE "+percentage);
	}

}
