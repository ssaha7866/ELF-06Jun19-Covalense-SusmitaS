package com.covalense.java.conditionsstatements;

import lombok.extern.java.Log;

@Log
public class largestNo {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 9;
		if (n1 > n2) {
			log.info(""+"Largest number is " + n1);
		} else {
			log.info(""+"Largerst number is " + n2);
		}
	}

}
