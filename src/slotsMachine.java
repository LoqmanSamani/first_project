import java.util.Scanner;
import java.util.Random;

public class slotsMachine {

    // symbols
    static String cherry = "\uD83C\uDF52";
    static String watermelon = "\uD83C\uDF49";
    static String lemon = "\uD83C\uDF4B";
    static String bell = "\uD83D\uDD14";
    static String star = "\u2B50";

    static String[] symbols = {cherry, watermelon, lemon, bell, star};

    public static void main(String[] args) {

        // variables
        double totalMoney = 0;
        double totalCoins = 0;
        int round = 1;
        boolean wantToPlay = true;

        Scanner sc = new Scanner(System.in);

        // preparation
        System.out.println("-------------------------------------------------");
        System.out.println("          ***Welcome to Slots Game!***");
        System.out.println("  	      Symbols: " +
                cherry + " " +
                watermelon + " " +
                lemon + " " +
                bell + " " +
                star);
        System.out.println("-------------------------------------------------");

        System.out.print("Insert your total money in dollars to play with: ");
        totalMoney = sc.nextDouble();

        totalCoins = totalMoney * 20; // each 5 cents is one coin!

        System.out.printf("Your bank has $%.2f, equivalent to %.0f coins!%n",
                totalMoney, totalCoins);

        System.out.println("Let's start!");

        do {

            System.out.println("-------------------");
            System.out.println("Round " + round);
            System.out.println("-------------------");

            totalCoins -= 30; // 30 coins for each round of play

            for (int i = 0; i < 10; i++) {
                totalCoins += oneRoundPlay();
            }

            System.out.printf("Current balance: %.0f coins%n", totalCoins);

            if (totalCoins < 30) {
                System.out.println("You don't have enough coins to continue.");
                break;
            }

            System.out.print("Do you want to play another round? (y/n): ");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("n")) {
                wantToPlay = false;
            }

            round++;

        } while (wantToPlay);

        totalMoney = totalCoins / 20.0;

        System.out.printf("%nAfter %d rounds of play, your remaining money is: $%.2f%n",
                round, totalMoney);

        sc.close();
    }

    public static double oneRoundPlay() {

        double earnedCoins = 0;

        String[] randSymbols = new String[3];
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            int r = rand.nextInt(5);
            randSymbols[i] = symbols[r];
        }

        for (int j = 0; j < 3; j++) {
            System.out.print(randSymbols[j] + " ");
        }
        System.out.println();

        if (randSymbols[0].equals(star)
                && randSymbols[1].equals(randSymbols[0])
                && randSymbols[2].equals(randSymbols[0])) {

            earnedCoins = 100;

        } else if (randSymbols[0].equals(bell)
                && randSymbols[1].equals(randSymbols[0])
                && randSymbols[2].equals(randSymbols[0])) {

            earnedCoins = 50;

        } else if (randSymbols[0].equals(watermelon)
                && randSymbols[1].equals(randSymbols[0])
                && randSymbols[2].equals(randSymbols[0])) {

            earnedCoins = 30;

        } else if (randSymbols[0].equals(lemon)
                && randSymbols[1].equals(randSymbols[0])
                && randSymbols[2].equals(randSymbols[0])) {

            earnedCoins = 20;

        } else if (randSymbols[0].equals(cherry)
                && randSymbols[1].equals(randSymbols[0])
                && randSymbols[2].equals(randSymbols[0])) {

            earnedCoins = 15;

        } else if (randSymbols[0].equals(randSymbols[1])
                || randSymbols[0].equals(randSymbols[2])
                || randSymbols[1].equals(randSymbols[2])) {

            earnedCoins = 5;

        } else {

            earnedCoins = 0;
        }

        System.out.println("You won " + earnedCoins + " coins!");

        return earnedCoins;
    }
}

