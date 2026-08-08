import java.util.ArrayList;

public class Generics{
	public static void main(String[] args){
		// generics: a concept where you can write a class, interface or method
		// that is compatible with different datatypes.
		// <T> type parameter: palceholder which will be replaced by a real type
		// <String> type argument: specifies the type

		// examples
		ArrayList<String> fruits = new ArrayList<>(); // specified arg (String) here is the type argument
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		System.out.println(fruits);

		// string
		Box<String> stringBox = new Box<>();
		stringBox.setItem("testItem");
		System.out.println(stringBox.getItem());

		// integer
		Box<Integer> integerBox = new Box<>();
		integerBox.setItem(2);
		System.out.println(integerBox.getItem());

		// double 
		Box<Double> doubleBox = new Box<>();
		doubleBox.setItem(3.14);
		System.out.println(doubleBox.getItem());

		Product<String, Double> product = new Product<>("testItem", 12.6);
		System.out.println(product.getItem());
		System.out.println(product.getPrice());
		product.updateItem("newItem");
		product.updatePrice(10.1);
		System.out.println(product.getItem());
		System.out.println(product.getPrice());
		
		
	}
}
