package com.covalense.java.filehandlingexamples;

import java.io.File;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class Test3 {

	public static void main(String[] args) {
		File f=new File("C:/newfile.txt");
		try {
			boolean res=f.createNewFile();
			log.info(""+"result is: "+res);
			log.info(""+"done");
			
		} catch (IOException e) {
			log.info("IOException");
		}
	}

}
