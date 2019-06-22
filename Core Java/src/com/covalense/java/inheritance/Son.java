package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Son extends Father{
	void bike()
	{
		log.info(""+"@overridden BIKE");
	}

}
