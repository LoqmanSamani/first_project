import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class HangMan {

    public static void main(String[] args) {
        // hangman game
        RandomWord rWord = new RandomWord();
        DrawHangman hangman = new DrawHangman();

        System.out.println("--------------------------------");
        System.out.println("   Welcome to HangMan Game!!!   ");
        System.out.println("--------------------------------");

        char anotherRound = 'Y';
        try (Scanner sc = new Scanner(System.in)) {
            while (anotherRound == 'Y' || anotherRound == 'y') {
                String word = rWord.randWord();
                ArrayList<String> chars = splitWord(word);
                
                // Track current progress with underscores
                ArrayList<String> hiddenDisplay = new ArrayList<>();
                for (int i = 0; i < word.length(); i++) {
                    hiddenDisplay.add("_");
                }

                int wrongGuesses = 0;
                int filledOuts = 0;

                System.out.println(hashedWord(word));

                while (wrongGuesses < 6 && filledOuts < chars.size()) {
                    boolean foundIt = false;
                    char guessedChar;
                    
                    System.out.print("Guess a Char: ");
                    guessedChar = sc.next().toUpperCase().charAt(0);
                    String guessStr = String.valueOf(guessedChar);

                    for (int count = 0; count < chars.size(); count++) {
                        if (chars.get(count).equalsIgnoreCase(guessStr) && hiddenDisplay.get(count).equals("_")) {
                            foundIt = true;
                            filledOuts++;
                            hiddenDisplay.set(count, guessStr);
                        }
                    }

                    if (!foundIt) {
                        wrongGuesses++;
                        System.out.println("Wrong Guess :(");
                        System.out.println(DrawHangman.stage(wrongGuesses));
                    } else if (filledOuts == chars.size()) {
                        System.out.println("Congrats!");
                        System.out.println(hiddenDisplay);
                        System.out.print("Want to play another round (y/n): ");
                        anotherRound = sc.next().toUpperCase().charAt(0);
                    } else {
                        System.out.println("Good Guess :)");
                        System.out.println(hiddenDisplay);
                    }
                }

                if (wrongGuesses >= 6) {
                    System.out.println("Game Over! The word was: " + word);
                    System.out.print("Want to play another round (y/n): ");
                    anotherRound = sc.next().toUpperCase().charAt(0);
                }
            }
        } catch (Exception e) {
            System.out.println("Please enter an alphabetic character!");
        }
    }

    static ArrayList<String> splitWord(String word) {
        ArrayList<String> chars = new ArrayList<>(Arrays.asList(word.split("")));
        return chars;
    }

    static String hashedWord(String word) {
        return "_ ".repeat(word.length());
    }
}
