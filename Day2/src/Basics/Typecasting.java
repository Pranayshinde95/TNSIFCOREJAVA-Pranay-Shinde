package Basics;

public class Typecasting {

	public static void main(String[] args) {
		
		//whitening (short to big)
		byte b =10;
		int i=b;  //syntax
		
		System.out.println(i);
		
		float num=22.4f;
		double num1=num;
		
		System.out.println(num1);
		
		//Narrowing(big to short) //explicit typecasting
		
		double f1=10.52d; //double to long
		long l1=(long) f1;  //syntax
		
		System.out.println(l1);
		
		
		
		
		

	}

}