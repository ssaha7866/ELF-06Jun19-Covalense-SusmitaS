package com.covalense.java.constructor;
import lombok.extern.java.Log;


public interface Printer {
	void print();

}

@Log
class Sony implements Printer
{
	public void print()
	{
		log.info(""+"i am print() method");
	}
}
