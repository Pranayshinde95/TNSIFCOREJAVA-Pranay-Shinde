package Basics1;

public class Switch {

	public static void main(String[] args) {
		int userInput=3;
		switch(userInput)
		{
		case 1:System.out.println("Details");
		break;
		
		case 2:System.out.println("Expiry");
		break;
		
		case 3:System.out.println("New offers");
		break;
		
		case 4:System.out.println("Talk to our support person");
		break;
		
		default:
			System.out.println("not a valid input ");

	}

}
}