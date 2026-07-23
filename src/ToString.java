public class ToString{
	public static void main(String[] args){
		// .toString(): method ingerited from the Object class
		// used to return a string representation of an object
		// by default, it returns a hash code as a unique identifier
		// it can be overridden to provide meaningful information
		CAR car1 = new CAR("Dodge", "Challenger Hellcat", 2015, "black");
		CAR car2 = new CAR("Ford", "GT", 2005, "blue");

		// we override toString method in CAR.java so the output of the line 
		// below is different from the default output of the method!
		System.out.println(car1);
		System.out.println(car2);
	}
}
