package com.covalense.java.assignmentfour;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;
@Log
public class ReadWriteData {

	public static void main(String[] args) {

/*		
		try {
			FileUtils.writeStringToFile(new File("dataFile1.txt"), "this is an old file", Charset.defaultCharset());
			log.info("" + "File created");
		} catch (IOException e) {
			log.info("IOException");
		}*/

		try {
			String fileData=FileUtils.readFileToString(new File("dataFile1.txt"), Charset.defaultCharset());
			FileUtils.writeStringToFile(new File("fuile2.txt"), fileData, Charset.defaultCharset());
			log.info(""+fileData);
		} catch (IOException e) {
			log.info("IOException");
		}
	}// end of main

}// end of class

