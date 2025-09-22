class Book {
    static String libraryName = "City Library";
    private String title, author;
    private final String isbn; // Final unique identifier

    // Constructor using 'this'
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Display details with instanceof
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN1234");
        b1.displayDetails();
        Book.displayLibraryName();
    }
}
