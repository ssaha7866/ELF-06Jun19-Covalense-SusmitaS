package com.covalense.java.interfaces;

import lombok.extern.java.Log;

@Log
public class Case2 {

	public static void main(String[] args) {
		int price=10;
		switch(price)
		{
		case 10:
			log.info(""+"Lays");
			break;
		case 20:
			log.info(""+"Kurkure");
			break;
		case 50:
			log.info(""+"Dairy Milk");
			break;
			default:
				log.info(""+"Invalid Input");
		}
	}

}
