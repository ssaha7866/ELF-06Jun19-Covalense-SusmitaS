package com.covalense.java.constructor;
import lombok.extern.java.Log;

@Log
public abstract class Google {
	void login()
	{
		log.info(""+"login method has run");
	}
	abstract void shareDocuments();

}

@Log
class Gmail extends Google{
	void shareDocuments()
	{
		log.info(""+"shareDocument in Gmail method has run");
	}
}

@Log
class Gdrive extends Google{
	void shareDocuments()
	{
		log.info(""+"shareDocument in Gdrive method has run");
	}
}


class Browser
{
	void open(Google g)
	{
		g.login();
		g.shareDocuments();
	}
}


