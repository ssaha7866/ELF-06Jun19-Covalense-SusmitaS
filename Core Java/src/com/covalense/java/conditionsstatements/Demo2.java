package com.covalense.java.conditionsstatements;

import lombok.extern.java.Log;

@Log
public class Demo2 {

	public static void main(String[] args) {
		int n1 = 5, n2 = 10;
		int sum1 = sum(n1, n2);
		int mul1 = mul(n1, n2);
		int fact = fac(n1);
		log.info(""+sum1);
		log.info(""+mul1);
		log.info(""+fact);
	}

	static int fac(int n1) {
		if (n1 == 0)
			return 1;
		else
			return n1 * fac(n1 - 1);
	}

	static int mul(int n1, int n2) {
		
		return (n1 * n2);
	}

	static int sum(int i, int j) {
		;
		return i + j;
	}
	

}
