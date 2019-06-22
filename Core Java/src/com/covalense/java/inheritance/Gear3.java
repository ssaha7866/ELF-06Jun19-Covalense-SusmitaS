package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Gear3 extends Gear2{
	@Override
	void speed()
	{
		log.info(""+"LEVEL THREE");
		log.info(""+"CAR SPEED WILL BE 150 TO 200");
	}

}
