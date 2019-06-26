package com.covalense.java.comsumer;

import java.util.function.Consumer;

import lombok.extern.java.Log;
@Log
public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student("Susmita", 84, 89, 90);
		
		Consumer<Student> c=s->{
			double d=(s.m1+s.m2+s.m3)/3.0;
			log.info("Name: "+s.name+" score: "+d);
		};
		c.accept(s1);
	}

}
