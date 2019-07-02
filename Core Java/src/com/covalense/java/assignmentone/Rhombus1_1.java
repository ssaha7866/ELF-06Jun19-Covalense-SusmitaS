package com.covalense.java.assignmentone;

public class Rhombus1_1 {

	public static void main(String[] args) {
		int n = 5;
		// FIRST HALF left triangle
		for (int i = 0; i < n; i++) {
			int k = 1;
			for (int j = 0; j < n; j++) {
				if (k < n - i) {
					System.out.print(" ");
					k++;
				} else if (i + j == (n - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			// FIRST HALF right triangle
			for (int j = 0; j < i; j++) {
				if (j == i - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// SECOnd HALF first triangle
		int space = -1;
		for (int i = n - 1; i >= 1; i--) {
			space = n - i;
			for (int j = 0; j < n - 1; j++) {
				if (space > 0) {
					System.out.print(" ");
					space--;

				} else if (i + j == n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			// SECOnd HALF second triangle
			for (int j = 0; j < i; j++) {
				if (j == i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}
