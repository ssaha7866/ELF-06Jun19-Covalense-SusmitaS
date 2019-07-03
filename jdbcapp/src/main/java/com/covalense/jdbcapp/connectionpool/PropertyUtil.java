package com.covalense.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {
	
	
	public static PropertyUtil properutilref=null;
	Properties propertyFile ;
	
	public static PropertyUtil getPropertyUtil() throws Exception {

		if (properutilref == null) {
			properutilref = new PropertyUtil();
		}
		return properutilref;
		
	}
	
	private PropertyUtil() throws Exception {
		
		propertyFile = new Properties();
		propertyFile.load(new FileInputStream("connectionPool.properties"));

		
	}

	public String getProperty(String key) {
		return propertyFile.getProperty(key);
	}

	
	
}
