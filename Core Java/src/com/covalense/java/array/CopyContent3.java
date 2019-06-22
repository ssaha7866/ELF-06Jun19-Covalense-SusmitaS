package com.covalense.java.array;

import lombok.extern.java.Log;

@Log
public class CopyContent3 {

	public static void main(String[] args) {
		int[] a = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		int key = 2;
		int nkey = 2;
		int si = 2;
		int count = 0;
		for (int i = key; i < b.length; i++) {
			b[i] = a[si++];
			count++;
			if (count == nkey)
				break;
		}
		for (int i : b) {
			log.info("value" + i);
		}
	}

}
