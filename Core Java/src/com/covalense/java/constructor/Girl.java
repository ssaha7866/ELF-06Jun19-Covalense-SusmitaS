package com.covalense.java.constructor;

import lombok.extern.java.Log;


public class Girl {
	public static void main(String[] args) {

		Grl g = new Grl();
		Phone p = new Phone();
		g.recive(p);

	}
}
@Log
class Grl {
	void recive(Phone p) {
		if (p instanceof MIPhone)
			log.info(""+"ThankYou Brother");

		else if (p instanceof IPhone)
			log.info(""+"I Love You");

	}
}

class Phone {

}

class MIPhone extends Phone {

}

class IPhone extends Phone {

}
