package com.covalense.java.assessmentone.questionone;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal{

	@Override
	public void sound() {

		log.info("Kschiz Kschiz");
	}
	

}
