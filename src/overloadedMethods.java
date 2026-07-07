public class overloadedMethods{
	public static void main(String[] args){
		// overloaded methods: methods with the same name 
		// but different set of params
		// signature = name + params
		System.out.println(add(12, 4));
		System.out.println(add(12, 4, 32));
		
	} 
	static double add(double a, double b){ return a + b; }
	static double add(double a, double b, double c){ return a + b + c; }
}
