import java.util.Random;

public class NestedIf{
	public static void main(String[] args){
		// nested if statements in java
		Random r = new Random();
		int i = 100;
		while (i > 1){
			double num = r.nextDouble();
			if (num > 0.5){
				if (num < 0.75){
					System.out.printf("Generated num is in the third quantile: %.2f%n", num);
				}
				else{
					System.out.printf("Generated num is in the fourth quantile: %.2f%n", num);
				}
			}
			else{
				if (num < 0.25){
					System.out.printf("Generated num is in the first quantile: %.2f%n", num);
				}
				else{
					System.out.printf("Generated num is in the second quantile: %.2f%n", num);
				}
			}
			i--;
		}
		
	}
}
