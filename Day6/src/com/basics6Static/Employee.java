package com.basics6Static;

public class Employee {
	
	private String name;
	private int id;
	
	//Declare a static companyName with data type string
	
	static String companyname="TNSIF";

	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ",company=" + companyname + "]";
	}
	
	
	
	

}
