package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Test3 {

	public static void main(String[] args) {
		Animal a=new Cow();
		a.i=5;
		a.walk();
		log.info(""+"I IS "+a.i);
		log.info(""+"UP-CASTING DONE");
		Cow c=(Cow)a;
		c.i=8;
		c.walk();
		c.r=10;
		c.eat();
		log.info(""+"I IS "+c.i);
		log.info(""+"R IS "+c.r);
		log.info(""+"DOWN-CASTING DONE");
	}

}
