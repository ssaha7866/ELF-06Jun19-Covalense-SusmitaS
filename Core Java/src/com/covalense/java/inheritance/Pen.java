package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Pen {
	int cost;
	void write()
	{
		log.info(""+"I AM WRITE() METHOD");
	}

}


@Log
class Marker2 extends Pen
{
	double size;
	void color()
	{
		log.info(""+"I AM COLOR() METHOD");
	}
}