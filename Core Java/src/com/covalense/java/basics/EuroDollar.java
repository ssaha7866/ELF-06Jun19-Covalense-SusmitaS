package com.covalense.java.basics;

import lombok.extern.java.Log;

@Log
public class EuroDollar {

	public static void main(String[] args) {
		log.info("" + "1000 rupees is = to " + (1000 * 0.14) + " dollars");
		log.info("" + "1000 rupees is = to " + (1000 * 0.013) + " euros");
	}

}
