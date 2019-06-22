package com.covalense.java.array;


import lombok.extern.java.Log;
@Log
public class CopyArray {

	public static void main(String[] args) {
		int ar[] = { 9, 6, 2, 4 };
		int b[] = { 9, 6, 2, 4 };
		if (ar.length==b.length) {
			for(int i=0;i<ar.length;i++) {
				if(ar[i]!=b[i])
					break;
			}
			log.info("equal");
		} else {
			log.info("Not equal");
		}
	}

}
