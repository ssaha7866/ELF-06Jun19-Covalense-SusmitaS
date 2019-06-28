package com.covalense.java.assessment.customexception;

import lombok.extern.java.Log;

@Log
public class NotEligibleException extends Throwable {
	
	String msg;
	
	
	public NotEligibleException() {
		this.msg = msg;
	}

	String show() {
				
				return msg;
		}
	}


