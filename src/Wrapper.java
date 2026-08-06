public class Wrapper{
	public static void main(String[] args){
		// wrapper classes: allow primitive values (int, char, boolean, double)
		// to be used as objects. "wrap them in an object"
		// generally, do not wrap primitive unless you need an object
		// allows use of Collections Framework and static Utility methods.
		
		// Autoboxing
		Integer a = 123;
		Double b = 123.7;
		Character c = '$';
		Boolean b = true;

		// Unboxing
		int x = a;
		double y = b;
		char z = c;
		boolean g = b;

		// convert wrappers to string
		String s1 = Integer.toString(123);
		String s2 = Double.toString(123.7);
		String s3 = Character.toString('$');
		String s4 =  Boolean.toString(true);

		System.out.println(a);
		System.out.println(x);
		System.out.println(s1);
	}
}

