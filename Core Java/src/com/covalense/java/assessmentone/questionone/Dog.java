package com.covalense.java.assessmentone.questionone;


import lombok.extern.java.Log;

@Log
public class Dog implements Animal{
	
	@Override
	public void sound() {
		log.info("Bhow Bhow");		
	}

}
