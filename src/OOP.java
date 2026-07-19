public class OOP{
	// object: an entity that holds data (attribute)
	// and can perform actions (methods)
	// it is a reference data type.

	// constructor: a special method to initialize objects
	// you can pass arguments to a constructor
	// and set up initial values

	public static void main(String[] args){
		Car car = new Car(); // create a car object
		// if we print car object we will get
		// a memory address, since objects are reference data
		System.out.println(car); // outputs: Car@1dbd16a6
		
		// access car attributes
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.price);
		System.out.println(car.isRunning);
		
		// access some methods
		car.start();
		car.stop();

		// constructors (use Student.java)
		Student student1 = new Student("Loqman", 20, 4.5, false);
		Student student2 = new Student("Shoresh", 19, 4.2);//  last argument(isEnrolled) 
		// is set by default = true, so in this case no need to specify it!

		System.out.println(student1.name);
		System.out.println(student2.age);
		System.out.println(student1.gpa);
		System.out.println(student1.isEnrolled);
		System.out.println(student2.isEnrolled);

		student1.study();
		student2.study();


		
	}
}
