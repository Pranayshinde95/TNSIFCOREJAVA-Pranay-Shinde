package HierchicalInheritance;

public class Person {
	
	private String Name;
	private String City;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	
	public Person() {
		System.out.println("Person class default values");
		Name="Pana";
		City="Pune";
		
	}
	public Person(String name, String city) {
		super();
		Name = name;
		City = city;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", City=" + City + ", getName()=" + getName() + "]";
	}
	
	
	
	
	

}