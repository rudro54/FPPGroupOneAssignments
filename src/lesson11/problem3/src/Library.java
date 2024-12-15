package lesson11.problem3.src;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Book> books = new HashMap<>();

    public void addBook(String ISBN, String title, String author) {
        if(ISBN == null || title == null || author == null) {
            System.out.println("Incomplete information! Book cannot be added.");
            return;
        }
        if (books.containsKey(ISBN)) {
            System.out.println("ISBN: " + ISBN + " already exists!");
        } else {
            books.put(ISBN, new Book(ISBN, title, author));
            System.out.println("The book " + title + " has been added.");
        }
    }
    public void borrowBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("The book with ISBN " + ISBN + " does not exist.");
        } else if (book.isBorrowed()) {
            System.out.println("The book with ISBN " + ISBN + " is already borrowed.");
        } else {
            book.setBorrowed(true);
            System.out.println("The book with ISBN " + ISBN + " has been issued.");
        }
    }
    public void returnBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("The book with ISBN " + ISBN + " does not exist.");
        } else if (!book.isBorrowed()) {
            System.out.println("The book with ISBN " + ISBN + " was not borrowed.");
        } else {
            book.setBorrowed(false);
            System.out.println("The book with ISBN " + ISBN + " has been returned.");
        }
    }
    public boolean isBookBorrowed(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null)
            return false;
        else
            return book.isBorrowed();
    }
    public String getBookDetails(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null)
            return "The book with ISBN " + ISBN + " does not exist.";
        else
            return book.toString();
    }
    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Empty library!");
            return;
        }
        System.out.println("\nBooks in the library: ");
        for (Book book : books.values()) {
            System.out.println(book);
        }
        System.out.println("\n");
    }
    public void listBorrowedBooks() {
        int counter = 0;
        System.out.println("\nBorrowed Books: ");
        for (Book book : books.values()) {
            if (book.isBorrowed()) {
                System.out.println(book);
                counter++;
            }
        }
        if (counter == 0)
            System.out.println("No books are currently borrowed.");

        System.out.println("\n");
    }
}

