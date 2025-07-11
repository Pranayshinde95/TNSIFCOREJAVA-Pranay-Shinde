package com.basics9;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		//Student student=new Student(0,null);
		
		Student [] arr;
		
		arr=new Student[5];
		
		arr[0]=new Student(10, "pana");
		arr[1]=new Student(11, "d");
		arr[2]=new Student(12, "a");
		arr[3]=new Student(13, "d");
		arr[4]=new Student(14, "y");
		
		for(int i=0;i<=arr.length;i++) {
			System.out.println("Elements at"+"\t"+i+":"+arr[i].getRollno()+"");
		}
		 

	}

}
