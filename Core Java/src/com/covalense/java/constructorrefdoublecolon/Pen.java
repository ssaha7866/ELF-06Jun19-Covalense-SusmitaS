package com.covalense.java.constructorrefdoublecolon;

import lombok.extern.java.Log;

@Log
public class Pen {

	Pen(){
		log.info("zero parameterised constructor");
	}
	void write() {
		log.info("write method");
	}
}
