public class Car1{
	String model;
	String color;

	// constructor
	Car1(String model, String color){
		this.model = model;
		this.color = color;
	}

	// method/s
	void drive(){
		System.out.printf("You drive a %s %s!%n", this.color, this.model);
	}
}
