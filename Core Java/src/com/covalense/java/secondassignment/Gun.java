package com.covalense.java.secondassignment;

import lombok.extern.java.Log;

@Log
public class Gun {
	
	int bullet;
	
	Gun()
	{
		bullet=5;
		log.info(""+"Gun with "+bullet+" bullets");
	}

}
