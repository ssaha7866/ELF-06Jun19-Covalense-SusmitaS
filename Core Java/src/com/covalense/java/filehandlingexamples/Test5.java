package com.covalense.java.filehandlingexamples;

import java.io.File;

import lombok.extern.java.Log;

@Log
public class Test5 {

	public static void main(String[] args) {
		File f=new File("movies/english/new");
		boolean res=f.mkdirs();
		log.info(""+"result is: "+res);
		log.info(""+"done");
	}
}
