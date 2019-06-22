package com.covalense.java.array;

import lombok.extern.java.Log;

@Log
public class StringForEach {

	public static void main(String[] args) {
		String b[] = { "anil, ajay, ashoke, sagar" };
		for (String s : b) {
			log.info("value" + s);
		}
	}

}
