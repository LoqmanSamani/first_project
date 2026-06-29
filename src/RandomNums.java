import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class RandomNums{
	public static void main(String[] args){
		// random
	     	List <Integer> odds = new ArrayList<>();
		List <Integer> evens = new ArrayList<>();
		Random rand = new Random();

		for (int i = 1; i < 10001; i++){
			int num = rand.nextInt(1, 101);// this will generate a number in range [1, 100]
			if (num % 2 == 0){
				evens.add(num);
			}else{
				odds.add(num);			
			}
			
		}
		System.out.println("---------------");
		System.out.println("#odds: " + odds.size());
		System.out.println("#evens: " + evens.size());
		System.out.println("---------------");
	}

}
