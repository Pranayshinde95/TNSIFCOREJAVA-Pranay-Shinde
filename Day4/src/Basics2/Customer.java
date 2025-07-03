package Basics2;

public class Customer {
	
	private String  customerName;
	private int customerId;
	private String customerCity;
	
	//default
	
	public Customer()
	{
		System.out.println("This is default constructor");
	}
	
	//paramterized constructor
	
	

	public Customer(String customerName, int customerId, String customerCity) {
		System.out.println("This is param constructor");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
	
	
	
	
	
	public Customer(String customerName, int customerId) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
	}
	
	void display() {
        System.out.println("Name:"+customerName+",Age:"+customerId);
      
	}

	//getter and setter
	
public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

public static void main(String[] args) {
		
	
	
	Customer c1=new Customer("Pana",21);
	
	c1.display();
	
	

	
	
	

	}

}