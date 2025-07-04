package HierchicalInheritance;

public class Employee extends Person {
	
	private int empId;
	private float salary;
	private String dept;
	
	
	public Employee() {
		System.out.println("Employee class default constructor");
		
		empId=141;
		salary=69f;
		dept="software";
		
		
	}


	public Employee(int empId, float salary, String dept) {
		
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", toString()=" + super.toString() + "]";
	}


	
	
	
	
	
	
	

}