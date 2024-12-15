package lesson11.problem3.src;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(String ISBN, String title, String author) {
        if(ISBN == null || title == null || author == null) {
            System.out.println("Incomplete information! Book with ISBN " + title + " cannot be added the library.");
            return;
        }
        if (books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " already exists in the library.");
        } else {
            books.put(ISBN, new Book(ISBN, title, author));
            System.out.println("Book with ISBN " + ISBN + " has been added to the library.");
        }
    }
    public void borrowBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book with ISBN " + ISBN + " does not exist in the library.");
        } else if (book.isBorrowed()) {
            System.out.println("Book with ISBN " + ISBN + " is already borrowed.");
        } else {
            book.setBorrowed(true);
            System.out.println("Book with ISBN " + ISBN + " has been borrowed.");
        }
    }
    public void returnBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book with ISBN " + ISBN + " does not exist in the library.");
        } else if (!book.isBorrowed()) {
            System.out.println("Book with ISBN " + ISBN + " was not borrowed.");
        } else {
            book.setBorrowed(false);
            System.out.println("Book with ISBN " + ISBN + " has been returned.");
        }
    }

    // Check if a book is borrowed
    public boolean isBookBorrowed(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book with ISBN " + ISBN + " does not exist in the library.");
            return false;
        }
        return book.isBorrowed();
    }

    // Get details of a book
    public String getBookDetails(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            return "Book with ISBN " + ISBN + " does not exist in the library.";
        }
        return book.toString();
    }

    // List all books in the library
    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("All Books in the Library:");
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    // List all borrowed books
    public void listBorrowedBooks() {
        boolean found = false;
        System.out.println("Borrowed Books in the Library:");
        for (Book book : books.values()) {
            if (book.isBorrowed()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books are currently borrowed.");
        }
    }
}

