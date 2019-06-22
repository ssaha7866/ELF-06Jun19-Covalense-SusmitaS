package com.covalense.java.filehandlingexamples;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

@Log
public class FileHandlingExample2 {

	public static void main(String[] args) {
		
		try {
			String fileData=FileUtils.readFileToString(new File("file22.txt"), Charset.defaultCharset());
			log.info(""+fileData);
		} catch (IOException e) {
			log.info("IOException");
		}

	}

}
