public class Library{
	String name;
	int year;
	Book[] books;
	Library(String name, int year, Book[] books){
		this.name = name;
		this.year = year;
		this.books = books;
	}
	void displayInfo(){
		System.out.printf("    The %d %s%n", this.year, this.name);
		System.out.println("    Books available: ");
		for (Book book : books){
			String bookInfo = book.displayInfo();
			System.out.printf("  - %s%n", bookInfo);
		}
	}
}
