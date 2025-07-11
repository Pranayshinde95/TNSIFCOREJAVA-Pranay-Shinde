package com.basics8String;

public class StringComparison {

	public static void main(String[] args) {
		String s1="TNSIF"; //poolmemory
		String s2="TNSIF"; //poolmemory
		
		//creating new string operator
		String s3=new String("TNSIF"); //heapmemory
		String s4=new String("TNSIF"); //heapmemory
		
		//==equals
		System.out.println("Case 1:"+(s1==s2));
		System.out.println("Case 2:"+(s1==s3));
		System.out.println("Case 3:"+(s1==s4));
		System.out.println("Case 4:"+(s2==s3));
		System.out.println("Case 5:"+(s2==s4));
		System.out.println("Case 6:"+(s3==s4));
		System.out.println("Case 7:"+(s2.equals(s4)));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compare by using compareTo
		
		System.out.println(s1.compareTo(s4));
		
		System.out.println(s1.compareToIgnoreCase(s4));
		
				

	}

}
