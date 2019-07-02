package com.covalense.java.assignmentone;

import lombok.extern.java.Log;

@Log
public class PrimeOrNot {
	public static void main(String[] args) {
		int n=4;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if (count==2)
			log.info(""+n+" is a prime no");
	}

}
