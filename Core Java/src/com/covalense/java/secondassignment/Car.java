package com.covalense.java.secondassignment;

import lombok.extern.java.Log;

@Log
public class Car {
	
int fuel;
	
	Car(int fuel)
	{
		this.fuel=fuel;
		log.info(""+"Car with "+this.fuel+"  Litter fuel ");
	}


}
