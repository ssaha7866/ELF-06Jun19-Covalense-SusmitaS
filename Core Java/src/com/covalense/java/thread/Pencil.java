package com.covalense.java.thread;

import java.util.concurrent.Callable;

public class Pencil implements Callable<Integer>{

	public Integer call() {
		return 120;
	}
}
