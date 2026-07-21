public class arrayObjects{
	public static void main(String[] args){

		// instances of Car1.java
		Car1 car1 = new Car1("Ford", "black");
		Car1 car2 = new Car1("Corvette", "yellow");
		Car1 car3 = new Car1("Charger", "red");

		// create an array of car objects
		Car1[] cars = {car1, car2, car3};
		for (Car1 car: cars){
			car.color = "white"; // change the color of each car
			System.out.printf("This is a %s %s!%n", car.color, car.model);
			car.drive();
		}
	}
}
