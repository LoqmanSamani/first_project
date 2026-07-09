import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class bankingProgramm{
	static double accountBalance = 10000;
	public static void main(String[] args){
		// a simple banking programm
		Scanner sc = new Scanner(System.in);
		int activity;
		double balance = 0.0;
		double add = 0.0;
		double reduce = 0.0;
		System.out.println("--------------------------------");
		System.out.println("Welcome to your account!");
		System.out.println("--------------------------------");
		System.out.println("Available functionalities: ");
		System.out.println("  a. Enter 1 for show balance.");
		System.out.println("  b. Enter 2 for deposit money.");
		System.out.println("  a. Enter 3 for withdraw money.");
		System.out.println("  a. Enter 4 for exit.");
		System.out.println("--------------------------------");
		do{
			System.out.print("What do you want to do: ");
			activity = sc.nextInt();
			switch(activity){
				case 1 -> {
						add = 0.0;
						reduce = 0.0;
						balance = getBalance(add, reduce);
						currentDate();
						currentTime();
						System.out.println("Current Balance: " + balance);
					}
				case 2 -> {
						System.out.print("How much do you want to add to your balance: ");
						add = sc.nextDouble();
						reduce = 0.0;
						balance = getBalance(add, reduce);
						currentDate();
						currentTime();
						System.out.println("Current Balance: " + balance);
					}
				case 3 -> {
						System.out.print("How much do you want to reduce from your balance: ");
						reduce = sc.nextDouble();
						add = 0.0;
						balance = getBalance(add, reduce);
						currentDate();
						currentTime();
						System.out.println("Current Balance: " + balance);
					}
				case 4 -> {
					System.out.println("See you around!!!");
				}
				default -> System.out.println("False input!!!");
			}
			
		
		}while(activity != 4);
		sc.close();
	}
	static void currentTime(){
		DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
		String time = LocalTime.now().format(f);
		System.out.println("Current Time: " + time);
	}
	static void currentDate(){
		LocalDate date = LocalDate.now();
	        System.out.println("Current Date: " + date);
	}
	static double getBalance(double add, double reduce){
		accountBalance = accountBalance + add - reduce;
		return accountBalance;
	}
}

