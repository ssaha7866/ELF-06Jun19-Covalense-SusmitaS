package com.covalense.java.assessment.customexception;

import javax.management.RuntimeErrorException;

import lombok.extern.java.Log;

@Log
public class CheckEligibility  {

	public String name;
	int percentage;

	void check(int p) throws NotEligibleException {
		 this.percentage=p;
		if(percentage >40) {
			log.info("passed");
		}
		else {
			throw new NotEligibleException();
		}
			
		}
}
