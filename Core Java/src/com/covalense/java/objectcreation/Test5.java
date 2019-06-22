package com.covalense.java.objectcreation;

import lombok.extern.java.Log;


public class Test5 {

	public static void main(String[] args) {
		ComMail cm=new ComMail();
		cm.sid="abcd@gmail.com";
		cm.subject="code";
		cm.rid="xyz@gmail.com";
		cm.sendMsg();
		cm.sendFile();
	}

}


@Log
class ComMail
{
	
	String sid;
	String rid;
	String subject;
	void sendMsg()
	{
		log.info(""+"IT IS USED TO SEND MESSEGES");
	}
	void sendFile()
	{
		log.info(""+"IT IS USED TO SEND FILES");
	}
}
