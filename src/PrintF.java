public class PrintF{
	public static void main(String[] args){
		// printf statement in java
		String name = "Spongebob";
		char firstChar = 'S';
		int age = 28;
		double height = 60.34;
		boolean isEmployed = true;
		// % is used a place-holder!
		System.out.printf("Your name is %s\n", name);// s for string
		System.out.printf("The first character of your name is %c\n", firstChar);// c for char
		System.out.printf("You are %d years old!\n", age);// d for integer
		System.out.printf("You are %f inches tall!\n", height);// f for double
		System.out.printf("Employed: %b\n", isEmployed);// b for boolean
                // multi-variables
		System.out.printf("%s is %d years old and is %.1f inches tall!\n", name, age, height);
		// .1 means round to one floating number, we can use .2 or higher percisions
		
	}
}
