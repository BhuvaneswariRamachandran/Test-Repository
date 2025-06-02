package week2.day1;

public class Library {
			public  String addBook(){
			return "Book Added successfully";
		}
	public void issueBook(){
			System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library Book = new Library();
		Book.addBook();
		Book.issueBook();
		String bookTitle = Book.addBook();
		System.out.println(bookTitle);
		

	}
	
	}		

	


