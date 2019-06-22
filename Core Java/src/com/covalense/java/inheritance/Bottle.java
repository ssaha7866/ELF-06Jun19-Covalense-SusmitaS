package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Bottle {
	void open()
	{
		log.info(""+"OPEN BOTTLE");
	}
	void drink()
	{
		log.info(""+"DRINK");
	}
}
