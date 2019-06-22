package com.covalense.java.annotation;

import lombok.extern.java.Log;

//example to show different annotations
@Log
public class Mouse {
	@Deprecated
	void scroll() {
		log.info("deprecated method");
	}

}
