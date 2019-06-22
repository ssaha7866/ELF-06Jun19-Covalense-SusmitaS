package com.covalense.java.objectcreation;

import lombok.extern.java.Log;


public class Test3 {

	public static void main(String[] args) {
		House h=new House();
		h. cost=45000000;
		h.type="GLASS";
		h.dream();
	}

}


@Log
class House
{
	int cost;
	String type;
	void dream()
	{
		log.info(""+"THIS IS MY DREAM HOUSE");
	}
}
