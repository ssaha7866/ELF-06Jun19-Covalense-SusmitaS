package com.covalense.java.array;

import lombok.extern.java.Log;

@Log
public class DoubleForEach {

	public static void main(String[] args) {
		double c[] = { 2.4, 6.9, 3.2, 4.6 };
		for (double s : c) {
			log.info("value" + s);
		}
	}

}
