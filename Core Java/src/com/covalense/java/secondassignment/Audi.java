package com.covalense.java.secondassignment;

import lombok.extern.java.Log;

@Log
public class Audi extends Vehicle {
@Override
	void drive()
	{
		log.info(""+"you can drive this Audi car");
	}
	
}
