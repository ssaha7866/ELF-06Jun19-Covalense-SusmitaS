package com.covalense.java.assignmentthree;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class Question4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		log.info(""+"Enter the string");
		String s=scn.nextLine();
		String ar[]=s.split(" ");
		s="";
		for(int i=0;i<ar.length;i++)
		{
			s+=ar[i]+ar[i].length()+" ";
		}
		
		log.info(""+s);
		
		scn.close();
	}

}
