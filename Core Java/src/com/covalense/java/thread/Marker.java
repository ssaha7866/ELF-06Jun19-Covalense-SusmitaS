package com.covalense.java.thread;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			log.info(""+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				log.severe("InterruptedException");
			}
		}
	}
}
