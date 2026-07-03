public class ternaryOperator{
	public static void main(String[] args){
		// ternary operator ? = return one of two values if a condition is true
		// variable = (condition)? ifTrue : ifFalse;

		//example 1
		int score = 50;
		// instead of using the if statement below
		//if (score >= 40){
		//	System.out.println("PASS");
		//} else{
		//	System.out.println("FAIL");
		//}
		// we use ternary operator as follow:
		String passOrFail = (score >= 40) ? "Pass" : "FAIL";
		System.out.println(passOrFail);
		
		// example 2
		int num = 133;
		String evenOrOdd = (num % 2 == 0)? "Even" : "Odd";
		System.out.println(evenOrOdd);

		// example 3
		int hour = 6;
		String amOrPm = (hour < 12)? "A.M." : "P.M.";
		System.out.println(amOrPm);

		// ecample 4
		double salary = 39000;
		double taxRate = (salary >= 40000) ? 0.25 : 0.15;
                //System.out.printf("You earn %.2f, so your tax rate is %.2f percent.%n", salary, taxRate);
		System.out.printf("You earn %.2f, so your tax rate is %.2f%%.%n", salary, taxRate); 
	}
}
