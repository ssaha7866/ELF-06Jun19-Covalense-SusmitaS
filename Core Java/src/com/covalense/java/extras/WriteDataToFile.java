package com.covalense.java.extras;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import lombok.extern.java.Log;

@Log
public class WriteDataToFile {
	public static void main(String[] args) {

		String msg = "hello";
		byte[] by = msg.getBytes();
		//try resource:no need to close connection.java closes it.
		try (FileOutputStream fos = new FileOutputStream("WriteFile.txt");) {
			fos.write(by);
		} catch (FileNotFoundException e) {
			log.info("FileNotFoundException");
		} catch (IOException e) {
			log.info("IOException");
		}
	}
}
