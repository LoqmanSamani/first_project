public class ST extends Person{
	double gpa;

	ST(String firstName, String lastName, double gpa){
		// super is used to specify attribute of the parent class		
  		super(firstName, lastName);
		this.gpa = gpa;
	}

	void showInfo(){
		System.out.printf("%s %s with a gpa of %.1f%n", this.firstName, this.lastName, this.gpa);
	}
}
