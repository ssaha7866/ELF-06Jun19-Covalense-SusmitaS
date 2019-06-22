package com.covalense.java.hasarelation;

import lombok.extern.java.Log;

@Log
public class Car {
	MusicSystem ms = new MusicSystem();

	void drive() {
		
		log.info(""+"DRIVE WITH CAR");
	}

}


@Log
class MusicSystem {
	void play()
	{
		log.info(""+"MUSIC SYSTEM CAN PLAY MUSIC");
	}
}