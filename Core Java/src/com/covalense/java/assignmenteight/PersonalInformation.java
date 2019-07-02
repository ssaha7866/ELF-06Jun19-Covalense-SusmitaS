package com.covalense.java.assignmenteight;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class PersonalInformation {

	public static void main(String[] args) {

		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("Per_Info.properties");
		} catch (FileNotFoundException e) {
			log.warning("FileNotFoundException");
		}
		Properties p = new Properties();
		p.setProperty("Name", "Susmita");
		p.setProperty("PhoneNumbers", "99764585239");

		try {
			p.store(fout, "Personal Details");
		} catch (IOException e) {
			log.warning("IOException");
		}
		log.info("Created the file");
	}

}
