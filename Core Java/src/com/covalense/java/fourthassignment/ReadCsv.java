package com.covalense.java.fourthassignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import lombok.extern.java.Log;
@Log
public class ReadCsv {
    public static void main(String[] args) {
		
    	
		try {
			FileReader fr=new FileReader("excel.csv");
			CSVParser cp=new CSVParser(fr, CSVFormat.DEFAULT .withFirstRecordAsHeader().withIgnoreHeaderCase());
			
			 for (CSVRecord csvRecord : cp) {
	                // Accessing Values by Column Index
	                String name = csvRecord.get(0);
	                String age  = csvRecord.get(1);
	                String designation = csvRecord.get(2);
	                String Salary = csvRecord.get(3);
	                
	                
	                cp.close();
	                log.info(""+"name : " + name);
	                log.info(""+"age : " + age);
	                log.info(""+"designation : " + designation);
	                log.info(""+"Salary : " + Salary);

	                log.info(""+"---------------\n\n");
			 }
		} catch (FileNotFoundException e) {
			log.info("FileNotFoundException");
		} catch (IOException e) {
			log.info("IOException");
		} // end of catch

	}// end of main

}// end of class
