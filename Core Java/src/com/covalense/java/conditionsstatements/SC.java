package com.covalense.java.conditionsstatements;

import lombok.extern.java.Log;

@Log
public class SC {

	public static void main(String[] args) {
		int age = 69;
		double ticktPrice = 100;
		if (age >= 60) {
			ticktPrice = 100 - ((15.2 / 100) * ticktPrice);

		}
		log.info(""+ticktPrice);
	}

}
