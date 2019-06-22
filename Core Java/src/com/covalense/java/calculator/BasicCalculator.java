package com.covalense.java.calculator;

import lombok.extern.java.Log;

@Log
public class BasicCalculator {

	void add(double i, double j) {
		log.info(""+i + j);
	}

	void sub(double i, double j) {
		log.info(""+(i - j));
	}

	void mul(double i, double j) {
		log.info(""+i * j);
	}

	void div(double i, double j) {
		log.info(""+i / j);
	}


}//end of class
