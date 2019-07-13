package com.covalense.java.assessmentone.questiontwenty;

import lombok.extern.java.Log;

@Log
public class CheckEligibility  {

	public String name;
	int percentage;

	void check(int p)  {
		 this.percentage=p;
		if(percentage >40) {
			log.info("passed");
		}
		else {
			throw new NotEligibleException("Student is not eligible for the exam");
		}
			
		}
}
