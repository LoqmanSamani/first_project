import java.util.Random;
import java.util.Scanner;


public class rockPaperGame{
    public static void main(String[] args){
        // rock-paper-scissors game
        int[] rounds; // how many round do you want to play!
        String[] opts = {"rock", "paper", "scissors"};
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("------------------------------------------");
        System.out.println("-  Welcome to Rock Paper Scissors Game   -");
        System.out.println("------------------------------------------");

        System.out.print("  How many round do you want to play: ");
        int totalRounds = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character in buffer
        rounds = new int[totalRounds];
        
        for (int i = 0; i < rounds.length; i++) {
            System.out.println("-------- round " + (i+1) + "/" + rounds.length + "  ---------");
            String yourChoice = "";
            int randNum = r.nextInt(3); // Generates 0, 1, or 2
            boolean isThere = false;
            
            do {
                System.out.print("Enter your choice (opts: rock, paper, scissors): ");
                yourChoice = sc.nextLine().toLowerCase();
                for (int j = 0; j < opts.length; j++) {
                    if (yourChoice.equals(opts[j])) {
                        isThere = true;
                        break;
                    }
                }
                if (!isThere) {
                    System.out.println("Please, enter a valid option (opts: rock, paper, scissors)");
                }
            } while (!isThere);
            
            switch (yourChoice) {
                case "rock" -> {
                    if (opts[randNum].equals("paper")) {
                        System.out.printf("your choice: %s, computer choice: %s, computer won!%n", yourChoice, opts[randNum]);
                        rounds[i] = -1;
                    } else if (opts[randNum].equals("rock")) {
                        System.out.printf("your choice: %s, computer choice: %s, it's a tie!%n", yourChoice, opts[randNum]);
                        rounds[i] = 0;
                    } else {
                        System.out.printf("your choice: %s, computer choice: %s, you won!%n", yourChoice, opts[randNum]);
                        rounds[i] = 1;
                    }
                }
                case "paper" -> { 
                    if (opts[randNum].equals("scissors")) { 
                        System.out.printf("your choice: %s, computer choice: %s, computer won!%n", yourChoice, opts[randNum]);
                        rounds[i] = -1;
                    } else if (opts[randNum].equals("paper")) { 
                        System.out.printf("your choice: %s, computer choice: %s, it's a tie!%n", yourChoice, opts[randNum]);
                        rounds[i] = 0;
                    } else { 
                        System.out.printf("your choice: %s, computer choice: %s, you won!%n", yourChoice, opts[randNum]);
                        rounds[i] = 1;
                    }
                }
                case "scissors" -> { 
                    if (opts[randNum].equals("rock")) { 
                        System.out.printf("your choice: %s, computer choice: %s, computer won!%n", yourChoice, opts[randNum]);
                        rounds[i] = -1;
                    } else if (opts[randNum].equals("scissors")) { 
                        System.out.printf("your choice: %s, computer choice: %s, it's a tie!%n", yourChoice, opts[randNum]);
                        rounds[i] = 0;
                    } else { 
                        System.out.printf("your choice: %s, computer choice: %s, you won!%n", yourChoice, opts[randNum]);
                        rounds[i] = 1;
                    }
                }
            }
            System.out.println("---------------------------------------");
        }
        
        int winSum = 0;
        int loseSum = 0;
        int tieSum = 0;
        for (int k = 0; k < rounds.length; k++) {
            if (rounds[k] == -1) {
                loseSum += 1;
            } else if (rounds[k] == 0) { 
                tieSum += 1;
            } else { 
                winSum += 1; 
            }
        }
        
        System.out.printf("you won: %d times, computer won: %d times, and you tie: %d times. %n", winSum, loseSum, tieSum);
        if (winSum > loseSum) {
            System.out.println("You won the competition!");
        } else if (winSum == loseSum) {
            System.out.println("It's a tie!");
        } else { 
            System.out.println("Computer won!"); 
        }
        sc.close();
    }
}


















































