import java.util.Scanner;

public class whileLoops{
	public static void main(String[] args){
		// while loops in java

		Scanner sc = new Scanner(System.in);

		String firstName = "";
		String surName = "";
		String password = "";

		while (firstName.isEmpty()){
			System.out.print("Enter your first name: ");
			firstName = sc.nextLine();
		}
		while (surName.isEmpty()){
			System.out.print("Enter your sur name: ");
			surName = sc.nextLine();
		}
		while(password.isEmpty()){
			System.out.print("Enter your password: ");
			password = sc.nextLine();
			if (password.length() < 8 || password.length() > 22){
				System.out.println("password must have 8-22 chars!");
				password = "";
			}
		}
		
		sc.close(); // close the scanner!
	}
}
