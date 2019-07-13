package com.covalense.java.assessmentone.questiontwenty;


@SuppressWarnings("serial")
public class NotEligibleException extends RuntimeException {
	
	String msg;
	
	
	public NotEligibleException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		
		return msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
	}


