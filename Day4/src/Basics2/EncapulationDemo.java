package Basics2;

public class EncapulationDemo {
	
	private int SerialNum;
	private String Name;
	private int Age;
	public int getSerialNum() {
		return SerialNum;
	}
	public void setSerialNum(int serialNum) {
		SerialNum = serialNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Encapsulationdemo [SerialNum=" + SerialNum + ", Name=" + Name + ", Age=" + Age + "]";
	}
	

	public static void main(String[] args) {
	//TODO Auto-generated method stub
		
	EncapulationDemo obj=new EncapulationDemo();
	
	obj.setName("Pranay");
	obj.setAge(21);
	obj.setSerialNum(007);
	
	System.out.println(obj);
}

}