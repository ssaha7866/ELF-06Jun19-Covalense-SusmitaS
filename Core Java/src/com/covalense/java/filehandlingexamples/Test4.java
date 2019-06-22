package com.covalense.java.filehandlingexamples;

import java.io.File;

import lombok.extern.java.Log;

@Log
public class Test4 {

	public static void main(String[] args) {
		File f=new File("program files");
		boolean res=f.mkdir();
		log.info(""+"result is: "+res);
		log.info(""+"done");
	}
}
