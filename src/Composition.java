public class Composition{
	public static void main(String[] args){
		// composition: represent a "part-of" relationship between objects
		// for example an engine is part of a car
		// allows complex objects to be constructed from smaller objects
		AUTO car = new AUTO("Dodge Charger Hellcat", 2017, "v8");

		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.engine.type);
		car.start();
	}
	
}
