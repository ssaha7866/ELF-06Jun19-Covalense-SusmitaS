package com.covalense.java.hasarelation;

import lombok.extern.java.Log;

@Log
public class Person {
	Mobile m=new Mobile();
	int i=5;
	void walk() {
		log.info(""+"MAN CAN WALK");
	}

}


@Log
class Mobile
{
	void call()
	{
		log.info(""+"MOBILE USED TO CALL");
	}
}
