package com.covalense.java.assignmentfive;


@SuppressWarnings("serial")
public class NotValidAge extends RuntimeException {
	String s="Age must be greater than 18";
	@Override
	public String toString() {
		return s;
	}
		@Override
		public String getMessage() {

			return s;
		}


}
