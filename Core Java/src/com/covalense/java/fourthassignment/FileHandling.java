package com.covalense.java.fourthassignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import lombok.extern.java.Log;
@Log
public class FileHandling {
    public static void main(String[] args) {
    	
		try {
			//FileOutputStream fos=new FileOutputStream("excelfile.csv");
			BufferedWriter bf=new BufferedWriter(new FileWriter("excel.csv"));
	    CSVPrinter csv=new CSVPrinter(bf, CSVFormat.DEFAULT.withHeader("Name", "Age","Designation","Salary"));
	    
	    csv.printRecord("Sundar Pichai","23","tester","25000");
	    csv.flush();csv.close();
	    log.info(""+"file is written");
		} catch (IOException e) {
			log.info("IOException");
		} // end of catch

	}// end of main

}// end of class

