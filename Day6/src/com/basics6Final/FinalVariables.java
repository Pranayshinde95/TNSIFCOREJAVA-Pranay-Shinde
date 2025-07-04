package com.basics6Final;

public class FinalVariables {
	//final int a;
	final int x=100;
	
	//declare a static blank final variable
	
	final static int y;
	final static int z=10;
	
	//instance method
	
	void change() {
		//x=30; cannot be changed or reassisgned
		
	}

	@Override
	public String toString() {
		return "FinalVariables [x=" + x + ",y=" + y + "]";
	}
	
	//declare a static block
	static {
		y=10;
	}
	
	

}
