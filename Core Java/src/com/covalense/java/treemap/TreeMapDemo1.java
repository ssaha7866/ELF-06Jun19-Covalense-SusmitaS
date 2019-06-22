package com.covalense.java.treemap;

import java.util.Map;
import java.util.TreeMap;

import lombok.extern.java.Log;

@Log
public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
		tm.put("One", 1);
		tm.put("Two", 2);
		tm.put("Three", 3);
		tm.put("Four",  4);
		
		for(Map.Entry<String, Integer> e : tm.entrySet()) {
			log.info(""+"KEY IS : "+e.getKey()+" VALUE IS : "+e.getValue());
		}
	}

}
