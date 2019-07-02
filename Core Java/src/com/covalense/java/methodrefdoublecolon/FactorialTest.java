package com.covalense.java.methodrefdoublecolon;

import lombok.extern.java.Log;

@Log
public class FactorialTest {
	public static void main(String[] args) {
		MyStudent my=new MyStudent();
		Factorial a=my::fac;
		int i=a.getFact(5);
		log.info(""+i);
	}

}
