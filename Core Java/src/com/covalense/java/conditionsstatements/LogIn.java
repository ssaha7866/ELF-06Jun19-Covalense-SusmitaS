package com.covalense.java.conditionsstatements;

import lombok.extern.java.Log;

@Log
public class LogIn {

	public static void main(String[] args) {
		int login = 1;
		double totalPrice = 1000;
		if (login == 1) {
			totalPrice = totalPrice - ((10 * totalPrice) / 100);

		}

		log.info(""+totalPrice);

	}

}
