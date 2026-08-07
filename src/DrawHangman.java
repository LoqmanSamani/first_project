public class DrawHangman{
	public static String one = """
		     ______
		     |	  |
		     O	  |
	                  |
 	          |
			  |
	         _________|
	""";
	public static String two = """
		     ______
		     |	  |
		     O	  |
		     |    |
 	          |
			  |
	         _________|
	""";
	public static String three = """
		     ______
		     |	  |
		     O	  |
		    /|    |
 	          |
			  |
	         _________|
	""";
	public static String four = """
		     ______
		     |	  |
		     O	  |
		    /|\\   |
 	          |
			  |
	         _________|
	""";
	public static String five = """
		     ______
		     |	  |
		     O	  |
		    /|\\   |
 	    /     |
			  |
	         _________|
	""";
	public static String six = """
		     ______
		     |	  |
		     O	  |
		    /|\\   |
 	    / \\   |
			  |
	         _________|
	""";

	static String stage(int num){
		String hangman = "";
		switch(num){
			case 1 -> hangman = one;
			case 2 -> hangman = two;
			case 3 -> hangman = three;
			case 4 -> hangman = four;
			case 5 -> hangman = five;
			case 6 -> hangman = six;
			default -> hangman = "non-valid number!";
		}
		return hangman;
	}
}
