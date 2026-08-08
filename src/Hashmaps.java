import java.util.HashMap;

public class Hashmaps{
	public static void main (String[] args){
		// HashMap: a data structure that stores key:value pairs
		// keys are unique, but values can be duplicated
		// does not maintain any order, but is memory-efficient
		// HashMap<key, value>

		HashMap<String, Double> map = new HashMap<>();

		map.put("Apple", 0.6);
		map.put("Banana", 0.4);
		map.put("Orange", 0.5);

		System.out.println(map);

		map.remove("Apple");

		System.out.println(map);
		
		System.out.println(map.get("Apple"));
		System.out.println(map.get("Orange"));
		

	}
}
