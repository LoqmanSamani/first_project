public class Student{
	// used as an instance for teaching constructor
	// inside OOP.java
	String name;
	int age;
	double gpa;
	boolean isEnrolled;

	// constructor
	Student(String name, int age, double gpa, boolean isEnrolled){
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		this.isEnrolled = isEnrolled;
	}
	// shortcut constructor to handle default values
	Student (String name, int age, double gpa){
		this(name, age, gpa, true);
	}

	void study(){
		System.out.printf("%s is studying!%n", this.name);
	}
}
