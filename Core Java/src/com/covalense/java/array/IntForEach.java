package com.covalense.java.array;

import lombok.extern.java.Log;

@Log
public class IntForEach {

	public static void main(String[] args) {
		int b[] = { 5, 2, 1, 4, 3 };
		for (int s : b) {
			log.info("value" + s);
		}
	}

}
