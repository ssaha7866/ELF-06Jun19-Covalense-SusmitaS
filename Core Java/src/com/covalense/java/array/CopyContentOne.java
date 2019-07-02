package com.covalense.java.array;

import lombok.extern.java.Log;

@Log
public class CopyContentOne {

	public static void main(String[] args) {
		int[] a = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		int key = 2;
		int k = 0;
		for (int i = key; i < b.length; i++) {
			b[i] = a[k++];

		}
		for (int i = 0; i < b.length; i++) {
			log.info("array" + b[i]);
		}
	}

}
