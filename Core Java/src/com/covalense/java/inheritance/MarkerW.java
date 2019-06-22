package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class MarkerW extends PenW{
	@Override
	void write()
	{
		log.info(""+"I AM WRITING WITH A MARKER");
	}

}
