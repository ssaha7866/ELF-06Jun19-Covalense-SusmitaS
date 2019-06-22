package com.covalense.java.exceptions;

@SuppressWarnings("serial")
public class InvalidNameException extends RuntimeException {
	String message;

	public InvalidNameException(String message) {
		super();
		this.message = message;
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
