package com.covalense.java.array;

import lombok.extern.java.Log;

@Log
public class SortArray {

	public static void main(String[] args) {
		int b[] = { 5, 2, 1, 4, 3 };
		double c[] = { 2.4, 6.9, 3.2, 4.6 };
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[j] < b[i]) {
					int t = b[i];
					b[i] = b[j];
					b[j] = t;
				} // if ends
			} // j loop ends
		} // i loop ends

		for (int i = 0; i < b.length; i++) {
			log.info("value" + b[i] + " ");
		} // i loop ends

		log.info("");

		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[j] < c[i]) {
					double t = c[i];
					c[i] = c[j];
					c[j] = t;
				} // if ends
			} // j loop ends
		} // i loop ends

		for (int i = 0; i < c.length; i++) {
			log.info("value" + c[i] + " ");
		} // i loop ends
	}

}
