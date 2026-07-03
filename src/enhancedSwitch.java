public class enhancedSwitch{
	public static void main(String[] args){
		// enhanced switch: a replacement to many if-else statements
		String day = "Su";
		switch (day){
			case "Monday"    -> System.out.println("It's a weekday!");
			case "Tuesday"   -> System.out.println("It's a weekday!");
			case "Wednesday" -> System.out.println("It's a weekday!");
			case "Thursday"  -> System.out.println("It's a weekday!");
			case "Friday"    -> System.out.println("It's a weekday!");
			case "Saturday"  -> System.out.println("It's a weekend!");
			case "Sunday"    -> System.out.println("It's a weekend!");
			default          -> System.out.printf("%s is not a day!%n", day);
		}
	}

}
