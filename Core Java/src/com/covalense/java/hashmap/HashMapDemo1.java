package com.covalense.java.hashmap;

import lombok.extern.java.Log;


import java.util.HashMap;
import java.util.Map;
@Log
public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.put("Four",  4);
		
		for(Map.Entry<String, Integer> e : hm.entrySet()) {
			log.info(""+"KEY IS : "+e.getKey()+" VALUE IS : "+e.getValue());
		}
		}

}
