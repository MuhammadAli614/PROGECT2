package classAndObject;

public class House {
	
	//declare variable
	
	int houseAddress;
	protected String houseName;
	private String housePassword= "abc123";
	//declare constructors
	
	// declare methods/function
	
	public void Kitchen() {
		System.out.println("You are allowed to cook in the kitchen");
	}
	public void LivingHouse() {
		System.out.println("you can watch tv in living room");
	}
	public void HouseEntry() {
		System.out.println("protected");
	}
}
