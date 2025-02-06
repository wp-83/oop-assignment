public class Main {

    public Main()
    {
        Author author1 = new Author("James Gosling", "Creator of the Java programming language.");
        Author author2 = new Author("Robert C. Martin", "Known for his works on software craftsmanship.");

        Book book1 = new Book("Java Programming", "123456789", author1);
        Book book2 = new Book("Clean Code", "987654321", author2);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        Borrower borrower = new Borrower("Alice");

        library.borrowBook(borrower, book1);
        library.borrowBook(borrower, book2);

        borrower.displayBorrowedBooks();

        library.returnBook(borrower, book1);

        borrower.displayBorrowedBooks();
        
        library.displayLibraryBooks();
    }
    
public static void main(String[] args) {
    new Main();
}
}