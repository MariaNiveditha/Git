package week2.day1;

public class Library {

	//Define a public method addBook(String bookTitle)
	public String addBook(String bookTitle) {
		System.out.println(" Book added successfully");
		return bookTitle;
		

	}
	//Define a public method issueBook()
	public void issueBook() {
		System.out.println("Book issued successfully");

	}

	public static void main(String[] args) {
	//Create Object for class Library and call both methods
		Library books = new Library();
		System.out.println(books.addBook("Java basics"));
		books.issueBook();

	}

}
