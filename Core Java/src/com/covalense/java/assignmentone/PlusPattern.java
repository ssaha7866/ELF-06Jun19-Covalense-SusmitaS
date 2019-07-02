package com.covalense.java.assignmentone;

public class PlusPattern {

	public static void main(String[] args) {
		int n = 9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == n / 2 || j == n / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} // j loop ends
			System.out.println();
		} // i loop ends
	}// main() ends
}// class ends
