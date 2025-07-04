package com.basics4Inheritance;


//child class
public class Student extends Citizen {
	
	//data member
	
	
	private int rollno;
	private String collegename;
	
	
	public Student(String string, String string2, String string3, int i, int j, String string4) {
		super();
	}


	public Student(int rollno, String collegename) {
		super();
		this.rollno = rollno;
		this.collegename = collegename;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + ", getName()=" + getName()
				+ ", getAdharno()=" + getAdharno() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
	
	
	
	
	

}
