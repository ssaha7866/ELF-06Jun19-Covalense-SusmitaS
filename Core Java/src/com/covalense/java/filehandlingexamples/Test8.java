package com.covalense.java.filehandlingexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class Test8 {

	public static void main(String[] args) {
		String msg = "Humty Dumty had a great fall";
		char b[] = msg.toCharArray();
		try {
			FileWriter fw = new FileWriter("poem2.txt", true);
			fw.write(b);
			fw.flush();
			fw.close();

		} catch (FileNotFoundException e) {
			log.info("FileNotFoundException");

		} catch (IOException e) {
			log.info("IOException");
		}

		try {
			FileReader fr = new FileReader("poem2.txt");

			int i;
			while ((i = fr.read()) != -1) {
				log.info("" + (char) i);
			}
			fr.close();
			log.info("");
		} catch (FileNotFoundException e) {
			log.info("FileNotFoundException");
		} catch (IOException e) {
			log.info("IOException");
		}
	}// end of main

}// end of class
