public class Super{
	public static void main(String[] args){
		// super: refers to the parent class
		// subclass(child) <- superclass(parent)
		// used in constructors or method overriding
		// calls the parent constructor to initialize attributes
		Person person = new Person("Loghman", "Samani");
		person.showName();

		ST student = new ST("Loqman", "Samani", 4.7);
		student.showInfo();

		Employee employee = new Employee("Loghman", "Samani", 4000);
		employee.earning();
	}
}
