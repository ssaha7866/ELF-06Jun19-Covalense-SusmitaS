package com.covalense.java.assessment.mobileobject;

import lombok.extern.java.Log;
/**
 * 
 * Class to display the mobile object
 *
 */
@Log
public class DisplayMobile {

	 public static void display(MobileBean m) {
			
		 log.info("Mobile name "+m.getName()+" Mobile cost "+m.getCost());
	}

}
