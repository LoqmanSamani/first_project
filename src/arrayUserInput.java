import java.util.Scanner;


public class arrayUserInput{
	public static void main(String[] args){
		// how to assign user input into an array
		// alocate space for an array of size 5
		String[] foods = new String[5];
		//System.out.println(foods.length);
		Scanner sc = new Scanner(System.in);
		int currentSize = 0;
		while (currentSize < foods.length){
			System.out.print("Enter a food: ");
			String input = sc.nextLine();

			if (input.isEmpty()){
				System.out.println("Empty input is ignored! please enter a valid food!");
				continue;
			}
			foods[currentSize] = input;
			currentSize++;
			System.out.println("Food added! slots remaining: " + (foods.length - currentSize));
		}
		System.out.println("-----------------------------------------");
		System.out.println("Array is full! here is list of the foods: ");
		System.out.println("-----------------------------------------");
		for (String food: foods){
			System.out.println("    - " + food);
		}
	}
}
