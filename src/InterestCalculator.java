import java.util.Scanner;

public class InterestCalculator{
	public static void main(String[] args){
		// compound interest calculator
		Scanner sc = new Scanner(System.in);
		double principal;
		double rate;
		int timesCompounded;
		int years;
		double amount;
		
		System.out.print("Enter principal amount: ");
		principal = sc.nextDouble();

		System.out.print("Enter the interest rate (in %): ");
		rate = sc.nextDouble() / 100.0;// to make it percentage!

		System.out.print("Enter the # times compounded in a year: ");
		timesCompounded = sc.nextInt();

		System.out.print("Enter the investment's years: ");
		years = sc.nextInt();
                
		// interest calculation
		amount = principal * Math.pow(1+(rate/timesCompounded), timesCompounded*years);
		System.out.printf("The amount after %d years is $%.2f\n", years, amount); 	

		sc.close();
		
	}
}
