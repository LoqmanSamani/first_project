public class Aggregation{
	public static void main (String[] args){
		// aggregation: represent "a-has" relationship between objects
		// one object contains another object as part of his structure
		// but the contain/s objects/ can exist independently
		Book b1 = new Book("Immortality", "Milan Kundra", 360);
		Book b2 = new Book("Devil and the good lord", "Jean-Paul Sartre", 180);
		Book b3 = new Book("The Metamorphosis", "Franz Kafka", 300);
		
		Book[] books = {b1, b2, b3};
		Library library = new Library("Marivan public library", 1920, books);
		
		library.displayInfo();
	}
}
