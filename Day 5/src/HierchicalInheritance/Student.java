package HierchicalInheritance;

public class Student extends Person {
	
	private String Standard;
	private float Percentage;
	public Student() {
		System.out.println("Student class default constructor");
		
		Standard="seventh";
		Percentage=88.9f;
	}
	
	
	
	public Student(String standard, float percentage) {
		super();
		Standard = standard;
		Percentage = percentage;
	}



	@Override
	public String toString() {
		return "Student [Standard=" + Standard + ", Percentage=" + Percentage + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
	
	
	
	

}