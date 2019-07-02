package com.covalense.java.methodrefdoublecolon;

import lombok.extern.java.Log;

@Log
public class AddTest {
	static int sum(int a,int b) {
		int s=a+b;
		log.info("sum"+s);
		return 0;
	}
	public static void main(String[] args) {
		
		Add a=AddTest :: sum;
		a.add(10,20);
		Add ad=Math::sum;
		
		log.info(""+ad.add(2, 3));
	}
}
