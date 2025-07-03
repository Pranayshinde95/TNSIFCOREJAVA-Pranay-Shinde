package Basics3;

public class Base {

	int varDefault = 10;
	public int varpublic = 20;
	private int varprivate = 30;
	protected int varproctected =40;
	private String varPublic;
	
	void methodDefault() {
		
		System.out.println("default access base class");
		System.out.println("Public varible :"+varDefault);
	}
	public void methodPublic() {
		System.out.println("Public access base class");
		System.out.println("Public varible :"+varPublic);
	}
	private void methodPrivate() {
		System.out.println("Private access base class");
		String varPrivate;
		System.out.println("Private varible :"+varprivate);
	}
}
	