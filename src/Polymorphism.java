public class Polymorphism{
	public static void main(String[] args){
		/*
		polymorphism: poly->many, moph->shape
		objects can identify as other objects
		objects can be treated as objects of
		a common superclass
		*/
		Auto car = new Auto();
		Bike bike = new Bike();
		Boat boat = new Boat();
		car.go();
		bike.go();
		boat.go();

		// creating an array of vehicles
		Vehicle[] vehicles = {car, bike, boat};
		for (Vehicle vehicle: vehicles){
			
			System.out.println(vehicle);// i already overrode toString() method of the class!
			vehicle.go();
			System.out.println("    ----    ");
		}
	}
}
