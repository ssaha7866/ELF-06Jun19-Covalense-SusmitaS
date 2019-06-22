package com.covalense.java.treemap;

import java.util.Set;
import java.util.TreeMap;

import lombok.extern.java.Log;

@Log
public class TreeMapDemo2 {

	public static void main(String[] args) {
			TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
			tm.put("One", 1);
			tm.put("Two", 2);
			tm.put("Three", 3);
			tm.put("Four",  4);
			Set<String> ts=tm.keySet();
			for(String e : ts) {
				
				log.info(""+"KEY IS : "+e);
			}
	}

}
