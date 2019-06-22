package com.covalense.java.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import lombok.extern.java.Log;

@Log
public class Test2 {

	private static final Logger loger = Logger.getLogger("flipkart");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		FileHandler fh;
		try {
			fh = new FileHandler("flipkartFile.log", true);
			fh.setLevel(Level.INFO);
			loger.addHandler(fh);
			fh.setFormatter(new SimpleFormatter());
			ByProduct b=new ByProduct();
			b.buy();
		}

		catch (SecurityException e) {
			log.info("SecurityException");

		} catch (IOException e) {
			log.info("IOException");

		}	

	}

}
