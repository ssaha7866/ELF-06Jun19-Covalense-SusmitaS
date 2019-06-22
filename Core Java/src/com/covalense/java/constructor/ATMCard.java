package com.covalense.java.constructor;

import lombok.extern.java.Log;


public interface ATMCard {
	void validate();

	void getInfo();
}


@Log
class HDFC implements ATMCard {
	public  void validate() {
		log.info(""+"validation done by HDFC");
	}

	public void getInfo() {
		log.info(""+"got info from HDFC");
	}

}


@Log
class ICICI implements ATMCard {
	public void validate() {
		log.info(""+"validation done by ICICI");
	}

	public void getInfo() {
		log.info(""+"got info from ICICI");
	}

}


@Log
class SBI implements ATMCard{
	public void validate()
	{
		log.info(""+"validation done by SBI");
	}
	public void getInfo()
	{
		log.info(""+"got info from SBI");
	}
	
}
class Machine {
	void slot(ATMCard a) {
		a.validate();
		a.getInfo();
	}
}