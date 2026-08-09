import java.util.Scanner;

public class Enumerations{
	public static void main(String[] args){
		// Enums (Enumerations): a special kind of class that
		// represents a fixed set of constants.
		// they improve code readablility and are easy to maintain.
		// more efficient with switches when comparing strings.

		//Day day = Day.SUNDAY;
		//System.out.println(day);
		//System.out.println(day.getDayNumber());

		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("which day of the week do you want to examine: ");
			String response = sc.nextLine().toUpperCase();
			Day day = Day.valueOf(response);

			switch (day){
				case MONDAY    -> System.out.println("It's a weekday!");
				case TUESDAY   -> System.out.println("It's a weekday!");
	                        case WEDNESDAY -> System.out.println("It's a weekday!");
				case THURSDAY  -> System.out.println("It's a weekday!");
				case FRIDAY    -> System.out.println("It's a weekday!");
				case SATURDAY  -> System.out.println("It's a weekend!");
				case SUNDAY    -> System.out.println("It's a weekend!");
				default        -> System.out.println("Please specifiy a valid week day!");
			}
		}
		catch (IllegalArgumentException e){
			System.out.println("Enter a valid day of the week!");
		}
	}
}
