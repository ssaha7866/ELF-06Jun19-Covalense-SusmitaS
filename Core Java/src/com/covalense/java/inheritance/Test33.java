package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Test33 {

	public static void main(String[] args) {
		FatherA f=new FatherA();
		SonOne c1=new SonOne();
		SonTwo c2=new SonTwo();
		
		f.showF();
		
		log.info("*****************");
		
		c1.show1();
		c1.showF();
		
		log.info("*******************");
		
		c2.show2();
		c2.showF();
	}

}
