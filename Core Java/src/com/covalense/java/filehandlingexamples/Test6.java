package com.covalense.java.filehandlingexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class Test6 {

	public static void main(String[] args) {
		String msg = "Hi all, good evening";
		byte b[] = msg.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("myFile.txt");
			fout.write(b);
			fout.close();

		} // try ends
		catch (FileNotFoundException e) {
			log.info("FileNotFoundException");

		} catch (IOException e) {
			log.info("IOException");
		} // catch ends

		try {
			FileInputStream fi = new FileInputStream("myFile.txt");

			int i;
			while ((i = fi.read()) != -1) {// while begins
				log.info("" + (char) i);
			} // end of while loop
			fi.close();
		} catch (FileNotFoundException e) {
			log.info("FileNotFoundException");
		} catch (IOException e) {
			log.info("IOException");
		} // end of catch

	}// end of main

}// end of class
