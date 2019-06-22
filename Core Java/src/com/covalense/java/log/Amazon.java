package com.covalense.java.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import lombok.extern.java.Log;

@Log
public class Amazon {

	private static final Logger loger = Logger.getLogger("flipkart");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		FileHandler fh;
		try {
			fh = new FileHandler("Amazon.log", true);
			fh.setLevel(Level.INFO);
			loger.addHandler(fh);
			fh.setFormatter(new SimpleFormatter());
			Register r = new Register();
			r.connectDB();
			r.store();
		}

		catch (SecurityException e) {
			log.info("SecurityException");

		} catch (IOException e) {
			log.info("IOException");
		}

	}

}
