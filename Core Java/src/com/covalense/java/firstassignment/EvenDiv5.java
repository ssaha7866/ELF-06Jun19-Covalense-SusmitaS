package com.covalense.java.firstassignment;

import lombok.extern.java.Log;

@Log
public class EvenDiv5 {
	public static void main(String[] args) {
		for(int i=50;i<=100;i++)
		{
			if(i%2==0 && i%5==0)
			{
				log.info(""+i+" ");
			}
		}
		log.info("");
	}

}
