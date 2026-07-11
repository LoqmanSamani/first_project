import java.util.Arrays;

public class arrays{
	public static void main(String[] args){
		// arrays in java
		
		// example 1
		String fruit = "apple";
		System.out.println(fruit);
		String[] fruits = {"apple", "banana", "orange"}; // array version of fruit
		for (int i = 0; i < fruits.length; i++){
			System.out.print(fruits[i] + " ");
		}
		System.out.println();

		fruits[0] = "pineapple"; // change the value of array using its index
		for (int i = 0; i < fruits.length; i++){
			System.out.print(fruits[i] + " ");
		}
		System.out.println();

		Arrays.sort(fruits); // sort the fruits alphabetically
		for (int i = 0; i < fruits.length; i++){
			System.out.print(fruits[i] + " ");
		}
		System.out.println();

		Arrays.fill(fruits, "mango"); // fill the entire array with a specified value
		for (int i = 0; i < fruits.length; i++){
			System.out.print(fruits[i] + " ");
		}
		System.out.println();
	}
}
