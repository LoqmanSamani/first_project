public class Auto extends Vehicle{
	@Override
	void go(){
		System.out.println("You drive the car!");
	}
	@Override
	public String toString(){
		return "This is a car!";
	}
}
