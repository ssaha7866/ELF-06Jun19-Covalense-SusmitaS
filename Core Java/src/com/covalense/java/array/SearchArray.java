package com.covalense.java.array;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class SearchArray {

	public static void main(String[] args) {
		int c;
		int n;
		int search;
		int array[];

		Scanner in = new Scanner(System.in);
		log.info("Enter number of elements");
		n = in.nextInt();
		array = new int[n];

		log.info("Enter those " + n + " elements");

		for (c = 0; c < n; c++)
			array[c] = in.nextInt();

		log.info("Enter value to find");
		search = in.nextInt();

		for (c = 0; c < n; c++) {
			if (array[c] == search) /* Searching element is present */
			{
				log.info(search + " is present at location " + (c + 1) + ".");
				break;
			}
		}
		if (c == n) /* Element to search isn't present */
			log.info(search + " isn't present in array.");
		in.close();
	}

}
