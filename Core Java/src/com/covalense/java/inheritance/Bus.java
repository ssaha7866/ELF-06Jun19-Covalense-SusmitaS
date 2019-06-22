package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Bus {

	int model;
	void move()
	{
		log.info(""+"I AM MOVE() METHOD");
	}

}


@Log
class Van extends Bus
{
	int seats;
	void turn()
	{
		log.info(""+"I AM TURN() METHOD");
	}
}
