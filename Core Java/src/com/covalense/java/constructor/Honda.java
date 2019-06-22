package com.covalense.java.constructor;
import lombok.extern.java.Log;

@Log
abstract class Honda {
	void engine() {
		log.info(""+"it has a good engine");
	}

	abstract void design();

}

@Log
class Hero extends Honda {
	void design()
	{
		log.info(""+"it also has a good design");
	}
}
