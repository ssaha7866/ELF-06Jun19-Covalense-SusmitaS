package com.covalense.java.assessment.counttypeofobjects;

import lombok.extern.java.Log;

/**
 * 
 * This is a child class of Animal interface
 *
 */
@Log
public class Dog implements Animal {

	@Override
	public void eat() {
		log.info("I am eat() method in Dog class ");

	}

}
