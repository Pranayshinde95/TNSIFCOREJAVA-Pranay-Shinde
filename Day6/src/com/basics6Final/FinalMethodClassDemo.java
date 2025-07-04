package com.basics6Final;

final class FinalClass{
	void show () {
		System.out.println("Final class cannot be inherited");
	}
}

//class Student extends FinalClass{
	//system.out.println("we cannot inherit from final class");
//}
public class FinalMethodClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalClass f=new FinalClass();
		f.show();

	}

}
