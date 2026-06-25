import java.util.Scanner;

public class MadLibsGame{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		// variables
		String noun1;
		String verb1;
		String adj1;
		String adj2;
		String adj3;

		// ask for inputs
	        System.out.print("Enter an adjective (description): ");
		adj1 = scanner.nextLine();
		System.out.print("Enter another adjective (description): ");
		adj2 = scanner.nextLine();
		System.out.print("Enter the last adjective (description): ");
		adj3 = scanner.nextLine();
		System.out.print("Enter a noun (person or animal): ");
		noun1 = scanner.nextLine();
		System.out.print("And finally, enter a verb ending with -ing (action): ");
		verb1 = scanner.nextLine();

		// outputs
		System.out.println("---------------------");
		System.out.println("Yesteday i went to a " + adj1 + " zoo!");
		System.out.println("In an exibit, i saw a " + noun1 + ".");
		System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "!");
		System.out.println("I was " + adj3 + "!");
		System.out.println("---------------------");
		scanner.close();
	}
}

