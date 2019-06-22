package com.covalense.java.constructor;

import lombok.extern.java.Log;

@Log

public class Person implements AnimalA, Human{
	public void eat() {
		log.info(""+"eat() method");
		
	}
	public void walk() {
		log.info(""+"walk() method");
		
	}

}
