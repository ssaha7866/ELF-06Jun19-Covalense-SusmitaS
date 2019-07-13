package com.covalense.java.assessmentone.questionfive;

import lombok.extern.java.Log;

/**
 * 
 * This is a child class of Animal interface
 *
 */
@Log
public class Lion implements Animal {

	@Override
	public void eat() {
		log.info("I am eat() method in Lion class ");
	}

}
