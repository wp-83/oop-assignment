import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public void addBook(Book book){
        bookList.add(book);
    }

    public void borrowBook(Borrower borrower, Book book){
        borrower.addBorrowBook(book);
        bookList.remove(book);
    }

    public void returnBook(Borrower borrower, Book book){
        System.out.println(borrower.getName() + " returned: " + book.getTitle());
        borrower.removeBorrowBook(book);
        bookList.add(book);
    }

    public void displayLibraryBooks(){
        System.out.println("Books in Library: ");
        
        for (Book book : bookList){
            book.printInfo();
        }
    }
}