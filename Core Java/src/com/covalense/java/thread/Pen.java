package com.covalense.java.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			log.info("" + i);
			try {
				sleep(2000);
			} // end of try
			catch (InterruptedException e) {
				log.severe("InterruptedException");

			} // end of catch
		} // end of loop
		String s = getName();
		log.severe(s);
	}
}
