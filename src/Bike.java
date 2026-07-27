public class Bike extends Vehicle{
	@Override 
	void go(){
		System.out.println("You ride the bike!");
	}
	@Override
	public String toString(){
		return "This is a bike!";
	}
}
