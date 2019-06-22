package com.covalense.java.array;

import java.util.Arrays;
import java.util.Collections;

import lombok.extern.java.Log;

@Log
public class ReverseArray {

	public static void main(String[] args) {
		Integer[] b = { 5, 2, 1, 4, 3 };
		Arrays.sort(b, Collections.reverseOrder());
		for (int i : b) {
			log.info("value" + i + " ");
		}
	}

}
