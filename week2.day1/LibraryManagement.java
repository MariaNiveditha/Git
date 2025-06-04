package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
	//Create a new object for Class "Library" and call both the public methods. 
	//Task to check private method of a class cannot be called in another class
		Library book = new Library();
		System.out.println(book.addBook("Java basics"));
		book.issueBook();

	}

}
