package com.covalense.java.assessmentone.questiontwenty;

import lombok.extern.java.Log;

@Log
public class StudentEligibilityTest {

	public static void main(String[] args) {
		
		CheckEligibility ck = new CheckEligibility();
		try {
			ck.check(12);
		} catch (NotEligibleException e) {
			log.info(""+e);
		}
	}

}
