package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Test1 {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		ScientificCalc sc=new ScientificCalc();
		sc.add();
		sc.sin();
		sc.sub();
		sc.cos();
		sc.log();
		
		log.info("*****************");
		c.add();
		c.sub();
	}

}
