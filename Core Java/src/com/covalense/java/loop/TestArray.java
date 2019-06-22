package com.covalense.java.loop;

import lombok.extern.java.Log;

@Log
public class TestArray {

	public static void main(String... args) {
		
		
		int [] a= {10,9,3,15};
		for(int i=0;i<a.length;i++)
		{
			log.info(""+a[i]);
		}
		for(int i=a.length-1;i>=0;i--)
		{
			log.info(""+a[i]);
		}
		
		
		
		
		
		
		
		/*int[] a1=new int[4];
		a1[0]=5;
		a1[1]=19;
		a1[2]=13;
		a1[3]=15;
		for(int i=0;i<a1.length;i++)
		{
			log.info(""+a1[i]);
		}
		double[] a2=new double[4];
		a2[0]=5.5;
		a2[1]=19.3;
		a2[2]=13.3;
		a2[3]=15.12;
		for(int i=0;i<a2.length;i++)
		{
			log.info(""+a2[i]);
		}
		char[] a=new char[7];
		a[0]='S';
		a[1]='U';
		a[2]='S';
		a[3]='M';
		a[4]='I';
		a[5]='T';
		a[6]='A';
		for(int i=0;i<a.length;i++)
		{
			log.info(""+a[i]);
		}
		
		String[] aa=new String[4];
		aa[0]="mother";
		aa[1]="father";
		aa[2]="sister";
		aa[3]="brother";
		
		for(int i=0;i<aa.length;i++)
		{
			log.info(""+aa[i]);
		}
		log.info(""+a.length);*/
	}

}
