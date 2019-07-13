package com.covalense.java.assessmentone.questionone;

import lombok.extern.java.Log;

@Log
public class AnimalSound {
	
	void getSound(Animal animal) {
		
		if(animal instanceof Dog) {
			animal.sound();
		}
		else if(animal instanceof Monkey){
			animal.sound();
		}
		else {
			log.info("Incorrect option selected");
		}
	}

}
