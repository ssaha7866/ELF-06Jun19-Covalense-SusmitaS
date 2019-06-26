package com.covalense.java.thread;

import lombok.extern.java.Log;

@Log
public class PVR {

	synchronized void book() {
		for(int i=0;i<5;i++) {
			log.info(""+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				log.severe("InterruptedException");
			}
		}
	}
}
