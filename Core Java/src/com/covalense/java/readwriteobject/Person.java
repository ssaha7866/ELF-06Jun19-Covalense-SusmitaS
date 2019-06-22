package com.covalense.java.readwriteobject;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {
	private String name;
	private transient int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
