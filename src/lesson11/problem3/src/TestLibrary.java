package lesson11.problem3.src;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("123", "Java Programming", "John Doe");
        library.addBook("456", "Data Structures", "Jane Smith");
        library.addBook("789", "Algorithms", "Alice Johnson");
        library.addBook("123", "Duplicate Book", "Duplicate Author");
        library.listAllBooks();

        library.borrowBook("123");
        library.borrowBook("456");
        library.borrowBook("123");
        library.listBorrowedBooks();

        System.out.println("Check ISBN 123 if borrowed? " + library.isBookBorrowed("123"));
        System.out.println("Check ISBN 789 if borrowed? " + library.isBookBorrowed("789"));

        library.returnBook("123");
        library.returnBook("789");
        library.listAllBooks();
        library.listBorrowedBooks();

        System.out.println("Details of ISBN 456: " + library.getBookDetails("456"));
        System.out.println("Details of ISBN 999: " + library.getBookDetails("999"));
    }
}

