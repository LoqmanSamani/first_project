public class variableScope{
	static int class_x = 4; // this is a class variable and can be accessed inside each methods defined inside the class
	public static void main(String[] args){
		// variable scope: where a variable can be accessed.
		// local variables
		int x = 2; // x is local and only inside the main method can be accessed.
		System.out.println(x);
		someMethod(); // it will output its local variable of x
		System.out.println(class_x);
	}
	static void someMethod(){
		int x = 3; // this is also a local variable
		System.out.println(x);
		System.out.println(class_x);
	}
}
