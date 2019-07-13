package com.covalense.java.assessmentone.questiontwo;

import lombok.extern.java.Log;

@Log
public class WaferTest {

	public static void main(String[] args) {

		
		int choice = 1;
		switch (choice) {

		case 1:{
			new Lays();
			break;
		}
		case 2:{
			new Kurkure();
			break;
		}
		case 3:{
			new Bingo();
			break;
		}
			default:log.info("Action could not be performed because of Invalid input. Please put any integer from 1-3");
		}
	}

}
