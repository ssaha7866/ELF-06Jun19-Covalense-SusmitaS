package com.covalense.java.enums;

public enum Loan {
	HOME(240), PERSONAL(241), CAR(243);
	
	private int value;
	private Loan(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}

}
