package com.covalense.java.constructor;
import lombok.extern.java.Log;

@Log
class Train {
	void search(int i)
	{
		log.info(""+"SEARCH BY ID");
	}
	void search(String b)
	{
		log.info(""+"SEARCH BY NAME");
	}

}
public class Test5
{
	public static void main(String[] args) {
		
	
	Train t=new Train();
	t.search(123);
	t.search("RD express");
	
}
	
}
