package com.covalense.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.java.Log;
@Log
public class StreamTestFive {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);
		
		Comparator<Integer>c=(i,j)->i.compareTo(j)*-1;
		
		List<Integer>l=al.stream().sorted(c).collect(Collectors.toList());
		log.info(""+ l);
	}

}
