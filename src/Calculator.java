import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		// a basic calculator

		Scanner sc = new Scanner(System.in);

		// variables
		String operator = "";
		double num1 = 0;
		double num2 = 0;

		// inputs
		System.out.print("Enter the first number: ");
		num1 = sc.nextDouble();
		System.out.print("Enter the operator (+, -, *, /, ^): ");
		operator = sc.next();
		System.out.print("Enter the second number: ");
		num2 = sc.nextDouble();

		switch (operator){
			case "+"  -> System.out.printf("%.2f %s %.2f = %.2f%n", num1, operator, num2, num1+num2);
			case "-"  -> System.out.printf("%.2f %s %.2f = %.2f%n", num1, operator, num2, num1-num2);
			case "*"  -> System.out.printf("%.2f %s %.2f = %.2f%n", num1, operator, num2, num1*num2);
			case "/"  -> System.out.printf("%.2f %s %.2f = %.2f%n", num1, operator, num2, num1/num2);
			case "^" -> System.out.printf("%.2f %s %.2f = %.2f%n", num1, operator, num2, Math.pow(num1, num2));
			default   -> System.out.println("Please use an available operator: (+, -, *, /, ^)");
		}
		sc.close();
	}
}
