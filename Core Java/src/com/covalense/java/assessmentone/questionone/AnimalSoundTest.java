package com.covalense.java.assessmentone.questionone;

public class AnimalSoundTest {

	public static void main(String[] args) {
		
		Animal dogAnimal=new Dog();
		Animal monkeyAnimal= new Monkey();
		
		AnimalSound animalSound=new AnimalSound();
		animalSound.getSound(monkeyAnimal);
		animalSound.getSound(dogAnimal);
	}

}
