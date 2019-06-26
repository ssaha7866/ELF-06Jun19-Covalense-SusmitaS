package com.covalense.java.lambdaimplementation;

import lombok.extern.java.Log;

@Log
public class RunnableLambda {
	public static void main(String[] args) {
		
		Runnable x=()->{
			for(int i=0;i<5;i++) {
				log.info(""+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					log.warning("InterruptedException");
				}
			}
		};
		
		Thread t1=new Thread(x);
		t1.start();
		
		Thread t2=new Thread(x);
		t2.start();
	}
}
