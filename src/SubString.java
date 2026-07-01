import java.util.Scanner;

public class SubString{
	public static void main(String[] args){
		// sub-string method in java
		// it's used to extract a portion of a string

		// variables
		String str = "The at sign (@) is a typographical symbol "
			   + "formally known as the commercial at.\n"
			   + "Originally used in commerce to denote "
                           + "'at the rate of',\n"
                           + "it is now a fundamental " 
			   + "digital character primarily used in email "
                           + "addresses and social media handles.\n";
		int startIdx;
		int endIdx;
		int lenStr = str.length();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start index(range(0, " + (lenStr-2) + ")): ");
		startIdx = sc.nextInt();
		System.out.print("Enter the end index(range(1, " + (lenStr-1) + ")): ");
		endIdx = sc.nextInt();

		// operations
		String yourChoice = str.substring(startIdx, endIdx);
		String startToAtSign = str.substring(0, str.indexOf("@"));// start of the string to at-sign
		String atSignToEnd = str.substring(str.indexOf("@")); // at-sing to end of the string
		String randomPart = str.substring(15, 55);
		

		// print statements
		System.out.printf("Start to @: %s%n", startToAtSign);
		System.out.printf("@ to end: %s%n", atSignToEnd);
		System.out.printf("A Random Part(15, 55): %s%n", randomPart);
                System.out.printf("Based on your Input(%d, %d): %s%n", startIdx, endIdx, yourChoice);

		sc.close();
	}
}

