package com.covalense.java.thirdassignment;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class Question7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		log.info("Enter the string");
		String s = scn.nextLine();
		String[] ar = s.split(" ");

		if (ar.length % 2 == 0) {
			log.info("Action cannot be performed");
		} else {
				String temp=ar[ar.length-1];
				ar[ar.length-1]=ar[ar.length/2];
				ar[ar.length/2]=ar[0];
				ar[0]=temp;
		}
		for(String s1:ar) {
		log.info(""+s1);
		}
		scn.close();
	}

}
