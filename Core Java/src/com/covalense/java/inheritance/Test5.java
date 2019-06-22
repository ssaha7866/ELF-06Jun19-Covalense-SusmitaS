package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Test5 {

	public static void main(String[] args) {
		Bus b=new Van();
		b.model=20;
		b.move();
		log.info(""+"model IS "+b.model);
		log.info(""+"UP-CASTING DONE");
		Van v=(Van)b;
		v.model=10;
		v.move();
		v.seats=5;
		v.turn();
		log.info(""+"model IS "+v.model);
		log.info(""+"seats IS "+v.seats);
		log.info(""+"DOWN-CASTING DONE");
	}

}
