package com.basics6Final;

public class FinalMethodClass {

	public FinalMethodClass() {
		System.out.println("This is default constructor");
	}
	
	final int a =50;
	
	//final method
	final void show() {
		System.out.println("value of a "+a);
	}
	
	

}
