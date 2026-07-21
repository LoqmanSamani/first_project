public class Inheritance{
	public static void main(String[] atgs){
		// inheritance: one class inherits attributes and methods
		// from another class
		// child class <- parent class <- grandparent
		Animal animal = new Animal();
		Plant plant = new Plant(); // this also inherits from Organism
		animal.eat();
		Dog dog = new Dog();
		Cat cat = new Cat();

		// the attribute (isAlive) and the method (eat())
		// are only defined inside Animal class and 
		// Dog and Cat classes inherited them.
		dog.eat();
		System.out.println(dog.isAlive);
		cat.eat();
		System.out.println(cat.isAlive);

		// these methods and attributes are specifically 
		// defined inside each class
		System.out.println(dog.lives);
		dog.speak();
		System.out.println(cat.lives);
		cat.speak();

		System.out.println(plant.isAlive);
		plant.photosynthesize();
	}
}
