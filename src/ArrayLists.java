import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
	public static void main(String[] args){
		// ArrayList: a resizable array that stores objects (autoboxing)
		// Arrays are fixed in size but ArrayLists can change.
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(6);

		// print the list item by item
		for(Integer item : list){
			System.out.println(item);
		}

		// or simply print the entire array list
		System.out.println(list);

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		System.out.println(fruits);
		fruits.remove(1);
		System.out.println(fruits);
		fruits.set(0, "Pineapple");
		System.out.println(fruits);

		Collections.sort(list);
		System.out.println(list);
	}
}
