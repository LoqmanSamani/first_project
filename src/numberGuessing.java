import java.util.Scanner;
import java.util.Random;

public class numberGuessing{
	public static void main(String[] args){
		// number guessing game
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("--------------------------------");
		System.out.println("welcome to number guessing game!");
		System.out.println("--------------------------------");
		
		int guessedNum;
		int num;
		int count = 0;

		do{
			num = r.nextInt(1, 10);
			System.out.print("Guess a number in range[1, 10]: ");
			guessedNum = sc.nextInt();
			count++;
		}while(num != guessedNum);
 
		System.out.printf("after %d guesses, you correctly guessed the number!%n", count);
		System.out.printf("num: %d, guessedNum: %d, count: %d%n", num, guessedNum, count);

		sc.close();

	}
}
