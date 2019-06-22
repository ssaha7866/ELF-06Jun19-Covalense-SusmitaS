package com.covalense.java.log;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class test1 {
	private static final Logger loger=Logger.getLogger("Susmita");
	
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		ConsoleHandler ch=new ConsoleHandler();
		ch.setLevel(Level.ALL);
		loger.addHandler(ch);
		
		loger.log(Level.SEVERE,"This is a SEVERE message");
		loger.log(Level.WARNING,"This is a WARNING message");
		loger.log(Level.INFO,"This is a INFO message");
		loger.log(Level.CONFIG,"This is a CONFIG message");
		loger.log(Level.FINE,"This is a FINE message");
		loger.log(Level.FINER,"This is a FINER message");
		loger.log(Level.FINEST,"This is a FINEST message");

		
	}

}
