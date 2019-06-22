package com.covalense.java.sixthassignment;

import lombok.extern.java.Log;

@Log
/*
 * lambda expression to add two numbers
 */
public class Prob1 {
	public static void main(String[] args) {
		AddTwoNumbers result = (a, b) -> a + b;
		int i = result.add(5, 6);
		log.info("" + i);
	}

}
