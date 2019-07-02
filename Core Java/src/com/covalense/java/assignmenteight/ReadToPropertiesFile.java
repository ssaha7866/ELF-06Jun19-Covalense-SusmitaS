package com.covalense.java.assignmenteight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import lombok.extern.java.Log;
/**
 * 
 * 
 *
 */
@Log
public class ReadToPropertiesFile {

	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("Per_info.properties");
		} catch (FileNotFoundException e) {
			log.warning("FileNotFoundException");
		}
		Properties p=new Properties();
		try {
			p.load(fin);
		} catch (IOException e) {
			log.warning("IOException");
		}
		String phn=p.getProperty("PhoneNumbers");
		String name=p.getProperty("Name");
		log.info(""+phn);
		log.info(""+name);
		
	}

}
