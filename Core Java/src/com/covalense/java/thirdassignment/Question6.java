package com.covalense.java.thirdassignment;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class Question6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		log.info("Enter the string");
		String s="Hi how are you man";
		String[] ar=s.split(" ");
		
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0) {
				
				char[] ch = ar[i].toCharArray();
				for(int h=ch.length-1;h>=0;h--) {
					log.info(""+ch[h]);
				}
			} else {
				log.info(""+ar[i]);
			}
			log.info(" ");
		}
		
		scn.close();
	}

}
