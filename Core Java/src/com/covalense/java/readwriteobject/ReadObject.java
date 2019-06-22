package com.covalense.java.readwriteobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import lombok.extern.java.Log;

@Log
public class ReadObject {

	public static void main(String[] args) {
		FileInputStream fis;
		ObjectInputStream ois = null;
		try {
			
			fis = new FileInputStream("file1.txt");
			ois = new ObjectInputStream(fis);
			Person p = (Person) ois.readObject();
			log.info(""+"Name " + p.getName());
			log.info(""+"ID " + p.getId());
			ois.close();

		} catch (FileNotFoundException e) {
			log.info("FileNotFoundException");
		} catch (IOException e) {
			log.info("IOException");
		} catch (ClassNotFoundException e) {
			log.info("ClassNotFoundException");
		} finally {

			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				log.info("IOException");
			}
		}

	}

}
