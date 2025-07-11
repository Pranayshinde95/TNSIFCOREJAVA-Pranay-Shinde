package com.basics8String;

public class SimpleStringDemo {

	public static void main(String[] args) {
		
		//initialize string
		
		char c[]={'c','a','s','s','i','d','y'};
		
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String(c);
		System.out.println(s2);
		
		//concatenation
		
		String longstr="This is string"+ "\t" +"how many more"+ "\t" +"can be done";
		System.out.println(longstr);
				
				

	}

}
