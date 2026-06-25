// importy scanner from util package of java
import java.util.Scanner;


public class UserInput{
	public static void main(String[] args){

		Scanner  scanner = new Scanner(System.in);
 		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + " and welcome to our platform!");

		System.out.print("let me ask you one more question!\n How old are you " + name + "? ");
		int age = scanner.nextInt();
		System.out.println("nice! you are " + age + " and still young!");
		// for double inputs, we can use "scanner.nextDouble()".
		// and for boolean we use "scanner.nextBoolean()" method.
		// for clearing the buffer we can simply use "scanner.nextLine()"
		// without assigning it to anything!
		scanner.close();
	}
}
