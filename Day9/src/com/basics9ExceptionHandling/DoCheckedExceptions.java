package com.basics9ExceptionHandling;

public class DoCheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[];
		try {
			x=new int[]{1,2,3,4,5,};
			System.out.println(x[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

	}

}
