package com.covalense.java.readwriteobject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lombok.extern.java.Log;

@Log
public class WriteObject {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Kavya");
		p.setId(22);

		try {
			FileOutputStream fos = new FileOutputStream("file1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.close();
		}  catch (FileNotFoundException e) {
			log.info("FileNotFoundException");
		} catch (IOException e) {
			log.info("IOException");
		}

	}

}
