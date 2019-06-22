package com.covalense.java.constructor;

import lombok.extern.java.Log;

@Log
public abstract class Pencil {

void draw() {
	log.info(""+"I am a draw method");
}
abstract void writer();
abstract void color();

}

@Log
abstract class Pen extends Pencil
{
	void writer()
	{
		log.info(""+"I am a writer method");
	}
	
}

@Log
class Marker extends Pen
{
	void color()
	{
		log.info(""+"I am a color method");
	}

	
}
