public class Abstraction{
	public static void main(String[] args){

		// abstract: used to defined abstract classes and methods
		// abstraction is the process of hidding implementation details
		// and showing only the essentioal features
		// abstract classes can not be instantiated directly
		// can contain abstract methods which should be implemented
		// can contain concrete methods which are inherited.

		Circle circle = new Circle(12.6);
		Triangle triangle = new Triangle(3, 12.4);
		Rectangle rectangle = new Rectangle(5.4, 2.1);

		System.out.println(circle);
		System.out.println(triangle);
		System.out.println(rectangle);

		double circle_a = circle.area();
		circle.display();
		System.out.println(circle_a);
		

		double rectangle_a = rectangle.area();
		rectangle.display();
		System.out.println(rectangle_a);

		double triangle_a = triangle.area();
		triangle.display();
		System.out.println(triangle_a);
	}
}
