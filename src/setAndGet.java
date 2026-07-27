public class setAndGet{
	public static void main(String[] args){
		// they will protect object data 
		// and set rules for accessing or modifying them
		// getters: methods that make a field readable
		// setters: methods that make a field wirtable
		Car2 car = new Car2("Dodge Hellcat", "black", 60000);
		System.out.println(car);
		
		// call getters
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getPrice());

		// change (private) attributes using setters
		car.setModel("Dodge Charger Hellcat");
		car.setColor("red");
		car.setPrice(-1000);//to test the if statement
		car.setPrice(52000);

		// call tostring and getters to confirm the chages
		System.out.println(car);
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getPrice());

	}
}
