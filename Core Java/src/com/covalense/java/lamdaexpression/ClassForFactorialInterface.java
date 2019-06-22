package com.covalense.java.lamdaexpression;

import lombok.extern.java.Log;

@Log
public class ClassForFactorialInterface {

	public static void main(String[] args) {
		Factorial f = n -> {
			int fac = 1;
			for (int i = 1; i <= n; i++) {
				fac *= i;
			}
			return fac;
		};
		int fac = f.fact(5);
		log.info(""+fac);
	}

}
