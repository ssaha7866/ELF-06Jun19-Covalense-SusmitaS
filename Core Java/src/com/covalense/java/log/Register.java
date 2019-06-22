package com.covalense.java.log;

import java.util.logging.Level;
import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class Register {
	
	private static final Logger loger = Logger.getLogger("flipkart");
	void connectDB()
	{
		log.info("*************");
		loger.log(Level.SEVERE,"This is a SEVERE message");
		loger.log(Level.WARNING,"This is a WARNING message");
		loger.log(Level.INFO,"This is a INFO message");
		loger.log(Level.CONFIG,"This is a CONFIG message");
		loger.log(Level.FINE,"This is a FINE message");
		loger.log(Level.FINER,"This is a FINER message");
		loger.log(Level.FINEST,"This is a FINEST message");
		log.info("*******************");
	}
	
	void store()
	{
		log.info("*******************");
		loger.log(Level.SEVERE,"This is a SEVERE message");
		loger.log(Level.WARNING,"This is a WARNING message");
		loger.log(Level.INFO,"This is a INFO message");
		loger.log(Level.CONFIG,"This is a CONFIG message");
		loger.log(Level.FINE,"This is a FINE message");
		loger.log(Level.FINER,"This is a FINER message");
		loger.log(Level.FINEST,"This is a FINEST message");
	}

}
