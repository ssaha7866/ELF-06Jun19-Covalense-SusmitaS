package com.covalense.java.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ByProduct {
	private static final Logger loger = Logger.getLogger("flipkart");

	void buy() {
		loger.log(Level.SEVERE, "severe message");
		loger.log(Level.WARNING,"WARNING message");
		loger.log(Level.INFO,"INFO message");
		loger.log(Level.CONFIG,"CONFIG message");
	}

}
