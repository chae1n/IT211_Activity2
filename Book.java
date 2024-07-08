import java.util.ArrayList;

public class Book {
    // Attributes of Book class
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize the Book object
    public Book(String title, String author, String isbn) {
        this.title = title;     // Set the title attribute
        this.author = author;   // Set the author attribute
        this.isbn = isbn;       // Set the ISBN attribute
    }

    // Getter method for the title attribute
    public String getTitle() {
        return title;
    }

    // Getter method for the author attribute
    public String getAuthor() {
        return author;
    }

    // Getter method for the ISBN attribute
    public String getIsbn() {
        return isbn;
    }

    // Method to return a string representation of the Book object
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

// Class to manage a collection of books
class BookCollection {
    private ArrayList<Book> books;

    // Constructor to initialize the BookCollection object
    public BookCollection() {
        books = new ArrayList<>();  // Initialize the ArrayList to store books
    }

    // Method to add a book to the collection
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // Method to remove a book from the collection by ISBN
    public void removeBookByIsbn(String isbn) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed: " + bookToRemove);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // Method to display books in the collection
    public void displayBooks() {
        System.out.println("Book Collection:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
        // Create instance of the BookCollection class
        BookCollection collection = new BookCollection();

        // Create and add books to the collection
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "1234567891");
        collection.addBook(book1);
        collection.addBook(book2);

        // Display all books in the collection
        collection.displayBooks();

        // Remove a book by ISBN
        collection.removeBookByIsbn("1234567890");

        // Display all the books in the collection after removal
        collection.displayBooks();
    }
}

