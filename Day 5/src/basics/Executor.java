package basics;

public class Executor {

	public static void main(String[] args) {
		
		Address address=new Address("101 Laxmi nagar","Pune","Maharashtra","411061");
		
		Person p=new Person("Pana",address);
		
		p.displayinfo();
		System.out.println(p);

	}

}