package lesson11.problem3.src;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook("123", "Java Programming", "John Doe");
        library.addBook("456", "Data Structures", "Jane Smith");
        library.addBook("789", "Algorithms", "Alice Johnson");

        // Try to add a duplicate book
        library.addBook("123", "Duplicate Book", "Duplicate Author");

        // List all books
        library.listAllBooks();

        // Borrow books
        library.borrowBook("123");
        library.borrowBook("456");

        // Try to borrow an already borrowed book
        library.borrowBook("123");

        // List all borrowed books
        library.listBorrowedBooks();

        // Check if a specific book is borrowed
        System.out.println("Is book with ISBN 123 borrowed? " + library.isBookBorrowed("123"));
        System.out.println("Is book with ISBN 789 borrowed? " + library.isBookBorrowed("789"));

        // Return books
        library.returnBook("123");
        library.returnBook("789"); // Trying to return a book that wasn't borrowed

        // List all books again
        library.listAllBooks();

        // List borrowed books again
        library.listBorrowedBooks();

        // Get details of a specific book
        System.out.println("Details of book with ISBN 456: " + library.getBookDetails("456"));
        System.out.println("Details of book with ISBN 999: " + library.getBookDetails("999")); // Non-existent book
    }
}

