package com.covalense.java.thirdassignment;

import lombok.extern.java.Log;

@Log
public class Question3 {

	public static void main(String[] args) {
		String s="HI HOW ARE YOU";
		StringBuilder s2=new StringBuilder("");
		for(int i=s.length();i>=0;i--)
		{
			char ch=s.charAt(i);
			s2=s2.append(ch);
		}
		log.info(""+s2);
	}

}
