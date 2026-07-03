import java.util.Scanner;

public class tempConvertor{
	public static void main(String[] args){
		// converts celsius to fahrenheit and vise versa
		Scanner sc = new Scanner(System.in);
		// variables
		int unit = 0;
		double inTemp = 0;
		double finalTemp = 0.0;

		// basic info
		System.out.println("---------------------------------");
		System.out.println("     Temperature convertor");
		System.out.println("     Available units:");
		System.out.println("     a. Celsius: 1");
		System.out.println("     b. Fahrenheit: 2");
		System.out.println("---------------------------------");
		
  		// inputs
		System.out.print("Enter the final unit(1 or 2): ");
		unit = sc.nextInt();
		System.out.print("Enter your temperature: ");
		inTemp = sc.nextDouble();

		// else condition
		if (unit != 1 && unit != 2){
			System.out.println("Please specify a valid unit!");
			System.out.println("1 for celsius and 2 for fahrenheit");
			return;
		}
		// calculations
		finalTemp = (unit == 2)? ((inTemp * 1.8)+ 32.0) : ((inTemp - 32.0) * (5.5/9.0));
		
		// print output
		System.out.printf("The converted temperture is: %.2f%n", finalTemp); 

		sc.close(); 
	}

}
