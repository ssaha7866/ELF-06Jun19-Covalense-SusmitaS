package com.covalense.java.conditionsstatements;

import lombok.extern.java.Log;

@Log
public class Number {

	public static void main(String[] args) {
		int n = 5;
		if (n % 2 == 0) {
			log.info(""+"even number");
		} else {
			log.info(""+"odd number");
		}
	}

}
