package com.covalense.java.propertiesfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class WritetoPropertiesFileTest {

	public static void main(String[] args) {
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("demo1.properties");
		} catch (FileNotFoundException e) {
			log.warning("FileNotFoundException");	
			}		
		Properties p=new Properties();
		p.setProperty("CompantName","Covalense");
		p.setProperty("PhoneNumbers", "99764585239");
		
		try {
			p.store(fout, "Company Details");
		} catch (IOException e) {
			log.warning("IOException");
		}
		log.info("Created the file");
	}

}
