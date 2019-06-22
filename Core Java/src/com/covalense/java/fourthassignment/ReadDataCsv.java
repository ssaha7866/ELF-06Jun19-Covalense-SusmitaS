package com.covalense.java.fourthassignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import lombok.extern.java.Log;
@Log
public class ReadDataCsv {
	public static void main(String[] args) {

		Employee arr[] = new Employee[5];
		try {
			FileReader fr = new FileReader("excel.csv");
			CSVParser csv = new CSVParser(fr, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase());
			int i = 0;
			for (CSVRecord csvRecord : csv) {
				Employee e1 = new Employee();

				e1.name = csvRecord.get(0);
				e1.age = csvRecord.get(1);
				e1.designation = csvRecord.get(2);
				e1.salary = csvRecord.get(3);
				
				arr[i++]=e1;
				

			}
			log.info(""+"read");

			for (Employee e : arr) {
				log.info(""+e.name);
				log.info(""+e.age);
				log.info(""+e.designation);
				log.info(""+e.salary);
				log.info(""+"========");
			}
			csv.close();
			
		} catch (FileNotFoundException e) {
			log.info("FileNotFoundException");
		} catch (IOException e) {
			log.info("IOException");
		} // end of catch

	}// end of main

}// end of class
