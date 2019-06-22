package com.covalense.java.extras;

public class MyArrayClass {
	private Object[] myArray;
	private int index;
	private Object[] myArray2;

	public MyArrayClass() {
		this(10);

	}

	public MyArrayClass(int size) {

		if (size < 0) {
			throw new ArrayIndexOutOfBoundsException("Size should be Greater than zero!!!");
		}
		myArray = new Object[size];
		index = 0;
		myArray2 = new Object[20];
	}

	public void add(Object val) {
		if (index >= myArray.length) {
			System.arraycopy(myArray, 0, myArray2, 0, myArray.length);
			myArray=myArray2;
		}
			myArray2[index] = val;
			index++;
		
	}

	public Object get(int position) {

		return myArray[position];
	}

	public void remove(int position) {
		/*
		 * if(position>myArray.length) { throw new ArrayIndexOutOfBoundsException(); }
		 * else {
		 */
		System.arraycopy(myArray, (position + 1), myArray, position, ((myArray.length - 1) - position));
		myArray[myArray.length - 1] = null;

	}
	
	public int getSize() {
		return index-1;
	}

}// class end
