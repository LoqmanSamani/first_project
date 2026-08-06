import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions{
	public static void main(String[] args){
		// exception: an event that interrupts the normal flow of a program
		// (e.g., deviding by zero, file not found, mismatch input type)
		// surrounds any dangerous code by a try{} block.
		// try{}, catch{}, finally{}
		
		Scanner sc = new Scanner(System.in);
		// examples
		try{
			System.out.println(1/0); // division by zero
		}
		catch(ArithmeticException e){
			System.out.println("You can NOT divide any number by zero!");
		}

		try{
			System.out.print("Enter a number: ");
			double num = sc.nextDouble();
		}
		catch(InputMismatchException e){
			System.out.println("Please enter a number (integer or float)!");
		}

		try{
			System.out.println(1/0);
		}
		catch(Exception e){
			System.out.println("Something went wrong!");
		}
		
		finally{
			sc.close();
			System.out.println("Scanner is closed!");
		}
	}
}
