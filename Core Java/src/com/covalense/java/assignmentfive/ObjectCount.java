
package com.covalense.java.assignmentfive;

import java.util.logging.Logger;
/**
* WAP to count the number of objects created in that respective class
 */
public class ObjectCount {

private static final Logger log=Logger.getLogger("bhavani");

	static int count;

	public ObjectCount() {
		count++;

	}

	static void getCount() {
		log.info("number of object created= " + count);
	}

}
