package com.covalense.java.assessment.customexception;

import lombok.extern.java.Log;

@Log
public class StudentEligibility {

	void validate() {

		CheckEligibility ck = new CheckEligibility();
		try {
			ck.check(12);
		} catch (NotEligibleException e) {
			log.info("not eligible to give the exam");
		}
	}

}
