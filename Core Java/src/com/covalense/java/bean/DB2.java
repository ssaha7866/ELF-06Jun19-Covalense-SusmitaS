package com.covalense.java.bean;

import lombok.extern.java.Log;

@Log
public class DB2 {
	void recieve(Person1 p) {
		log.info("" + "name is" + p.getName());
		log.info("" + "Age" + p.getAge());
	}
}
