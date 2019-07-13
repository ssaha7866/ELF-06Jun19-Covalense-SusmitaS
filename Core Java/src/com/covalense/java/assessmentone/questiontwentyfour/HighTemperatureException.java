package com.covalense.java.assessmentone.questiontwentyfour;
@SuppressWarnings("serial")
public class HighTemperatureException extends RuntimeException {
	
	String message;
	
	public HighTemperatureException(String message) {
		
		this.message=message;
	}
	
	@Override
	public String toString() {
		return message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
