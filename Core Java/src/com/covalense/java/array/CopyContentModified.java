package com.covalense.java.array;

import lombok.extern.java.Log;

@Log
public class CopyContentModified {

	public static void main(String[] args) {
		int[] a = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		System.arraycopy(a, 2, b, 3, 1);

		for (int i : b) {
			log.info("value" + i);
		}
	}

}
