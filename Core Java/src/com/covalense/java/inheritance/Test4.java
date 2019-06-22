package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Test4 {

	public static void main(String[] args) {
		Pen p=new Marker2();
		p.cost=20;
		p.write();
		log.info(""+"cost IS "+p.cost);
		log.info(""+"UP-CASTING DONE");
		Marker2 m=(Marker2)p;
		m.cost=10;
		m.write();
		m.size=5;
		m.color();
		log.info(""+"cost IS "+m.cost);
		log.info(""+"size IS "+m.size);
		log.info(""+"DOWN-CASTING DONE");
	}

}
