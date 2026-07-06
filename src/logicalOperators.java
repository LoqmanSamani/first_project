import java.util.Scanner;

public class logicalOperators{
	public static void main(String[] args){
		// logical operators in java
		// && : and
		// || : or
		// ! : not

		// example 1
		double temp = 22.04;
		boolean isSunny = false;

		if (temp >= 20.0 && temp < 30.0 && isSunny){
			System.out.println("Temp in the range!");
			System.out.println("isSunny is True!");
		}
		else if (temp >= 20.0 && temp < 30.0 && !isSunny){
			System.out.println("temp is still in the range!");
			System.out.println("but it is not sunny out there!");
		}
		else if (temp < 0.0 || temp >= 30.0){
			System.out.println("weather is bad!");
		}
		else{}

		// example
		Scanner sc = new Scanner(System.in);
		
		// rules
		// username must have 4 to 14 chars
		// it can not contain underscore  or spaces
		String username;
		System.out.print("Specify your username: ");
		username = sc.nextLine();

		if (username.length() < 4 || username.length() > 14){
			System.out.println("username length must be between 4 and 14 chars!");
			return;
		}
		else {
			for (int i = 0; i < username.length(); i++){
				char c = username.charAt(i);
				if (c == '_' || c == ' '){
					System.out.println("username should not contain underscore or space!");
					return;
				}
			}
		}
		System.out.printf("You successfully created your username (%s)!%n", username);
		sc.close(); //  close the scanner
	}
}
