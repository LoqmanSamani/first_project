public class MathMethods{
	public static void main(String[] args){
		// useful mathematic operations
		double a = 2.9;
		double b = 3.213;
		double c = - 2.00;
		//System.out.println(Math.PI);
		//System.out.println(Math.E);
		// Operations
		double d = Math.pow(a, b);
		System.out.print("a with the power of b: ");
		System.out.println(d);
		double e = Math.abs(c);
		System.out.print("absolute value of c: ");
		System.out.println(e);
		double f = Math.sqrt(b);
		System.out.print("the squared root of b: ");
		System.out.println(f);
		double g = Math.round(b); //round b to the nearest int
		System.out.print("round b to the nearest int: ");
		System.out.println(g);
		double h = Math.ceil(b); // round up to the nearest int
		System.out.print("ceiling(round up) b: ");
		System.out.println(h);
		double i = Math.floor(a); // round down to the nearest int
		System.out.print("flooring(round down) a: ");
		System.out.println(i);
		double j = Math.max(a, b);
		double k = Math.min(a, c);
		System.out.print("maximum of two numbers (a, b): ");
		System.out.println(j);
		System.out.print("minimum of two numbers (a, c): ");
		System.out.println(k);
	}
}
