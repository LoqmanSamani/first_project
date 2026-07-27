public class Boat extends Vehicle{
	@Override
	void go(){
		System.out.println("You sail the boat!");
	}
	@Override
	public String toString(){
		return "This is a boat!";
	}
}
