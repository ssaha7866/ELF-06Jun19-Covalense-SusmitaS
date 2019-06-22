package com.covalense.java.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<String, Integer>();
		lhm.put("One", 1);
		lhm.put("Two", 2);
		lhm.put("Three", 3);
		lhm.put("Four",  4);
		
		for(Map.Entry<String, Integer> e : lhm.entrySet()) {
			log.info(""+"KEY IS : "+e.getKey()+" VALUE IS : "+e.getValue());
		}
	}

}
