import java.util.Scanner;

public class ArithmeticOpt{

	public static void main(String[] args){
		// arithmetic operations
		int x;
		int y;
		int z;
		char operation;
     		
		// ask for inputs
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number (int): ");
		x = scanner.nextInt();
		System.out.print("Enter another number (int): ");
		y = scanner.nextInt();
		System.out.print("Enter an operation (+, -, *, / or %): ");
		operation = scanner.nextLine().charAt(0);// there is no specific nextchar method 
		// so we use the command above to store the input char.

		// apply operation   
		if (operation == '+'){
		    z = x + y;
		}else if (operation == '-'){
		    z = x - y;
		}else if (operation == '*'){
		    z = x * y;
		}else if (operation == '/'){
		    z = x / y;
		}else if (operation == '%'){
		    z = x % y;
		}else{
 		    System.out.println("Something went wrong!!! please check your inputs.");
		}

		// print result
		System.out.println("--------------------");
		System.out.println("x " + operation + " y" + " = " + "z");
		System.out.println("--------------------");

		scanner.close();
   		
	}	
}
