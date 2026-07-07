public class methods{
	public static void main(String[] args){
		// method: a block of reusable code,
		// that is executed when called ()
		for (int i = 0; i < 5; i++){
			callableMethod();
		}
		
		for (int i = 0; i < 5; i++){
			callableVarMethod("with variable");
		}	
		
		double sphereVol = sphereVolume(12.9);
		System.out.println(sphereVol);	
		
		
	}
	static void callableMethod(){
		System.out.println("---------------------------");
		System.out.println("This is the callable method");
		System.out.println("This is the callable method");
		System.out.println("This is the callable method");
		System.out.println("---------------------------");
	}
	static void callableVarMethod(String method){
		System.out.println("---------------------------------------");
		System.out.printf("This is the callable %s method%n", method);
		System.out.printf("This is the callable %s method%n", method);
		System.out.printf("This is the callable %s method%n", method);
		System.out.println("---------------------------------------");
	}
	static double sphereVolume(double r){
		return (4/3)* Math.PI * Math.pow(r, 3);
	}
}
