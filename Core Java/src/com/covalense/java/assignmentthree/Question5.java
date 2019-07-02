package com.covalense.java.assignmentthree;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class Question5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		log.info("Enter the string");
		String s=scn.nextLine();
		String[] ar=s.split(" ");
		StringBuilder temp=new StringBuilder("");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=ar[i].length()-1;j>=0;j--) {
			temp=temp.append(ar[i].charAt(j));
			}
			temp=temp.append(" ");
		}
		log.info(""+temp);
		scn.close();
	}

}
