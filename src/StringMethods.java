public class StringMethods{
	public static void main(String[] args){
		// string methods in java
		String str = "  This string will be used to examine string methods!   ";
		System.out.printf("The srting length is: %d%n", str.length());
		//char idx4 = str.charAt(4);
		//char idx14 = str.charAt(14);
		System.out.printf("Index 14: %c%n", str.charAt(14));
		System.out.printf("Index 24: %c%n", str.charAt(24));
		// find the index of a char
		System.out.printf("The first e: %d%n", str.indexOf("e"));
		// last index
		System.out.printf("The last index of e: %d%n", str.lastIndexOf("e"));
		// upper case
		System.out.printf("To upper case: %s%n", str.toUpperCase());
		// lower case
		System.out.printf("To lower case: %s%n", str.toLowerCase());
		System.out.printf("Trim (delete spaces): %s%n", str.trim());
		System.out.printf("Replace chars(i with X): %s%n", str.replace("i", "X"));
		System.out.printf("Is the string empty: %s%n", str.isEmpty());
		if (str.contains(" ")){
    			System.out.println("Your str contains space/s!");
		}else{
			System.out.println("There is no space in your str!");
		}
		if (str.equals("  This string will be used to examine string methods!   ")){
			System.out.println("They are equal!");
		}else{
			System.out.println("They are not equal!");
		}
		
	}
}
