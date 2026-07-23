public class methodOverriding{
	public static void main(String[] args){
		// method overriding: when a subclass provides
		// its own implementation of a method
		// that is already defined.
		// allows for code reusability and 
		// specific implementations.
		Horse horse = new Horse();
		Rabbit rabbit = new Rabbit();
		Fish fish = new Fish();

		horse.move();
		rabbit.move();
		fish.move();

	}
}
