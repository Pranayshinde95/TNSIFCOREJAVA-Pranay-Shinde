package com.basics6Static;

public class MyClass {
	
	private int section;//non static
	
	private static int srNo;//ststic
	
	
	//static block
	{
		System.out.println("within static block");
	}


	public MyClass(int section) {
		
		this.section = section;
		
		 section=101;
		 srNo=1001;
	}


	public MyClass() {
		System.out.println("within default constructor");
		
		srNo++;
		section++;
		
		

	}


	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method
	static void display()
	{
		System.out.println("SerailNo:"+srNo);
	}
	
	
	

	

}
