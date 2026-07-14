public class variableArguments{
	public static void main(String[] args){
		// varargs: allowing a method to accept a varing number of args
		// java will pack the args in an array
		System.out.println(add(1.2, 2.3, 3.4, 4.5));
		System.out.println(add(1, 2, 3, 4, 5));
		System.out.println(add(1, 2.4));

		System.out.println(mean(1.2, 2.3, 3.4, 4.5));
		System.out.println(mean(1, 2, 3, 4, 5));
		System.out.println(mean(1, 2.4));
	}
	static double add(double... numbers){
		double sum = 0;
		for (double num: numbers){
			sum += num;
		}
		return sum;
	}
	static double mean(double... numbers){
		double sum = 0;
		for (double num: numbers){
			sum += num;
		}
		return (sum / numbers.length);
	}
}
