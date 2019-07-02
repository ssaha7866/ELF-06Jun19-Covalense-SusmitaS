package com.covalense.java.assignmenttwo;

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
