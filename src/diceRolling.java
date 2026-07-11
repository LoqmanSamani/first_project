import java.util.Random;
import java.util.Scanner;

public class diceRolling{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int numDice = 0;
		int randomRoll;
		int sum = 0;

		System.out.print("Enter the number of dices: ");
		numDice = sc.nextInt();
		
		for (int i = 0; i < numDice; i++){

			randomRoll = r.nextInt(1, 7);

			switch (randomRoll){
				case 1 -> {
					System.out.println("You rolled: 1");
					System.out.println(" ------- ");
					System.out.println("|       |");
					System.out.println("|   ●   |");
					System.out.println("|       |");
					System.out.println(" ------- ");
				 	System.out.println();
					}
				case 2 -> {
					System.out.println("You rolled: 1");
					System.out.println(" ------- ");
					System.out.println("|       |");
					System.out.println("|  ● ●  |");
					System.out.println("|       |");
					System.out.println(" ------- ");
				 	System.out.println();
					}
				case 3 -> {
					System.out.println("You rolled: 1");
					System.out.println(" ------- ");
					System.out.println("| ●     |");
					System.out.println("|   ●   |");
					System.out.println("|     ● |");
					System.out.println(" ------- ");
				 	System.out.println();
					}
				case 4 -> {
					System.out.println("You rolled: 1");
					System.out.println(" ------- ");
					System.out.println("|  ● ●  |");
					System.out.println("|       |");
					System.out.println("|  ● ●  |");
					System.out.println(" ------- ");
				 	System.out.println();
					}
				case 5 -> {
					System.out.println("You rolled: 1");
					System.out.println(" ------- ");
					System.out.println("|  ● ●  |");
					System.out.println("|   ●   |");
					System.out.println("|  ● ●  |");
					System.out.println(" ------- ");
				 	System.out.println();
					}
				case 6 -> {
					System.out.println("You rolled: 1");
					System.out.println(" ------- ");
					System.out.println("|  ● ●  |");
					System.out.println("|  ● ●  |");
					System.out.println("|  ● ●  |");
					System.out.println(" ------- ");
				 	System.out.println();
					}

			}

			sum += randomRoll;
		}

		System.out.printf("Sum of all your rolls (%d rolls): %d%n", numDice, sum);
		sc.close();
	}
}
