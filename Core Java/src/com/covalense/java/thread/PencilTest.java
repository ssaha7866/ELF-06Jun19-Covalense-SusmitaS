package com.covalense.java.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;
@Log
public class PencilTest {

	public static void main(String[] args) {
		Pencil p1=new Pencil();
		
		FutureTask<Integer> ft=new FutureTask<Integer>(p1);
		
		Thread t1=new Thread(ft);
		t1.start();
		
		int i;
		try {
			i = ft.get();
			log.info("Value "+ i);
		} catch (InterruptedException e) {
			log.severe("InterruptedException");
		} catch (ExecutionException e) {
			log.severe("ExecutionException");
		}
		
	}

}
