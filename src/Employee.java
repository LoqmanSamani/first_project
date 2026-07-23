public class Employee extends Person{
	int salary;

	Employee(String firstName, String lastName, int salary){
		super(firstName, lastName);
		this.salary = salary;
	}
	void earning(){
		System.out.printf("%s %s earns $%d %n", this.firstName, this.lastName, this.salary);
	}
}
