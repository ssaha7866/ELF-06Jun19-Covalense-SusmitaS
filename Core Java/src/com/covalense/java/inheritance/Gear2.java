package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Gear2 extends Gear1{
	@Override
	void speed()
	{
		log.info(""+"LEVEL TWO");
		log.info(""+"CAR SPEED WILL BE 100 TO 150");
	}
}
